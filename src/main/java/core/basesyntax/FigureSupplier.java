package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    private Figure[] figures = {new Circle(), new IsoscelesTrapezoid(),
            new Rectangle(), new RightTriangle(), new Square()};
    private Figure figure;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        figure = figures[random.nextInt(FIGURE_COUNT)];
        getParametres(figure);
        figure.setColor(colorSupplier.getRandomColor());
        return figure;
    }

    public void getParametres(Figure figure) {
        if (figure instanceof Circle) {
            getCircle();
        }
        if (figure instanceof IsoscelesTrapezoid) {
            getIsoscelesTrapezoid();
        }
        if (figure instanceof Rectangle) {
            getRectangle();
        }
        if (figure instanceof RightTriangle) {
            getRightTriangle();
        }
        if (figure instanceof Square) {
            getSquare();
        }
    }

    public Figure getCircle() {
        double radius = random.nextInt(9) + 1;
        figure = new Circle(radius);
        return figure;
    }

    public Figure getIsoscelesTrapezoid() {
        double lowerBaseSide = random.nextInt(9) + 1;
        double upperBaseSide = random.nextInt(9) + 1;
        double height = random.nextInt(9) + 1;
        figure = new IsoscelesTrapezoid(lowerBaseSide, upperBaseSide, height);
        return figure;
    }

    public Figure getRectangle() {
        double length = random.nextInt(9) + 1;
        double width = random.nextInt(9) + 1;
        figure = new Rectangle(length, width);
        return figure;
    }

    public Figure getRightTriangle() {
        double baseSide = random.nextInt(9) + 1;
        double height = random.nextInt(9) + 1;
        figure = new RightTriangle(baseSide, height);
        return figure;
    }

    public Figure getSquare() {
        double side = random.nextInt(9) + 1;
        figure = new Square(side);
        return figure;
    }

    public Figure getDefaultFigure() {
        return new Circle("WHITE", 10);
    }
}
