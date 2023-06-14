package core.basesyntax;

import java.util.Random;

public class FigureSupplier  {
    Random random = new Random();
    ColorSupplier colorSupplier = new ColorSupplier();
    final static int NUMBER_OF_FIGURES = 5;

    public Figure getDefaultFigure() {
        return new Circle(10, Color.WHITE);
    }

    public Figure getRandomFigure() {
        switch (random.nextInt(NUMBER_OF_FIGURES)) {
            case 0:
                return new Circle(random.nextInt(100), colorSupplier.getRandomColor());
            case 1:
                return new Rectangle(random.nextInt(100), random.nextInt(100), colorSupplier.getRandomColor());
            case 2:
                return new Square(random.nextInt(100), colorSupplier.getRandomColor());
            case 3:
                return new RightTriangle(random.nextInt(100), random.nextInt(100), random.nextInt(100), colorSupplier.getRandomColor());
            case 4:
                return new IsoscelesTrapezoid(random.nextInt(100), random.nextInt(100), random.nextInt(100), colorSupplier.getRandomColor());
            default:
                return getDefaultFigure();
        }
    }
}
