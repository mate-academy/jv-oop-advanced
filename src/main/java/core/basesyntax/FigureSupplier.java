package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();
    private final int maxValue = 5;
    private final int minValue = 2;
    private final int units = 5;
    private final int amount = 3;
    private int number;

    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        Figure figure = null;
        for (int i = 0; i < amount; i++) {
            number = random.nextInt(units);
            switch (number) {
                case 0: figure = new Circle(colorSupplier.getRandomColor(),
                        random.nextInt(maxValue) + minValue);
                break;
                case 1: figure = new Square(colorSupplier.getRandomColor(),
                        random.nextInt(maxValue) + minValue);
                break;
                case 2: figure = new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(maxValue) + minValue,
                        random.nextInt(maxValue) + minValue);
                break;
                case 3: figure = new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(maxValue) + minValue,
                        random.nextInt(maxValue) + minValue);
                break;
                case 4: figure = new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(maxValue) + minValue,
                        random.nextInt(maxValue) + minValue,
                        random.nextInt(maxValue) + minValue);
                break;
                default:
            }
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        return new Circle("white",10);
    }
}
