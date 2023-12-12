package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    // made BOUND = 100 to generate random int which will be more than 0, because we
    // can't have figure shapes or area lower than 0
    public static final int BOUND = 100;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Figure defaultFigure = new Circle(Color.WHITE.name(), 10.0);
    private Figure randomFigure;

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        switch (figureNumber) {
            case 0:
                double side = random.nextInt(BOUND);
                randomFigure = new Square(colorSupplier.getRandomColor(), side);
                break;
            case 1:
                double firstSide = random.nextInt(BOUND);
                double secondSide = random.nextInt(BOUND);
                randomFigure = new Rectangle(colorSupplier.getRandomColor(),
                        firstSide, secondSide);
                break;
            case 2:
                double firstLeg = random.nextInt(BOUND);
                double secondLeg = random.nextInt(BOUND);
                randomFigure = new RightTriangle(colorSupplier.getRandomColor(),
                        firstLeg, secondLeg);
                break;
            case 3:
                double radius = random.nextInt(BOUND);
                randomFigure = new Circle(colorSupplier.getRandomColor(), radius);
                break;
            case 4:
                double shortLeg = random.nextInt(BOUND);
                double longLeg = random.nextInt(BOUND);
                double height = random.nextInt(BOUND);
                randomFigure = new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        shortLeg, longLeg, height);
                break;
            default:
                randomFigure = getDefaultFigure();
        }
        return randomFigure;
    }

    public Figure getDefaultFigure() {
        return defaultFigure;
    }
}
