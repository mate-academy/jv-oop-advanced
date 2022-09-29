package core.basesyntax.models;

import java.util.Random;

public class FigureSupplier {
    public static final String DEFAULT_FIGURE = "Circle";
    private static final String[] AVAILABLE_FIGURES = {
            "Circle",
            "IsoscelesTrapezoid",
            "Rectangle",
            "RightTriangle",
            "Square"
    };
    private final Random random = new Random();

    public Figure getDefaultFigure() {
        return createFigure(DEFAULT_FIGURE);
    }

    public Figure getRandomFigure() {
        int randFigureIndex = random.nextInt(AVAILABLE_FIGURES.length);
        Figure figure = createFigure(AVAILABLE_FIGURES[randFigureIndex]);
        return figure.setRandomProperties();
    }

    private Figure createFigure(String figureName) {
        switch (figureName) {
            case "Circle":
                return new Circle();
            case "IsoscelesTrapezoid":
                return new IsoscelesTrapezoid();
            case "Rectangle":
                return new Rectangle();
            case "RightTriangle":
                return new RightTriangle();
            case "Square":
                return new Square();
            default:
                return getDefaultFigure();
        }
    }
}
