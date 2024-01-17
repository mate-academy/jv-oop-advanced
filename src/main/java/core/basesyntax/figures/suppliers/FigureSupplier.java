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
    private static final String DEFAULT_COLOR = "white";

    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        Figure figure;

        int figureNumber = random.nextInt(FIGURES_COUNT);
        String randomColor = colorSupplier.getRandomColor();

        switch (figureNumber) {
            case 0:
                return getDefaultFigure();
            case 1:
                figure = new IsoscelesTrapezoid(getRandomGeometricProperty(),
                        getRandomGeometricProperty(),
                        getRandomGeometricProperty(), randomColor);
                break;
            case 2:
                figure = new Rectangle(getRandomGeometricProperty(),
                        getRandomGeometricProperty(), randomColor);
                break;
            case 3:
                figure = new RightTriangle(getRandomGeometricProperty(),
                        getRandomGeometricProperty(), randomColor);
                break;
            default:
                figure = new Square(getRandomGeometricProperty(), randomColor);
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
    }

    private double getRandomGeometricProperty() {
        return random.nextDouble(100);
    }
}
