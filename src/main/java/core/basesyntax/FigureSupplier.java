package core.basesyntax;

import java.security.SecureRandom;

public class FigureSupplier {
    private static final int RANDOMIZER_BOUND = 100;
    private final SecureRandom secureRandom = new SecureRandom();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        switch (Figures.values()[secureRandom.nextInt(Figures.values().length)]) {
            case SQUARE: return new Square(secureRandom.nextInt(RANDOMIZER_BOUND),
                    colorSupplier.getColor());
            case RECTANGLE: return new Rectangle(secureRandom.nextInt(RANDOMIZER_BOUND),
                    secureRandom.nextInt(RANDOMIZER_BOUND), colorSupplier.getColor());
            case CIRCLE: return new Circle(secureRandom.nextInt(RANDOMIZER_BOUND),
                    colorSupplier.getColor());
            case RIGHT_TRIANGLE: return new RightTriangle(secureRandom.nextInt(RANDOMIZER_BOUND),
                    secureRandom.nextInt(RANDOMIZER_BOUND), colorSupplier.getColor());
            case ISOSCELES_TRAPEZOID:
                return new IsoscelesTrapezoid(secureRandom.nextInt(RANDOMIZER_BOUND),
                    secureRandom.nextInt(RANDOMIZER_BOUND), secureRandom.nextInt(RANDOMIZER_BOUND),
                    colorSupplier.getColor());
            default: return null;
        }
    }
}
