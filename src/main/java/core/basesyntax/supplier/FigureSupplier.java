package core.basesyntax.supplier;

import core.basesyntax.figure.Circle;
import core.basesyntax.figure.Figure;
import core.basesyntax.figure.IsoscelesTrapezoid;
import core.basesyntax.figure.Rectangle;
import core.basesyntax.figure.RightTriangle;
import core.basesyntax.figure.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int LIMIT_RANDOM = 15;
    private static final int NUMBERS_OF_FIGURES = 5;
    private final Random random;
    private final ColorSupplier colorSupplier;

    public FigureSupplier() {
        random = new Random();
        colorSupplier = new ColorSupplier();
    }

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(NUMBERS_OF_FIGURES);
        int firstSide = random.nextInt(LIMIT_RANDOM);
        int secondSide = random.nextInt(LIMIT_RANDOM);

        if (figureNumber == 0) {
            return new Square(colorSupplier.getRandomColor(), firstSide);
        } else if (figureNumber == 1) {
            return new Rectangle(colorSupplier.getRandomColor(), firstSide, secondSide);
        } else if (figureNumber == 2) {
            return new RightTriangle(colorSupplier.getRandomColor(), firstSide, secondSide);
        } else if (figureNumber == 3) {
            int thirdSide = random.nextInt(LIMIT_RANDOM);
            String color = colorSupplier.getRandomColor();
            return new IsoscelesTrapezoid(color, firstSide, secondSide, thirdSide);
        } else {
            return getDefultFigure();
        }
    }

    public Figure getDefultFigure() {
        return new Circle("WHITE", 10);
    }
}
