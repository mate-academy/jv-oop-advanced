package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private Figure figure;
    private final Figure defaultFigure = new Circle(Color.WHITE, 10);

    public Figure getRandomFigure() {
        int randomFigureNumber = random.nextInt(5);
        switch (randomFigureNumber) {
            case 0:
                figure = getRandomSquare();
                break;
            case 1:
                figure = getRandomRectangle();
                break;
            case 2:
                figure = getRandomRightTriangle();
                break;
            case 3:
                figure = getRandomCircle();
                break;
            case 4:
                figure = getRandomIsoscelesTrapezoid();
                break;
            default:
                break;
        }
        return figure;
    }

    public Figure getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(), random.nextInt(20));
    }

    public Figure getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),
                random.nextInt(20),
                random.nextInt(20));
    }

    public Figure getRandomRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                random.nextInt(20),
                random.nextInt(20));
    }

    public Figure getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(), random.nextInt(20));
    }

    public Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                random.nextInt(20),
                random.nextInt(10),
                random.nextInt(20));
    }

    public Figure getDefaultFigure() {
        return defaultFigure;
    }
}
