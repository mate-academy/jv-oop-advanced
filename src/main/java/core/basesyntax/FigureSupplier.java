package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURES_NUMBERS = 5;
    private static final int MAX_FIGURE_LENGTH = 20;
    private static final int DEFAULT_CIRCLE_RADIUS = 10;
    private static final String DEFAULT_CIRCLE_COLOR = Color.WHITE.name();
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getDefaultFigure() {
        Circle circle = new Circle();
        circle.setColor(DEFAULT_CIRCLE_COLOR);
        circle.setRadius(DEFAULT_CIRCLE_RADIUS);
        return circle;
    }

    public Figure getRandomFigure() {
        int figureIndex = random.nextInt(FIGURES_NUMBERS);
        switch (figureIndex) {
            case 1:
                return getRandomCircle();
            case 2:
                return getRandomTrapezoid();
            case 3:
                return getRandomRectangle();
            case 4:
                return getRandomTriangle();
            case 5:
            default:
                return getRandomSquare();
        }
    }

    private Figure getRandomCircle() {
        Circle circle = new Circle();
        circle.setRadius(MAX_FIGURE_LENGTH);
        circle.setColor(colorSupplier.getRandomColor());
        return circle;
    }

    private Figure getRandomTrapezoid() {
        IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
        isoscelesTrapezoid.setTopSide(random.nextInt(MAX_FIGURE_LENGTH) + 1);
        isoscelesTrapezoid.setBottomSide(isoscelesTrapezoid.getTopSide() + 1);
        isoscelesTrapezoid.setHeight(random.nextInt(MAX_FIGURE_LENGTH) + 1);
        isoscelesTrapezoid.setColor(colorSupplier.getRandomColor());
        return isoscelesTrapezoid;
    }

    private Figure getRandomRectangle() {
        Rectangle rectangle = new Rectangle();
        rectangle.setSideOne(random.nextInt(MAX_FIGURE_LENGTH) + 1);
        rectangle.setSideTwo(random.nextInt(MAX_FIGURE_LENGTH) + 1);
        rectangle.setColor(colorSupplier.getRandomColor());
        return rectangle;
    }

    private Figure getRandomTriangle() {
        RightTriangle rightTriangle = new RightTriangle();
        rightTriangle.setFirstLeg(random.nextInt(MAX_FIGURE_LENGTH) + 1);
        rightTriangle.setSecondLeg(random.nextInt(MAX_FIGURE_LENGTH) + 1);
        rightTriangle.setColor(colorSupplier.getRandomColor());
        return rightTriangle;
    }

    private Figure getRandomSquare() {
        Square square = new Square();
        square.setSide(random.nextInt(MAX_FIGURE_LENGTH) + 1);
        square.setColor(colorSupplier.getRandomColor());
        return square;
    }
}
