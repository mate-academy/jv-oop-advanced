package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public Figure getRandomFigure() {
        FigureTypes figureType = getFigureType();

        ColorSupplier colorSupplier = new ColorSupplier();
        Color color = colorSupplier.getRandomColor();

        switch (figureType) {
            case RECTANGLE:
                int sideA = getRandomValue();
                int sideB = getRandomValue();
                return new Rectangle(color, sideA, sideB);

            case SQUARE:
                int side = getRandomValue();
                return new Square(color, side);

            case RIGHT_TRIANGLE:
                int firstLeg = getRandomValue();
                int secondLeg = getRandomValue();
                return new RightTriangle(color, firstLeg, secondLeg);

            case CIRCLE:
                int radius = getRandomValue();
                return new Circle(color, radius);

            case ISOSCELES_TRAPEZOID:
                int lowBase = getRandomValue();
                int topBase = getRandomValue();
                int height = getRandomValue();
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

    private int getRandomValue() {
        return new Random().nextInt(99) + 1;
    }
}
