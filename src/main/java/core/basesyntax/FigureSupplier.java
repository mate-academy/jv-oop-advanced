package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int SIZE_LIMIT = 30;
    private static final int FIGURE_OPTION = 5;
    private static final int DEFAULT_RADIUS = 10;

    public Figure getRandomFigure() {
        Random random = new Random();
        ColorSupplier randomColor = new ColorSupplier();
        int figureOption = random.nextInt(FIGURE_OPTION);
        int param = random.nextInt(SIZE_LIMIT);

        switch (figureOption) {
            case 1:
                return new Circle(param, randomColor.getRandomColor());
            case 2:
                return new Square(param, randomColor.getRandomColor());
            case 3:
                return new Rectangle(param, param, randomColor.getRandomColor());
            case 4:
                return new RightTriangle(param,param, randomColor.getRandomColor());
            default:
                return new Trapezoid(param, param, param, randomColor.getRandomColor());
        }

    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, Color.WHITE);
    }
}
