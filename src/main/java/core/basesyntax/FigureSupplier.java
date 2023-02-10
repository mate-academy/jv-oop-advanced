package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final String DEFAULT_COLOR = "WHITE";
    private static final double DEFAULT_RADIUS = 10.0;
    private static final int NUMBER_RANGE = 100;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        FiguresShape[] figureshape = FiguresShape.values();
        switch (figureshape[random.nextInt(figureshape.length)].name()) {
            case "SQUARE": {
                return new Square(random.nextDouble() * NUMBER_RANGE, colorSupplier.getRandomColor());
            }
            case "RECTANGLE": {
                return new Rectangle(random.nextDouble() * NUMBER_RANGE, random.nextDouble()
                    * NUMBER_RANGE, colorSupplier.getRandomColor());
            }
            case "RIGHTTRIANGLE": {
                return new RightTriangle(random.nextDouble() * NUMBER_RANGE, random.nextDouble()
                    * NUMBER_RANGE, colorSupplier.getRandomColor());
            }
            case "CIRCLE": {
                return new Circle(random.nextDouble() * NUMBER_RANGE, colorSupplier.getRandomColor());
            }
            case "ISOSCELESTRAPEZOID": {
                return new IsoscelesTrapezoid(random.nextDouble() * NUMBER_RANGE, random.nextDouble()
                    * NUMBER_RANGE, random.nextDouble() * NUMBER_RANGE,
                    colorSupplier.getRandomColor());
            }
            default: {
            }
        }
        return;
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
    }
}
