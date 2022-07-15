public class Temps{
   public static void main(String[] args){
      System.out.println("Kelvin to Fahrenheit: " + cToF(15));
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