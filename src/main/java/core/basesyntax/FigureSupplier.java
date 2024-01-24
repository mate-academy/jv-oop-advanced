package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public Figure getRandomFigure() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Random random = new Random();
        int rand = random.nextInt(5);

        switch (rand) {
            case 0:
                return new Circle(10, colorSupplier.getRandomColor());
            case 1:
                return new IsoscelesTrapezoid(10, 5, 2, colorSupplier.getRandomColor());
            case 2:
                return new Rectangle(5, 6, colorSupplier.getRandomColor());
            case 3:
                return new RightTriangle(5, 8, colorSupplier.getRandomColor());
            case 4:
                return new Square(5, colorSupplier.getRandomColor());
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10,"WHITE");
    }
}
