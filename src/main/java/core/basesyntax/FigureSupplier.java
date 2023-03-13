package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int MAX_RANDOM_VALUE = 100;
    public static final int NUMBER_FIGURES = 5;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = new Random().nextInt(NUMBER_FIGURES);
        int randomParameter1 = random.nextInt(MAX_RANDOM_VALUE);
        int randomParameter2 = random.nextInt(MAX_RANDOM_VALUE);
        int randomParameter3 = random.nextInt(MAX_RANDOM_VALUE);
        String colorRandom = colorSupplier.getRandomColor();
        switch (index) {
            case 0:
                return new Square(randomParameter1, colorRandom);
            case 1:
                return new Rectangle(randomParameter1, randomParameter2, colorRandom);
            case 2:
                return new Circle(randomParameter1, colorRandom);
            case 3:
                return new RightTriangle(randomParameter1, randomParameter2, colorRandom);
            case 4:
                return new IsoscelesTrapezoid(randomParameter1, randomParameter2,
                        randomParameter3, colorRandom);
            default:
                return new Circle(randomParameter1, colorRandom);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, "WHITE");
    }
}
