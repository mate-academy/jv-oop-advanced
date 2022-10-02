package core.basesyntax;

import static core.basesyntax.Color.WHITE;

import java.util.Random;

public class FigureSupplier {
    public static final int LENGTH_LIMIT = 250;

    public Figure getRandomFigure() {
        Figure newFigure = null;
        Color color = ColorSuplier.getRandomColor();
        int figureIndex = new Random().nextInt(FigureTypes.values().length);
        FigureTypes newFigureType = FigureTypes.values()[figureIndex];
        switch (newFigureType) {
            case CIRCLE: int radius = new Random().nextInt(LENGTH_LIMIT);
                newFigure = new Circle(color, radius);
                break;
            case SQUARE: int side = new Random().nextInt(LENGTH_LIMIT);
                newFigure = new Square(color, side);
                break;
            case RECTANGLE: int side1 = new Random().nextInt(LENGTH_LIMIT);
                int side2 = new Random().nextInt(LENGTH_LIMIT);
                newFigure = new Rectangle(color, side1, side2);
                break;
            case RIGRHTTRIANGLE: int leg1 = new Random().nextInt(LENGTH_LIMIT);
                int leg2 = new Random().nextInt(LENGTH_LIMIT);
                newFigure = new RightTriangle(color, leg1, leg2);
                break;
            case ISOSCELESTRAPEZOID: int height = new Random().nextInt(LENGTH_LIMIT);
                int lowerBase = new Random().nextInt(LENGTH_LIMIT);
                int upperBase = new Random().nextInt(LENGTH_LIMIT);
                newFigure = new IsoscelesTrapezoid(color, height, lowerBase, upperBase);
                break;
            default:
                System.out.println("Error: figure type not exists");
        }
        return newFigure;
    }

    public Figure getDefaultFigure() {
        return new Circle(WHITE, 10);
    }
}
