public class Chick {
   // Can not refer to a variable before it has been defined.
   // { System.out.println(name);} 
   private String name = "Fluffy";
   { System.out.println("setting field");} 
   public Chick() {
	System.out.println("in constructor");
   }
}
