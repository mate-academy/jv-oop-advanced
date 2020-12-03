package core.basesyntax;

import java.util.Random;

public class Main {

    public static void main(String [] args) {
        int numberFigures = new Random().nextInt(10);
        Figure [] figures = new Figure[numberFigures];
        for (int i = 0; i < numberFigures; i++) {
            figures[i] = figures[i].getFigure();
            System.out.print("Figure: " + figures[i].getName() + ", ");
            System.out.print(String.format("area: %.1f", figures[i].getArea()));
            System.out.print(" sq. units, ");
            figures[i].printUniqueParameters();
            System.out.print(" color: ");
            System.out.println(figures[i].getColor().toString().toLowerCase());
        }
    }
}
