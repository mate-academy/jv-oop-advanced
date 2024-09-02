package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final String DEFAULT_COLOR = Color.WHITE.name();

    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private Figure figure;

    public Figure getRandomFigure() {
        int randomFigure = random.nextInt(5);
        int randomUnits = random.nextInt(20) + 1;
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
                return null;
        }

        figure.color = colorSupplier.getRandomColor();
        return figure;
    }

    public Figure getDefaultFigure() {
        figure = new Circle(10);
        figure.color = DEFAULT_COLOR;
        return figure;
    }
}
