package epsi.software.formes;

import epsi.software.formes.models.Line;
import epsi.software.formes.models.ShapeAbs;
import epsi.software.formes.models.Square;
import epsi.software.formes.models.Triangle;

import java.util.ArrayList;

/**
 * Hello world!
 */
public class DisplayConsole {
    public static void main(String[] args) {
        int number = 5;

        ArrayList<ShapeAbs> maListe = new ArrayList<>();
        maListe.add(new Line());
        maListe.add(new Line());
        maListe.add(new Line());
        maListe.add(new Line(8));
        maListe.add(new Line(8));
        maListe.add(new Square(7));
        maListe.add(new Square(7));
        maListe.add(new Square(7));
        maListe.add(new Square(7));
        maListe.add(new Triangle());
        maListe.add(new Triangle());
        maListe.add(new Triangle());
        maListe.add(new Triangle(6));
        maListe.add(new Triangle(6));

        for(ShapeAbs s : maListe){
            s.display();
            System.out.println("f");
        }
    }
}
