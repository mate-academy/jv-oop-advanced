package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int MAX_FIGURE_SIZE = 100;
    private static final int DEFAULT_CIRCLE_RADIUS = 10;
    private static final String DEFAULT_CIRCLE_COLOUR = Colour.values()[0].name();
    
    private Random random = new Random();
    private ColourSupplier colourSupplier = new ColourSupplier();
    
    public Figure getRandomFigure() {
        String colour = colourSupplier.getRandomColor();
        
        switch (FigureList.values()[random.nextInt(FIGURE_COUNT)]) {
            case CIRCLE:
                int radius = getRandomInt();
                return new Circle(colour, radius);
            case ISOSCELESTRAPEZOID:
                int bottomSide = getRandomInt();
                int topSide = getRandomInt();
                int leg = getRandomInt();
                return new IsoscelesTrapezoid(colour, bottomSide, topSide, leg);
            case RECTANGLE:
                int width = getRandomInt();
                int height = getRandomInt();
                return new Rectangle(colour, width, height);
            case SQUARE:
                int side = getRandomInt();
                return new Square(colour, side);
            default:
                int adjacent = getRandomInt();
                int opposite = getRandomInt();
                return new RightTriangle(colour, adjacent, opposite);
        }
    }
    
    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_CIRCLE_COLOUR, DEFAULT_CIRCLE_RADIUS);
    }
    
    public int getRandomInt() {
        return random.nextInt(MAX_FIGURE_SIZE);
    }
}
