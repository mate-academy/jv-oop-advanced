package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 4;
    private static final int MAX_VAL = 100;
    private ColorSupplier supplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        switch (figureNumber) {
            case 1:
                double randomValue = random.nextDouble();
                return new Circle(randomValue, supplier.getRandomColor());
            case 2:
                randomValue = random.nextDouble();
                return new Square(randomValue, supplier.getRandomColor());
            case 3:
                int varInt1 = random.nextInt(MAX_VAL);
                int varInt2 = random.nextInt(MAX_VAL);
                return new Rectangle(varInt1, varInt2, supplier.getRandomColor());
            case 4:
                randomValue = random.nextDouble();
                return new RightTriangle(randomValue, supplier.getRandomColor());
            default:
                varInt1 = random.nextInt(MAX_VAL);
                varInt2 = random.nextInt(MAX_VAL);
                return new IsoscelesTrapezoid(varInt1, varInt2, supplier.getRandomColor());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, supplier.getDefaultColor());
    }
}

