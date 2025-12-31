package core.basesyntax.model;

import java.util.Random;

public class FigureSupplier {
    private int maxColor = 5;
    private int maxValue = 25;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }

    public Figure getRandomFigure() {
        int index = random.nextInt(maxColor);
        double a = random.nextInt(maxValue);
        double b = random.nextInt(maxValue);
        double c = random.nextInt(maxValue);

        switch (index) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(), a);
            case 1:
                return new Rectangle(colorSupplier.getRandomColor(), a, b);
            case 2:
                return new Square(colorSupplier.getRandomColor(), a);
            case 3:
                return new RightTriangle(colorSupplier.getRandomColor(), a, b);
            case 4:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), a, b, c);
            default:
                break;
        }

        return getDefaultFigure();
    }
}
