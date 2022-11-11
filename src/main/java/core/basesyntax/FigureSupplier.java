package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    public static final int FIGURE_COUNT = 5;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {

        int figureNumber = random.nextInt(FIGURE_COUNT);

        switch (figureNumber) {
            case 0:
                return new Square(colorSupplier.getRandomColor(),
                        random.nextInt(10) + 1);

            case 1:
                return new Circle(colorSupplier.getRandomColor(),
                        random.nextInt(10) + 1);

            case 2:
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(10) + 1, new Random().nextInt(10) + 1);

            case 3:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(10) + 1,
                        random.nextInt(10) + 1);

            default:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(10) + 1,
                        random.nextInt(10) + 1,
                        random.nextInt(10) + 1);

        }
    }

    public Figure getDefaultFigure() {
        return new Circle("WHITE", 10);
    }
}
