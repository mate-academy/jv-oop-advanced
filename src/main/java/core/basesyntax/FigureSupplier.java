package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int MAX_VALUE_OF_PARAMETER = 100;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);

        Figure figure;

        switch (figureNumber) {
            case 0:
                figure = new Square(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_VALUE_OF_PARAMETER));
                break;
            case 1:
                figure = new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_VALUE_OF_PARAMETER),
                        random.nextInt(MAX_VALUE_OF_PARAMETER));
                break;
            case 2:
                figure = new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_VALUE_OF_PARAMETER),
                        random.nextInt(MAX_VALUE_OF_PARAMETER));
                break;
            case 3:
                figure = new Circle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_VALUE_OF_PARAMETER));
                break;
            default:
                figure = new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_VALUE_OF_PARAMETER),
                        random.nextInt(MAX_VALUE_OF_PARAMETER),
                        random.nextInt(MAX_VALUE_OF_PARAMETER));
                break;
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), 10);
    }
}
