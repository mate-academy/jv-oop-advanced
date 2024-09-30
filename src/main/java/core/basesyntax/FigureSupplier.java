package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    private static final int MAX_VALUE = 5;
    private static final Random random = new Random();
    private final ColorSupplier colorSupplier;

    public FigureSupplier(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
    }

    public static Figure getDefaultFigure() {
        return new Circle("White", 10);
    }

    public static Figure getRandomFigure() {
        int figureType = random.nextInt(MAX_VALUE);

        switch (figureType) {

            case 0:
                int side = random.nextInt(10) + 1;
                String colorSquare = ColorSupplier.getRandomColor();
                Square square = new Square(colorSquare, side);
                return square;
            case 1:
                int radius = random.nextInt(10) + 1;
                String colorCircle = ColorSupplier.getRandomColor();
                Circle circle = new Circle(colorCircle, radius);
                return circle;

            case 2:
                int bothside = random.nextInt(10) + 1;
                int height = random.nextInt(10) + 1;
                String colorRectangle = ColorSupplier.getRandomColor();
                Rectangle rectangle = new Rectangle(colorRectangle, bothside, height);
                return rectangle;

            case 3:
                int baseLength = random.nextInt(10) + 1;
                int height2 = random.nextInt(10) + 1;
                String colorRightTriangle = ColorSupplier.getRandomColor();
                RightTriangle rightTriangle = new RightTriangle(colorRightTriangle,
                        baseLength, height2);
                return rightTriangle;

            case 4:
                int upperSide = random.nextInt(10) + 1;
                int lowerSide = random.nextInt(10) + 1;
                int height3 = random.nextInt(10) + 1;
                String colorTrapezoid = ColorSupplier.getRandomColor();
                IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid(colorTrapezoid,
                        upperSide, lowerSide, height3);
                return isoscelesTrapezoid;

            default:
                return new Circle("White", 10);
        }
    }
}
