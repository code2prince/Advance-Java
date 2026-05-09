package Practice.DesignPattern;

public class PrinterManager {
    // 1. Create a private static variable to hold the ONE instance
    private static PrinterManager printerManager;

    // 2. Make the constructor PRIVATE so no one can say "new PrinterManager()"
    private PrinterManager(){
        System.out.println("printer manager initialized ");
    }
    // 3. Provide a public way to get that one instance
    public static PrinterManager getPrinterManager(){
        if(printerManager==null){
            printerManager=new PrinterManager();
        }
        return printerManager;
    }
    public void printing(String doc){
        System.out.println("printing...."+ doc);
    }
}
