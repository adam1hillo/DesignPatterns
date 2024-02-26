package be.vdab.herhalingsoefeningen.brand;

public class Main {
    public static void main(String[] args) {

        var bewoner1 = new Bewoner("Adam");
        var bewoner2 = new Bewoner("Asia");
        var brandweerman1 = new Brandweerman(123);
        var brandweerman2 = new Brandweerman(456);
        Brand brand = new Brand();
        brand.addObserver(bewoner1);
        brand.addObserver(bewoner2);
        brand.addObserver(brandweerman1);
        brand.addObserver(brandweerman2);
        brand.breekUit();
    }
}
