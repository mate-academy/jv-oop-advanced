package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final Random RANDOM = new Random();
    private static final int CIRCLE_RADIUS = 10;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private int firstParam = 0;
    private int secondParam = 0;
    private Color colorParam;

    public Figure getRandomFigure() {
        firstParam = RANDOM.nextInt(100);
        secondParam = RANDOM.nextInt(200);
        colorParam = colorSupplier.getRandomColor();
        int number = RANDOM.nextInt(FIGURE_COUNT);
        switch (number) {
            case 1:
                return new Circle(firstParam, colorParam);
            case 2:
                double side = RANDOM.nextDouble(100);
                return new IsoscelesTrapezoid(firstParam, secondParam, side, colorParam);
            case 3:
                return new Rectangle(firstParam, secondParam, colorParam);
            case 4:
                return new RightTriangle(firstParam, secondParam, colorParam);
            default:
                return new Square(firstParam, colorParam);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(CIRCLE_RADIUS, Color.white);
    }
}
