package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public Figure getRandomFigure() {
        Random rnd = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();
        switch (rnd.nextInt(41) % 4) {
            case 0:
                return new Square(colorSupplier.getRandomColor(), rnd.nextInt(10) + 1);
            case 1:
                return new RightTriangle(colorSupplier.getRandomColor(), rnd.nextInt(10) + 1,
                        rnd.nextInt(10) + 1);
            case 2:
                return new Circle(colorSupplier.getRandomColor(),
                        rnd.nextInt(10) + 1);
            default:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), rnd.nextInt(10) + 1,
                        rnd.nextInt(10) + 1, rnd.nextInt(10) + 1);
        }
    }
}
