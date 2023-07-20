package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private Random random = new Random();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        switch (figureNumber) {
            case 0:
                return new Square(ColorSupplier.getRandomColor(),
                        random.nextDouble() * 10 + 1);
            case 1:
                return new Rectangle(ColorSupplier.getRandomColor(),
                        random.nextDouble() * 10 + 1,
                        random.nextDouble() * 10 + 1);
            case 2:
                return new RightTriangle(ColorSupplier.getRandomColor(),
                        random.nextDouble() * 10 + 1,
                        random.nextDouble() * 10 + 1);
            case 3:
                return new Circle(ColorSupplier.getRandomColor(),
                        random.nextDouble() * 10 + 1);
            case 4:
                return new IsoscelesTrapezoid(ColorSupplier.getRandomColor(),
                        random.nextDouble() * 10 + 1,
                        random.nextDouble() * 10 + 1,
                        random.nextDouble() * 10 + 1);
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, 10);
    }
}
