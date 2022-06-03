package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int MEASURE_RANGE = 20;
    private Random random = new Random();
    private Figure figure;

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        switch (figureNumber) {
            case 1:
                double radius = random.nextDouble() * MEASURE_RANGE;
                figure = new Circle(radius);
                break;
            case 2:
                double side = random.nextDouble() * MEASURE_RANGE;
                figure = new Square(side);
                break;
            case 3:
                double length = random.nextDouble() * MEASURE_RANGE;
                double width = random.nextDouble() * MEASURE_RANGE;
                figure = new Rectangle(length, width);
                break;
            case 4:
                double firstLeg = random.nextDouble() * MEASURE_RANGE;
                double secondLeg = random.nextDouble() * MEASURE_RANGE;
                figure = new RightTriangle(firstLeg, secondLeg);
                break;
            default:
                double topSide = random.nextDouble() * MEASURE_RANGE;
                double downSide = random.nextDouble() * MEASURE_RANGE;
                double height = random.nextDouble() * MEASURE_RANGE;
                figure = new IsoscelesTrapezoid(topSide, downSide, height);
                break;
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        double radius = 10.0;

        figure = new Circle(radius);
        figure.color = Color.WHITE;
        return figure;
    }
}
