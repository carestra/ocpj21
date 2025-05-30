public class PrintTextBlock {
   public String label(String title, String author) {
	return """
	       Book:
	       """ + title + " by " + author;
   }

   public void prepare() {
	String labelled = label("""
          Java Study Guide
          For Java 21
            2024 Edition""", "Jeanne & Scott");
	System.out.println(labelled);
   }

   public void noNewLineEscapeCharacter() {
	String block = """
		John \
		Doe""";
	System.out.println(block);
   }

   public void withIncidentalWhiteSpace() {
	String block = """
	 The Sun \
	 makes me:
	 HAPPY!
	 All lines are imaginary vertical line drawn on the leftmost non-whitespace character in the block.
	""";
	String otherBlock = """
	  This is the leftmost non-whitespace line 
	   of the end of the block (3 double quotes).""";

	System.out.println(block);
	System.out.println(otherBlock);
   }

   public static void main(String... args) {
	PrintTextBlock block = new PrintTextBlock();
	block.prepare();
	block.noNewLineEscapeCharacter();
   	block.withIncidentalWhiteSpace();
   }
}

