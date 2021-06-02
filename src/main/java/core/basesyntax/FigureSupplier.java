package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURES = 5;
    private static final int MAX_FIGURE_SIZE = 20;

    public Figure getRandomFigure() {
        Figure figure = null; //yes, there is a null, but it wont return it anyway
        ColorSupplier colorSupplier = new ColorSupplier();
        Random random = new Random();

        int figureType = random.nextInt(FIGURES);

        switch (figureType) {
            case 0:
                figure = new Circle(colorSupplier.getRandomColor().toLowerCase(),
                        random.nextInt(MAX_FIGURE_SIZE) + 1);
                break;
            case 1:
                figure = new Square(colorSupplier.getRandomColor().toLowerCase(),
                        random.nextInt(MAX_FIGURE_SIZE) + 1);
                break;
            case 2:
                figure = new Rectangle(colorSupplier.getRandomColor().toLowerCase(),
                        random.nextInt(MAX_FIGURE_SIZE) + 1,
                        random.nextInt(MAX_FIGURE_SIZE) + 1);
                break;
            case 3:
                figure = new RightTriange(colorSupplier.getRandomColor().toLowerCase(),
                        random.nextInt(MAX_FIGURE_SIZE) + 1);
                break;
            case 4:
                figure = new IsoscelesTrapezoid(colorSupplier.getRandomColor().toLowerCase(),
                        random.nextInt(MAX_FIGURE_SIZE) + 1,
                        random.nextInt(MAX_FIGURE_SIZE) + 1,
                        random.nextInt(MAX_FIGURE_SIZE) + 1);
                break;
            default:
                break;
        }
        return figure;
    }
}
