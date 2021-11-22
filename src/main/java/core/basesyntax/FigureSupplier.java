package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final TypeSupplier typeSupplier = new TypeSupplier();
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        switch (typeSupplier.getRandomType()) {
            case "SQUARE" -> {
                Square square = new Square();
                square.setSide(random.nextInt(10) + 1);
                square.setColor(colorSupplier.getRandomColor());
                return square;
            }
            case "RECTANGLE" -> {
                Rectangle rectangle = new Rectangle();
                rectangle.setFirstSide(random.nextInt(10) + 1);
                rectangle.setSecondSide(random.nextInt(10) + 1);
                rectangle.setColor(colorSupplier.getRandomColor());
                return rectangle;
            }
            case "RIGHT_TRIANGLE" -> {
                RightTriangle rightTriangle = new RightTriangle();
                rightTriangle.setFirstLeg(random.nextInt(10) + 1);
                rightTriangle.setSecondLeg(random.nextInt(10) + 1);
                rightTriangle.setColor(colorSupplier.getRandomColor());
                return rightTriangle;
            }
            case "CIRCLE" -> {
                Circle circle = new Circle();
                circle.setRadius(random.nextInt(10) + 1);
                circle.setColor(colorSupplier.getRandomColor());
                return circle;
            }
            default -> {
                IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
                isoscelesTrapezoid.setShorterSide(random.nextInt(10) + 1);
                isoscelesTrapezoid.setLongerSide(random.nextInt(10) + 1);
                isoscelesTrapezoid.setHeight(random.nextInt(10) + 1);
                isoscelesTrapezoid.setColor(colorSupplier.getRandomColor());
                return isoscelesTrapezoid;
            }
        }
    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle();
        circle.setRadius(10);
        circle.setColor("WHITE");
        return circle;
    }
}
