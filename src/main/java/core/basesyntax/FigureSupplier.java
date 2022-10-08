package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 4;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(), random.nextDouble());
    }

    public Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                random.nextDouble(),
                random.nextDouble(),
                random.nextDouble());
    }

    public Figure getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),
                random.nextDouble(),
                random.nextDouble());
    }

    public Figure getRandomRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                random.nextDouble(),
                random.nextDouble());
    }

    public Figure getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(), random.nextDouble());
    }

    public Figure getRandomFigure() {
        int index = random.nextInt(FIGURE_COUNT);
        Figure figure;
        switch (index) {
            case 0:
                figure = getRandomSquare();
                break;
            case 1:
                figure = getRandomIsoscelesTrapezoid();
                break;
            case 2:
                figure = getRandomRightTriangle();
                break;
            case 3:
                figure = getRandomCircle();
                break;
            case 4:
                figure = getRandomRectangle();
                break;
            default:
                figure = getRandomRectangle();
                break;
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}
