package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 4;
    public static final int DEFAULT_RADIUS = 10;
    public static final int PARAMENTR = 100;
    private Random random = new Random();

    public Figure getRandomFigure() {
        int value = random.nextInt(FIGURE_COUNT);
        Figure figure = null;
        switch (value) {
            case 0:
                figure = new Circle(getRandomNumber(), ColorSupplier.getRandomColor());
                break;
            case 1:
                figure = new Square(getRandomNumber(), ColorSupplier.getRandomColor());
                break;
            case 2:
                figure = new IsoscelesTrapezoid(getRandomNumber(), getRandomNumber(),
                        getRandomNumber(), ColorSupplier.getRandomColor());
                break;
            case 3:
                figure = new RightTriangle(getRandomNumber(), getRandomNumber(),
                        ColorSupplier.getRandomColor());
                break;
            default:
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, Color.WHITE.getName());
    }

    private int getRandomNumber() {
        return new Random().nextInt(PARAMENTR);
    }
}
