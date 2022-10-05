package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_NUM = 7;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random randomNum = new Random();

    public Figure getRandomFigure() {
        int randomFigureNumber = randomNum.nextInt(4);
        switch (randomFigureNumber) {
            case 0:
                return getRandomIsoscelesTrapezoid();
            case 1:
                return getRandomRectangle();
            case 2:
                return getRandomRightTriangle();
            case 3:
                return getRandomSquare();
            case 4:
                return getRandomCircle();
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }

    private Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), randomNum.nextInt(MAX_NUM), randomNum.nextInt(MAX_NUM), randomNum.nextInt(MAX_NUM));
    }

    public Figure getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(), randomNum.nextInt(MAX_NUM),randomNum.nextInt(MAX_NUM));
    }

    public Figure getRandomRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(), randomNum.nextInt(MAX_NUM),randomNum.nextInt(MAX_NUM));
    }

    public Figure getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(),randomNum.nextInt(MAX_NUM));
    }

    public Figure getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(), randomNum.nextInt(MAX_NUM));
    }
}
