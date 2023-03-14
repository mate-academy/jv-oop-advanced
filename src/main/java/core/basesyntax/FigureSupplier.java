package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static int PROPERTIES = 25;
    private static Random random = new Random();
    private static final int FIGURECOUNT = 5;

    public static Figure getRandomFigure() {
        int figure = random.nextInt(FIGURECOUNT);
        String color = new ColorSupplier().getRandomColor();
        switch (figure) {
            case 0:
                return getRandomSquare(color);
            case 1:
                return getRandomCircle(color);
            case 2:
                return getRandomIsoscelesTrapezoid(color);
            case 3:
                return getRandomRectangle(color);
            case 4:
                return getRandomRightTriangle(color);
            default:
                return getDefaultFigure();
        }
    }

    public static Figure getDefaultFigure() {
        return new Circle("white", 10);
    }

    private static Square getRandomSquare(String color) {
        return new Square(color, random.nextInt(PROPERTIES));
    }

    private static Circle getRandomCircle(String color) {
        return new Circle(color, random.nextInt(PROPERTIES));
    }

    private static IsoscelesTrapezoid getRandomIsoscelesTrapezoid(String color) {
        return new IsoscelesTrapezoid(color, random.nextInt(PROPERTIES),
                random.nextInt(PROPERTIES), random.nextInt(PROPERTIES));
    }

    private static Rectangle getRandomRectangle(String color) {
        return new Rectangle(color, random.nextInt(PROPERTIES),
                random.nextInt(PROPERTIES));
    }

    private static RightTriangle getRandomRightTriangle(String color) {
        return new RightTriangle(color, random.nextInt(PROPERTIES),
                random.nextInt(PROPERTIES));
    }
}
