package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    static final int MAX_SIZE = 11;

    public Figure getRandomFigure() {
        Random random = new Random();
        Figures figure = Figures.values()[random.nextInt(Figures.values().length)];
        switch (figure) {
            case SQUARE: {
                return getRandomSquare();
            }
            case RECTANGLE: {
                return getRandomRectangle();
            }
            case TRIANGLE: {
                return getRandomTriangle();
            }
            case TRAPEZOID: {
                return getRandomTrapezoid();
            }
            default: {
                return getRandomCircle();
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

    private Square getRandomSquare() {
        ColorSupplier colorSupplier = new ColorSupplier();
        String color = colorSupplier.getRandomColor();
        Random random = new Random();
        int side = getRandomInt(random);
        return new Square(color, side);
    }

    private Rectangle getRandomRectangle() {
        ColorSupplier colorSupplier = new ColorSupplier();
        String color = colorSupplier.getRandomColor();
        Random random = new Random();
        int sideA = getRandomInt(random);
        int sideB = getRandomInt(random);
        return new Rectangle(color, sideA, sideB);
    }

    private Triangle getRandomTriangle() {
        ColorSupplier colorSupplier = new ColorSupplier();
        String color = colorSupplier.getRandomColor();
        Random random = new Random();
        int firstLeg = getRandomInt(random);
        int secondLeg = getRandomInt(random);
        return new Triangle(color, firstLeg, secondLeg);
    }

    private Trapezoid getRandomTrapezoid() {
        ColorSupplier colorSupplier = new ColorSupplier();
        String color = colorSupplier.getRandomColor();
        Random random = new Random();
        int baseA = getRandomInt(random);
        int baseB = getRandomInt(random);
        int leg = getRandomInt(random);
        return new Trapezoid(color, baseA, baseB, leg);
    }

    private Circle getRandomCircle() {
        ColorSupplier colorSupplier = new ColorSupplier();
        String color = colorSupplier.getRandomColor();
        Random random = new Random();
        int radius = getRandomInt(random);
        return new Circle(color, radius);
    }
}
