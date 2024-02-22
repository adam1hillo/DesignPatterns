package be.vdab.simplefactory.theorie;

enum DocumentFactoryEnum {

    INSTANCE;

    Document open(String bestandsnaam) {
        String extensie = bestandsnaam.substring(bestandsnaam.length()-4);
        return switch (extensie) {
            case "docx" -> new Tekst(bestandsnaam);
            case "xlsx" -> new Rekenblad(bestandsnaam);
            case "pptx" -> new Presentatie(bestandsnaam);
            default -> throw new IllegalArgumentException();
        };
    }
}
