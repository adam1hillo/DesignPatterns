package be.vdab.simplefactory.theorie;

abstract class Document {

    private final String bestandsnaam;

    protected Document (String bestandsnaam) {
        this.bestandsnaam = bestandsnaam;
    }

    abstract void print();
    abstract void printPreview();
}
