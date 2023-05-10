package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final static int defaultLength = 10;
    private final static String defaultColor = Color.WHITE.name();
    private Random random = new Random();
    private  ColorSupplier colorSupplier = new ColorSupplier();

    public int getRandomLength() {

        return random.nextInt(defaultLength) + 1;
    }

    public Figure getRandomFigure() {
        int figure = random.nextInt(5);
        switch (figure) {
            case (0): return getCircle();
            case (1): return getIsoscelesTrapezoid();
            case (2): return getRectangle();
            case (3): return getRightTriangle();
            default: return getSquare();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(defaultColor, defaultLength);
    }

    private Figure getCircle() {
        int radius = getRandomLength();
        String color = colorSupplier.getRandomColor();
        return new Circle(color, radius);
    }

    private Figure getIsoscelesTrapezoid() {
        int length = getRandomLength();
        String color = colorSupplier.getRandomColor();
        return new IsoscelesTrapezoid(color, length, length + 4, length + 2);
    }

    private Figure getRectangle() {
        int length = getRandomLength();
        String color = colorSupplier.getRandomColor();
        return new Rectangle(color, length, length + 3);
    }

    private Figure getRightTriangle() {
        int length = getRandomLength();
        String color = colorSupplier.getRandomColor();
        return new RightTriangle(color, length + 3, length);
    }

    private Figure getSquare() {
        int length = getRandomLength();
        String color = colorSupplier.getRandomColor();
        return new Square(color,length);
    }
}
