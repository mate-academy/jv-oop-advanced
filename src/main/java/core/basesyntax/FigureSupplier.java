package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private static final int DEFAULT_RADIUS = 10;
    private static final int MAX_FIGURE = 5;
    private static final int MAX_NUMBER = 100;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    public Figure getRandomFigure(){
        Color color = colorSupplier.getRandomColor();
        int randomFigure = random.nextInt(MAX_FIGURE);

        return switch (randomFigure) {
            case 1: {
                int side = random.nextInt(MAX_NUMBER);
                yield  new Square(color, side);
            }
            case 2: {
                int firstLeg = random.nextInt(MAX_NUMBER);
                int secondLeg = random.nextInt(MAX_NUMBER);
                yield  new Rectangle(color, firstLeg, secondLeg);
            }
            case 3: {
                int firstLeg = random.nextInt(MAX_NUMBER);
                int secondLeg = random.nextInt(MAX_NUMBER);
                yield new RightTriangle(color, firstLeg, secondLeg);
            }
            case 4: {
                int radius = random.nextInt(MAX_NUMBER);
                yield  new Circle(color, radius);
            }
            default: {
                int largerBase = random.nextInt(MAX_NUMBER);
                int smallerBase = random.nextInt(MAX_NUMBER);
                int side = random.nextInt(MAX_NUMBER);
                yield  new IsoscelesTrapezoid(color, largerBase, smallerBase, side);
            }
        };
    }
}
