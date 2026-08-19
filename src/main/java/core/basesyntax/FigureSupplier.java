package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    public static final int MAX_FIGURE_BOUND = 31;

    public Figure getRandomFigure() {
        ColorSupplier colorGenerator = new ColorSupplier();
        Random randomNumber = new Random();
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
