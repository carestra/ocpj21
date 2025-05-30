public class Initializers {
   int instanceVar = 1;
   public int publicInstanceVar;
   public static String STATIC_CLASS_INSTANCE_VARIABLE = "Hello";
   // Compilation error if static instance variable are not initialized
   // public static final float STATIC_FINAL_CLASS_INSTANCE_VARIABLE;
   public static final float STATIC_FINAL_CLASS_INSTANCE_VARIABLE = 23F;

   {
	System.out.println("0 - static=" + STATIC_CLASS_INSTANCE_VARIABLE + " staticFinal=" + STATIC_FINAL_CLASS_INSTANCE_VARIABLE);
	System.out.println("1 - instanceVar=" + instanceVar + " publicInstanceVar=" + publicInstanceVar);
	instanceVar = 2;
	publicInstanceVar = 10;
        System.out.println("2 - instanceVar=" + instanceVar + " publicInstanceVar=" + publicInstanceVar);
   }

   static {
// non-static instance variable can not be access in static block
//	System.out.println("3 - instanceVar=" + instanceVar + " publicInstanceVar=" + publicInstanceVar);
	System.out.println("4 - static=" + STATIC_CLASS_INSTANCE_VARIABLE + " staticFinal=" + STATIC_FINAL_CLASS_INSTANCE_VARIABLE);
	STATIC_CLASS_INSTANCE_VARIABLE = "WORLD";
System.out.println("5 - static=" + STATIC_CLASS_INSTANCE_VARIABLE + " staticFinal=" + STATIC_FINAL_CLASS_INSTANCE_VARIABLE);
   }

   public void print() {
	System.out.println("6 - instanceVar=" + instanceVar + " publicInstanceVar=" + publicInstanceVar);
	System.out.println("7 - static=" + STATIC_CLASS_INSTANCE_VARIABLE + " staticFinal=" + STATIC_FINAL_CLASS_INSTANCE_VARIABLE);
   }

   public static void main(String... args) {
	System.out.println("8 - In main");
	Initializers underTest = new Initializers();
	underTest.print();
   }

}


	
