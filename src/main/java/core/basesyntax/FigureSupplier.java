package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int MAX_VALUE = 10;
    private int[] figureParameters = new int[3];
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    private Figure getFigure(int figureNumber) {
        switch (figureNumber) {
            case 0:
                return new Circle(figureParameters[0]);
            case 1:
                return new RightTriangle(figureParameters[0], figureParameters[1]);
            case 2:
                return new Square(figureParameters[0]);
            case 3:
                return new Rectangle(figureParameters[0], figureParameters[1]);
            default:
                return new IsoscelesTrapezoid(figureParameters[0],
                        figureParameters[1], figureParameters[2]);
        }
    }

    public Figure getRandomFigure() {
        for (int i = 0; i < figureParameters.length; i++) {
            figureParameters[i] = random.nextInt(MAX_VALUE) + 1;
        }
        Figure figure = getFigure(random.nextInt(FIGURE_COUNT));
        figure.setFigureColor(colorSupplier.getRandomColor());
        return figure;
    }

    public Figure getDefaultFigure() {
        figureParameters[0] = 10;
        Figure figure = getFigure(0);
        figure.setFigureColor(Color.WHITE.name().toLowerCase());
        return figure;
    }
}
