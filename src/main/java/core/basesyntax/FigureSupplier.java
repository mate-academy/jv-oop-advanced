package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    static final int MAX_SIZE = 11;
    public Figure getRandomFigure() {
        Figure retVal = null;
        ColorSupplier colorSupplier = new ColorSupplier();
        Random random = new Random();
        Figures figure = Figures.values()[random.nextInt(Figures.values().length)];
        switch (figure) {
            case SQUARE: {
                retVal = new Square(colorSupplier.getRandomColor(), random.nextInt(MAX_SIZE));
                break;
            }
            case RECTANGLE: {
                retVal = new Rectangle(colorSupplier.getRandomColor(), random.nextInt(MAX_SIZE), random.nextInt(MAX_SIZE));
                break;
            }
            case TRIANGLE: {
                retVal = new Triangle(colorSupplier.getRandomColor(), random.nextInt(MAX_SIZE), random.nextInt(MAX_SIZE));
                break;
            }
            case CIRCLE: {
                retVal = new Circle(colorSupplier.getRandomColor(), random.nextInt(MAX_SIZE));
                break;
            }
            case TRAPEZOID: {
                retVal = new Trapezoid(colorSupplier.getRandomColor(), random.nextInt(MAX_SIZE), random.nextInt(MAX_SIZE), random.nextInt(MAX_SIZE));
                break;
            }
        }
        return retVal;
    }
    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}
