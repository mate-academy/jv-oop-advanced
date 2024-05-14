package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Random random = new Random();
    private static final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        Color color = colorSupplier.getRandomColor();
        FigureType figureType = getRandomFigureType();

        return switch (figureType) {
            case CIRCLE -> new Circle(color.name(), random.nextDouble() * 10 + 1);
            case SQUARE -> new Square(color.name(), random.nextDouble() * 10 + 1);
            case RECTANGLE -> new Rectangle(color.name(), random.nextDouble() * 10 + 1,
                    random.nextDouble() * 10 + 1);
            case RIGHT_TRIANGLE -> new RightTriangle(color.name(), random.nextDouble() * 10 + 1,
                    random.nextDouble() * 10 + 1);
            case ISOSCELES_TRAPEZOID -> new IsoscelesTrapezoid(color.name(),
                    random.nextDouble() * 10 + 1,
                    random.nextDouble() * 10 + 1, random.nextDouble() * 10 + 1);
            default -> throw new IllegalStateException("Unexpected figure type: " + figureType);
        };
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10); // Default figure: white circle, radius 10
    }

    private FigureType getRandomFigureType() {
        FigureType[] figureTypes = FigureType.values();
        int index = random.nextInt(figureTypes.length);
        return figureTypes[index];
    }
}

