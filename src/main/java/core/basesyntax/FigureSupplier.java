package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int VALUE = 10;
    private final Random random = new Random();
    private Figure newFigure;

    public Figure getRandomFigure() {
        int index = random.nextInt(MyFigure.values().length);
        MyFigure figure = MyFigure.values()[index];

        switch (figure) {
            case CIRCLE:
                newFigure = new Circle(random.nextInt(VALUE));
                break;
            case SQUARE:
                newFigure = new Square(random.nextInt(VALUE));
                break;
            case RECTANGLE:
                newFigure = new Rectangle(random.nextInt(VALUE), random.nextInt(VALUE));
                break;
            case RIGHTTRIANGLE:
                newFigure = new RightTriangle(random.nextInt(VALUE), random.nextInt(VALUE));
                break;
            case ISOSCELESTRAPEZOID:
                newFigure = new IsoscelesTrapezoid(
                        random.nextInt(VALUE), random.nextInt(VALUE), random.nextInt(VALUE));
                break;
            default:
                newFigure = new Circle(10,Color.WHITE);
        }
        return newFigure;
    }

    public Figure getDefaultFigure() {
        return new Circle(10, Color.WHITE);
    }
}
