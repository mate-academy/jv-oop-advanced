package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        FigureTypes type = FigureTypes.values()[random.nextInt(FigureTypes.values().length)];
        switch (type) {
            case SQUARE:
                Square square = new Square();
                square.setLeg(random.nextInt(1,100));
                square.setColor(colorSupplier.getRandomColor());
                return square;
            case RECTANGLE:
                Rectangle rectangle = new Rectangle();
                rectangle.setFirstLeg(random.nextInt(1,100));
                rectangle.setSecondLeg(random.nextInt(1,100));
                rectangle.setColor(colorSupplier.getRandomColor());
                return rectangle;
            case RIGHT_TRIANGLE:
                RightTriangle rightTriangle = new RightTriangle();
                rightTriangle.setFirstLeg(random.nextInt(1,100));
                rightTriangle.setSecondLeg(random.nextInt(1,100));
                rightTriangle.setColor(colorSupplier.getRandomColor());
                return rightTriangle;
            case CIRCLE:
                Circle circle = new Circle();
                circle.setColor(colorSupplier.getRandomColor());
                circle.setRadius(random.nextInt(1,100));
                return circle;
            case ISOSCELES_TRAPEZOID:
                IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
                isoscelesTrapezoid.setLeg(random.nextInt(1,100));
                isoscelesTrapezoid.setFirstBase(random.nextInt(1,100));
                isoscelesTrapezoid.setSecondBase(random.nextInt(1,100));
                isoscelesTrapezoid.setColor(colorSupplier.getRandomColor());
                return isoscelesTrapezoid;
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle();
        circle.setColor("White");
        circle.setRadius(10);
        return circle;
    }
}
