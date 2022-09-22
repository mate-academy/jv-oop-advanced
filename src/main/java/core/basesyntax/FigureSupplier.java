package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final Color DEFAULT_COLOR = Color.WHITE;
    public static final int DEFAULT_COUNT = 10;
    private int figureNumber;
    private Random random = new Random();
    
    public Figure getRandomFigure() {
        figureNumber = random.nextInt(FIGURE_COUNT);
        ColorSupplier colorSupplier = new ColorSupplier();
        switch (figureNumber) {
            case 1:
                return new Circle(colorSupplier.getRandomColor(),
                        random.nextInt(FIGURE_COUNT));
            case 2:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(FIGURE_COUNT),
                        random.nextInt(10),
                        random.nextInt(10));
            case 3:
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(FIGURE_COUNT),
                        random.nextInt(10));
            case 4:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(FIGURE_COUNT),
                        random.nextInt(10));
            default:
                return new Square(colorSupplier.getRandomColor(),
                        random.nextInt(FIGURE_COUNT));
        }
    }
    
    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR.name(), DEFAULT_COUNT);
    }
}

