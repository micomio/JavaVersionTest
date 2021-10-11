public class VersionPrinter {
    public void printInfo() {
        String version = String.valueOf(Runtime.version().feature());
        String spec = System.getProperty("java.vm.vendor");

        printHelper("Version", version);
        printHelper("SpecVer", spec);
    }

    private void printHelper(String what, String content){
        System.out.println(what + ": " + content + "\n");
    }
}
