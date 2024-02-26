package be.vdab.decorator.theorie;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Koffie eenvoudig = new EenvoudigeKoffie();
//        System.out.println(eenvoudig.getKost());
//        System.out.println(eenvoudig.getBereidignswijze());
//        System.out.println();
//        Koffie metMelk = new MetMelk(new EenvoudigeKoffie());
//        System.out.println(metMelk.getKost());
//        System.out.println(metMelk.getBereidignswijze());
//        System.out.println();
//        Koffie metChocolade = new MetChocolade(new EenvoudigeKoffie());
//        System.out.println(metChocolade.getKost());
//        System.out.println(metChocolade.getBereidignswijze());
//        System.out.println();
//        Koffie metMelkEnChocolade = new MetChocolade(new MetMelk(new EenvoudigeKoffie()));
//        System.out.println(metMelkEnChocolade.getKost());
//        System.out.println(metMelkEnChocolade.getBereidignswijze());

//        Koffie koffie = new EenvoudigeKoffie();
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Melk (j/n):");
//        if ("j".equals(scanner.next())) {
//            koffie = new MetMelk(koffie);
//        }
//        System.out.println("Chocolade (j/n):");
//        if ("j".equals(scanner.next())) {
//            koffie = new MetChocolade(koffie);
//        }
//        System.out.println(koffie.getKost());
//        System.out.println(koffie.getBereidignswijze());

        try (var reader = new LineNumberReader(Files.newBufferedReader(Path.of("/users/joann/data/liedje.txt")))) {
            for (String line; (line = reader.readLine()) != null;) {
                System.out.print(reader.getLineNumber());
                System.out.print(":");
                System.out.println(line);
            }
        }
        catch (IOException e) {
            e.printStackTrace(System.err);
        }
    }
}
