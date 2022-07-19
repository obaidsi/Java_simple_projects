import java.util.Scanner;

public class CircleArea {
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       Computation cp = new Computation();
       int choice;
       double radius = 0, actArea =0.0, estArea=0.0;
      do {
         System.out.println("\nCircle Area Calculations Menue\n");
         System.out.println("1. Set radius");
         System.out.println("2. Find y values for a given x");
         System.out.println("3. Calculate actual area");
         System.out.println("4. Calculate estimated area");
         System.out.println("5. Exit the program");
         System.out.println("\nEnter your Choice: ");
         while (!sc.hasNextInt()){
            sc.next();
            System.out.println("Not a valid Entry. Please renter a valid choice:");
         }
     
         choice = sc.nextInt();        
         System.out.println("You Entered: "+ choice);
         
         switch(choice){
            case 1: 
               System.out.println("Enter the radius: ");
               radius = sc.nextDouble(); 
               System.out.println("Radius set to " + radius);  
               break; 
            case 2:
               System.out.println("Enter x vlaue ");
               double xVal = sc.nextDouble();
               System.out.println("Y_value = " + cp.calY(xVal, radius));
               break;
            case 3:
               actArea = cp.actualArea(radius);
               System.out.println("Actual Area = "+ actArea);
               break;
            case 4:
               System.out.println("Enter the number of rentangle for estimationi:");
               int numRect = sc.nextInt();
               estArea = cp.estimateArea(numRect, radius);
               System.out.println("Estimated_Area = "+ estArea);
               System.out.println("Over_estiamted by "+ cp.areaDeviation(actArea, estArea));
               break;
                 }
         }while (choice != 5);
            System.out.println("GoodBye");

         }
}