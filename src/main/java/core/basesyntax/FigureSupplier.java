package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int RADIUS_DEFAULT = 10;
    private static final String COLOR_DEFAULT = "WHITE";
    private static final int FIGURE_NUMBER = 5;
    protected Random random = new Random();
    protected ColorSupplier colorSupplier = new ColorSupplier();

    protected Figure getRandomFigure() {
        int randomFigure = random.nextInt(FIGURE_NUMBER);
        switch (randomFigure) {
            case 0:
                return getRandomCircle();
            case 1:
                return getRandomTrapezoid();
            case 2:
                return getRandomRectangle();
            case 3:
                return getRandomRightRectangle();
            case 4:
                return getRandomSquare();
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(RADIUS_DEFAULT, COLOR_DEFAULT);
    }

    private Circle getRandomCircle() {
        return new Circle(random.nextInt(),
                colorSupplier.getRandomColor());
    }

    private IsoscelesTrapezoid getRandomTrapezoid() {
        return new IsoscelesTrapezoid(random.nextInt(),
                random.nextInt(), random.nextInt(), colorSupplier.getRandomColor());
    }

    private Rectangle getRandomRectangle() {
        return new Rectangle(random.nextInt(),
                random.nextInt(), colorSupplier.getRandomColor());
    }

    private RightTriangle getRandomRightRectangle() {
        return new RightTriangle(random.nextInt(),
                random.nextInt(), colorSupplier.getRandomColor());
    }

    private Square getRandomSquare() {
        return new Square(random.nextInt(), colorSupplier.getRandomColor());
    }
}
