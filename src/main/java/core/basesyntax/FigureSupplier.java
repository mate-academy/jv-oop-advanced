package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public Figure getRandomFigure() {
        FigureTypes figureType = getFigureType();

        ColorSupplier colorSupplier = new ColorSupplier();
        Color color = colorSupplier.getRandomColor();

        switch (figureType) {
            case RECTANGLE:
                int sideA = new Random().nextInt(100) + 1;
                int sideB = new Random().nextInt(100) + 1;
                return new Rectangle(color, sideA, sideB);

            case SQUARE:
                int side = new Random().nextInt(100) + 1;
                return new Square(color, side);

            case RIGHT_TRIANGLE:
                int firstLeg = new Random().nextInt(100) + 1;
                int secondLeg = new Random().nextInt(100) + 1;
                return new RightTriangle(color, firstLeg, secondLeg);

            case CIRCLE:
                int radius = new Random().nextInt(100) + 1;
                return new Circle(color, radius);

            case ISOSCELES_TRAPEZOID:
                int lowBase = new Random().nextInt(100) + 1;
                int topBase = new Random().nextInt(100) + 1;
                int height = new Random().nextInt(100) + 1;
                return new IsoscelesTrapezoid(color, lowBase, topBase, height);

            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, 10);
    }

    private FigureTypes getFigureType() {
        int index = new Random().nextInt(FigureTypes.values().length);
        return FigureTypes.values()[index];
    }
}
