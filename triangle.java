// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.util.Scanner;

public class p5 {
   public p5() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.println("enter n");
      int var2 = var1.nextInt();

      for(int var4 = 0; var4 < var2; ++var4) {
         int var3 = var4 + 1;

         for(int var5 = 0; var5 < 2 * var2; ++var5) {
            if (var5 >= var2 - var4 && var5 <= var2 + var4) {
               if (var5 < var2) {
                  System.out.print(var3 + " ");
                  --var3;
               } else {
                  System.out.print(var3 + " ");
                  ++var3;
               }
            } else {
               System.out.print(" ");
            }
         }

         System.out.println(" ");
      }

   }
}
