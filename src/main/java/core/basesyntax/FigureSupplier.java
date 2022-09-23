package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();
    
    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        
        switch (figureNumber) {
            case 1:
                return new Circle(colorSupplier.getRandomColor(),
                        random.nextInt(FIGURE_COUNT));
            case 2:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(FIGURE_COUNT),
                        random.nextInt(FIGURE_COUNT),
                        random.nextInt(FIGURE_COUNT));
            case 3:
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(FIGURE_COUNT),
                        random.nextInt(FIGURE_COUNT));
            case 4:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(FIGURE_COUNT),
                        random.nextInt(FIGURE_COUNT));
            default:
                return new Square(colorSupplier.getRandomColor(),
                        random.nextInt(FIGURE_COUNT));
        }
    }
    
    public Figure getDefaultFigure() {
        return getRandomCircle();
    }
    
    private Figure getRandomCircle() {
        Color defaultcolor = Color.WHITE;
        int defaultcount = 10;
        return new Circle(defaultcolor.name(), defaultcount);
    }
}

