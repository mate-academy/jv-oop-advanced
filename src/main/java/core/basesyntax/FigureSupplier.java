package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(5);

        switch (figureType) {
            case 0:
                return new Square(colorSupplier.getRandomColor(), random.nextDouble() * 10 + 1);
            case 1:
                return new Rectangle(colorSupplier.getRandomColor(), random.nextDouble() * 10 + 1,
                        random.nextDouble() * 10 + 1);
            case 2:
                return new RightTriangle(colorSupplier.getRandomColor(), random.nextDouble() * 10
                        + 1, random.nextDouble() * 10 + 1);
            case 3:
                return new Circle(colorSupplier.getRandomColor(), random.nextDouble() * 10 + 1);
            case 4:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), random.nextDouble()
                        * 10 + 1, random.nextDouble() * 10 + 1, random.nextDouble() * 10 + 1);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}
