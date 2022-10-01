package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int BOUND_OF_RANDOM_PARAMETER = 30;
    private final Random random;
    private final ColorSupplier supplier;

    public FigureSupplier(Random random, ColorSupplier supplier) {
        this.random = random;
        this.supplier = supplier;
    }

    public Figure getRandomFigure(int number) {
        String randomColor = supplier.getRandomColor();
        Figure randomFigure;
        int parameter1 = random.nextInt(BOUND_OF_RANDOM_PARAMETER);
        int parameter2 = random.nextInt(BOUND_OF_RANDOM_PARAMETER);

        switch (number) {
            case 0:
                randomFigure = new Square(randomColor, parameter1);
                break;
            case 1:
                randomFigure = new Rectangle(randomColor, parameter1, parameter2);
                break;
            case 2:
                randomFigure = new RightTriangle(randomColor, parameter1, parameter2);
                break;
            case 3:
                randomFigure = new IsoscelesTrapezoid(randomColor, parameter1, parameter2);
                break;
            default:
                randomFigure = new Circle(randomColor, parameter1);
                break;
        }
        return randomFigure;
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), 10);
    }
}
