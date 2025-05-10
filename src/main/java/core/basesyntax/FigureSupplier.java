package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURES_COUNT = 100;
    private static final int CIRCLE_RADIUS = 10;
    private static final String CIRCLE_COLOR = "WHITE";
    private final ColorSupplier colorSupplier;
    private FigureName figures;

    public FigureSupplier(ColorSupplier colorSupplier, Random random) {
        this.colorSupplier = colorSupplier;
    }

    private int getRandomValues() {
        int random = new Random().nextInt(FIGURES_COUNT);
        return random;
    }

    public Figure getRandomFigure() {
        int index = new Random().nextInt(FigureName.values().length);
        figures = FigureName.values()[index];

        switch (figures) {
            case CIRCLE:
                return new Circle(getRandomValues(), colorSupplier.getRandomColor());
            case RIGHT_TRIANGLE:
                return new RightTriangle(getRandomValues(), getRandomValues(),
                        colorSupplier.getRandomColor());
            case ISOSCELES_TRAPEZOID:
                return new IsoscelesTrapezoid(getRandomValues(), getRandomValues(),
                        getRandomValues(), colorSupplier.getRandomColor());
            case RECTANGLE:
                return new Rectangle(getRandomValues(),getRandomValues(),
                        colorSupplier.getRandomColor());
            case SQUARE:
                return new Square(getRandomValues(), colorSupplier.getRandomColor());
            default: DEFAULT_CIRCLE:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        Figure defaultCircle = new Circle(CIRCLE_RADIUS, CIRCLE_COLOR);
        return defaultCircle;
    }
}
