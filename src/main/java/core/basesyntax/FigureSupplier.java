package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final byte MAX_RND_NUMBER_FIGURE = 5;
    private static final byte MAX_RND_NUMBER_100 = 100;
    private static final byte RADIUS_WHITE_CIRCLE = 10;
    private static Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getDefaultFigure() {
        return new Circle("WHITE", RADIUS_WHITE_CIRCLE);
    }

    private int getRandomInt() {
        return new Random().nextInt(MAX_RND_NUMBER_100);
    }

    public Figure getRandomFigure() {
        int index = new Random().nextInt(MAX_RND_NUMBER_FIGURE);
        switch (index) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(), getRandomInt());
            case 1:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        getRandomInt(), getRandomInt(), getRandomInt());
            case 2:
                return new Rectangle(colorSupplier.getRandomColor(), getRandomInt(),
                        getRandomInt());
            case 3:
                return new RightTriangle(colorSupplier.getRandomColor(), getRandomInt(),
                        getRandomInt());
            case 4:
                return new Square(colorSupplier.getRandomColor(), getRandomInt());
            default: return getDefaultFigure();
        }
    }



}
