package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int MAX_RANDOM_NUMBER = 10;
    private static final int DEFAULT_RADIUS = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        switch (figureNumber) {
            case 0 :
                return getRandomSquare();
            case 1 :
                return getRandomRectangle();
            case 2 :
                return getRandomRightTriangle();
            case 3 :
                return getRandomCircle();
            case 4 :
            default:
                return getRandomIsoscelesTrapezoid();
        }
    }

    private Figure getRandomSquare() {
        Square square = new Square();
        square.setColor(colorSupplier.getRandomColor());
        square.setSide(random.nextInt(MAX_RANDOM_NUMBER) + 1);
        return square;
    }

    private Figure getRandomRectangle() {
        Rectangle rectangle = new Rectangle();
        rectangle.setColor(colorSupplier.getRandomColor());
        rectangle.setLength(random.nextInt(MAX_RANDOM_NUMBER) + 1);
        rectangle.setWeight(random.nextInt(MAX_RANDOM_NUMBER) + 1);
        return rectangle;
    }

    private Figure getRandomRightTriangle() {
        RightTriangle rightTriangle = new RightTriangle();
        rightTriangle.setColor(colorSupplier.getRandomColor());
        rightTriangle.setFirstLeg(random.nextInt(MAX_RANDOM_NUMBER) + 1);
        rightTriangle.setSecondLeg(random.nextInt(MAX_RANDOM_NUMBER) + 1);
        return rightTriangle;
    }

    private Figure getRandomCircle() {
        Circle circle = new Circle();
        circle.setColor(colorSupplier.getRandomColor());
        circle.setRadius(random.nextInt(MAX_RANDOM_NUMBER) + 1);
        return circle;
    }

    private Figure getRandomIsoscelesTrapezoid() {
        IsoscelesTrapezoid trapezoid = new IsoscelesTrapezoid();
        trapezoid.setColor(colorSupplier.getRandomColor());
        trapezoid.setFirstBase(random.nextInt(MAX_RANDOM_NUMBER) + 1);
        trapezoid.setSecondBase(random.nextInt(MAX_RANDOM_NUMBER) + 1);
        trapezoid.setHeight(random.nextInt(MAX_RANDOM_NUMBER) + 1);
        return trapezoid;
    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle();
        circle.setColor(Color.WHITE.toString());
        circle.setRadius(DEFAULT_RADIUS);
        return circle;
    }
}
