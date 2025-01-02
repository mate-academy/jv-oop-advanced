package core.basesyntax;

import java.util.Random;

public class FigureSupplier extends ColorSupplier {
    private final static Random picker = new Random();

    public static Figure getRandomFigure() {
        return switch(picker.nextInt(4)) {
            case 0 -> new Circle(getRandomColor(), picker.nextInt(1, 50));
            case 1 -> new Rectangle(getRandomColor(), picker.nextInt(1, 50), picker.nextInt(1, 50));
            case 2 -> new RightTriangle(getRandomColor(), picker.nextInt(1, 50), picker.nextInt(1, 50));
            case 3 -> new Square(getRandomColor(), picker.nextInt(1, 50));
            default -> new Circle(Colors.WHITE, 10);
        };
    }

    public static Figure getDefaultFigure() {
        return new Circle(Colors.WHITE, 10);
    }
}
