package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 4;
    private static final Random random = new Random();
    private static final ColorSupplier ColorSupplier = new ColorSupplier();

    private double getRandomDouble() {
        return new Random().nextDouble() * 10;
    }

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        switch (figureNumber) {
            case 0:
                return new Circle(ColorSupplier.getRandomColor(),getRandomDouble());
            case 1:
                return new IsoscelesTrapezoid(ColorSupplier.getRandomColor(),getRandomDouble(),
                        getRandomDouble(),getRandomDouble());
            case 2:
                return new Rectangle(ColorSupplier.getRandomColor(),
                        getRandomDouble(),getRandomDouble());
            case 3:
                return new RightTriangle(ColorSupplier.getRandomColor(),
                        getRandomDouble(),getRandomDouble());
            case 4:
                return new Square(ColorSupplier.getRandomColor(),getRandomDouble());
            default:
                new Square(ColorSupplier.getRandomColor(),getRandomDouble());
        }
        return null;
    }
}
