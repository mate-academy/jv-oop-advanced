package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomNumFigure = random.nextInt(FIGURE_COUNT);
        switch (randomNumFigure) {
            case 0:
                return getCircle();
            case 1:
                return getIsoscelesTrapezoid();
            case 2:
                return getRectangle();
            case 3:
                return getRectangle();
            case 4:
                return getRightTriangle();
            default:
                return getSquare();
        }
    }

    private Figure getCircle() {
        double radius = random.nextInt(9) + 1;
        Figure figure = new Circle(radius);
        figure.setColor(colorSupplier.getRandomColor());
        return figure;
    }

    private Figure getIsoscelesTrapezoid() {
        double lowerBaseSide = random.nextInt(9) + 1;
        double upperBaseSide = random.nextInt(9) + 1;
        double height = random.nextInt(9) + 1;
        Figure figure = new IsoscelesTrapezoid(lowerBaseSide, upperBaseSide, height);
        figure.setColor(colorSupplier.getRandomColor());
        return figure;
    }

    private Figure getRectangle() {
        double length = random.nextInt(9) + 1;
        double width = random.nextInt(9) + 1;
        Figure figure = new Rectangle(length, width);
        figure.setColor(colorSupplier.getRandomColor());
        return figure;
    }

    private Figure getRightTriangle() {
        double baseSide = random.nextInt(9) + 1;
        double height = random.nextInt(9) + 1;
        Figure figure = new RightTriangle(baseSide, height);
        figure.setColor(colorSupplier.getRandomColor());
        return figure;
    }

    private Figure getSquare() {
        double side = random.nextInt(9) + 1;
        Figure figure = new Square(side);
        figure.setColor(colorSupplier.getRandomColor());
        return figure;
    }

    public Figure getDefaultFigure() {
        return new Circle("WHITE", 10);
    }
}
