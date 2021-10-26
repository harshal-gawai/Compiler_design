import syntaxtree.*;
import visitor.*;

public class P4 {
   public static void main(String [] args) {
      try {
         Node root = new MiniIRParser(System.in).Goal();
         //System.out.println("Program parsed successfully");
         Temp_count t = new Temp_count();
         root.accept(t);
         IR_reduce c = new IR_reduce();
         c.i = t.max_Temp + 1;
         root.accept(c, null);
         //root.accept(new IR_reduce(),null); // Your assignment part is invoked here.
      }
      catch (ParseException e) {
         System.out.println(e.toString());
      }
   }
}
