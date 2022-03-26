package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int UPPER_BOUND = 10;
    private static final int LOWER_BOUND = 1;

    public Figure getRandomFigure() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Random random = new Random();
        int number1 = random.nextInt(UPPER_BOUND - LOWER_BOUND + 1) + LOWER_BOUND;
        int number2 = random.nextInt(UPPER_BOUND - LOWER_BOUND + 1) + LOWER_BOUND;
        int numberOfSubclasses = 5;
        int num = random.nextInt(numberOfSubclasses);
        switch (num) {
            case 1: return new RigthTriangle(colorSupplier.getRandomColor(),
                    number1,
                    number2);
            case 2: return new Circle(colorSupplier.getRandomColor(),
                    number1);
            case 3: return new Rectangle(colorSupplier.getRandomColor(),
                    number1,
                    number2);
            case 4: return new Square(colorSupplier.getRandomColor(),
                    number1);
            default: return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                    number1,
                    number2);
        }
    }

    public AreaCalculator getDefaultFigure() {
        //this method return white circle with radius 10.
        return new Circle("white", 10);
    }
}
