package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int ORIGIN = 1;
    private static final int BOUND = 10;
    private static final Random random = new Random();

    public static int getRandomInt() {
        return random.nextInt(ORIGIN, BOUND);
    }

    public Figure getRandomFigure() {
        FigureSupplier figureSupplier = new FigureSupplier();
        int index = random.nextInt(Name.values().length);
        Name name = Name.values()[index];
        Figure figure = null;
        switch (name.name()) {
            case "CIRCLE" :
                figure = new Circle(getRandomInt(), null);
                break;
            case "ISOSCELES_TRAPESOID" :
                figure = new IsoscelesTrapezoid(getRandomInt(), getRandomInt(), getRandomInt());
                break;
            case "RIGHT_TRIANGLE" :
                figure = new RightTriangle(getRandomInt(), getRandomInt());
                break;
            case "RECTANGLE" :
                figure = new RightTriangle(getRandomInt(), getRandomInt());
                break;
            case "SQUARE" :
                figure = new Square(getRandomInt());
                break;
            default:
                figure = null;
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        return new Circle(10, Color.WHITE);
    }
}
