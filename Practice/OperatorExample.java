// Decompiled by Procyon v0.5.36
public class OperatorExample {
   public OperatorExample() {
   }

   public static void main(String[] var0) {
      int var1 = 10;
      byte var2 = 20;
      System.out.println(var1 % var2);
      var1 += var2;
      System.out.println("n1 :- " + var1 + " and n2 :- " + var2);
      var1 -= var2;
      System.out.println("n1 :- " + var1 + " and n2 :- " + var2);
      var1 *= var2;
      System.out.println("n1 :- " + var1 + " and n2 :- " + var2);
      var1 /= var2;
      System.out.println("n1 :- " + var1 + " and n2 :- " + var2);
      var1 %= var2;
      System.out.println("n1 :- " + var1 + " and n2 :- " + var2);
      System.out.println(var1 != var2);
      System.out.println(var1 != 10 && var2 != 20);
   }
}
