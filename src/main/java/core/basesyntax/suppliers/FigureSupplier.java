package core.basesyntax.suppliers;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    static final double MAX_LENGTH = 25.0;
    static final int AMOUNT_OF_FIGURES = 5;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.getColor(), 10);
    }

    public Figure getRandomFigure() {
        int randomFigure = random.nextInt(AMOUNT_OF_FIGURES) + 1;
        String color = colorSupplier.getRandomColor();
        switch (randomFigure) {
            case 1:
                double radius = MAX_LENGTH * random.nextDouble();
                return new Circle(color, radius);
            case 2:
                double lowBase = MAX_LENGTH * random.nextDouble();
                double upperBase = MAX_LENGTH * random.nextDouble();
                double sidePart = MAX_LENGTH * random.nextDouble();
                return new IsoscelesTrapezoid(color, lowBase, upperBase, sidePart);
            case 3:
                double firstSide = MAX_LENGTH * random.nextDouble();
                double secondSide = MAX_LENGTH * random.nextDouble();
                return new Rectangle(color, firstSide, secondSide);
            case 4:
                double firstSideTriangle = MAX_LENGTH * random.nextDouble();
                double secondSideTriangle = MAX_LENGTH * random.nextDouble();
                return new RightTriangle(color, firstSideTriangle, secondSideTriangle);
            case 5:
                double sideOfSquare = MAX_LENGTH * random.nextDouble();
                return new Square(color, sideOfSquare);
            default: return getDefaultFigure();
        }
    }
}
