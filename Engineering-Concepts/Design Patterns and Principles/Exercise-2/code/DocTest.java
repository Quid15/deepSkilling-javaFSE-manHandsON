public class DocTest {
    public static void main(String[] args) {
        
        System.out.println("--- Testing Word Factory ---");
        DocumentFactory wordFactory = new WordDocumentFactory();
        Document wordDoc = wordFactory.createDocument();
        wordDoc.open();
        wordDoc.save();
        
        System.out.println("\n--- Testing PDF Factory ---");
        DocumentFactory pdfFactory = new PdfDocumentFactory();
        pdfFactory.processNewDocument();
        
        System.out.println("\n--- Testing Excel Factory ---");
        DocumentFactory excelFactory = new ExcelDocumentFactory();
        Document excelDoc = excelFactory.createDocument();
        excelDoc.open();
        excelDoc.close();
    }
}
