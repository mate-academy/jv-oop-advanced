package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private static final double DEFAULT_RADIUS = 10.00;
    private static final int MAX_SIDE_UNITS = 9;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        Figure figure;
        int numberOfFigures = 5;
        int randomFigure = random.nextInt(numberOfFigures);

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
        return MAX_SIDE_UNITS * random.nextDouble() + 1;
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
