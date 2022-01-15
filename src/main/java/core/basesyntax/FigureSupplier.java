package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public Figure getRandomFigure() {
        FigureTypes figureType = getFigureType();

        ColorSupplier colorSupplier = new ColorSupplier();
        Color color = colorSupplier.getRandomColor();

        switch (figureType) {
            case RECTANGLE:
                int sideA;
                int sideB;

                do {
                    sideA = new Random().nextInt(100);
                    sideB = new Random().nextInt(100);
                } while (sideA == 0 && sideB == 0);

                return new Rectangle(color, sideA, sideB);

            case SQUARE:
                int side;

                do {
                    side = new Random().nextInt(100);
                } while (side == 0);

                return new Square(color, side);

            case RIGHT_TRIANGLE:
                int firstLeg;
                int secondLeg;

                do {
                    firstLeg = new Random().nextInt(100);
                    secondLeg = new Random().nextInt(100);
                } while (firstLeg == 0 & secondLeg == 0);

                return new RightTriangle(color, firstLeg, secondLeg);

            case CIRCLE:
                int radius;

                do {
                    radius = new Random().nextInt(100);
                } while (radius == 0);

                return new Circle(color, radius);

            case ISOSCELES_TRAPEZOID:
                int lowBase;
                int topBase;
                int height;

                do {
                    lowBase = new Random().nextInt(100);
                    topBase = new Random().nextInt(100);
                    height = new Random().nextInt(100);
                } while (lowBase == 0 & topBase == 0 & height == 0);

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
