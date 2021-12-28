package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_SIZE = 11;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
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

    private int getRandomInt() {
        if (random != null) {
            return random.nextInt(MAX_SIZE);
        } else {
            return (new Random()).nextInt(MAX_SIZE);
        }
    }

    private Square getRandomSquare() {
        String color = colorSupplier.getRandomColor();
        int side = getRandomInt();
        return new Square(color, side);
    }

    private Rectangle getRandomRectangle() {
        String color = colorSupplier.getRandomColor();
        int sideA = getRandomInt();
        int sideB = getRandomInt();
        return new Rectangle(color, sideA, sideB);
    }

    private Triangle getRandomTriangle() {
        String color = colorSupplier.getRandomColor();
        int firstLeg = getRandomInt();
        int secondLeg = getRandomInt();
        return new Triangle(color, firstLeg, secondLeg);
    }

    private Trapezoid getRandomTrapezoid() {
        String color = colorSupplier.getRandomColor();
        int baseA = getRandomInt();
        int baseB = getRandomInt();
        int leg = getRandomInt();
        return new Trapezoid(color, baseA, baseB, leg);
    }

    private Circle getRandomCircle() {
        String color = colorSupplier.getRandomColor();
        int radius = getRandomInt();
        return new Circle(color, radius);
    }
}
