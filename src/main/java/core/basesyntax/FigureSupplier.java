package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public Figure getRandomFigure() {
        Figure newFigure = null;
        Color color = ColorSupplier.getRandomColor();
        int figureIndex = new Random().nextInt(FigureTypes.values().length);
        FigureTypes newFigureType = FigureTypes.values()[figureIndex];
        switch (newFigureType) {
            case CIRCLE:
                int radius = new Random().nextInt(20);
                newFigure = new Circle(color, radius);
                break;
            case SQUARE:
                int side = new Random().nextInt(20);
                newFigure = new Square(color, side);
                break;
            case RECTANGLE:
                int side1 = new Random().nextInt(20);
                int side2 = new Random().nextInt(20);
                newFigure = new Rectangle(color, side1, side2);
                break;
            case RIGRHT_TRIANGLE:
                int leg1 = new Random().nextInt(20);
                int leg2 = new Random().nextInt(20);
                newFigure = new RightTriangle(color, leg1, leg2);
                break;
            case ISOSCELES_TRAPEZOID:
                int height = new Random().nextInt(20);
                int topSide = new Random().nextInt(20);
                int downside = new Random().nextInt(20);
                newFigure = new IsoscelesTrapezoid(color, height, topSide, downside);
                break;
            default:
                System.out.println("Error: figure type not exists");
        }
        return newFigure;
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, 10);
    }
}
