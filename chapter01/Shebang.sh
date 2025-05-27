#!java --source 21

/*
* On a Unix-like operating system, a single-file source-code application,
* can also be launched as a shebang file like a script.
* Within the a java source file, as the first line in the file add path/to/java/home --source <version> 
* The file cannot have .java as its file extension, and must also be executable chmod +x.
* With that, it can be launched with: ./Shebang.sh
*/
public class Shebang {
   public static void main(String[] args) {
       System.out.println("Hello Wolrd!");
   }
}

