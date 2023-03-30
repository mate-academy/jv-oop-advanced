package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_OF_FIGURES = 4;
    private static int index;
    private static Random random = new Random();
    private static ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        index = random.nextInt(NUMBER_OF_FIGURES);
        switch (index) {
            case 0:
                return new Square(random.nextDouble() * 10,
                        colorSupplier.getRandomColor());
            case 1:
                return new Rectangle(random.nextDouble() * 10,
                        random.nextDouble() * 10,
                        colorSupplier.getRandomColor());
            case 2:
                return new RightTriangle(random.nextDouble() * 10,
                        random.nextDouble() * 10,
                        colorSupplier.getRandomColor());
            case 3:
                return new Circle(random.nextDouble() * 10,
                        colorSupplier.getRandomColor());
            case 4:
                return new IsoscelesTrapezoid(random.nextDouble() * 10,
                        random.nextDouble() * 10,
                        random.nextDouble() * 10,
                        colorSupplier.getRandomColor());
            default:
                return new Circle(10,
                        Color.WHITE.name());
        }

    }

    public Figure getDefaultFigure() {
        return new Circle(10, Color.WHITE.name());
    }
}
