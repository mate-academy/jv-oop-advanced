package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIG_COUNT = 5;
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private static final float DEFAULT_RADIUS = 10;
    private ColorSupplier nextColor = new ColorSupplier();
    private Random random = new Random();
    private int figureType;

    public Figure getRandomFigure() {
        figureType = random.nextInt(FIG_COUNT);
        switch (figureType) {
            case 0: return new Circle(nextColor.getRandomColor(), random.nextInt());
            case 1: return new IsoscelesTrapezoid(nextColor.getRandomColor(),
                    random.nextInt(), random.nextInt(), random.nextInt());
            case 2: return new Rectangle(nextColor.getRandomColor(), random.nextInt(),
                    random.nextInt());
            case 3: return new RightTriangle(nextColor.getRandomColor(),
                    random.nextInt(), random.nextInt());
            case 4: return new Square(nextColor.getRandomColor(), random.nextInt());
            default: return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
