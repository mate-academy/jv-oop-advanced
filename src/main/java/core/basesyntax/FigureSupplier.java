package core.basesyntax;

import static core.basesyntax.ColorSupplier.RANDOM;

public class FigureSupplier {

    public Figure getRandomFigure() {
        int ran = RANDOM.nextInt(5);
        int a = RANDOM.nextInt(10) + 2;
        int b = RANDOM.nextInt(10) + 2;
        int c = RANDOM.nextInt(10) + 2;
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
