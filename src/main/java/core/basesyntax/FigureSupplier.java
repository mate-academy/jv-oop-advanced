package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final static int BOUND = 100;
    private final String white = "WHITE";
    private final static int radius = 10;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    private int getRandomNum() {
        return random.nextInt(BOUND);
    }

    private String getRandomFigure() {
        return FigureList.values()[random.nextInt(FigureList.values().length)].name();
    }

    public Figure generateFigure() {
        switch (getRandomFigure()) {
            case ("CIRCLE"):
                Figure circle = new Circle(colorSupplier.getRandomColor(), getRandomNum());
                return circle;
            case ("SQUARE"):
                Figure square = new Square(colorSupplier.getRandomColor(), getRandomNum());
                return square;
            case ("RIGHT_TRIANGLE"):
                Figure rightTriangle = new RightTriangle(colorSupplier.getRandomColor(), getRandomNum(), getRandomNum());
                return rightTriangle;
            case ("ISOSCELES_TRAPEZOID"):
                Figure isoscelesTrapezoid = new IsoscelesTrapezoid(colorSupplier.getRandomColor(), getRandomNum(), getRandomNum(), getRandomNum());
                return isoscelesTrapezoid;
            case ("RECTANGLE"):
                Figure rectangle = new Rectangle(colorSupplier.getRandomColor(), getRandomNum(), getRandomNum());
                return rectangle;
        }
        return null;
    }

    public Figure getDefaultFigure() {
        return new Circle(white, radius);
    }
}
