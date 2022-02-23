package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public FigureType getRandomFigureSupplier() {
        int index = new Random().nextInt(FigureType.values().length);
        return FigureType.values()[index];
    }

    public Figures getRandomFigure() {

        FigureType name = getRandomFigureSupplier();

        switch (name) {
            case CIRCLE: {
                Circle circle = new Circle();
                circle.setColor(colorSupplier.getRandomColor());
                circle.setRadius(random.nextDouble());
                return circle;
            }
            case RIGHT_TRIANGLE: {
                RightTriangle rightTriangle = new RightTriangle();
                rightTriangle.setColor(colorSupplier.getRandomColor());
                rightTriangle.setFirstLeg(random.nextDouble());
                rightTriangle.setSecondLeg(random.nextDouble());
                return rightTriangle;

            }
            case SQUARE: {
                Square square = new Square();
                square.setColor(colorSupplier.getRandomColor());
                square.setSide(random.nextDouble());
                return square;
            }
            case ISOSCELES_TRAPEZOID: {
                IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
                isoscelesTrapezoid.setColor(colorSupplier.getRandomColor());
                isoscelesTrapezoid.setBottom(random.nextDouble());
                isoscelesTrapezoid.setHeight(random.nextDouble());
                isoscelesTrapezoid.setTop(random.nextDouble());
                return isoscelesTrapezoid;
            }
            default: {
                Rectangle rectangle = new Rectangle();
                rectangle.setColor(colorSupplier.getRandomColor());
                rectangle.setHeight(random.nextDouble());
                rectangle.setWidth(random.nextDouble());
                return rectangle;
            }
        }
    }
}
