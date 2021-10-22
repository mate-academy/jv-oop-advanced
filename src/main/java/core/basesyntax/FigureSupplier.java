package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final int MAX_RANDOM_NUMBER = 30;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Circle getRandomCircle() {
        Circle circle = new Circle(colorSupplier.getRandomColor());
        circle.setRadius(random.nextInt(MAX_RANDOM_NUMBER));
        return circle;
    }

    public Rectangle getRandomRectangle() {
        Rectangle rectangle = new Rectangle(colorSupplier.getRandomColor());
        rectangle.setSideA(random.nextInt(MAX_RANDOM_NUMBER));
        rectangle.setSideB(random.nextInt(MAX_RANDOM_NUMBER));
        return rectangle;
    }

    public IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        IsoscelesTrapezoid trapezoid = new IsoscelesTrapezoid(colorSupplier.getRandomColor());
        trapezoid.setHeight(random.nextInt(MAX_RANDOM_NUMBER));
        trapezoid.setLowerSide(random.nextInt(MAX_RANDOM_NUMBER));
        trapezoid.setUpperSide(random.nextInt(MAX_RANDOM_NUMBER));
        return trapezoid;
    }

    public Square getRandomSquare() {
        Square square = new Square(colorSupplier.getRandomColor());
        square.setSide(random.nextInt(MAX_RANDOM_NUMBER));
        return square;
    }

    public RightTriangle getRandomRightTriangle() {
        RightTriangle rightTriangle = new RightTriangle(colorSupplier.getRandomColor());
        rightTriangle.setFirstLeg(random.nextInt(MAX_RANDOM_NUMBER));
        rightTriangle.setSecondLeg(random.nextInt(MAX_RANDOM_NUMBER));
        return rightTriangle;
    }

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        Figure figure;
        switch (figureNumber) {
            case 1:
                figure = getRandomCircle();
                break;
            case 2:
                figure = getRandomRectangle();
                break;
            case 3:
                figure = getRandomRightTriangle();
                break;
            case 4:
                figure = getRandomIsoscelesTrapezoid();
                break;
            default:
                figure = getRandomSquare();
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        return new Circle(10, Color.WHITE.toString());
    }
}
