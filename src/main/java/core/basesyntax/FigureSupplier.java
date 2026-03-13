package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_SIZE = 20;
    private static final int DEFAULT_RADIUS = 10;
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private static final int FIGURE_COUNT = 5;
    private Random rd = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureType = rd.nextInt(FIGURE_COUNT);
        Color randomColor = colorSupplier.getRandomColor();
        int randomRadius = rd.nextInt(1, MAX_SIZE + 1);
        switch (figureType) {
            case 1:
                int randomSides = rd.nextInt(1, MAX_SIZE + 1);
                int randomSmallerBase = rd.nextInt(1, MAX_SIZE + 1);
                int randomBiggerBase = rd.nextInt(randomSmallerBase + 1, MAX_SIZE + 1);
                return new IsoscelesTrapezoid(randomBiggerBase, randomSmallerBase, 
                    randomSides, randomColor);
            case 2:
                int randomFirstSide = rd.nextInt(1, MAX_SIZE + 1);
                int randomSecondSide = rd.nextInt(1, MAX_SIZE + 1);
                return new Rectangle(randomFirstSide, randomSecondSide, randomColor);
            case 3:
                int randomLegA = rd.nextInt(1, MAX_SIZE + 1);
                int randomLegB = rd.nextInt(1, MAX_SIZE + 1);
                return new RightTriangle(randomLegA, randomLegB, randomColor);
            case 4:
                int randomSide = rd.nextInt(1, MAX_SIZE + 1);
                return new Square(randomSide, randomColor);
            default:
                return new Circle(randomRadius, randomColor);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
    }
}
