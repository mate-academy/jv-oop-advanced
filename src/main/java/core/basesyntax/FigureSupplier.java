package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(Parameters.getFigureCount());
        switch (figureNumber) {
            case 0:
                return new Square(ColorSupplier.getRandomColor(),
                        random.nextDouble() * Parameters.getDefaultRadius() + 1);
            case 1:
                return new Rectangle(ColorSupplier.getRandomColor(),
                        random.nextDouble() * Parameters.getDefaultRadius() + 1,
                        random.nextDouble() * Parameters.getDefaultRadius() + 1);
            case 2:
                return new RightTriangle(ColorSupplier.getRandomColor(),
                        random.nextDouble() * Parameters.getDefaultRadius() + 1,
                        random.nextDouble() * Parameters.getDefaultRadius() + 1);
            case 3:
                return new Circle(ColorSupplier.getRandomColor(),
                        random.nextDouble() * Parameters.getDefaultRadius() + 1);
            case 4:
                return new IsoscelesTrapezoid(ColorSupplier.getRandomColor(),
                        random.nextDouble() * Parameters.getDefaultRadius() + 1,
                        random.nextDouble() * Parameters.getDefaultRadius() + 1,
                        random.nextDouble() * Parameters.getDefaultRadius() + 1);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, Parameters.getDefaultRadius());
    }
}
