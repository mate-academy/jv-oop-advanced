package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_VALUE = 100;
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private static final int DEFAULT_RADIUS = 10;

    private final ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {

        Figure figure;
        switch (getRandomFigures()) {
            case CIRCLE:
                figure = createRandomCircle();
                break;
            case ISOSCELESTRAPEZOID:
                figure = createRandomIsoscelesTrapezoid();
                break;
            case RECTANGLE:
                figure = createRandomRectangle();
                break;
            case RIGHTTRIANGLE:
                figure = createRandomRightTriangle();
                break;
            default:
                figure = createRandomSquare();
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
    }

    private Figures getRandomFigures() {
        int index = random.nextInt(Figures.values().length);
        return Figures.values()[index];
    }

    private Figure createRandomRectangle() {
        return new Rectangle(random.nextInt(MAX_VALUE), random.nextInt(MAX_VALUE),
                colorSupplier.getRandomColor());
    }

    private Figure createRandomCircle() {
        return new Circle(random.nextInt(MAX_VALUE), colorSupplier.getRandomColor());
    }

    private Figure createRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(random.nextInt(MAX_VALUE), random.nextInt(MAX_VALUE),
                random.nextInt(MAX_VALUE), colorSupplier.getRandomColor());
    }

    private Figure createRandomRightTriangle() {
        return new RightTriangle(random.nextInt(MAX_VALUE),
                random.nextInt(MAX_VALUE), colorSupplier.getRandomColor());
    }

    private Figure createRandomSquare() {
        return new Square(random.nextInt(MAX_VALUE), colorSupplier.getRandomColor());
    }
}
