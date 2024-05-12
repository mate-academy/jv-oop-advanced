package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Random random = new Random();
    private static final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        String color = String.valueOf(colorSupplier.getRandomColor());
        int figureType = random.nextInt(5); // 5 figure types

        switch (figureType) {
            case 0:
                return new Square(color, random.nextDouble() * 10 + 1); // side between 1 and 10
            case 1:
                return new Rectangle(color, random.nextDouble() * 10
                        + 1, random.nextDouble() * 10 + 1);
            case 2:
                return new RightTriangle(color, random.nextDouble() * 10
                        + 1, random.nextDouble() * 10 + 1);
            case 3:
                return new Circle(color, random.nextDouble() * 10 + 1); // radius between 1 and 10
            case 4:
                return new IsoscelesTrapezoid(color, random.nextDouble() * 10 + 1,
                        random.nextDouble() * 10 + 1, random.nextDouble() * 10 + 1);
            default:
                throw new IllegalStateException("Unexpected value: " + figureType);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10); // Default figure: white circle, radius 10
    }
}
