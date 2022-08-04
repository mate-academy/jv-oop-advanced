/* package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private static final int MAX_NUMBER_FIGURES = 5;
    private static final int DEFAULT_RADIUS = 10;

    public Figure getRandomFigure() {
        int figureIndex = random.nextInt(MAX_NUMBER_FIGURES);
        switch (figureIndex) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(), getRandomDouble());
            case 1:
                return new Square(colorSupplier.getRandomColor(), getRandomDouble());
            case 2:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        getRandomDouble(),
                        getRandomDouble());
            case 3:
                return new Rectangle(colorSupplier.getRandomColor(),
                        getRandomDouble(),
                        getRandomDouble());
            case 4:
            default:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        getRandomDouble(),
                        getRandomDouble(),
                        getRandomDouble());
        }
    }

    private double getRandomDouble() {
        return random.nextDouble();
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), DEFAULT_RADIUS);
    }
}
 */
