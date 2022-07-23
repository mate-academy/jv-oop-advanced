package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_RADIUS_VALUE = 20;
    private static final int MAX_QUANTITIES_FIGURES = 4;
    private static final int MAX_RANDOM_VALUE = 20;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomRadius = random.nextInt(MAX_RADIUS_VALUE);
        int randomBase1 = random.nextInt(MAX_RANDOM_VALUE);
        int randomBase2 = random.nextInt(MAX_RANDOM_VALUE);
        int height = random.nextInt(MAX_RANDOM_VALUE);
        int firstLeg = random.nextInt(MAX_RANDOM_VALUE);
        int secondLeg = random.nextInt(MAX_RANDOM_VALUE);
        int leg = random.nextInt(MAX_RANDOM_VALUE);
        int index = random.nextInt(MAX_QUANTITIES_FIGURES);

        switch (index) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(), randomRadius);
            case 1:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), randomBase1,
                        randomBase2, height);
            case 2:
                return new RightTriangle(colorSupplier.getRandomColor(), firstLeg, secondLeg);
            case 3:
                return new Rectangle(colorSupplier.getRandomColor(), firstLeg, secondLeg);
            case 4:
            default:
                return new Square(colorSupplier.getRandomColor(), leg);
        }

    }

    public Figure getDefaultFigure() {
        return new Circle("WHITE", 10);
    }
}





