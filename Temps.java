import java.util.Scanner;

public class Temps{
   public static void main(String[] args){ 
      Scanner sc = new Scanner(System.in);
      int choice;
      double inputTemp, result = 0.0;
      
      do {
         System.out.println("\n\nTemperature Conversion Menue\n");
         System.out.println("1. Fahrenheit to Celsius");
         System.out.println("2. Fahrenheit to Kelvin");
         System.out.println("3. Celsius to Fahrenheit");
         System.out.println("4. Celsius to Kelvin");
         System.out.println("5. Kelvin to Fahrenheit");
         System.out.println("6. Kelvin to Celsius");
         System.out.println("0. EXIT\n");
         System.out.println("Enter your Choice: ");
         
         // Get user Choice
         while (!sc.hasNextInt()) {
            sc.next();
            System.out.print("Enter your Choice: ");
          } 
          choice = sc.nextInt();
          
          if (choice >= 1 && choice <= 6) {
            System.out.print("Enter the input temperature: ");
            inputTemp = sc.nextDouble();
            
            if (choice == 1) {
               result = fToC(inputTemp);
            }
            else if (choice == 2) {
               result = fToK(inputTemp);
            }
            else if (choice == 3) {
               result = cToF(inputTemp);
            }
            else if (choice == 4) {
               result = cToK(inputTemp);
            }
            else if (choice == 5) {
               result = kToF(inputTemp);
            }
            else if (choice == 6) {
               result = kToC(inputTemp);
            }
            System.out.printf("Conversion Temperature is: %8.2f\n", result);
            
          } 
      } while (choice !=0);
      System.out.println("GoodBye");
   }
   /**
   * Converts Fahrenheit to Celsius
   * @param degF degree Fahrenheit
   * @return degree Celcius
   */
   public static double fToC(double degF){
      return (degF - 32.0) * 5.0/9.0;
   }
   /**
   * Converts Celsius to Fahrenheit
   * @param degC degree Celsius
   * @return degree Fahrenheit
   */
   public static double cToF(double degC){
      return degC *1.8 + 32.0;
   }
   /**
   * Converts Celsius to Kelvin
   * @param degC degree Celsius
   * @return degree Kelvin
   */
   public static double cToK(double degC){
      return degC + 273.15;
   }
   /**
   * Converts Kelvin to Celsius
   * @param degK degree Kelvin
   * @return degree Celcius
   */
   public static double kToC(double degK){
      if (degK < 0) throw new IllegalArgumentException("Kelvin degrees must be non-negative");
      return degK - 273.15;
   }
   /**
   * Converts Kelvin to Fahrenheit 
   * @param degK degree Kelvin
   * @return degree Fahrenheit
   */
   public static double kToF(double degK){
      if (degK < 0) throw new IllegalArgumentException("Kelvin degrees must be non-negative");
      return degK * 9.0 / 5.0 - 459.67;
   }
   /**
   * Converts Fahrenheit to Kelvin
   * @param degF degree Fahrenheit
   * @return degree Kelvin
   */
   public static double fToK(double degF){
      return (degF-32.0)*(5.0/9.0)+273.15;
   }
}