package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURES_LENGTH = 5;
    private static final int DEFAULT_RADIUS = 10;
    private static final int MAX_LENGTH_OF_SIDE = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureIndex = random.nextInt(FIGURES_LENGTH);
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
        int radius = random.nextInt(MAX_LENGTH_OF_SIDE);
        return new Circle(color, radius);
    }

    public Figure getSquare() {
        String color = colorSupplier.getRandomColor().toString();
        int sideOfSquare = random.nextInt(MAX_LENGTH_OF_SIDE);
        return new Square(color, sideOfSquare);
    }

    public Figure getRectangle() {
        String color = colorSupplier.getRandomColor().toString();
        int firstLegOfRectangle = random.nextInt(MAX_LENGTH_OF_SIDE);
        int secondLegOfRectangle = random.nextInt(MAX_LENGTH_OF_SIDE);
        return new Rectangle(color, firstLegOfRectangle, secondLegOfRectangle);
    }

    public Figure getTriangle() {
        String color = colorSupplier.getRandomColor().toString();
        int sideOfTriangle = random.nextInt(MAX_LENGTH_OF_SIDE);
        return new RightTriangle(color, sideOfTriangle);
    }

    public Figure getTrapezoid() {
        String color = colorSupplier.getRandomColor().toString();
        int topSide = random.nextInt(MAX_LENGTH_OF_SIDE);
        int downSide = random.nextInt(MAX_LENGTH_OF_SIDE);
        int heightOfTrapezoid = random.nextInt(MAX_LENGTH_OF_SIDE);
        return new IsoscelesTrapezoid(color, topSide, downSide, heightOfTrapezoid);
    }

    public Figure getDefaultFigure() {
        String defaultColor = Color.WHITE.toString().toLowerCase();
        return new Circle(defaultColor, DEFAULT_RADIUS);
    }
}
