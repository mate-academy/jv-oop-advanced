package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int SIDE_LIMIT = 7;
    private static final int SIDE_DEFAULT = 10;
    private Random random = new Random();

    public Figure getRandomFigure() {
        Square square = new Square(getRandomColor(), getRandomInt(SIDE_LIMIT));
        Rectangle rectangle =
                new Rectangle(getRandomColor(), getRandomInt(SIDE_LIMIT), getRandomInt(SIDE_LIMIT));
        Circle circle = new Circle(getRandomColor(), getRandomInt(SIDE_LIMIT));
        RightTriangle rightTriangle = new RightTriangle(getRandomColor(), getRandomInt(SIDE_LIMIT));
        IsoscelesTrapezoid trapezoid = new IsoscelesTrapezoid(getRandomColor(),
                getRandomInt(SIDE_LIMIT), getRandomInt(SIDE_LIMIT), getRandomInt(SIDE_LIMIT));

        Figure[] array = {square, rectangle, circle, rightTriangle, trapezoid};
        int indexFigure = random.nextInt(array.length);

        return array[indexFigure];
    }

    public Figure getDefaultFigure() {
        return new Circle(EnumColors.WHITE.name(), SIDE_DEFAULT);
    }

    public int getRandomInt(int countLimit) {
        int index = random.nextInt(countLimit);
        if (index == 0) {
            index = getRandomInt(countLimit);
        }
        return index;
    }

    public String getRandomColor() {
        int randomColor = random.nextInt(EnumColors.values().length);
        return EnumColors.values()[randomColor].name();
    }
}
