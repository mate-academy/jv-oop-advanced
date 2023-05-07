package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    public static int getRandomLength() {
        Random random = new Random();
        return random.nextInt(9) + 1;
    }

    public static Figure getRandomFigure() {
        Random random = new Random();
        int figure = random.nextInt(4);
        switch (figure) {
            case (0): return new Circle();
            case (1): return new IsoscelesTrapezoid();
            case (2): return new Rectangle();
            case (3): return new RightTriangle();
            case (4): return new Square();
            default: return null;
        }
    }

    public static Figure getDefaultFigure() {
        return new Circle("WHITE", 10);
    }
}
