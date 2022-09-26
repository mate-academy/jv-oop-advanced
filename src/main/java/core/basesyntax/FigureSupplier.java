package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final Color DEFAULT_COLOR = Color.WHITE;
    public static final int DEFAULT_COUNT = 10;
    
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();
    
    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        
        switch (figureNumber) {
            case 1:
                return getRandomCircle();
            case 2:
                return getRandomIsoscelesTrapezoid();
            case 3:
                return getRandomRectangle();
            case 4:
                return getRandomRightTriangle();
            default:
                return getRandomSquare();
        }
    }
    
    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR.name(), DEFAULT_COUNT);
    }
    
    private Figure getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(), random.nextInt(FIGURE_COUNT));
    }
    
    private Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                random.nextInt(FIGURE_COUNT),
                random.nextInt(FIGURE_COUNT),
                random.nextInt(FIGURE_COUNT));
    }
    
    private Figure getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),
                random.nextInt(FIGURE_COUNT),
                random.nextInt(FIGURE_COUNT));
    }
    
    private Figure getRandomRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                random.nextInt(FIGURE_COUNT),
                random.nextInt(FIGURE_COUNT));
    }
    
    private Figure getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(),
                random.nextInt(FIGURE_COUNT));
    }
}
