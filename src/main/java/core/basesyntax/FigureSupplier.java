package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Random random = new Random();

    public static Figure getRandomFigure() {
        int index = random.nextInt(5);
        switch (index) {
            case 0: return getRandomCircle();
            case 1: return getRandomSquare();
            case 2: return getRandomRectangle();
            case 3: return getRandomRightTriangle();
            case 4: return getRandomIsoscelesTrapezoid();
            default: return getDefaultFigure();
        }
    }

    public static Figure getDefaultFigure() {
        return new Circle("white", 10);
    }

    private static Figure getRandomCircle() {
        return new Circle(ColorSuplier.getRandomColor(), random.nextInt(10));
    }

    private static Figure getRandomSquare() {
        return new Square(ColorSuplier.getRandomColor(), random.nextInt(10));
    }

    private static Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(ColorSuplier.getRandomColor(), random.nextInt(10),
                random.nextInt(10), random.nextInt(10));
    }

    private static Figure getRandomRectangle() {
        return new Rectangle(ColorSuplier.getRandomColor(), random.nextInt(10),
                random.nextInt(10));
    }

    private static Figure getRandomRightTriangle() {
        return new RightTriangle(ColorSuplier.getRandomColor(), random.nextInt(10),
                random.nextInt(10));
    }
}

