package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_OF_FIGURES = 5;
    private static final int MAX_SIDE = 100;
    private static final int MAX_WIDTH = 200;
    private static final int MAX_HEIGHT = 250;
    private static final int MAX_BASE = 50;
    private static final int MAX_RADIUS = 25;
    private static final int MAX_TOP_BASE = 50;
    private static final int MAX_BOTTOM_BASE = 100;
    private static final int DEFAULT_RADIUS = 10;
    private static final Color DEFAULT_COLOR = Color.WHITE;

    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();
    private int randomSide;
    private int randomBase;
    private int randomWidth;
    private int randomHeight;
    private int randomRadius;
    private int randomTopBase;
    private int randomBottomBase;

    public Figure getRandomFigure() {
        Figure randomFigure = null;
        Color randomColor = Color.valueOf(colorSupplier.getRandomColor());
        int figureIndex = random.nextInt(NUMBER_OF_FIGURES);

        switch (figureIndex) {
            case 0:
                randomSide = random.nextInt(MAX_SIDE) + 1;
                randomFigure = new Square(randomColor, randomSide);
                break;
            case 1:
                randomWidth = random.nextInt(MAX_WIDTH) + 1;
                randomHeight = random.nextInt(MAX_HEIGHT) + 1;
                randomFigure = new Rectangle(randomColor, randomWidth, randomHeight);
                break;
            case 2:
                randomBase = random.nextInt(MAX_BASE) + 1;
                randomHeight = random.nextInt(MAX_HEIGHT) + 1;
                randomFigure = new RightTriangle(randomColor, randomBase, randomHeight);
                break;
            case 3:
                randomRadius = random.nextInt(MAX_RADIUS) + 1;
                randomFigure = new Circle(randomColor, randomRadius);
                break;
            case 4:
                randomTopBase = random.nextInt(MAX_TOP_BASE);
                randomBottomBase = random.nextInt(MAX_BOTTOM_BASE);
                randomHeight = random.nextInt(MAX_HEIGHT);
                randomFigure = new IsoscelesTrapezoid(randomColor, randomTopBase,
                        randomBottomBase, randomHeight);
                break;
            default:
                System.out.println("FigureSupplier error: there isn't such figure.");
        }
        return randomFigure;
    }

    public Figure getDefaultFigure() {
        Figure defaultFigure = new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);

        return defaultFigure;
    }
}
