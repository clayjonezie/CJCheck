public class Check{

   public static void check(String method, int given, int expected) {
      if (given != expected) {
         System.out.println("Error in " + method + " was " + 
                             given + " expected " + expected);
      }
   }
   
   public static void check(String method, boolean given, boolean expected) {
      if (given != expected) {
         System.out.println("Error in " + method + " was " + 
                             given + " expected " + expected);
      }
   }
   
   public static void check(String method, String given, String expected) {
      if (!given.equals(expected)) {
         System.out.println("Error in " + method + " was " + 
                             given + " expected " + expected);
      }
   }

   public static void check(String method, double given,
                            double expected, double epsilon) {
      if (Math.abs((given/expected) - 1) > epsilon) {
         System.out.println("Error in " + method + " was " + 
                             given + " expected " + expected);
      }
   }
}
