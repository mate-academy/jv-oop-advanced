package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int DEFAULT_RADIUS = 10;
    public static final int FIGURE_COUNT = 5;
    public static final int UPPER_BOUND = 31;
    public static final Color DEFAULT_COLOR = Color.WHITE;

    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();
    
    public Figure getRandomFigure() {
        int figureIndex = random.nextInt(FIGURE_COUNT);
        Figure figure;
        switch (figureIndex) {
            case 0: 
                figure = getRandomCircle();
                break;
            case 1:
                figure = getRandomTrapezoid();
                break;
            case 2:
                figure = getRandomTriangle();
                break;
            case 3:
                figure = getRandomRectangle();
                break;  
            default:
                figure = getRandomSquare();
        }
        return figure;
    }

    public Figure getDefaultfFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    private Figure getRandomCircle() {
        int randomRadius = random.nextInt(UPPER_BOUND);
        return new Circle(colorSupplier.getRandomColor(), randomRadius);
    }

    private Figure getRandomTrapezoid() {
        int randomShortBase = random.nextInt(UPPER_BOUND);
        int randomLongBase = random.nextInt(UPPER_BOUND);
        int randomHeight = random.nextInt(UPPER_BOUND);
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), 
                randomShortBase, randomLongBase, randomHeight);
    }

    private Figure getRandomRectangle() {
        int firstSide = random.nextInt(UPPER_BOUND);
        int secondSide = random.nextInt(UPPER_BOUND);
        return new Rectangle(colorSupplier.getRandomColor(), firstSide, secondSide);
    }

    private Figure getRandomTriangle() {
        int firstLeg = random.nextInt(UPPER_BOUND);
        int secondLeg = random.nextInt(UPPER_BOUND);
        return new RightTriangle(colorSupplier.getRandomColor(), firstLeg, secondLeg);
    }

    private Figure getRandomSquare() {
        int randomSide = random.nextInt(UPPER_BOUND);
        return new Square(colorSupplier.getRandomColor(), randomSide);       
    }
}
