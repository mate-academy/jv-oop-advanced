package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    public static final int MAX_FIGURE_BOUND = 31;
    private final Random randomNumber = new Random();
    private final ColorSupplier colorGenerator = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomValue = randomNumber.nextInt(MAX_FIGURE_BOUND);
        String randomColor = colorGenerator.getRandomColor();
        Figure square = new Square(randomColor, randomValue);
        Figure rectangle = new Rectangle(randomColor, randomValue, randomValue);
        Figure rightTriangle = new RightTriangle(randomColor, randomValue, randomValue);
        Figure circle = new Circle(randomColor, randomValue);
        Figure isoscelesTrapezoid = new IsoscelesTrapezoid(
                randomColor, randomValue, randomValue, randomValue);
        Figure[] figures = {square, rectangle, rightTriangle, circle, isoscelesTrapezoid};
        int randomIndex = randomNumber.nextInt(figures.length);
        return figures[randomIndex];
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), 10);
    }
}
