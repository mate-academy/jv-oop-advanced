package core.basesyntax;

import static core.basesyntax.Color.WHITE;

import java.util.Random;

public class FigureSupplier {
    public Figure getRandomFigure() {
        Figure newFigure = null;
        Color color = ColorSuplier.getRandomColor();
        int figureIndex = new Random().nextInt(FigureTypes.values().length);
        FigureTypes newFigureType = FigureTypes.values()[figureIndex];
        switch (newFigureType) {
            case CIRCLE: int radius = new Random().nextInt(250);
                newFigure = new Circle(color, radius);
                break;
            case SQUARE: int side = new Random().nextInt(250);
                newFigure = new Square(color, side);
                break;
            case RECTANGLE: int side1 = new Random().nextInt(250);
                int side2 = new Random().nextInt(250);
                newFigure = new Rectangle(color, side1, side2);
                break;
            case RIGRHTTRIANGLE: int leg1 = new Random().nextInt(250);
                int leg2 = new Random().nextInt(250);
                newFigure = new RightTriangle(color, leg1, leg2);
                break;
            case ISOSCELESTRAPEZOID: int height = new Random().nextInt(250);
                int lowerBase = new Random().nextInt(250);
                int upperBase = new Random().nextInt(250);
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
