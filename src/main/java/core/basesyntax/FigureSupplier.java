package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(FIGURE_COUNT);
        switch (index) {
            case 0: {
                return createCircle();
            }
            case 1: {
                return createRectangle();
            }
            case 2: {
                return createRightTriangle();
            }
            case 3: {
                return createSquare();
            }
            default: {
                return createIsoscelesTrapezoid();
            }
        }
    }

    public Figure getDefaultFigure() {
        Figure defaultFigure = new Circle(Color.WHITE.name(), 10.0);
        return defaultFigure;
    }

    private Figure createCircle() {
        double radius = random.nextDouble() * 100;
        Figure circle = new Circle(colorSupplier.getRandomColor(), radius);
        return circle;
    }

    private Figure createRectangle() {
        double firstLeg = random.nextDouble() * 100;
        double secondLeg = random.nextDouble() * 100;
        Figure rectangle = new Rectangle(colorSupplier.getRandomColor(), firstLeg, secondLeg);
        return rectangle;
    }

    private Figure createRightTriangle() {
        double firstLeg = random.nextDouble() * 100;
        double secondLeg = random.nextDouble() * 100;
        Figure rightTriangle = new RightTriangle(colorSupplier.getRandomColor(), firstLeg,
                secondLeg);
        return rightTriangle;
    }

    private Figure createIsoscelesTrapezoid() {
        double firstSide = random.nextDouble() * 100;
        double secondSide = random.nextDouble() * 100;
        double height = random.nextDouble() * 100;
        Figure trapezoid = new IsoscelesTrapezoid(colorSupplier.getRandomColor(), firstSide,
                secondSide, height);
        return trapezoid;
    }

    private Figure createSquare() {
        double side = random.nextDouble() * 100;
        Figure square = new Square(colorSupplier.getRandomColor(), side);
        return square;
    }
}
