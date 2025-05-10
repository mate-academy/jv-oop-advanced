package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_PARARM = 10;
    private static final int FIGURES_AMOUNT = 5;
    private static final int RANDOM_BOUND = 100;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figure = random.nextInt(FIGURES_AMOUNT);
        String randomColor = colorSupplier.getRandomColor();
        switch (figure) {
            case 0:
                return new Circle(
                        random.nextInt(RANDOM_BOUND),
                        randomColor
                );
            case 1:
                return new IsoscelesTrapezoid(
                        random.nextInt(RANDOM_BOUND),
                        random.nextInt(RANDOM_BOUND),
                        random.nextInt(RANDOM_BOUND),
                        randomColor
                );
            case 2:
                return new Rectangle(
                        random.nextInt(RANDOM_BOUND),
                        random.nextInt(RANDOM_BOUND),
                        randomColor
                );
            case 3:
                return new RightTriangle(
                        random.nextInt(RANDOM_BOUND),
                        random.nextInt(RANDOM_BOUND),
                        randomColor
                );
            case 4:
                return new Square(random.nextInt(RANDOM_BOUND), randomColor);
            default: return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_PARARM, Color.WHITE.toString().toLowerCase());
    }
}
