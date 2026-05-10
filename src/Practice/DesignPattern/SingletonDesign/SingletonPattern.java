package Practice.DesignPattern.SingletonDesign;

public class SingletonPattern {
    public static void main(String[] args) {

        //NOTE-> here we are stoping new PrinterManager() by using pvt constructor PrinterManager else it always create a new obj
        //PrinterManager a=new PrinterManager();

        // Everyone gets the SAME manager
        PrinterManager workerA = PrinterManager.getPrinterManager();
        PrinterManager workerB= PrinterManager.getPrinterManager();

        workerA.printing("Report.pdf");
        workerB.printing("Marksheet.jpg");


        System.out.println(workerA==workerB);  // true

        System.out.println(workerA.hashCode());  //1283928880
        System.out.println(workerB.hashCode());  //1283928880
    }
}
