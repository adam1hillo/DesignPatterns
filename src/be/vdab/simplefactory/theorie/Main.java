package be.vdab.simplefactory.theorie;

class Main {
    public static void main(String[] args) {
        DocumentFactory factory = new DocumentFactory();
        Document document = factory.open("liedje.docx");
        document.print();
        document.printPreview();

        Document document2 = DocumentFactoryEnum.INSTANCE.open("liedje.xlsx");
        document2.print();
        document2.printPreview();
    }
}
