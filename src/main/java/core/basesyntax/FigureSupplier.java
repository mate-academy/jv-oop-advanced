package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private Random rand = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();
    private int firstParam = 0;
    private int secondParam = 0;
    private Color colorParam;

    public Figure getRandomFigure() {
        firstParam = rand.nextInt(100);
        secondParam = rand.nextInt(200);
        colorParam = colorSupplier.getRandomColor();
        int number = rand.nextInt(FIGURE_COUNT);
        switch (number) {
            case 1:
                return new Circle(firstParam, colorParam);
            case 2:
                return new IsoscelesTrapezoid(firstParam, secondParam, colorParam);
            case 3:
                return new Rectangle(firstParam, secondParam, colorParam);
            case 4:
                return new RightTriangle(firstParam, secondParam, colorParam);
            default:
                return new Square(firstParam, colorParam);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, Color.white);
    }
}
