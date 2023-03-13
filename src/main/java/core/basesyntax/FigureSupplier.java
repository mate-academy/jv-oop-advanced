package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_TYPES = 5;
    private static final int MAX_SIDE = 12;
    private static final String DEFAULT_COLOR = "white";
    private static final int DEFAULT_SIDE = 10;
    private final Random random = new Random();
    private ColorSupplier randomColor = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomFigure = random.nextInt(FIGURE_TYPES);
        switch (randomFigure) {
            case (0):
                return getRandomSquare();
            case (1):
                return getRandomRectangle();
            case (2):
                return getRandomRightTriangle();
            case (3):
                return getRandomCircle();
            default:
                return getIsoscelesTrapezoid();
        }
    }
    
    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_SIDE, DEFAULT_COLOR);
    }

    private Figure getRandomSquare() {
        return new Square((new Random().nextInt(MAX_SIDE)
                + 1), randomColor.getRandomColor());
    }

    private Figure getRandomRectangle() {
        return new Rectangle((new Random().nextInt(MAX_SIDE)
                + 1), (new Random().nextInt(MAX_SIDE) + 1), randomColor.getRandomColor());
    }

    private Figure getRandomRightTriangle() {
        return new RightTriangle((new Random().nextInt(MAX_SIDE)
                + 1), (new Random().nextInt(MAX_SIDE) + 1), randomColor.getRandomColor());
    }

    private Figure getRandomCircle() {
        return new Circle((new Random().nextInt(MAX_SIDE)
                + 1), randomColor.getRandomColor());
    }

    private Figure getIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid((new Random().nextInt(MAX_SIDE)
                + 1), (new Random().nextInt(MAX_SIDE) + 1),
                (new Random().nextInt(MAX_SIDE) + 1), randomColor.getRandomColor());
    }
}
