package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public Figure getRandomFigure() {
        int index = new Random().nextInt(EnumFigure.values().length);
        EnumFigure figureName = EnumFigure.values()[index];
        Figure figure = null;
        switch (figureName) {
            case SQUARE:
                figure = new Square(new ColorSupplier().getRandomColor(), new Random().nextInt(15));
                break;
            case CIRCLE:
                figure = new Circle(new ColorSupplier().getRandomColor(), new Random().nextInt(10));
                break;
            case RECTANGLE:
                figure = new Rectangle(new ColorSupplier().getRandomColor(),
                        new Random().nextInt(18),
                        new Random().nextInt(12));
                break;
            case RIGHT_TRIANGLE:
                figure = new RightTriangle(new ColorSupplier().getRandomColor(),
                        new Random().nextInt(10),
                        new Random().nextInt(11));
                break;
            case ISOSCELES_TRAPEZOID:
                figure = new IsoscelesTrapezoid(new ColorSupplier().getRandomColor(),
                        new Random().nextInt(12),
                        new Random().nextInt(17), new Random().nextInt(9));
                break;
            default:
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        return new Circle("WHITE",10);
    }
}
