package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_RADIUS = 10;
    private static final int MAX_LENGTH_OF_SIDE = 10;
    private Random randomFigure = new Random();
    private Random randomSide = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureIndex = randomFigure.nextInt(Figures.values().length);
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
        String color = colorSupplier.getRandomColor().toString();
        int radius = randomSide.nextInt(MAX_LENGTH_OF_SIDE);
        return new Circle(color, radius);
    }

    public Figure getSquare() {
        String color = colorSupplier.getRandomColor().toString();
        int sideOfSquare = randomSide.nextInt(MAX_LENGTH_OF_SIDE);
        return new Square(color, sideOfSquare);
    }

    public Figure getRectangle() {
        String color = colorSupplier.getRandomColor().toString();
        int firstLegOfRectangle = randomSide.nextInt(MAX_LENGTH_OF_SIDE);
        int secondLegOfRectangle = randomSide.nextInt(MAX_LENGTH_OF_SIDE);
        return new Rectangle(color, firstLegOfRectangle, secondLegOfRectangle);
    }

    public Figure getTriangle() {
        String color = colorSupplier.getRandomColor().toString();
        int sideOfTriangle = randomSide.nextInt(MAX_LENGTH_OF_SIDE);
        return new RightTriangle(color, sideOfTriangle);
    }

    public Figure getTrapezoid() {
        String color = colorSupplier.getRandomColor().toString();
        int topSide = randomSide.nextInt(MAX_LENGTH_OF_SIDE);
        int downSide = randomSide.nextInt(MAX_LENGTH_OF_SIDE);
        int heightOfTrapezoid = randomSide.nextInt(MAX_LENGTH_OF_SIDE);
        return new IsoscelesTrapezoid(color, topSide, downSide, heightOfTrapezoid);
    }

    public Figure getDefaultFigure() {
        String defaultColor = Colors.WHITE.toString().toLowerCase();
        return new Circle(defaultColor, DEFAULT_RADIUS);
    }
}
