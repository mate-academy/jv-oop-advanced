package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final int MAX_FIGURE_SIZE = 100;
    private Random random = new Random();
    private ColourSupplier colourSupplier = new ColourSupplier();
    
    public Figure getRandomFigure() {
        switch (FigureList.values()[random.nextInt(FIGURE_COUNT)]) {
            case CIRCLE:
                return new Circle(colourSupplier.getRandomColor(), getRandomInt());
            case ISOSCELESTRAPEZOID:
                return new IsoscelesTrapezoid(colourSupplier.getRandomColor(), getRandomInt(), getRandomInt()
                        , getRandomInt());
            case RECTANGLE:
                return new Rectangle();
            case SQUARE:
                return new Square();
            default: RIGHTRIANGLE:
                return new RightTriangle();
        }
    }
    
    public Figure getDefaultFigure() {
        return null;
    }
    
    public int getRandomInt() {
        return random.nextInt(MAX_FIGURE_SIZE);
    }
}
