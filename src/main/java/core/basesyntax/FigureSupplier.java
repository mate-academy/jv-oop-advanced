package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 4;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    private double getRandomDouble() {
        return random.nextDouble() * 10;
    }

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        switch (figureNumber) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(),getRandomDouble());
            case 1:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),getRandomDouble(),
                        getRandomDouble(),getRandomDouble());
            case 2:
                return new Rectangle(colorSupplier.getRandomColor(),
                        getRandomDouble(),getRandomDouble());
            case 3:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        getRandomDouble(),getRandomDouble());
            case 4:
                return new Square(colorSupplier.getRandomColor(),getRandomDouble());
            default:
                return new Square(colorSupplier.getRandomColor(),getRandomDouble());
        }
    }
}
