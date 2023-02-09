package core.basesyntax;

import java.security.SecureRandom;

public class FigureSupplier {
    private static final double NUMBER_BOUND = 50.0;
    private static final double DEFAULT_RADIUS = 10.0;
    private SecureRandom random = new SecureRandom();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        switch (FigureName.values()[random.nextInt(Color.values().length)]) {
            case CIRCLE:
                return new Circle(colorSupplier.getRandomColor(),
                        randomArgument()
                );
            case SQUARE:
                return new Square(colorSupplier.getRandomColor(),
                        randomArgument()
                );
            case RECTANGLE:
                return new Rectangle(colorSupplier.getRandomColor(),
                        randomArgument(),
                        randomArgument()
                );
            case RIGHT_TRIANGLE:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        randomArgument(),
                        randomArgument()
                );
            case ISOSCELES_TRAPEZOID:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        randomArgument(),
                        randomArgument(),
                        randomArgument()
                );
            default:
                return null;
        }
    }

    private double randomArgument() {
        return 0.01 + random.nextDouble() * NUMBER_BOUND;
    }
    
    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, DEFAULT_RADIUS);
    }
}
