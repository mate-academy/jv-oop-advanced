package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private static final int FIGURES_AMOUNT = 5;
    private static final int UNITS_BORDER = 20;
    private static final int DEFAULT_RADIUS = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private Figure figure;

    public Figure getRandomFigure() {
        int randomFigure = random.nextInt(FIGURES_AMOUNT);
        int randomUnits = random.nextInt(UNITS_BORDER) + 1;
        switch (randomFigure) {
            case 0:
                figure = new Square(randomUnits);
                break;
            case 1:
                figure = new Rectangle(randomUnits, randomUnits);
                break;
            case 2:
                figure = new RightTriangle(randomUnits,randomUnits);
                break;
            case 3:
                figure = new Circle(randomUnits);
                break;
            case 4:
                figure = new IsoscelesTrapezoid(randomUnits, randomUnits, randomUnits);
                break;
            default:
                break;
        }

        figure.isColor(colorSupplier.getRandomColor());

        return figure;
    }

    public Figure getDefaultFigure() {
        figure = new Circle(DEFAULT_RADIUS);
        figure.color = DEFAULT_COLOR;
        return figure;
    }
}
