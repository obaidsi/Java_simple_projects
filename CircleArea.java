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
            System.out.println("Invalid choice. Enter your choice again:");
            }
      
         choice = sc.nextInt();        
         System.out.println("You Entered: "+ choice);
         while (choice<1 || choice>5){
            System.out.println("Invalid choice. Enter your choice again:");
            while (!sc.hasNextInt()){
               sc.next();
               System.out.println("Invalid choice. Enter your choice again:");
               }
            choice = sc.nextInt();
            }
         switch(choice){
            case 1: 
                radius = getRadius();
               break; 
            case 2:
               System.out.println("Enter x vlaue ");
               double xVal = sc.nextDouble();
               System.out.printf("Y_value = %4.2f", cp.calY(xVal, radius));
               break;
            case 3:
               actArea = cp.actualArea(radius);
               System.out.printf("Actual Area = %4.2f", actArea);
               break;
            case 4:
					radius = getRadius();
               System.out.println("Enter the number of rentangle for estimationi:");
               int numRect = sc.nextInt();
               estArea = cp.estimateArea(numRect, radius);
               System.out.printf("Estimated_Area = %4.2f ", estArea);
               actArea = cp.actualArea(radius);
               System.out.printf("Over_estiamted by %%%4.2f", cp.areaDeviation(actArea, estArea));
               break;
            }
         }while (choice != 5);
      System.out.println("GoodBye");
   
      }
		public static double getRadius(){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the radius: ");
			double radius = sc.nextInt();
			while(radius<=0 || radius>1000){
				System.out.println("Radius must be greater than zero less than 1000. Please renter radius:");
				radius = sc.nextInt();
			}
        	System.out.println("Radius set to " + radius);
			return radius; 
		}
   }