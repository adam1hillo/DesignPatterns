package be.vdab.decorator.taken;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Arrangement arrangement = new Bungalow();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wil jij een barbecue in jouw arrangement (j/n):");
        if ("j".equals(scanner.next())) {
            arrangement = new MetBarbecue(arrangement);
        }
        System.out.println("Wil jij de fietsen in jouw arrangement (j/n):");
        if ("j".equals(scanner.next())) {
            arrangement = new MetFiets(arrangement);
        }
        System.out.println(arrangement.getTaak());


    }
}
