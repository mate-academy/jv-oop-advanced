package core.basesyntax;

import java.security.SecureRandom;

public class FigureSupplier {
    private static final int RANDOMIZERBOUND = 100;
    private final SecureRandom randomizer = new SecureRandom();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        switch (Figures.values()[randomizer.nextInt(Figures.values().length)]) {
            case SQUARE: return new Square(randomizer.nextInt(RANDOMIZERBOUND),
                    colorSupplier.getColor());
            case RECTANGLE: return new Rectangle(randomizer.nextInt(RANDOMIZERBOUND),
                    randomizer.nextInt(RANDOMIZERBOUND), colorSupplier.getColor());
            case CIRCLE: return new Circle(randomizer.nextInt(RANDOMIZERBOUND),
                    colorSupplier.getColor());
            case RIGHTTRIANGLE: return new RightTriangle(randomizer.nextInt(RANDOMIZERBOUND),
                    randomizer.nextInt(RANDOMIZERBOUND), colorSupplier.getColor());
            case ISOSCELESTRAPEZOID:
                return new IsoscelesTrapezoid(randomizer.nextInt(RANDOMIZERBOUND),
                    randomizer.nextInt(RANDOMIZERBOUND), randomizer.nextInt(RANDOMIZERBOUND),
                    colorSupplier.getColor());
            default: return null;
        }
    }
}
