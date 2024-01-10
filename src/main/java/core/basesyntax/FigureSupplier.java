package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int BOUND = 100;
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private static final double DEFAULT_RADIUS = 10.0;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Figure randomFigure;

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        switch (figureNumber) {
            case 0:
                double side = sideNotNull();
                randomFigure = new Square(colorSupplier.getRandomColor(), side);
                break;
            case 1:
                double firstSide = sideNotNull();
                double secondSide = sideNotNull();
                randomFigure = new Rectangle(colorSupplier.getRandomColor(),
                        firstSide, secondSide);
                break;
            case 2:
                double firstLeg = sideNotNull();
                double secondLeg = sideNotNull();
                randomFigure = new RightTriangle(colorSupplier.getRandomColor(),
                        firstLeg, secondLeg);
                break;
            case 3:
                double radius = sideNotNull();
                randomFigure = new Circle(colorSupplier.getRandomColor(), radius);
                break;
            case 4:
                double shortLeg = sideNotNull();
                double longLeg = sideNotNull();
                double height = sideNotNull();
                randomFigure = new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        shortLeg, longLeg, height);
                break;
            default:
                throw new IllegalStateException();
        }
        return randomFigure;
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    private double sideNotNull() {
        double side = random.nextInt(BOUND);
        while (side == 0) {
            side = random.nextInt(BOUND);
        }
        return side;
    }
}
