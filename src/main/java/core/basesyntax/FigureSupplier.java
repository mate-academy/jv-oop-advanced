package core.basesyntax;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    private static final int RANDOM_INT_BOUNDS = 100;
    private static final int DEFAULT_RADIUS = 10;
    private Random random = new Random();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        ColourSupplier colourSupplier = new ColourSupplier();
        String randomColor = colourSupplier.getRandomColor();
        switch (figureNumber) {
            case 1:
                int radius = random.nextInt(RANDOM_INT_BOUNDS);
                return new Circle(randomColor, radius);
            case 2:
                int firstLeg = random.nextInt(RANDOM_INT_BOUNDS);
                int secondLeg = random.nextInt(RANDOM_INT_BOUNDS);
                return new RightTriangle(randomColor, firstLeg, secondLeg);
            case 3:
                int firstSide = random.nextInt(RANDOM_INT_BOUNDS);
                int secondSide = random.nextInt(RANDOM_INT_BOUNDS);
                return new Rectangle(randomColor, firstSide, secondSide);
            case 4:
                int side = random.nextInt(RANDOM_INT_BOUNDS);
                return new Square(randomColor, side);
            default: //case 0:
                int base = random.nextInt(RANDOM_INT_BOUNDS);
                int upperSide = random.nextInt(RANDOM_INT_BOUNDS);
                int leg = random.nextInt(RANDOM_INT_BOUNDS);
                int height = random.nextInt(RANDOM_INT_BOUNDS);
                return new IsoscelesTrapezoid(randomColor, base, upperSide, leg, height);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), DEFAULT_RADIUS);
    }
}
