package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_FIGURES = 5;
    private static final int MIN_SIZE = 1;
    private static final int MAX_SIZE = 10;

    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomFigure = random.nextInt(MAX_FIGURES) + 1;

        switch (randomFigure) {
            case 1:
                double radius = randomParameter();
                Circle circle = new Circle(radius);
                circle.setColor(colorSupplier.getRandomColor());
                return circle;
            case 2:
                double side = randomParameter();
                Square square = new Square(side);
                square.setColor(colorSupplier.getRandomColor());
                return square;
            case 3:
                double length = randomParameter();
                double width = randomParameter();
                Rectangle rectangle = new Rectangle(length, width);
                rectangle.setColor(colorSupplier.getRandomColor());
                return rectangle;
            case 4:
                double firstLeg = randomParameter();
                double secondLeg = randomParameter();
                double base = randomParameter();
                RightTriangle rightTriangle = new RightTriangle(
                        firstLeg, secondLeg, base);
                rightTriangle.setColor(colorSupplier.getRandomColor());
                return rightTriangle;
            case 5:
                double firstBase = randomParameter();
                double secondBase = randomParameter();
                double leg = randomParameter();
                IsoscelesTrapezoid isoscelesTrapezoid =
                        new IsoscelesTrapezoid(firstBase, secondBase, leg);
                isoscelesTrapezoid.setColor(colorSupplier.getRandomColor());
                return isoscelesTrapezoid;
            default:
                return getDefaultFigure();
        }
    }

    public double randomParameter() {
        return random.nextInt(MIN_SIZE, MAX_SIZE);
    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle(10);
        circle.setColor("white");
        return circle;
    }
}
