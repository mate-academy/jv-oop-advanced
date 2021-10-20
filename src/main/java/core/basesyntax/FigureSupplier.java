package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_RADIUS = 10;
    private static final int MAX_LENGTH_OF_SIDE = 10;
    private static final Random RANDOM_FIGURE = new Random();
    private static final Random RANDOM_SIDE = new Random();
    private static final ColorSupplier COLOR_SUPPLIER = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureIndex = RANDOM_FIGURE.nextInt(Figures.values().length);
        switch (figureIndex) {
            case 0:
                return getCircle();
            case 1:
                return getSquare();
            case 2:
                return getRectangle();
            case 3:
                return getTriangle();
            case 4:
                return getTrapezoid();
            default:
                return getDefaultFigure();
        }
    }

    public Figure getCircle() {
        String color = COLOR_SUPPLIER.getRandomColor().toString();
        int radius = RANDOM_SIDE.nextInt(MAX_LENGTH_OF_SIDE);
        return new Circle(color, radius);
    }

    public Figure getSquare() {
        String color = COLOR_SUPPLIER.getRandomColor().toString();
        int sideOfSquare = RANDOM_SIDE.nextInt(MAX_LENGTH_OF_SIDE);
        return new Square(color, sideOfSquare);
    }

    public Figure getRectangle() {
        String color = COLOR_SUPPLIER.getRandomColor().toString();
        int firstLegOfRectangle = RANDOM_SIDE.nextInt(MAX_LENGTH_OF_SIDE);
        int secondLegOfRectangle = RANDOM_SIDE.nextInt(MAX_LENGTH_OF_SIDE);
        return new Rectangle(color, firstLegOfRectangle, secondLegOfRectangle);
    }

    public Figure getTriangle() {
        String color = COLOR_SUPPLIER.getRandomColor().toString();
        int sideOfTriangle = RANDOM_SIDE.nextInt(MAX_LENGTH_OF_SIDE);
        return new RightTriangle(color, sideOfTriangle);
    }

    public Figure getTrapezoid() {
        String color = COLOR_SUPPLIER.getRandomColor().toString();
        int topSide = RANDOM_SIDE.nextInt(MAX_LENGTH_OF_SIDE);
        int downSide = RANDOM_SIDE.nextInt(MAX_LENGTH_OF_SIDE);
        int heightOfTrapezoid = RANDOM_SIDE.nextInt(MAX_LENGTH_OF_SIDE);
        return new IsoscelesTrapezoid(color, topSide, downSide, heightOfTrapezoid);
    }

    public Figure getDefaultFigure() {
        String defaultColor = Colors.WHITE.toString().toLowerCase();
        return new Circle(defaultColor, DEFAULT_RADIUS);
    }
}
