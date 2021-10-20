package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_RADIUS = 10;
    private static final int MAX_LENGTH_OF_SIDE = 10;
    private Random random = new Random();

    public Figure getRandomFigure() {
        ColorSupplier colorSupplier = new ColorSupplier();
        String color = colorSupplier.getRandomColor().toString();
        int index = new Random().nextInt(Figures.values().length);
        Figures figure = Figures.values()[index];
        switch (figure) {
            case CIRCLE:
                int radius = random.nextInt(MAX_LENGTH_OF_SIDE);
                return new Circle(color, radius);
            case SQUARE:
                int sideOfSquare = random.nextInt(MAX_LENGTH_OF_SIDE);
                return new Square(color, sideOfSquare);
            case RECTANGLE:
                int firstLegOfRectangle = random.nextInt(MAX_LENGTH_OF_SIDE);
                int secondLegOfRectangle = random.nextInt(MAX_LENGTH_OF_SIDE);
                return new Rectangle(color, firstLegOfRectangle, secondLegOfRectangle);
            case RIGHTTRIANGLE:
                int sideOfTriangle = random.nextInt(MAX_LENGTH_OF_SIDE);
                return new RightTriangle(color, sideOfTriangle);
            case ISOSCELESTRAPEZOID:
                int topSide = random.nextInt(MAX_LENGTH_OF_SIDE);
                int downSide = random.nextInt(MAX_LENGTH_OF_SIDE);
                int heightOfTrapezoid = random.nextInt(MAX_LENGTH_OF_SIDE);
                return new IsoscelesTrapezoid(color, topSide, downSide, heightOfTrapezoid);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        String defaultColor = Colors.WHITE.toString().toLowerCase();
        return new Circle(defaultColor, DEFAULT_RADIUS);
    }

}
