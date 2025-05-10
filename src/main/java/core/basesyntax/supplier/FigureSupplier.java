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
    private static final int DEFAULT_RADIUS = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(NUMBERS_OF_FIGURES);
        int firstSide = random.nextInt(LIMIT_RANDOM);
        int secondSide = random.nextInt(LIMIT_RANDOM);

        switch (figureNumber) {
            case 0:
                return new Square(colorSupplier.getRandomColor(), firstSide);
            case 1:
                return new Rectangle(colorSupplier.getRandomColor(), firstSide, secondSide);
            case 2:
                return new RightTriangle(colorSupplier.getRandomColor(), firstSide,
                        secondSide);
            case 3:
                int thirdSide = random.nextInt(LIMIT_RANDOM);
                String color = colorSupplier.getRandomColor();
                return new IsoscelesTrapezoid(color, firstSide, secondSide, thirdSide);
            default:
                return new Circle(Color.WHITE.name(), DEFAULT_RADIUS);
        }
    }

    public Figure getDefultFigure() {
        return new Circle(Color.WHITE.name(), DEFAULT_RADIUS);
    }
}
