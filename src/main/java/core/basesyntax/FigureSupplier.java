package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 4;
    public static final int FIGURE_SIZE = 100;
    public static final int DEFAULT_RADIUS = 10;
    public static final String DEFAULT_COLOR = Color.WHITE.toString();
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(FIGURE_COUNT);
        Figure figure;
        switch (index) {
            case 0:
                figure = this.getRandomCircle();
                break;
            case 1:
                figure = this.getRandomSquare();
                break;
            case 2:
                figure = this.getRandomRectangle();
                break;
            case 3:
                figure = this.getRandomIsoscelesTrapezoid();
                break;
            case 4:
                figure = this.getRandomRightTriangle();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + index);
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
    }

    private Circle getRandomCircle() {
        return new Circle(random.nextInt(FIGURE_SIZE), colorSupplier.getRandomColor());
    }

    private Square getRandomSquare() {
        return new Square(random.nextInt(FIGURE_SIZE), colorSupplier.getRandomColor());
    }

    private Rectangle getRandomRectangle() {
        return new Rectangle(random.nextInt(FIGURE_SIZE),
                random.nextInt(FIGURE_SIZE), colorSupplier.getRandomColor());
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(random.nextInt(FIGURE_SIZE),
                random.nextInt(FIGURE_SIZE), random.nextInt(FIGURE_SIZE),
                colorSupplier.getRandomColor());
    }

    private RightTriangle getRandomRightTriangle() {
        return new RightTriangle(random.nextInt(FIGURE_SIZE),
                random.nextInt(FIGURE_SIZE), colorSupplier.getRandomColor());
    }
}
