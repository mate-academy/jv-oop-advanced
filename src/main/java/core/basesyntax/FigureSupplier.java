package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final int figureType = random.nextInt(5);

    public Figure getRandomFigure() {
        switch (figureType) {
            case 0:
                return new Square(random.nextInt(10) + 1, colorSupplier.getRandomColor());
            case 1:
                return new Rectangle(random.nextInt(10) + 1, random.nextInt(10) + 1,
                        colorSupplier.getRandomColor());
            case 2:
                return new RightTriangle(random.nextInt(10) + 1, random.nextInt(10) + 1,
                        colorSupplier.getRandomColor());
            case 3:
                return new Circle(random.nextInt(10) + 1, colorSupplier.getRandomColor());
            default:
                return new IsoscelesTrapezoid(random.nextInt(10) + 1, random.nextInt(10) + 1,
                        random.nextInt(10) + 1, colorSupplier.getRandomColor());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, "white");
    }

}
