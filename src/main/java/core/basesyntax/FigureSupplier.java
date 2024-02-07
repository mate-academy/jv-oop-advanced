package core.basesyntax;

import java.util.Random;

public class FigureSupplier extends ColorSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int RANDOM_BOUND = 30;
    private static final int DEFAULT_CIRCLE_RADIUS = 10;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int numberOfFigures = random.nextInt(FIGURE_COUNT);
        switch (numberOfFigures) {
            case 0:
                return getRandomCircle();
            case 1:
                return getRandomIsoscelesTrapezoid();
            case 2:
                return getRandomRectangle();
            case 3:
                return getRandomRightTriangle();
            case 4:
                return getRandomSquare();
            default:
                return getRandomSquare();
        }
    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle();
        circle.setRadius(DEFAULT_CIRCLE_RADIUS);
        circle.setColor(Color.WHITE);
        return circle;
    }

    private Circle getRandomCircle() {
        Color randomColor = getRandomColor();
        Circle circle = new Circle();
        circle.setRadius(random.nextInt(RANDOM_BOUND));
        circle.setColor(randomColor);
        return circle;
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        Color randomColor = getRandomColor();
        IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
        isoscelesTrapezoid.setSide(random.nextInt(RANDOM_BOUND));
        isoscelesTrapezoid.setBottom(random.nextInt(RANDOM_BOUND));
        isoscelesTrapezoid.setTop(random.nextInt(RANDOM_BOUND));
        isoscelesTrapezoid.setColor(randomColor);
        return isoscelesTrapezoid;
    }

    private Rectangle getRandomRectangle() {
        Color randomColor = getRandomColor();
        Rectangle rectangle = new Rectangle();
        rectangle.setFirstLeg(random.nextInt(RANDOM_BOUND));
        rectangle.setSecondLeg(random.nextInt(RANDOM_BOUND));
        rectangle.setColor(randomColor);
        return rectangle;
    }

    private RightTriangle getRandomRightTriangle() {
        Color randomColor = getRandomColor();
        RightTriangle rightTriangle = new RightTriangle();
        rightTriangle.setFirstLeg(random.nextInt(RANDOM_BOUND));
        rightTriangle.setSecondLeg(random.nextInt(RANDOM_BOUND));
        rightTriangle.setColor(randomColor);
        return rightTriangle;
    }

    private Square getRandomSquare() {
        Color randomColor = getRandomColor();
        Square square = new Square();
        square.setSide(random.nextInt(RANDOM_BOUND));
        square.setColor(randomColor);
        return square;
    }
}


