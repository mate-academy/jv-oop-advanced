package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int MAX_NUMBER_OF_FIGURE = 5;
    public static final int SIZE_OF_UNITS = 100;
    private Random random = new Random();
    private ColorSupplier colorSupplier;
    private ColorSupplier randomColor;

    private Figure getCircle() {
        int radius = this.random.nextInt(100);
        return new Circle(this.randomColor.getRandomColor(), radius);
    }

    private Figure getIsoscelesTrapezoid() {
        int topSide = this.random.nextInt(100);
        int botSide = this.random.nextInt(100);
        int height = this.random.nextInt(100);
        return new IsoscelesTrapezoid(this.randomColor.getRandomColor(),
                topSide, botSide, height);
    }

    private Figure getRectangle() {
        int height = this.random.nextInt(100);
        int width = this.random.nextInt(100);
        return new Rectangle(this.randomColor.getRandomColor(), height, width);
    }

    private Figure getRightTriangle() {
        int firstLeg = this.random.nextInt(100);
        int secondLeg = this.random.nextInt(100);
        return new RightTriangle(this.randomColor.getRandomColor(),
                firstLeg, secondLeg);
    }

    private Figure getSquare() {
        int side = this.random.nextInt(100);
        return new Square(this.randomColor.getRandomColor(), side);
    }

    Figure getRandomFigure() {
        int figureNumber = random.nextInt(MAX_NUMBER_OF_FIGURE);
        Figure randomFigure;
        switch (figureNumber) {
            case 0:
                randomFigure = new Square(new ColorSupplier().getRandomColor(),
                        random.nextInt(SIZE_OF_UNITS) + 1);
                break;
            case 1:
                randomFigure = new Rectangle(new ColorSupplier().getRandomColor(),
                        random.nextInt(SIZE_OF_UNITS) + 1,
                        random.nextInt(SIZE_OF_UNITS) + 1);
                break;
            case 2:
                randomFigure = new RightTriangle(new ColorSupplier().getRandomColor(),
                        random.nextInt(SIZE_OF_UNITS) + 1,
                        random.nextInt(SIZE_OF_UNITS) + 1);
                break;
            case 3:
                randomFigure = new Circle(new ColorSupplier().getRandomColor(),
                        random.nextInt(SIZE_OF_UNITS) + 1);
                break;
            case 4:
            default:
                randomFigure = new IsoscelesTrapezoid(new ColorSupplier().getRandomColor(),
                        random.nextInt(SIZE_OF_UNITS) + 1,
                        random.nextInt(SIZE_OF_UNITS) + 1,
                        random.nextInt(SIZE_OF_UNITS) + 1);
                break;
        }
        return randomFigure;
    }
}
