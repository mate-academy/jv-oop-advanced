package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_FIGURE = Type.values().length;
    private static final int MAX_NUMBER = 100;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, 10);
    }

    public Figure getRandomFigure(){
        Color color = colorSupplier.getRandomColor();
        Type randomFigure = Type.values()[random.nextInt(MAX_FIGURE)];

        return switch (randomFigure) {
            case Square: {
                int side = random.nextInt(MAX_NUMBER);
                yield new Square(color, side);
            }
            case Rectangle: {
                int firstLeg = random.nextInt(MAX_NUMBER);
                int secondLeg = random.nextInt(MAX_NUMBER);
                yield new Rectangle(color, firstLeg, secondLeg);
            }
            case RightTriangle: {
                int firstLeg = random.nextInt(MAX_NUMBER);
                int secondLeg = random.nextInt(MAX_NUMBER);
                yield new RightTriangle(color, firstLeg, secondLeg);
            }
            case Circle: {
                int radius = random.nextInt(MAX_NUMBER);
                yield new Circle(color, radius);
            }
            default: {
                int largerBase = random.nextInt(MAX_NUMBER);
                int smallerBase = random.nextInt(MAX_NUMBER);
                int side = random.nextInt(MAX_NUMBER);
                yield new IsoscelesTrapezoid(color, largerBase, smallerBase, side);
            }
        };
    }
}
