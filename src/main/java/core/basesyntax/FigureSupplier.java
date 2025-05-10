package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    private Random random = new Random();
    private Figure figure;
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        switch (figureNumber) {
            case 0:
                figure = getCircle();
                break;
            case 1:
                figure = getIsoscelesTrapezoid();
                break;
            case 2:
                figure = getRectangle();
                break;
            case 3:
                figure = getRightTriangle();
                break;
            case 4:
                figure = getSquare();
                break;
            default:
                break;
        }
        return figure;
    }

    private Figure getCircle() {
        int radius = random.nextInt(10);
        return new Circle(radius, colorSupplier.getRandomColor());
    }

    private Figure getIsoscelesTrapezoid() {
        int upSide = random.nextInt(10);
        int downSide = random.nextInt(10);
        int height = random.nextInt(10);
        return new IsoscelesTrapezoid(upSide, downSide, height, colorSupplier.getRandomColor());
    }

    private Figure getRectangle() {
        int rightSide = random.nextInt(10);
        int downSide = random.nextInt(10);
        return new Rectangle(rightSide, downSide, colorSupplier.getRandomColor());
    }

    private Figure getRightTriangle() {
        int firstLeg = random.nextInt(10);
        int secondLeg = random.nextInt(10);
        return new RightTriangle(firstLeg, secondLeg, colorSupplier.getRandomColor());
    }

    private Figure getSquare() {
        int side = random.nextInt(10);
        return new Square(side, colorSupplier.getRandomColor());
    }
}
