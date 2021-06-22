package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_OF_FIGURES = 5;
    private static final int MAX_FIGURE_SIZE = 20;

    public Figure getRandomFigure() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Random random = new Random();

        int figureType = random.nextInt(NUMBER_OF_FIGURES);

        switch (figureType) {
            case 0:
                return new Circle(colorSupplier.getRandomColor().toLowerCase(),
                        random.nextInt(MAX_FIGURE_SIZE) + 1);
            case 1:
                return new Square(colorSupplier.getRandomColor().toLowerCase(),
                        random.nextInt(MAX_FIGURE_SIZE) + 1);
            case 2:
                return new Rectangle(colorSupplier.getRandomColor().toLowerCase(),
                        random.nextInt(MAX_FIGURE_SIZE) + 1,
                        random.nextInt(MAX_FIGURE_SIZE) + 1);
            case 3:
                return new RightTriangle(colorSupplier.getRandomColor().toLowerCase(),
                        random.nextInt(MAX_FIGURE_SIZE) + 1);
            case 4:
            default:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor().toLowerCase(),
                        random.nextInt(MAX_FIGURE_SIZE) + 1,
                        random.nextInt(MAX_FIGURE_SIZE) + 1,
                        random.nextInt(MAX_FIGURE_SIZE) + 1);
        }
    }
}
