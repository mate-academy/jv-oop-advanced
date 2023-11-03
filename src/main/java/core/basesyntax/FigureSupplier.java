package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Random random = new Random();
    private static final int DEFAULT_LENGTH = 10;
    private static final String DEFAULT_COLOR = Color.WHITE.toString();

    private int getIndex() {
        return random.nextInt(4);
    }

    private int getFirstSide() {
        return random.nextInt(1,10);
    }

    private int getSecondSide() {
        return random.nextInt(1,10);
    }

    public Figure getRandomFigure() {
        switch (getIndex()) {
            case 0:
                Circle circle = new Circle();
                circle.setRadius(getFirstSide());
                circle.setColor(new ColorSupplier().getRandomColor());
                return circle;
            case 1:
                Square square = new Square();
                square.setSide(getFirstSide());
                square.setColor(new ColorSupplier().getRandomColor());
                return square;
            case 2:
                Rectangle rectangle = new Rectangle();
                rectangle.setLength(getFirstSide());
                rectangle.setHeight(getSecondSide());
                rectangle.setColor(new ColorSupplier().getRandomColor());
                return rectangle;
            case 3:
                IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
                isoscelesTrapezoid.setSide(getFirstSide());
                isoscelesTrapezoid.setHeight(getSecondSide());
                isoscelesTrapezoid.setColor(new ColorSupplier().getRandomColor());
                return isoscelesTrapezoid;
            default:
                RightTriangle rightTriangle = new RightTriangle();
                rightTriangle.setFirstLeg(getFirstSide());
                rightTriangle.setSecondLeg(getSecondSide());
                rightTriangle.setColor(new ColorSupplier().getRandomColor());
                return rightTriangle;
        }
    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle();
        circle.setRadius(DEFAULT_LENGTH);
        circle.setColor(DEFAULT_COLOR);
        return circle;
    }
}
