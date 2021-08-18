package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 20;
    private static final int MAX_INTEGER_NUMBER = 100;
    private static final Random random = new Random();
    private static final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        String figureType = getRandomFigureType();
        switch (figureType) {
            case "square": return getRandomSquare();
            case "rectangle": return getRandomRectangle();
            case "circle": return getRandomCircle();
            case "right triangle": return getRandomRightTriangle();
            default: return getRandomIsoscelesTrapezoid();
        }
    }

    private Figure getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(), getRandomInt());
    }

    private Figure getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(), getRandomInt(), getRandomInt());
    }

    private Figure getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(), getRandomInt());
    }

    private Figure getRandomRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(), getRandomInt(), getRandomInt());
    }

    private Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                getRandomInt(), getRandomInt(), getRandomInt());
    }

    public int getRandomArrayLength() {
        return getRandomInt(FIGURE_COUNT);
    }

    private int getRandomInt(int n) {
        return random.nextInt(n) + 1;
    }

    private int getRandomInt() {
        return getRandomInt(MAX_INTEGER_NUMBER);
    }

    private String getRandomFigureType() {
        int randomIndex = random.nextInt(FigureType.values().length);
        return FigureType.values()[randomIndex].getName();
    }
}
