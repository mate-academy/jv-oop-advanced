package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(5);
        Figure losowaFigura;
        int losowyNumer = random.nextInt(21);
        double losowyDouble = losowyNumer;
        int losowaWysokosc = random.nextInt(5);
        String kolor = colorSupplier.getRandomColor();

        switch (index) {
            case 0 -> losowaFigura = new Circle(losowyDouble, kolor);
            case 1 -> losowaFigura = new Square(losowyDouble, kolor);
            case 2 -> losowaFigura = new Rectangle(losowyDouble, losowyDouble, kolor);
            case 3 -> losowaFigura = new RightTriangle(losowyDouble, losowyDouble, kolor);
            case 4 -> losowaFigura = new IsoscelesTrapezoid(losowyDouble, losowyDouble,
                    losowaWysokosc, kolor);
            default -> losowaFigura = null;
        }

        return losowaFigura;
    }

    public Figure getDefaultFigure() {
        return new Circle(10, "WHITE");
    }
}
