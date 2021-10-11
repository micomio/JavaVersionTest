import javax.tools.JavaCompiler;

public class JavaVersionTest {
    public static void main(String[] args){
        System.out.println("\n\n *** JAVA INFO *** \n\n");

        VersionPrinter vp = new VersionPrinter();
        vp.printInfo();
    }
}
