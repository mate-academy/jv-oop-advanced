package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Random random = new Random();
    private static final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        String color = String.valueOf(colorSupplier.getRandomColor());
        int figureType = random.nextInt(5); // 5 figure types

        return switch (figureType) {
            case 0 -> new Square(color, random.nextDouble() * 10 + 1); // side between 1 and 10
            case 1 -> new Rectangle(color, random.nextDouble() * 10
                    + 1, random.nextDouble() * 10 + 1);
            case 2 -> new RightTriangle(color, random.nextDouble() * 10
                    + 1, random.nextDouble() * 10 + 1);
            case 3 -> new Circle(color, random.nextDouble() * 10 + 1); // radius between 1 and 10
            case 4 -> new IsoscelesTrapezoid(color, random.nextDouble() * 10 + 1,
                    random.nextDouble() * 10 + 1, random.nextDouble() * 10 + 1);
            default -> throw new IllegalStateException("Unexpected value: " + figureType);
        };
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10); // Default figure: white circle, radius 10
    }
}
