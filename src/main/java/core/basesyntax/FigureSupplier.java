package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_RANDOM_VALUE = 19;
    private static final int NUMBER_OF_FIGURES = 5;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(NUMBER_OF_FIGURES);

        switch (index) {
            case 0:
                int randomRadius = random.nextInt(MAX_RANDOM_VALUE) + 1;
                return new Circle(colorSupplier.getRandomColor(), randomRadius);
            case 1:
                int randomLength = random.nextInt(MAX_RANDOM_VALUE) + 1;
                int randomWidth = random.nextInt(MAX_RANDOM_VALUE) + 1;
                return new Rectangle(colorSupplier.getRandomColor(), randomLength, randomWidth);
            case 2:
                int randomFirstLeg = random.nextInt(MAX_RANDOM_VALUE) + 1;
                int randomSecondLeg = random.nextInt(MAX_RANDOM_VALUE) + 1;
                return new RightTriangle(
                        colorSupplier.getRandomColor(), randomFirstLeg, randomSecondLeg
                );
            case 3:
                int randomSide = random.nextInt(MAX_RANDOM_VALUE) + 1;
                return new Square(colorSupplier.getRandomColor(), randomSide);
            default:
                int randomHeight = random.nextInt(MAX_RANDOM_VALUE) + 1;
                int randomBase1 = random.nextInt(MAX_RANDOM_VALUE) + 1;
                int randomBase2 = random.nextInt(MAX_RANDOM_VALUE) + 1;
                return new IsoscelesTrapezoid(
                        colorSupplier.getRandomColor(), randomHeight, randomBase1, randomBase2
                );
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.toString(), 10);
    }
}
