package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final Random RANDOM = new Random();

    public Figure getRandomFigure() {
        int figureNumber = RANDOM.nextInt(FIGURE_COUNT);
        double randomSize = RANDOM.nextDouble() * 10 + 1;
        Color randomColor = new ColorSupplier().getRandomColor();

        switch (figureNumber) {
            case 0:
                return new Square(RANDOM.nextDouble() * 10 + 1,
                        new ColorSupplier().getRandomColor());
            case 1:
                return new Rectangle(RANDOM.nextDouble() * 10 + 1, RANDOM.nextDouble() * 10 + 1,
                        new ColorSupplier().getRandomColor());
            case 2:
                return new RightTriangle(RANDOM.nextDouble() * 10 + 1, RANDOM.nextDouble() * 10 + 1,
                        new ColorSupplier().getRandomColor());
            case 3:
                return new Circle("Random Circle",
                        RANDOM.nextDouble() * 10 + 1,
                        new ColorSupplier().getRandomColor());
            case 4:
                return new IsoscelesTrapezoid(RANDOM.nextDouble() * 10 + 1,
                        RANDOM.nextDouble() * 10 + 1,
                        RANDOM.nextDouble() * 10 + 1, new ColorSupplier().getRandomColor());
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("Default Circle", 10, Color.WHITE);
    }
}
