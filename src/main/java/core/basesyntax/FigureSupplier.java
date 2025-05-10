package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int BOUND = 100;
    private static final int FIGURE_NUMBER = 5;
    private static final int DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = "white";
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_NUMBER);
        switch (figureNumber) {
            case 0:
                return createCircle();
            case 1:
                return createIsoscelesTrapezoid();
            case 2:
                return createRectangle();
            case 3:
                return createRightTriangle();
            default:
                return createSquare();
        }
    }

    public Figure getDefaultFigure() {
        Figure defaultFigure = new Circle(DEFAULT_RADIUS);
        defaultFigure.setColor(DEFAULT_COLOR);
        return defaultFigure;
    }

    private Figure createCircle() {
        int randomRadius = random.nextInt(BOUND);
        Figure circle = new Circle(randomRadius);
        String randomColor = colorSupplier.getRandomColor().toLowerCase();
        circle.setColor(randomColor);
        return circle;
    }

    private Figure createIsoscelesTrapezoid() {
        int randomBase = random.nextInt(BOUND);
        int randomTop = random.nextInt(BOUND);
        int randomHeight = random.nextInt(BOUND);
        Figure trapezoid = new IsoscelesTrapezoid(randomBase, randomTop, randomHeight);
        String randomColor = colorSupplier.getRandomColor().toLowerCase();
        trapezoid.setColor(randomColor);
        return trapezoid;
    }

    private Figure createRectangle() {
        int randomLength = random.nextInt(BOUND);
        int randomWidth = random.nextInt(BOUND);
        Figure rectangle = new Rectangle(randomLength, randomWidth);
        String randomColor = colorSupplier.getRandomColor().toLowerCase();
        rectangle.setColor(randomColor);
        return rectangle;
    }

    private Figure createRightTriangle() {
        int randomFirstLeg = random.nextInt(BOUND);
        int randomSecondLeg = random.nextInt(BOUND);
        Figure triangle = new RightTriangle(randomFirstLeg, randomSecondLeg);
        String randomColor = colorSupplier.getRandomColor().toLowerCase();
        triangle.setColor(randomColor);
        return triangle;
    }

    private Figure createSquare() {
        int randomSide = random.nextInt(BOUND);
        Figure square = new Square(randomSide);
        String randomColor = colorSupplier.getRandomColor().toLowerCase();
        square.setColor(randomColor);
        return square;
    }
}
