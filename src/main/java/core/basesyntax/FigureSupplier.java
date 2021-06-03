package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_OF_FIGURES = 5;
    private static final int UPPER_BOUND = 50;

    public Figure getRandomFigure() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Random random = new Random();
        double generatedDouble = Math.ceil(Math.random() * UPPER_BOUND);
        int target = random.nextInt(NUMBER_OF_FIGURES);
        switch (target) {
            case 0:
                return new Square(colorSupplier.getRandomColor(), generatedDouble);
            case 1:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        generatedDouble, generatedDouble);
            case 2:
                return new Rectangle(colorSupplier.getRandomColor(),
                        generatedDouble, generatedDouble);
            case 3:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), generatedDouble,
                        generatedDouble, generatedDouble);
            case 4:
            default:
                return new Cirlce(colorSupplier.getRandomColor(), generatedDouble);

        }
    }
}
