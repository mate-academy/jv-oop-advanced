package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int UPPER_BOUND = 10;
    private static final int LOWER_BOUND = 1;
    private static final int DEFAULT_RADIUS = 5;

    public Figure getRandomFigure() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Random random = new Random();
        int firstnumber = random.nextInt(UPPER_BOUND - LOWER_BOUND + 1) + LOWER_BOUND;
        int secondNumber = random.nextInt(UPPER_BOUND - LOWER_BOUND + 1) + LOWER_BOUND;
        int numberOfSubclasses = 5;
        int num = random.nextInt(numberOfSubclasses);
        switch (num) {
            case 1: return new RigthTriangle(colorSupplier.getRandomColor(),
                    firstnumber,
                    secondNumber);
            case 2: return new Circle(colorSupplier.getRandomColor(),
                    firstnumber);
            case 3: return new Rectangle(colorSupplier.getRandomColor(),
                    firstnumber,
                    secondNumber);
            case 4: return new Square(colorSupplier.getRandomColor(),
                    firstnumber);
            default: return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                    firstnumber,
                    secondNumber);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), DEFAULT_RADIUS);
    }
}
