package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Random RANDOM = new Random();

    public Figure getRandomFigure() {
        final int figure_types = 5;
        int figureType = RANDOM.nextInt(figure_types); // Randomly choose between 0, 1, 2, 3, 4

        switch (figureType) {
            case 0:
                return new Circle(ColorSupplier.getRandomColor(),
                        Math.round(RANDOM.nextDouble() * 10 + 1));
            case 1:
                return new Rectangle(ColorSupplier.getRandomColor(),
                        Math.round(RANDOM.nextDouble() * 10 + 1),
                        Math.round(RANDOM.nextDouble() * 10 + 1));
            case 2:
                return new Square(ColorSupplier.getRandomColor(),
                        Math.round(RANDOM.nextDouble() * 10 + 1));
            case 3:
                return new RightTriangle(ColorSupplier.getRandomColor(),
                        Math.round(RANDOM.nextDouble() * 10 + 1),
                        Math.round(RANDOM.nextDouble() * 10 + 1));
            case 4:
                return new IsoscelesTrapezoid(ColorSupplier.getRandomColor(),
                        Math.round(RANDOM.nextDouble() * 10 + 1),
                        Math.round(RANDOM.nextDouble() * 10 + 1),
                        Math.round(RANDOM.nextDouble() * 10 + 1));
            default:
                return new Circle(Color.WHITE, 10);
        }
    }
    //return Math.round(value * scale) / scale;
    //Math.round(a * 100.0) / 100.0;

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, 10); // Radius: 1-10
    }
}
