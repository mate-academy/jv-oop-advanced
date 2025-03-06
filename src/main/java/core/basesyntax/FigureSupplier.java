package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random RANDOM = new Random();

    public Figure getRandomFigure() {
        int figureType = RANDOM.nextInt(5); // Randomly choose between 0, 1, 2, 3, 4

        switch (figureType) {
            case 0:
                return new Circle(ColorSupplier.getRandomColor(), Math.round(RANDOM.nextDouble() * 10 + 1)); // Radius: 1-10
            case 1:
                return new Rectangle(ColorSupplier.getRandomColor(), Math.round(RANDOM.nextDouble() * 10 + 1), Math.round(RANDOM.nextDouble() * 10 + 1)); // Width and height 1-10
            case 2:
                return new Square(ColorSupplier.getRandomColor(), Math.round(RANDOM.nextDouble() * 10 + 1)); // Base and height 1-10
            case 3:
                return new RightTriangle(ColorSupplier.getRandomColor(), Math.round(RANDOM.nextDouble() * 10 + 1), Math.round(RANDOM.nextDouble() * 10 + 1)); // Base and height 1-10
            case 4:
                return new IsoscelesTrapezoid(ColorSupplier.getRandomColor(), Math.round(RANDOM.nextDouble() * 10 + 1), Math.round(RANDOM.nextDouble() * 10 + 1), Math.round(RANDOM.nextDouble() * 10 + 1)); // Base and height 1-10
            default:
                Figure figure = null;
                return figure;
        }
    }
    //return Math.round(value * scale) / scale;
    //Math.round(a * 100.0) / 100.0;
    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, 10); // Radius: 1-10
    }
}