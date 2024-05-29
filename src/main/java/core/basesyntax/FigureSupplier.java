package core.basesyntax;

import java.util.Random;

class FigureSupplier {
    private static final double MAX_SIZE = 10.0;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(5);
        String color = colorSupplier.getRandomColor();

        return switch (figureType) {
            case 0 -> new Square(color, random.nextDouble() * MAX_SIZE);
            case 1 -> new Rectangle(color, random.nextDouble() * MAX_SIZE,
                    random.nextDouble() * MAX_SIZE);
            case 2 -> new RightTriangle(color, random.nextDouble() * MAX_SIZE,
                    random.nextDouble() * MAX_SIZE);
            case 3 -> new Circle(color, random.nextDouble() * MAX_SIZE);
            case 4 -> new IsoscelesTrapezoid(color, random.nextDouble() * MAX_SIZE,
                    random.nextDouble() * MAX_SIZE, random.nextDouble() * MAX_SIZE);
            default -> getDefaultFigure();
        };
    }

    public Figure getDefaultFigure() {
        return new Circle("White", 10);
    }
}
