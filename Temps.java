public class Temps{
   public static void main(String[] args){
   }
   /**
   * Converts Fahrenheit to Celsius
   * @param degF degree Fahrenheit
   * @return degree Celcius
   */
   public static double fToC(double degF){
      return (degF - 32.0) * 5.0/9.0;
   }
   
   public static double cToF(double degC){
      return degC + 273.15;
   }
   
}