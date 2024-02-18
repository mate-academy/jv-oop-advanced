package core.basesyntax.supplier;

import core.basesyntax.colors.Color;
import core.basesyntax.figure.Circle;
import core.basesyntax.figure.Figure;
import core.basesyntax.figure.IsoscelesTrapezoid;
import core.basesyntax.figure.Rectangle;
import core.basesyntax.figure.RightTriangle;
import core.basesyntax.figure.Square;
import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureNumber = 5;
        int randIndex = random.nextInt(figureNumber);
        Figure figure;

        switch (randIndex) {
            case 0 -> figure = new Circle(getRandomDouble(), colorSupplier.getRandomColor());
            case 1 -> figure = new IsoscelesTrapezoid(getRandomDouble(), getRandomDouble(),
                        getRandomDouble(), colorSupplier.getRandomColor());
            case 2 -> figure = new Rectangle(getRandomDouble(), getRandomDouble(),
                        colorSupplier.getRandomColor());
            case 3 -> figure = new RightTriangle(getRandomDouble(), colorSupplier.getRandomColor());
            case 4 -> figure = new Square(getRandomDouble(), colorSupplier.getRandomColor());
            default -> throw new IllegalArgumentException("Unexpected value for CASE_INDEX: "
                    + randIndex);
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        double defaultRadius = 10.0;
        Color defaultColor = Color.WHITE;
        return new Circle(defaultRadius, defaultColor);
    }

    private double getRandomDouble() {
        final double minRand = 10.0;
        final double maxRand = 50.0;
        return random.nextDouble(minRand, maxRand);
    }
}
