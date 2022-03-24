package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int MAX_VAL = 100;
    private ColorSupplier supplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        switch (figureNumber) {
            case 0:
                double randomValue = random.nextDouble();
                return new Circle(randomValue, supplier.getRandomColor());
            case 1:
                randomValue = random.nextDouble();
                return new Square(randomValue, supplier.getRandomColor());
            case 2:
                int firstParametr = random.nextInt(MAX_VAL);
                int secondParametr = random.nextInt(MAX_VAL);
                return new Rectangle(firstParametr, secondParametr, supplier.getRandomColor());
            case 3:
                randomValue = random.nextDouble();
                return new RightTriangle(randomValue, supplier.getRandomColor());
            default:
                firstParametr = random.nextInt(MAX_VAL);
                secondParametr = random.nextInt(MAX_VAL);
                return new IsoscelesTrapezoid(firstParametr,
                        secondParametr,
                        supplier.getRandomColor());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, supplier.getDefaultColor());
    }
}

