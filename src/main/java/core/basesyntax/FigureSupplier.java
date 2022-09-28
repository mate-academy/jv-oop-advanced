package core.basesyntax;

import core.basesyntax.figures.AbstractFigure;
import core.basesyntax.figures.Circle;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_OF_FIGURES_BOUND = 4;
    private static final int MAX_VALUE_BOUND = 100;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public AbstractFigure getRandomFigure() {
        String randomColor = colorSupplier.getRandomColor();
        int randomFigureNumber = random.nextInt(NUMBER_OF_FIGURES_BOUND);
        if (randomFigureNumber == 0) {
            double randomRadius = random.nextInt(MAX_VALUE_BOUND);
            return new Circle(randomColor, randomRadius);
        } else if (randomFigureNumber == 1) {
            double randomFirstBaseSide = random.nextInt(MAX_VALUE_BOUND);
            double randomSecondBaseSide = random.nextInt(MAX_VALUE_BOUND);
            double randomHeight = random.nextInt(MAX_VALUE_BOUND);
            double randomSide = random.nextInt(MAX_VALUE_BOUND);
            return new IsoscelesTrapezoid(randomColor, randomFirstBaseSide, randomSecondBaseSide,
                    randomHeight, randomSide);
        } else if (randomFigureNumber == 2) {
            double randomWidth = random.nextInt(MAX_VALUE_BOUND);
            double randomHeight = random.nextInt(MAX_VALUE_BOUND);
            return new Rectangle(randomColor, randomWidth, randomHeight);
        } else if (randomFigureNumber == 3) {
            double randomFirstLeg = random.nextInt(MAX_VALUE_BOUND);
            double randomSecondLeg = random.nextInt(MAX_VALUE_BOUND);
            double randomHypotenuse = random.nextInt(MAX_VALUE_BOUND);
            return new RightTriangle(randomColor, randomFirstLeg, randomSecondLeg,
                    randomHypotenuse);
        } else {
            double randomSide = random.nextInt(MAX_VALUE_BOUND);
            return new Square(randomColor, randomSide);
        }
    }

    public AbstractFigure getDefaultFigure() {
        return new Circle("white", 10);
    }
}
