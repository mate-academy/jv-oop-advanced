package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_OF_FIGURES = 5;
    private static final int MAX_FIGURE_SIZE = 20;

    public Figure getRandomFigure() {
        Figure figure;
        ColorSupplier colorSupplier = new ColorSupplier();
        Random random = new Random();

        int figureType = random.nextInt(NUMBER_OF_FIGURES);

        switch (figureType) {
            case 0:
                figure = new Circle(colorSupplier.getRandomColor().toLowerCase(),
                        random.nextInt(MAX_FIGURE_SIZE) + 1);
                return figure;
            case 1:
                figure = new Square(colorSupplier.getRandomColor().toLowerCase(),
                        random.nextInt(MAX_FIGURE_SIZE) + 1);
                return figure;
            case 2:
                figure = new Rectangle(colorSupplier.getRandomColor().toLowerCase(),
                        random.nextInt(MAX_FIGURE_SIZE) + 1,
                        random.nextInt(MAX_FIGURE_SIZE) + 1);
                return figure;
            case 3:
                figure = new RightTriange(colorSupplier.getRandomColor().toLowerCase(),
                        random.nextInt(MAX_FIGURE_SIZE) + 1);
                return figure;
            case 4:
            default:
                figure = new IsoscelesTrapezoid(colorSupplier.getRandomColor().toLowerCase(),
                        random.nextInt(MAX_FIGURE_SIZE) + 1,
                        random.nextInt(MAX_FIGURE_SIZE) + 1,
                        random.nextInt(MAX_FIGURE_SIZE) + 1);
                return figure;
        }
    }
}
