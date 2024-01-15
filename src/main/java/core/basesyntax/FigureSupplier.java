package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();
    public static final int DEFAULT_RADIUS = 10;
    public static final int FIGURE_COUNT = 5;
    public static final int UPPER_BOUND = 31;
    public static final int ORIGIN = 1;

    public Figure getRandomFigure() {
        int figureIndex = random.nextInt(FIGURE_COUNT);
        Figure figure;
        switch (figureIndex) {
            case 0: 
                int randomRadius = random.nextInt(ORIGIN, UPPER_BOUND);
                figure = new Circle(colorSupplier.getRandomColor(), randomRadius);
                break;
            case ORIGIN:
                int randomShortBase = random.nextInt(ORIGIN, UPPER_BOUND);
                int randomLongBase = random.nextInt(ORIGIN, UPPER_BOUND);
                int randomHeight = random.nextInt(ORIGIN, UPPER_BOUND);
                figure = new IsoscelesTrapezoid(colorSupplier.getRandomColor(), randomShortBase, randomLongBase, randomHeight);
                break;
            case 2:
                int firstSide = random.nextInt(ORIGIN, UPPER_BOUND);
                int secondSide = random.nextInt(ORIGIN, UPPER_BOUND);
                figure = new Rectangle(colorSupplier.getRandomColor(), firstSide, secondSide);
                break;
            case 3:
                int firstLeg = random.nextInt(ORIGIN, UPPER_BOUND);
                int secondLeg = random.nextInt(ORIGIN, UPPER_BOUND);
                figure = new RightTriangle(colorSupplier.getRandomColor(), firstLeg, secondLeg);
                break;  
            default:
                int randomSide = random.nextInt(ORIGIN, UPPER_BOUND);
                figure = new Square(colorSupplier.getRandomColor(), randomSide);               
        }

        return figure;
    }

    public Figure getDefaultfFigure() {
        return new Circle(Color.WHITE, DEFAULT_RADIUS);
    }
}
