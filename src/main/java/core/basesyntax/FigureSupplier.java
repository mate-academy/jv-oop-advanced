package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int MAX_RANDOM_VALUE = 15;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        Color randomColor = colorSupplier.getRandomColor();
        Circle circle = new Circle(randomColor, getRandomValue());
        IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid(randomColor,
                getRandomValue(), getRandomValue(), getRandomValue());
        Rectangle rectangle = new Rectangle(randomColor, getRandomValue(), getRandomValue());
        RightTriangle rightTriangle = new RightTriangle(randomColor,
                getRandomValue(), getRandomValue());
        Square square = new Square(randomColor, getRandomValue());
        Figure[] figures = new Figure[]{circle, isoscelesTrapezoid,
                rectangle, rightTriangle, square};
        int randomIndexFigure = random.nextInt(FIGURE_COUNT);
        return figures[randomIndexFigure];
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, 10);
    }

    private int getRandomValue() {
        return random.nextInt(MAX_RANDOM_VALUE);
    }
}
