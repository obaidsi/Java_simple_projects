//import java.lang.Math;

public class Computation{
   public static void main(String[] args){
      System.out.println("Y value = "+ calY(5, 10));
      System.out.println("Actual Area = "+ actualArea(10));
      System.out.println("Estimate Area = "+ estimateArea(4, 10.0));
      System.out.println("Area Overestimate percentage = " + areaDeviation(actualArea(10),estimateArea(4, 10.0)));
   }
   public static double calY(double xVal, double rVal){
      double y = Math.sqrt(rVal*rVal - xVal*xVal);
      return y;
   }
   
   public static double actualArea(double rVal){
      return Math.PI * rVal* rVal;
   }
   
   public static double estimateArea(int numRect, double rVal){
      double width = rVal/numRect, estArea=0.0, xVal = 0.0, yVal=rVal;
      
      for (int num =1; num<=numRect;  num++){
         estArea += (yVal * width);
         xVal += width;
         yVal = calY(xVal, rVal);  
      }
      return (estArea * 4);
   }
   
   public static double areaDeviation(double actArea, double estArea){
      double areaDev = (Math.abs(estArea-actArea)/actArea) * 100;
      return areaDev;
   }
}