package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    static final int figuresNumber = 5;
    static final double defaultRadius = 10;

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), defaultRadius);
    }

    public Figure getRandomFigure() {
        Random random = new Random();
        int randomFigure = random.nextInt(figuresNumber);
        return switch (randomFigure) {
            case 0 -> new Square(ColorSupplier.getRandomColor(), random.nextDouble());
            case 1 -> new Rectangle(ColorSupplier.getRandomColor(), random.nextDouble(),
                    random.nextDouble());
            case 2 -> new Circle(ColorSupplier.getRandomColor(), random.nextDouble());
            case 3 -> new RightTriangle(ColorSupplier.getRandomColor(), random.nextDouble(),
                    random.nextDouble());
            default -> new IsoscelesTrapezoid(ColorSupplier.getRandomColor(), random.nextDouble(),
                    random.nextDouble(), random.nextDouble());
        };
    }
}
