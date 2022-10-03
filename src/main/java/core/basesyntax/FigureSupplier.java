package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final String SQUARE = "square";
    private static final String RECTANGLE = "rectangle";
    private static final String ISOSCELES_TRAPEZOID = "isoscelesTrapezoid";
    private static final String CIRCLE = "circle";
    private static final String RIGHT_TRIANGLE = "triangle";
    private static final String WHITE = "WHITE";
    private static final int MAX_INDEX = 10;
    private static final int RADIUS = 10;
    private final Random random = new Random();
    private final ColorSupplier supplier = new ColorSupplier();
    private Figure figure;

    public Figure getRandomFigure() {
        Figures figures = Figures.values()[random.nextInt(Figures.values().length)];

        switch (figures) {
            case SQUARE:
                figure = createRandomSquare();
                break;
            case RECTANGLE:
                figure = createRandomRectangle();
                break;
            case ISOSCELES_TRAPEZOID:
                figure = createRandomIsoscelesTrapezoid();
                break;
            case CIRCLE:
                figure = createRandomCircle();
                break;
            case TRIANGLE:
                figure = createRandomRightTriangle();
                break;
            default:
                figure = getDefaultFigure();
                break;
        }
        return figure;
    }

    public Figure createRandomSquare() {
        int sideA = random.nextInt(MAX_INDEX) + 1;
        return new Square(SQUARE,
                supplier.getRandomColor(),
                sideA);
    }

    public Figure createRandomRectangle() {
        int sideA = random.nextInt(MAX_INDEX) + 1;
        int sideB = random.nextInt(MAX_INDEX) + 1;
        return new Rectangle(RECTANGLE,
                supplier.getRandomColor(),
                sideA,
                sideB);
    }

    public Figure createRandomIsoscelesTrapezoid() {
        int sideA = random.nextInt(MAX_INDEX) + 1;
        int sideB = random.nextInt(MAX_INDEX) + 1;
        int sideC = random.nextInt(MAX_INDEX) + 1;
        int index = sideA - (sideB + 2 * sideC);

        if (index >= 0) {
            while (index >= 0) {
                sideB = random.nextInt(MAX_INDEX) + 1;
                sideC = random.nextInt(MAX_INDEX) + 1;
                index = sideA - (sideB + 2 * sideC);
            }
        }
        if (sideA < sideB) {
            figure = new IsoscelesTrapezoid(ISOSCELES_TRAPEZOID,
                    supplier.getRandomColor(),
                    sideB,
                    sideA,
                    sideC);
        } else {
            figure = new IsoscelesTrapezoid(ISOSCELES_TRAPEZOID,
                    supplier.getRandomColor(),
                    sideA,
                    sideB,
                    sideC);
        }
        return figure;
    }

    public Figure createRandomCircle() {
        int radius = random.nextInt(MAX_INDEX) + 1;
        return new Circle(CIRCLE,
                supplier.getRandomColor(),
                radius);
    }

    public Figure createRandomRightTriangle() {
        int firstLeg = random.nextInt(MAX_INDEX) + 1;
        int secondLeg = random.nextInt(MAX_INDEX) + 1;
        return new RightTriangle(RIGHT_TRIANGLE,
                supplier.getRandomColor(),
                firstLeg,
                secondLeg);
    }

    public Figure getDefaultFigure() {
        return new Circle(CIRCLE, WHITE, RADIUS);
    }
}
