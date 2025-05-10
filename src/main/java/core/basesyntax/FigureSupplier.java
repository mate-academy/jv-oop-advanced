package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static double DEFAULT_CIRCLE_RADIUS = 10;
    private static String DEFAULT_COLOR = "white";
    private static int MAX_RANDOM_FIGURES_QTY = 6;
    private static int MAX_RANDOM_BOUND_LIMIT = 15;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomCircle() {
        Figure circle = new Circle(colorSupplier.getRandomColor(),
                Figure.FigureType.CIRCLE,
                random.nextInt(MAX_RANDOM_BOUND_LIMIT));
        return circle;
    }

    public Figure getRandomIsoscelesTrapezoid() {
        Figure isoscelesTrapezoid = new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                Figure.FigureType.TRAPEZOID,
                random.nextInt(MAX_RANDOM_BOUND_LIMIT),
                random.nextInt(MAX_RANDOM_BOUND_LIMIT), random.nextInt(MAX_RANDOM_BOUND_LIMIT));
        return isoscelesTrapezoid;
    }

    public Figure getRandomRectangle() {
        Figure rectangle = new Rectangle(colorSupplier.getRandomColor(),
                Figure.FigureType.RECTANGLE,
                random.nextInt(MAX_RANDOM_BOUND_LIMIT),
                random.nextInt(MAX_RANDOM_BOUND_LIMIT));
        return rectangle;
    }

    public Figure getRandomRightTriangle() {
        Figure triangle = new RightTriangle(colorSupplier.getRandomColor(),
                Figure.FigureType.TRIANGLE,
                random.nextInt(MAX_RANDOM_BOUND_LIMIT),
                random.nextInt(MAX_RANDOM_BOUND_LIMIT));
        return triangle;
    }

    public Figure getRandomSquare() {
        Figure square = new Square(colorSupplier.getRandomColor(),
                Figure.FigureType.SQUARE,
                random.nextInt(MAX_RANDOM_BOUND_LIMIT));
        return square;
    }

    public Figure getDefaultFigure() {
        Figure circle = new Circle(DEFAULT_COLOR,
                Figure.FigureType.CIRCLE,
                DEFAULT_CIRCLE_RADIUS);
        return circle;
    }

    public Figure getRandomFigure() {
        int index = random.nextInt(MAX_RANDOM_FIGURES_QTY);
        switch (index) {
            case 1:
                return getRandomCircle();
            case 2:
                return getRandomIsoscelesTrapezoid();
            case 3:
                return getRandomRectangle();
            case 4:
                return getRandomRightTriangle();
            case 6:
                return getRandomSquare();
            default:
                return getDefaultFigure();
        }
    }
}
