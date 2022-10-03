package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_SIZE = 10;
    private static final ColorSupplier supplier = new ColorSupplier();
    private static final Random random = new Random();

    public Figure getRandomFigure() {
        int index = new Random().nextInt(Figures.values().length);
        Figure figure = null;
        switch (Figures.values()[index]) {
            case SQUARE:
                figure = getSquare();
                break;
            case CIRCLE:
                figure = getCircle();
                break;
            case RECTANGLE:
                figure = getRectangle();
                break;
            case RIGHTTRIANGLE:
                figure = getRightTriangle();
                break;
            case ISOSCELESTRAPEZOID:
                figure = getIsoscelesTrapezoid();
                break;
            default:
                getDefaultFigure();
        }
        return figure;
    }

    public Circle getCircle() {
        return new Circle(supplier.getRandomColor(), random.nextInt(MAX_SIZE));
    }

    public Square getSquare() {
        return new Square(supplier.getRandomColor(), random.nextInt(MAX_SIZE));
    }

    public Rectangle getRectangle() {
        return new Rectangle(supplier.getRandomColor(), random.nextInt(MAX_SIZE), random.nextInt(MAX_SIZE));
    }

    public IsoscelesTrapezoid getIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(supplier.getRandomColor()
                , random.nextInt(MAX_SIZE)
                , random.nextInt(MAX_SIZE)
                , random.nextInt(MAX_SIZE));
    }

    public RightTriangle getRightTriangle() {
        return new RightTriangle(supplier.getRandomColor(), random.nextInt(MAX_SIZE), random.nextInt(MAX_SIZE));
    }

    public Figure getDefaultFigure() {
        return new Circle("WHITE", 10);
    }
}

