package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int COUNT_FIGURE = 5;
    private static final int MAX_PARAMETER = 100;
    private final Random random;
    private final ColorSupplier colorSupplier;

    public FigureSupplier(Random random, ColorSupplier colorSupplier) {
        this.random = random;
        this.colorSupplier = colorSupplier;
    }

    public Figure getRandomFigure() {
        Figure figure = null;
        int index = new Random().nextInt(COUNT_FIGURE);
        switch (index) {
            case 1:
                return new Circle(colorSupplier.getRandomColor(),
                        new Random().nextInt(MAX_PARAMETER));
            case 2:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        new Random().nextInt(MAX_PARAMETER),
                        new Random().nextInt(MAX_PARAMETER));
            case 3:
                return new Rectangle(colorSupplier.getRandomColor(),
                        new Random().nextInt(MAX_PARAMETER),
                        new Random().nextInt(MAX_PARAMETER));
            case 4:
                return new Square(colorSupplier.getRandomColor(),
                        new Random().nextInt(MAX_PARAMETER));
            default:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        new Random().nextInt(MAX_PARAMETER),
                        new Random().nextInt(MAX_PARAMETER),
                        new Random().nextInt(MAX_PARAMETER));
        }
    }

    public Figure defaultFigure() {
        return new Square(Colors.BLUE.toString().toLowerCase(), 20);
    }
}
