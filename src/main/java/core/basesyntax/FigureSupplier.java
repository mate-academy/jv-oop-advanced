package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURES_NUMBER = 5;
    private static final int MAX_RANDOM_VALUE = 20;
    private static final String DEFAULT_COLOR = "WHITE";
    private static final int DEFAULT_RADIUS = 20;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(FIGURES_NUMBER);
        switch (index) {
            case 0:
                int randomRadius = random.nextInt(FIGURES_NUMBER);
                return new Circle(colorSupplier.getRandomColor(), randomRadius);
            case 1:
                int randomBase1 = random.nextInt(MAX_RANDOM_VALUE);
                int randomBase2 = random.nextInt(MAX_RANDOM_VALUE);
                int height = random.nextInt(MAX_RANDOM_VALUE);
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), randomBase1,
                        randomBase2, height);
            case 2:
                int firstLeg = random.nextInt(MAX_RANDOM_VALUE);
                int secondLeg = random.nextInt(MAX_RANDOM_VALUE);
                return new RightTriangle(colorSupplier.getRandomColor(), firstLeg, secondLeg);
            case 3:
                int firstLeg1 = random.nextInt(MAX_RANDOM_VALUE);
                int secondLeg1 = random.nextInt(MAX_RANDOM_VALUE);
                return new Rectangle(colorSupplier.getRandomColor(), firstLeg1, secondLeg1);
            case 4:
            default:
                int leg = random.nextInt(MAX_RANDOM_VALUE);
                return new Square(colorSupplier.getRandomColor(), leg);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
