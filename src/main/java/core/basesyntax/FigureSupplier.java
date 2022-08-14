package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Random random = new Random();
    private static final int MAX_INT = 25;
    private static final ColorSupplier colorSupplier = new ColorSupplier();
    private static final String[] FIGURES = {"Rectangle",
            "RightTriangle",
            "Circle",
            "Square",
            "IsoscelesTrapezoid"};

    public Figure getRandomFigure() {
        Figure figure = null;

        switch (FIGURES[random.nextInt(FIGURES.length)]) {
            case "Rectangle": {
                figure = getRectangle();
                break;
            }
            case "RightTriangle": {
                figure = getRightTriangle();
                break;
            }
            case "Circle": {
                figure = getCircle();
                break;
            }
            case "Square": {
                figure = getSquare();
                break;
            }
            case "IsoscelesTrapezoid": {
                figure = getIsoscelesTrapezoid();
                break;
            }
            default: break;
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }

    private Circle getCircle() {
        return new Circle(colorSupplier.getRandomColor(),
                random.nextInt(MAX_INT) + 1);
    }

    private Rectangle getRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),
                random.nextInt(MAX_INT) + 1,
                random.nextInt(MAX_INT) + 1);
    }

    private RightTriangle getRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                random.nextInt(MAX_INT) + 1,
                random.nextInt(MAX_INT) + 1);
    }

    private IsoscelesTrapezoid getIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                random.nextInt(MAX_INT) + 1,
                random.nextInt(MAX_INT) + 1,
                random.nextInt(MAX_INT) + 1);
    }

    private Square getSquare() {
        return new Square(colorSupplier.getRandomColor(), random.nextInt(MAX_INT) + 1);
    }
}
