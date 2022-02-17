package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 4;
    private static final int RADIUS_DEFAULT = 10;
    private static final int RANGE = 100;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Figure figure = new Figure();
    private Figure defaultFigure = new Circle(RADIUS_DEFAULT);

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        switch (figureNumber) {
            case 0:
                int radius = random.nextInt(RANGE) + 1;
                figure = new Circle(radius);
                figure.setColor(colorSupplier.getRandomColor());
                break;
            case 1:
                int side = random.nextInt(RANGE) + 1;
                figure = new Square(side);
                figure.setColor(colorSupplier.getRandomColor());
                break;
            case 2:
                int sideA = random.nextInt(RANGE) + 1;
                int sideB = random.nextInt(RANGE) + 1;
                figure = new Rectangle(sideA, sideB);
                figure.setColor(colorSupplier.getRandomColor());
                break;
            case 3:
                int firstLeg = random.nextInt(RANGE) + 1;
                int secondLeg = random.nextInt(RANGE) + 1;
                figure = new RightTriangle(firstLeg, secondLeg);
                figure.setColor(colorSupplier.getRandomColor());
                break;
            default:
                break;
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        defaultFigure.setColor(String.valueOf(Color.WHITE));
        return defaultFigure;
    }
}
