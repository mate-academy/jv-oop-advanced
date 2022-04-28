package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_FIGURE_PARAMETER_VALUE = 10;
    private static final int RANDOM_NUMBER_FIGURE = 5;
    private Random random = new Random();

    public Figure getRandomFigure() {
        ColorSupplier colorSupplier = new ColorSupplier();
        switch (random.nextInt(RANDOM_NUMBER_FIGURE)) {
            case (0):
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_FIGURE_PARAMETER_VALUE),
                        random.nextInt(MAX_FIGURE_PARAMETER_VALUE),
                        random.nextInt(MAX_FIGURE_PARAMETER_VALUE));
            case (1):
                return new Circle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_FIGURE_PARAMETER_VALUE));
            case (2):
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_FIGURE_PARAMETER_VALUE),
                        random.nextInt(MAX_FIGURE_PARAMETER_VALUE));
            case (3):
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_FIGURE_PARAMETER_VALUE),
                        random.nextInt(MAX_FIGURE_PARAMETER_VALUE));
            default:
                return new Square(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_FIGURE_PARAMETER_VALUE));
        }
    }
}
