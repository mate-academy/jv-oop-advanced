package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static Random random = new Random();
    protected static Circle circle = new Circle(random.nextInt(), ColorSupplier.getRandomColor());
    protected static IsoscelesTrapezoid isoscelesTrapezoid
            = new IsoscelesTrapezoid(random.nextInt(),
            random.nextInt(), random.nextInt());
    protected static Rectangle rectangle = new Rectangle(random.nextInt(),
            random.nextInt());
    protected static RightTriangle rightTriangle = new RightTriangle(random.nextInt(),
            random.nextInt());
    protected static Square square = new Square(random.nextInt());

    private static Circle getRandomCircle() {
        return circle;
    }

    private static IsoscelesTrapezoid getRandomTrapezoid() {
        return isoscelesTrapezoid;
    }

    private static Rectangle getRandomRectangle() {
        return rectangle;
    }

    private static RightTriangle getRandomRightRectangle() {
        return rightTriangle;
    }

    private static Square getRandomSquare() {
        return square;
    }

    public FigureForm getRandomFigure(int randomFigure) {
        randomFigure = random.nextInt(5);
        switch (randomFigure) {
            case 1:
                return FigureSupplier.getRandomCircle();
            case 2:
                return getRandomTrapezoid();
            case 3:
                return getRandomRectangle();
            case 4:
                return getRandomRightRectangle();
            case 5:
                return getRandomSquare();
            default:
                return null;
        }
    }

    public FigureForm getDefaultFigure() {
        return new Circle(10,"WHITE");
    }
}
