package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int MAX_NUMBER_OF_FIGURE = 5;
    public static final int SIZE_OF_UNITS = 15;
    private Random random = new Random();

    private Figure getCircle() {
        int radius = this.random.nextInt(SIZE_OF_UNITS);
        ColorSupplier newColorSupplier = new ColorSupplier();
        return new Circle(newColorSupplier.getRandomColor(), radius);
    }

    private Figure getIsoscelesTrapezoid() {
        int topSide = this.random.nextInt(SIZE_OF_UNITS);
        int botSide = this.random.nextInt(SIZE_OF_UNITS);
        int height = this.random.nextInt(SIZE_OF_UNITS);
        ColorSupplier newColorSupplier = new ColorSupplier();
        return new IsoscelesTrapezoid(newColorSupplier.getRandomColor(),
                topSide, botSide, height);
    }

    private Figure getRectangle() {
        int height = this.random.nextInt(SIZE_OF_UNITS);
        int width = this.random.nextInt(SIZE_OF_UNITS);
        ColorSupplier newColorSupplier = new ColorSupplier();
        return new Rectangle(newColorSupplier.getRandomColor(), height, width);
    }

    private Figure getRightTriangle() {
        int firstLeg = this.random.nextInt(SIZE_OF_UNITS);
        int secondLeg = this.random.nextInt(SIZE_OF_UNITS);
        ColorSupplier newColorSupplier = new ColorSupplier();
        return new RightTriangle(newColorSupplier.getRandomColor(),
                firstLeg, secondLeg);
    }

    private Figure getSquare() {
        int side = this.random.nextInt(SIZE_OF_UNITS);
        ColorSupplier newColorSupplier = new ColorSupplier();
        return new Square(newColorSupplier.getRandomColor(), side);
    }

    Figure getRandomFigure() {
        int figureNumber = random.nextInt(MAX_NUMBER_OF_FIGURE);
        //Figure randomFigure;
        switch (figureNumber) {
            case 0:
                return getSquare();
            case 1:
                return getRectangle();
            case 2:
                return getRightTriangle();
            case 3:
                return getCircle();
            default:
                return getIsoscelesTrapezoid();
        }
    }
}
