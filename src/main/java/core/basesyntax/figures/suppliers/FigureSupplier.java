package core.basesyntax.figures.suppliers;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int FIGURES_COUNT = 5;
    private static final int DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private static final int PROPERTY_MAX_SIZE = 100;

    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURES_COUNT);
        String randomColor = colorSupplier.getRandomColor();

        return switch (figureNumber) {
            case 0 -> getDefaultFigure();
            case 1 -> new IsoscelesTrapezoid(getRandomGeometricProperty(),
                    getRandomGeometricProperty(),
                    getRandomGeometricProperty(), randomColor);
            case 2 -> new Rectangle(getRandomGeometricProperty(),
                    getRandomGeometricProperty(), randomColor);
            case 3 -> new RightTriangle(getRandomGeometricProperty(),
                    getRandomGeometricProperty(), randomColor);
            default -> new Square(getRandomGeometricProperty(), randomColor);
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
    }

    private double getRandomGeometricProperty() {
        return random.nextDouble(PROPERTY_MAX_SIZE);
    }
}
