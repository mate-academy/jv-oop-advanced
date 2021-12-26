package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    static final int MAX_SIZE = 11;

    public Figure getRandomFigure() {
        Random random = new Random();
        Figures figure = Figures.values()[random.nextInt(Figures.values().length)];
        switch (figure) {
            case SQUARE: {
                return getRandomSquare(random);
            }
            case RECTANGLE: {
                return getRandomRectangle(random);
            }
            case TRIANGLE: {
                return getRandomTriangle(random);
            }
            case TRAPEZOID: {
                return getRandomTrapezoid(random);
            }
            default: {
                return getRandomCircle(random);
            }
        }
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

    private Square getRandomSquare(Random random) {
        ColorSupplier colorSupplier = new ColorSupplier();
        String color = colorSupplier.getRandomColor();
        int side = getRandomInt(random);
        return new Square(color, side);
    }

    private Rectangle getRandomRectangle(Random random) {
        ColorSupplier colorSupplier = new ColorSupplier();
        String color = colorSupplier.getRandomColor();
        int sideA = getRandomInt(random);
        int sideB = getRandomInt(random);
        return new Rectangle(color, sideA, sideB);
    }

    private Triangle getRandomTriangle(Random random) {
        ColorSupplier colorSupplier = new ColorSupplier();
        String color = colorSupplier.getRandomColor();
        int firstLeg = getRandomInt(random);
        int secondLeg = getRandomInt(random);
        return new Triangle(color, firstLeg, secondLeg);
    }

    private Trapezoid getRandomTrapezoid(Random random) {
        ColorSupplier colorSupplier = new ColorSupplier();
        String color = colorSupplier.getRandomColor();
        int baseA = getRandomInt(random);
        int baseB = getRandomInt(random);
        int leg = getRandomInt(random);
        return new Trapezoid(color, baseA, baseB, leg);
    }

    private Circle getRandomCircle(Random random) {
        ColorSupplier colorSupplier = new ColorSupplier();
        String color = colorSupplier.getRandomColor();
        int radius = getRandomInt(random);
        return new Circle(color, radius);
    }
}
