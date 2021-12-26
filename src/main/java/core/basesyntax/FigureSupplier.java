package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    static final int MAX_SIZE = 11;

    public Figure getRandomFigure() {
        Figure retVal = null;
        ColorSupplier colorSupplier = new ColorSupplier();
        Random random = new Random();
        Figures figure = Figures.values()[random.nextInt(Figures.values().length)];
        switch (figure) {
            case SQUARE: {
                retVal = new Square(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_SIZE));
                break;
            }
            case RECTANGLE: {
                retVal = new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_SIZE),
                        random.nextInt(MAX_SIZE));
                break;
            }
            case TRIANGLE: {
                retVal = new Triangle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_SIZE),
                        random.nextInt(MAX_SIZE));
                break;
            }
            case TRAPEZOID: {
                retVal = new Trapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_SIZE),
                        random.nextInt(MAX_SIZE),
                        random.nextInt(MAX_SIZE));
                break;
            }
            default: {
                retVal = new Circle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_SIZE));
                break;
            }
        }
        return retVal;
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }

    private int getRandomInt(Random random) {
        if (random != null) {
            return random.nextInt(MAX_SIZE);
        } else {
            return (new Random()).nextInt(MAX_SIZE);
        }
    }

    private Circle getRandomCircle() {
        ColorSupplier colorSupplier = new ColorSupplier();
        String color = colorSupplier.getRandomColor();
        Random random = new Random();
        int radius = getRandomInt(random);
        return new Circle(color, radius);
    }

    private Square getSquareCircle() {
        ColorSupplier colorSupplier = new ColorSupplier();
        String color = colorSupplier.getRandomColor();
        Random random = new Random();
        int side = getRandomInt(random);
        return new Square(color, side);
    }
}
