package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    public Figure getRandomFigure() {
        int ran = new Random().nextInt(5);
        int a = new Random().nextInt(10) + 2;
        int b = new Random().nextInt(10) + 2;
        int c = new Random().nextInt(10) + 2;
        switch (ran) {
            case (0):
                return new Square(a);
            case (1):
                return new Rectangle(a,b);
            case (2):
                return new RightTriangle(a,b);
            case (3):
                return new Circle(a);
            default:
                return new IsoscelesTrapezoid(a,b,c);
        }

    }

    public Figure getDefaultFigure() {
        return new Circle(10, "white");
    }
}
