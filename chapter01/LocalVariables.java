/**
* A 'local variable' is a variable defined within a constructor, method or initialiazer block.
* Local varibles do not have a defualt value!
* They must be initialized before use.
* 
* Contructor parameters and method paramters are variable passed to constructor or method respectively.
* These parameters are like 'local variables' that have to be initialized before use.
*
**/
public class LocalVariables {
   public void findAnswer(boolean check) {}

   public void checkAnswer() {
	boolean value; // this is a local variable, uninitialized.
	findAnswer(value); // Will throw compilation error, since method parameter has not been initialized.
   }

   public void willFindAnswer() {
	boolean value; // this is a local variable, uninitialized.
	if (value) { // Will throw compilation error, since variable has not been initialized
	  int yes = 0;
	}
   }

}
