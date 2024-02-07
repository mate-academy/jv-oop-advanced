package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = FigureEnumeration.values().length;
    private static final int FIGURE_PARAMETER_BOUND = 100;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(FIGURE_COUNT);
        Figure figure;
        switch (index) {
            case 0:
                figure = new Square(random.nextInt(FIGURE_PARAMETER_BOUND),
                        colorSupplier.getRandomColor());
                break;
            case 1:
                figure = new Rectangle(random.nextInt(FIGURE_PARAMETER_BOUND),
                        random.nextInt(FIGURE_PARAMETER_BOUND),
                        colorSupplier.getRandomColor());
                break;
            case 2:
                figure = new RightTriangle(random.nextInt(FIGURE_PARAMETER_BOUND),
                        random.nextInt(FIGURE_PARAMETER_BOUND),
                        colorSupplier.getRandomColor());
                break;
            case 3:
                figure = new Circle(random.nextInt(FIGURE_PARAMETER_BOUND),
                        colorSupplier.getRandomColor());
                break;
            case 4:
                figure = new IsoscelesTrapezoid(random.nextInt(FIGURE_PARAMETER_BOUND),
                        random.nextInt(FIGURE_PARAMETER_BOUND),
                        random.nextInt(FIGURE_PARAMETER_BOUND),
                        colorSupplier.getRandomColor());
                break;
            default:
                figure = new FigureSupplier().getDefaultFigure();
                break;
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        return new Circle(10, "white");
    }
}
