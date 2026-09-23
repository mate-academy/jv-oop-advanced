package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_FIGURE_SIZE = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getDefaultFigure() {
        Circle defaultCircle = new Circle();
        defaultCircle.setColor(Color.WHITE.name());
        defaultCircle.setRadius(10);

        return defaultCircle;
    }

    public Figure getRandomFigure() {
        int index = random.nextInt(FigureType.values().length);
        return switch (FigureType.values()[index]) {
            case SQUARE -> getRandomSquare();
            case RECTANGLE -> getRandomRectangle();
            case RIGHT_TRIANGLE -> getRandomRightTriangle();
            case CIRCLE -> getRandomCircle();
            case ISOSCELES_TRAPEZOID -> getRandomIsoscelesTrapezoid();
        };
    }

    private Square getRandomSquare() {
        Square square = new Square();
        square.setSide(random.nextInt(MAX_FIGURE_SIZE) + 1);
        square.setColor(colorSupplier.getRandomColor());

        return square;
    }

    private Rectangle getRandomRectangle() {
        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(random.nextInt(MAX_FIGURE_SIZE) + 1);
        rectangle.setWidth(random.nextInt(MAX_FIGURE_SIZE) + 1);
        rectangle.setColor(colorSupplier.getRandomColor());

        return rectangle;
    }

    private RightTriangle getRandomRightTriangle() {
        RightTriangle rightTriangle = new RightTriangle();
        rightTriangle.setFirstLeg(random.nextInt(MAX_FIGURE_SIZE) + 1);
        rightTriangle.setSecondLeg(random.nextInt(MAX_FIGURE_SIZE) + 1);
        rightTriangle.setColor(colorSupplier.getRandomColor());

        return rightTriangle;
    }

    private Circle getRandomCircle() {
        Circle circle = new Circle();
        circle.setRadius(random.nextInt(MAX_FIGURE_SIZE) + 1);
        circle.setColor(colorSupplier.getRandomColor());

        return circle;
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
        isoscelesTrapezoid.setHeight(random.nextInt(MAX_FIGURE_SIZE) + 1);
        isoscelesTrapezoid.setLongerBase(random.nextInt(MAX_FIGURE_SIZE) + 1);
        isoscelesTrapezoid.setShorterBase(random.nextInt(MAX_FIGURE_SIZE) + 1);
        isoscelesTrapezoid.setColor(colorSupplier.getRandomColor());

        return isoscelesTrapezoid;
    }
}
