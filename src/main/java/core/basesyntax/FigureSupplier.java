package core.basesyntax;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    public static final int maxLengthInUnits = 100;
    public static final int figuresTypesNumber = 5;
    private static final int defaultRadius = 10;
    private static final String defaultColor = Color.WHITE.name();
    private static final Figure defaultFigure = new Circle(defaultColor, defaultRadius);
    private final ColorSupplier colorSupplier;
    private final Random random;

    public FigureSupplier() {
        // Should I pass this random object to color supplier constructor, or it is bad practice ?
        // And is it better to create another random class in color supplier ?
        this.random = new Random();
        this.colorSupplier = new ColorSupplier(random);
    }

    public Figure getRandomFigure() {
        int randomChoice = random.nextInt(figuresTypesNumber);

        return switch (randomChoice) {
            case 0 -> new Circle(colorSupplier, random, maxLengthInUnits);
            case 1 -> new Square(colorSupplier, random, maxLengthInUnits);
            case 2 -> new Rectangle(colorSupplier, random, maxLengthInUnits);
            case 3 -> new RightTriangle(colorSupplier, random, maxLengthInUnits);
            case 4 -> new IsoscelesTrapezoid(colorSupplier, random, maxLengthInUnits);
            default -> {
                assert false : "Default case should not be reached.";
                yield null;
            }
        };
    }

    public Figure getDefaultFigure() {
        return defaultFigure;
    }
}
