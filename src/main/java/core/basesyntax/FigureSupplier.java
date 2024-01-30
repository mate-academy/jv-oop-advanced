package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_RADIUS_LENGTH = 10;
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Figure figure;

    public Figure getRandomFigure() {
        int randomSwitchValue = random.nextInt(1, 5);
        switch (randomSwitchValue) {
            case 1:
                figure = new RightTriangle(colorSupplier.getRandomColor(),
                        getRandomValue(), getRandomValue());
                break;
            case 2:
                figure = new Square(colorSupplier.getRandomColor(), getRandomValue());
                break;
            case 3:
                figure = new Rectangle(colorSupplier.getRandomColor(),
                        getRandomValue(), getRandomValue());
                break;
            case 4:
                figure = new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        getRandomValue(), getRandomValue(), getRandomValue());
                break;
            case 5:
                figure = new Circle(colorSupplier.getRandomColor(),getRandomValue());
                break;
            default:
                break;
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS_LENGTH);
    }

    public double getRandomValue() {
        return random.nextDouble(1, 10);
    }
}
