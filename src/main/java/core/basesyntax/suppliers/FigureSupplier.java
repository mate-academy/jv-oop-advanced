package core.basesyntax.suppliers;

import core.basesyntax.colors.Color;
import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private static final double DEFAULT_RADIUS = 10.00;
    private static final int MAX_SIDE_UNITS = 9;
    private static final int MIN_SIDE_UNITS = 9;
    private static final int NUMBER_OF_FIGURES = 5;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        Figure figure;
        int randomFigure = random.nextInt(NUMBER_OF_FIGURES);

        switch (randomFigure) {
            case 0:
                figure = new Circle(colorSupplier.getRandomColor(), getRandomSide());
                break;
            case 1:
                figure = new IsoscelesTrapezoid(colorSupplier.getRandomColor(), getRandomSide(),
                        getRandomSide(), getRandomSide());
                break;
            case 2:
                figure = new Rectangle(colorSupplier.getRandomColor(), getRandomSide(),
                        getRandomSide());
                break;
            case 3:
                figure = new RightTriangle(colorSupplier.getRandomColor(), getRandomSide(),
                        getRandomSide());
                break;
            case 4:
                figure = new Square(colorSupplier.getRandomColor(), getRandomSide());
                break;
            default:
                figure = getDefaultFigure();
                break;
        }
        return figure;
    }

    private double getRandomSide() {
        return (random.nextDouble() * (MAX_SIDE_UNITS - MIN_SIDE_UNITS)) + MIN_SIDE_UNITS;
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
