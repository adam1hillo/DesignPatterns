package be.vdab.observer.taken;

public class Main {
    public static void main(String[] args) {

        FotokopieMachine fotokopieMachine = new FotokopieMachine("AZF6146");
        var technieker1 = new Technieker(12345);
        var technieker2 = new Technieker(6789);
        fotokopieMachine.aadObserver(technieker1);
        fotokopieMachine.aadObserver(technieker2);
        fotokopieMachine.kopieer(5000);
        fotokopieMachine.kopieer(5000);


    }
}
