package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final double CIRCLE_RADIUS = 10.0;
    private Random random = new Random();

    public Figure getRandomFigure() {
        int index = random.nextInt(RandomFigure.values().length);
        RandomFigure randomFigure = RandomFigure.values()[index];
        switch (randomFigure) {
            case CIRCLE:
                return new Circle();
            case SQUARE:
                return new Square();
            case RECTANGLE:
                return new Rectangle();
            case RIGHTTRIANGLE:
                return new RightTriangle();
            case ISOSCELESTRAPESOID:
                return new IsoscelesTrapezoid();
            default:
                return getDefaultFigure();
        }
    }

    protected Figure getDefaultFigure() {
        return new Circle(CIRCLE_RADIUS, Color.WHITE.name());
    }
}
