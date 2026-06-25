package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        FigureType[] figureTypesArr = FigureType.values();
        FigureType randomFigureType = figureTypesArr[random.nextInt(figureTypesArr.length)];

        switch (randomFigureType) {
            case CIRCLE:
                return new Circle(colorSupplier.getRandomColor(), random.nextDouble(100));
            case SQUARE:
                return new Square(colorSupplier.getRandomColor(), random.nextDouble(100.00));
            case RECTANGLE:
                return new Rectangle(colorSupplier.getRandomColor(), random.nextDouble(100),
                         random.nextDouble(100));
            case RIGHT_TRIANGLE:
                return new RightTriangle(colorSupplier.getRandomColor(), random.nextDouble(100),
                        random.nextDouble(100));
            case ISOSCELES_TRAPEZOID:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextDouble(100), random.nextDouble(100),
                        random.nextDouble(100));
            default:
                throw new IllegalStateException("Unknown figure type: " + randomFigureType);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}
