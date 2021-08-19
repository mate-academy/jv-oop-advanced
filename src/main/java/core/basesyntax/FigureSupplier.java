package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        switch (figureNumber) {
            case 0:
                return createCircle();
            case 1:
                return createIsoscelesTrapezoid();
            case 2:
                return createRectangle();
            case 3:
                return createRightTriangle();
            default:
                return createSquare();
        }
    }

    private Figure createCircle() {
        return new Circle(random.nextInt(9) + 1,
                colorSupplier.getRandomColor(),
                "circle");
    }

    private Figure createIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(random.nextInt(9) + 1,
                random.nextInt(9) + 1,
                random.nextInt(9) + 1,
                colorSupplier.getRandomColor(),
                "trapezoid");
    }

    private Figure createRectangle() {
        return new Rectangle(random.nextInt(9) + 1,
                random.nextInt(9) + 1,
                colorSupplier.getRandomColor(),
                "rectangle");
    }

    private Figure createRightTriangle() {
        return new RightTriangle(random.nextInt(9) + 1,
                random.nextInt(9) + 1,
                colorSupplier.getRandomColor(),
                "triangle");
    }

    private Figure createSquare() {
        return new Square(random.nextInt(9) + 1,
                colorSupplier.getRandomColor(),
                "square");
    }
}
