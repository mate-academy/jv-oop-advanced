package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    private static final double DEFAULT_RADIUS = 10.0;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public BaseShape getRandomFigure() {
        int figureType = random.nextInt(5);
        String color = colorSupplier.getRandomColor();
        switch (figureType) {
            case 0:
                return new Square(color, random.nextDouble() * 10);
            case 1:
                return new Rectangle(color, random.nextDouble() * 10, random.nextDouble() * 10);
            case 2:
                return new RightTriangle(color, random.nextDouble() * 10, random.nextDouble() * 10);
            case 3:
                return new Circle(color, random.nextDouble() * 10);
            case 4:
                return new IsoscelesTrapezoid(color, random.nextDouble() * 10,
                        random.nextDouble() * 10,
                        random.nextDouble() * 10);
            default:
                return new Square("Unknown color", 0);
        }
    }

    public BaseShape getDefaultFigure() {
        return new Circle("white", DEFAULT_RADIUS);
    }
}
