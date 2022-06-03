package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_NUMBER = 100;
    private static Type type;

    public FigureSupplier(Type type) {
        this.type = type;
    }

    public static Figure getRandomFigure() {
        Random random = new Random();
        Random random3 = new Random();
        Random random2 = new Random();
        int value1 = random.nextInt(MAX_NUMBER) + 1;
        int value2 = random.nextInt(MAX_NUMBER) + 1;
        int value3 = random.nextInt(MAX_NUMBER) + 1;
        int index = random.nextInt(Type.values().length);
        type = Type.values()[index];
        ColorSupplier colorSupplier = new ColorSupplier();
        Figure figure = new Figure();

        switch (type) {
            case CIRCLE:
                figure = new Circle(value1);
                figure.setColor(String.valueOf(colorSupplier.getRandomColor()));
                break;

            case SQUARE:
                figure = new Square(value1);
                figure.setColor(String.valueOf(colorSupplier.getRandomColor()));
                break;

            case RECTANGLE:
                figure = new Rectangle(value1, value2);
                figure.setColor(String.valueOf(colorSupplier.getRandomColor()));
                break;

            case RIGHT_TRIANGLE:
                figure = new RightTriangle(value1);
                figure.setColor(String.valueOf(colorSupplier.getRandomColor()));
                break;

            default :
                figure = new IsoscelesTrapezoid(value1, value2, value3);
                figure.setColor(String.valueOf(colorSupplier.getRandomColor()));
                break;
        }
        return figure;
    }

    public static Figure getDefaultFigure() {
        Figure figure = new Circle(10);
        figure.setColor("WHITE");
        return figure;
    }
}
