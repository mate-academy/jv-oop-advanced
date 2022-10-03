package core.basesyntax;

import static core.basesyntax.Color.WHITE;
import static core.basesyntax.Figure.LENGTH_LIMIT;

import java.util.Random;

public class FigureSupplier {
    private final int figureIndex = new Random().nextInt(FigureTypes.values().length);

    public Figure getRandomFigure() {
        FigureTypes newFigureType = FigureTypes.values()[figureIndex];
        switch (newFigureType) {
            case CIRCLE: return new FigureSupplier().buildCircle();
            case SQUARE: return new FigureSupplier().buildSquare();
            case RECTANGLE: return new FigureSupplier().buildRectangle();
            case RIGRHTTRIANGLE: return new FigureSupplier().buildRightTriangle();
            case ISOSCELESTRAPEZOID:
            default:
                return new FigureSupplier().buildTrapezoid();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(WHITE, 10);
    }

    public Circle buildCircle() {
        int radius = new Random().nextInt(LENGTH_LIMIT);
        return new Circle(ColorSupplier.getRandomColor(), radius);
    }

    public Square buildSquare() {
        int side = new Random().nextInt(LENGTH_LIMIT);
        return new Square(ColorSupplier.getRandomColor(), side);
    }

    public Rectangle buildRectangle() {
        int side1 = new Random().nextInt(LENGTH_LIMIT);
        int side2 = new Random().nextInt(LENGTH_LIMIT);
        return new Rectangle(ColorSupplier.getRandomColor(), side1, side2);
    }

    public RightTriangle buildRightTriangle() {
        int leg1 = new Random().nextInt(LENGTH_LIMIT);
        int leg2 = new Random().nextInt(LENGTH_LIMIT);
        return new RightTriangle(ColorSupplier.getRandomColor(), leg1, leg2);
    }

    public IsoscelesTrapezoid buildTrapezoid() {
        int height = new Random().nextInt(LENGTH_LIMIT);
        int lowerBase = new Random().nextInt(LENGTH_LIMIT);
        int upperBase = new Random().nextInt(LENGTH_LIMIT);
        return new IsoscelesTrapezoid(ColorSupplier.getRandomColor(), height, lowerBase, upperBase);
    }
}
