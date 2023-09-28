package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_LENGTH = 100;
    private static final int FIGURE_COUNT = 5;
    private static final int DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = String.valueOf(Color.WHITE);

    private final Random random = new Random();
    private final ColorSupplier supplier = new ColorSupplier();

    public Figure getRandomFigure() {
        String color = supplier.getRandomColor();
        final int index = random.nextInt(FIGURE_COUNT);

        switch (index) {
            case 0:
                return new Circle(getRandomNumber(), color);
            case 1:
                return new IsoscelesTrapezoid(getRandomNumber(), getRandomNumber(),
                        getRandomNumber(), color);
            case 2:
                return new Rectangle(getRandomNumber(), getRandomNumber(), color);
            case 3:
                return new RightTriangle(getRandomNumber(), getRandomNumber(), color);
            default:
                return new Square(getRandomNumber(), color);
        }
    }


    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
    }

    private int getRandomNumber() {
        return random.nextInt(MAX_LENGTH);
    }
}
