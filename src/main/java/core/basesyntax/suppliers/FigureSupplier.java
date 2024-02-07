package core.basesyntax.suppliers;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int BOUND_OF_SIZES = 100;
    private static final int NUMBER_OF_FIGURES = 5;
    private static final int DEFAULT_SIZE = 10;
    private static final String DEFAULT_COLOR = "white";
    private static final FigureSupplier figureSupplier = new FigureSupplier();
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomNumberOfFigure = random.nextInt(NUMBER_OF_FIGURES);
        int rndSize = figureSupplier.getRandomNumber();
        int rndSize2 = figureSupplier.getRandomNumber();
        int rndSize3 = figureSupplier.getRandomNumber();
        String rndColor = colorSupplier.getRandomColor().toLowerCase();
        switch (randomNumberOfFigure) {
            case 0:
                return new Square(rndSize, rndColor);
            case 1:
                return new Rectangle(rndSize, rndSize2, rndColor);
            case 2:
                return new RightTriangle(rndSize, rndSize2, rndColor);
            case 3:
                return new Circle(rndSize, rndColor);
            default:
                return new IsoscelesTrapezoid(rndSize, rndSize, rndSize3, rndColor);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_SIZE, DEFAULT_COLOR);
    }

    private int getRandomNumber() {
        return random.nextInt(BOUND_OF_SIZES);
    }
}
