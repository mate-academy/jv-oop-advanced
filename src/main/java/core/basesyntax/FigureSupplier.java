package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURES_NUMBER = 5;
    public static final int DEFAULT_FIRST_SIDE = 10;
    public static final int DEFAULT_SECOND_SIDE = 10;
    public static final int DEFAULT_RADIUS = 10;
    public static final int DEFAULT_HEIGHT = 10;
    public static final Color DEFAULT_COLOR = Color.WHITE;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURES_NUMBER);
        switch (figureNumber) {
            case 0: return new Circle(random.nextInt(DEFAULT_RADIUS),
                    colorSupplier.getRandomColor());
            case 1: return new Rectangle(random.nextInt(DEFAULT_FIRST_SIDE),
                    random.nextInt(DEFAULT_SECOND_SIDE), colorSupplier.getRandomColor());
            case 2: return new RightTriangle(random.nextInt(DEFAULT_FIRST_SIDE),
                    random.nextInt(DEFAULT_SECOND_SIDE),
                    colorSupplier.getRandomColor());
            case 3: return new IsoscelesTrapezoid(random.nextInt(DEFAULT_FIRST_SIDE),
                    random.nextInt(DEFAULT_SECOND_SIDE),
                    random.nextInt(DEFAULT_HEIGHT), colorSupplier.getRandomColor());
            default: return new Square(random.nextInt(DEFAULT_HEIGHT),
                    colorSupplier.getRandomColor());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
    }
}
