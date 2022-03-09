package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    private Circle getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(), random.nextInt(100));
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100));
    }

    private Rectangle getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),
                random.nextInt(100),
                random.nextInt(100));
    }

    private RightTriangle getRandomRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                random.nextInt(100),
                random.nextInt(100));
    }

    private Square getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(),
                random.nextInt(100));
    }

    public Figure getRandomFigure() {
        Figure figure = null;
        switch (random.nextInt(5)) {
            case 0 :
                figure = getRandomCircle();
                break;
            case 1 :
                figure = getRandomIsoscelesTrapezoid();
                break;
            case 2 :
                figure = getRandomRectangle();
                break;
            case 3 :
                figure = getRandomRightTriangle();
                break;
            case 4 :
                figure = getRandomSquare();
                break;
            default:
                break;
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}
