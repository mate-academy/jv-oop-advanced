package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int FIGURE_PARAMETERS_COUNT = 10;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        Figure figure = null;
        switch (figureNumber) {
            case 1:
                figure = new Square(colorSupplier.getRandomColor(),
                        random.nextInt(FIGURE_PARAMETERS_COUNT));
                break;
            case 2:
                figure = new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(FIGURE_PARAMETERS_COUNT),
                        random.nextInt(FIGURE_PARAMETERS_COUNT));
                break;
            case 3:
                figure = new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(FIGURE_PARAMETERS_COUNT),
                        random.nextInt(FIGURE_PARAMETERS_COUNT));
                break;
            case 4:
                figure = new Circle(colorSupplier.getRandomColor(),
                        random.nextInt(FIGURE_PARAMETERS_COUNT));
                break;
            default:
                figure = new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(FIGURE_PARAMETERS_COUNT),
                        random.nextInt(FIGURE_PARAMETERS_COUNT),
                        random.nextInt(FIGURE_PARAMETERS_COUNT));
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        return new Circle(Colors.WHITE.toString().toLowerCase(), 10);
    }
}
