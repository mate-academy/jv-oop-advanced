package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int MAX_FIGURE_VALUE = 10;
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
                return getRandomIsoscelesTrapezoid();
            default:
                return getDefaultFigure();
        }
    }

    public Figure getRandomSquare() {
        Square square = new Square();
        square.setColor(colorSupplier.getRandomColor());
        square.setSide(random.nextInt(MAX_FIGURE_VALUE) + 1);
        return square;
    }

    public Figure getRandomRectangle() {
        Rectangle rectangle = new Rectangle();
        rectangle.setColor(colorSupplier.getRandomColor());
        rectangle.setLength(random.nextInt(MAX_FIGURE_VALUE) + 1);
        rectangle.setWeight(random.nextInt(MAX_FIGURE_VALUE) + 1);
        return rectangle;
    }

    public Figure getRandomRightTriangle() {
        RightTriangle rightTriangle = new RightTriangle();
        rightTriangle.setColor(colorSupplier.getRandomColor());
        rightTriangle.setFirstLeg(random.nextInt(MAX_FIGURE_VALUE) + 1);
        rightTriangle.setSecondLeg(random.nextInt(MAX_FIGURE_VALUE) + 1);
        return rightTriangle;
    }

    public Figure getRandomCircle() {
        Circle circle = new Circle();
        circle.setColor(colorSupplier.getRandomColor());
        circle.setRadius(random.nextInt(MAX_FIGURE_VALUE) + 1);
        return circle;
    }

    public Figure getRandomIsoscelesTrapezoid() {
        IsoscelesTrapezoid trapezoid = new IsoscelesTrapezoid();
        trapezoid.setColor(colorSupplier.getRandomColor());
        trapezoid.setFirstBase(random.nextInt(MAX_FIGURE_VALUE) + 1);
        trapezoid.setSecondBase(random.nextInt(MAX_FIGURE_VALUE) + 1);
        trapezoid.setHeight(random.nextInt(MAX_FIGURE_VALUE) + 1);
        return trapezoid;
    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle();
        circle.setColor(Color.WHITE.toString());
        circle.setRadius(MAX_FIGURE_VALUE);
        return circle;
    }
}
