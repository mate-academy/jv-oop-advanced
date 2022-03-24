package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final int MAX_VALUE = 27;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomCircle() {
        Circle circle = new Circle(colorSupplier.getRandomColor(), random.nextInt(MAX_VALUE));
        return circle;
    }

    public Figure getRandomSquare() {
        Square square = new Square(colorSupplier.getRandomColor(), random.nextInt(MAX_VALUE));
        return square;
    }

    public Figure getRandomRightTriangle() {
        RightTriangle rightTriangle = new RightTriangle(colorSupplier.getRandomColor(),
                random.nextInt(MAX_VALUE), random.nextInt(MAX_VALUE));
        return rightTriangle;
    }

    public Figure getRandomRectangle() {
        Rectangle rectangle = new Rectangle(colorSupplier.getRandomColor(),
                random.nextInt(MAX_VALUE), random.nextInt(MAX_VALUE));
        return rectangle;
    }

    public Figure getRandomIsoscelesTrapezoid() {
        IsoscelesTrapezoid isoscelesTrapezoid =
                new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_VALUE), random.nextInt(MAX_VALUE),
                        random.nextInt(MAX_VALUE));
        return isoscelesTrapezoid;

    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }

    public Figure getRandomFigure() {
        int indexOfFigure = random.nextInt(FIGURE_COUNT);
        switch (indexOfFigure) {
            case 0:
                return getRandomCircle();
            case 1:
                return getRandomIsoscelesTrapezoid();
            case 2:
                return getRandomSquare();
            case 3:
                return getRandomRectangle();
            default:
                return getRandomRightTriangle();
        }

    }

}
