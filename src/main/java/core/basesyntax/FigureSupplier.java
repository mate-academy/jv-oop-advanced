package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 4;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(FIGURE_COUNT);
        Figure figure;
        switch (index) {
            case 0:
                figure = getRandomCircle();
                break;
            case 1:
                figure = getRandomIsoscelesTrapezoid();
                break;
            case 2:
                figure = getRandomRectangle();
                break;
            case 3:
                figure = getRandomRightTriangle();
                break;
            case 4:
            default:
                figure = getRandomSquare();
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }

    private Figure getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(), random.nextDouble());
    }

    private Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                random.nextDouble(),
                random.nextDouble(),
                random.nextDouble());
    }

    private Figure getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),
                random.nextDouble(),
                random.nextDouble());
    }

    private Figure getRandomRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                random.nextDouble(),
                random.nextDouble());
    }

    private Figure getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(), random.nextDouble());
    }
}
