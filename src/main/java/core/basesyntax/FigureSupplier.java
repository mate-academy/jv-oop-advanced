package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    Random random = new Random();
    ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        FigureTypes type = FigureTypes.values()[random.nextInt(FigureTypes.values().length)];
        switch (type) {
            case SQUARE:
                Square square = new Square();
                square.leg = random.nextInt(1,100);
                square.color = colorSupplier.getRandomColor();
                return square;
            case RECTANGLE:
                Rectangle rectangle = new Rectangle();
                rectangle.firstLeg = random.nextInt(1,100);
                rectangle.secondLeg = random.nextInt(1,100);
                rectangle.color = colorSupplier.getRandomColor();
                return rectangle;
            case RIGHT_TRIANGLE:
                RightTriangle rightTriangle = new RightTriangle();
                rightTriangle.firstLeg = random.nextInt(1,100);
                rightTriangle.secondLeg = random.nextInt(1,100);
                rightTriangle.color = colorSupplier.getRandomColor();
                return rightTriangle;
            case CIRCLE:
                Circle circle = new Circle();
                circle.color = colorSupplier.getRandomColor();
                circle.radius = random.nextInt(1,100);
                return circle;
            case ISOSCELES_TRAPEZOID:
                IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
                isoscelesTrapezoid.leg = random.nextInt(1,100);
                isoscelesTrapezoid.firstBase = random.nextInt(1,100);
                isoscelesTrapezoid.secondBase = random.nextInt(1,100);
                isoscelesTrapezoid.color = colorSupplier.getRandomColor();
                return isoscelesTrapezoid;
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle();
        circle.color = "White";
        circle.radius = 10;
        return circle;
    }
}
