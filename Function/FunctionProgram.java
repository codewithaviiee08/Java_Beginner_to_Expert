
public class FunctionProgram {
   public FunctionProgram() {
   }

   public void hello() {
      System.out.println("Hello");
   }

   public void add(int var1, int var2) {
      System.out.println("Addition of a and b :- " + (var1 + var2));
   }

   public int data() {
      return 5;
   }

   public int sum(int var1, int var2, int var3) {
      return var1 + var2 + var3;
   }

   public static void main(String[] var0) {
      FunctionProgram var1 = new FunctionProgram();
      var1.hello();
      var1.add(5, 6);
      int var2 = var1.data();
      System.out.println("Value of a :- " + var2);
      int var3 = var1.sum(4, 5, 6);
      System.out.println("Result :- " + var3);
   }
}
