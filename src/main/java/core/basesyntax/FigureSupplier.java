package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    private static final int MAX_VALUE = 5;
    private static final Random random = new Random();
    private ColorSupplier colorSupplier;

    public FigureSupplier(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }

    public Figure getRandomFigure() {
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
                int width = random.nextInt(10) + 1;
                int height = random.nextInt(10) + 1;
                String colorRectangle = ColorSupplier.getRandomColor();
                Rectangle rectangle = new Rectangle(colorRectangle, width, height);
                return rectangle;

            case 3:
                int firstLeg = random.nextInt(10) + 1;
                int secondLeg = random.nextInt(10) + 1;
                String colorRightTriangle = ColorSupplier.getRandomColor();
                RightTriangle rightTriangle = new RightTriangle(
                        colorRightTriangle, firstLeg, secondLeg);
                return rightTriangle;

            case 4:
                int base1 = random.nextInt(10) + 1;
                int base2 = random.nextInt(10) + 1;
                int height2 = random.nextInt(10) + 1;
                String colorIsoscelesTrapezoid = ColorSupplier.getRandomColor();
                IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid(
                        colorIsoscelesTrapezoid, base1, base2, height2);
                return isoscelesTrapezoid;

            default:
                return new Circle("Withe", 10);
        }
    }
}
