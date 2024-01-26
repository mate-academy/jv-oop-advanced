package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int RADIUS_LENGTH = 10;
    private static final String WHITE_COLOR = Color.WHITE.name();
    private Random random = new Random();

    public Figure getRandomFigure() {
        double randomValue = random.nextDouble();
        Square square = new Square(randomValue);
        Circle circle = new Circle(randomValue);
        RightTriangle rightTriangle = new RightTriangle(randomValue, randomValue);
        Rectangle rectangle = new Rectangle(randomValue, randomValue);
        IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid(randomValue,
                randomValue, randomValue);
        Figure[] figure = {square, circle, rectangle, rightTriangle, isoscelesTrapezoid};
        int position = random.nextInt(figure.length);
        return figure[position];
    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle(RADIUS_LENGTH, WHITE_COLOR);
        return circle;
    }
}
