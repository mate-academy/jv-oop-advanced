package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final String DEFAULT_COLOR = "White";
    private static final int RANDOM_NUMBER = new Random().nextInt(5);
    private static Random RANDOM = new Random();
    private static final int MAX_RANDOM_NUMBER = 100;
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        Figure figure;

        switch (RANDOM_NUMBER) {
            case 0 : {
                figure = createSquare();
                break;
            }
            case 1 : {
                figure = createRectangle();
                break;
            }
            case 2 : {
                figure = createRightTriangle();
                break;
            }
            case 3 : {
                figure = createCircle();
                break;
            }
            case 4 : {
                figure = createIsoscelesTrapezoid();
                break;
            }
            default: {
                figure = createSquare();
            }
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, 10.0);
    }

    private Square createSquare() {
        return new Square(colorSupplier.getRandomColor(),
                RANDOM.nextInt(MAX_RANDOM_NUMBER));
    }

    private Rectangle createRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),
                RANDOM.nextInt(MAX_RANDOM_NUMBER),
                RANDOM.nextInt(MAX_RANDOM_NUMBER));
    }

    private RightTriangle createRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                RANDOM.nextInt(MAX_RANDOM_NUMBER),
                RANDOM.nextInt(MAX_RANDOM_NUMBER));
    }

    private Circle createCircle() {
        return new Circle(colorSupplier.getRandomColor(),
                RANDOM.nextInt(MAX_RANDOM_NUMBER));
    }

    private IsoscelesTrapezoid createIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                RANDOM.nextInt(MAX_RANDOM_NUMBER),
                RANDOM.nextInt(MAX_RANDOM_NUMBER),
                RANDOM.nextInt(MAX_RANDOM_NUMBER));
    }
}
