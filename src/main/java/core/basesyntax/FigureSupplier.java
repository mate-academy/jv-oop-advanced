package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final static Random random = new Random();

    public static Figure getRandomFigure() {
        int index = random.nextInt(5);
        Figure [] figures = new Figure[5];
        switch (index) {
            case 0: figures[0] = getRandomCircle();
                break;
            case 1: figures[1] = getRandomSquare();
                break;
            case 2: figures[2] = getRandomRectangle();
                break;
            case 3: figures[3] = getRandomRightTriangle();
                break;
            case 4: figures[4] = getRandomIsoscelesTrapezoid();
                break;
            default: getDefaultFigure();
        }
        return figures[index];
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

    public static Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}

