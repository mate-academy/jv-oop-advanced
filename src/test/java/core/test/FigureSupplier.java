package core.test;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    private static final int MAX_LENGTH_RANDOM_NUMBER = 15;
    private final Random random;

    public FigureSupplier() {
        random = new Random();
    }
    public Figure getRandomFigure(){
        IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid(MAX_LENGTH_RANDOM_NUMBER,
                MAX_LENGTH_RANDOM_NUMBER, MAX_LENGTH_RANDOM_NUMBER, MAX_LENGTH_RANDOM_NUMBER);
        Circle circle = new Circle(MAX_LENGTH_RANDOM_NUMBER);
        Rectangle rectangle = new Rectangle(MAX_LENGTH_RANDOM_NUMBER, MAX_LENGTH_RANDOM_NUMBER);
        RightTriangle rightTriangle = new RightTriangle(MAX_LENGTH_RANDOM_NUMBER,
                MAX_LENGTH_RANDOM_NUMBER, MAX_LENGTH_RANDOM_NUMBER);
        Square square = new Square(MAX_LENGTH_RANDOM_NUMBER);
        Figure[] randomFigure = new Figure[]{isoscelesTrapezoid, circle, rectangle, rightTriangle, square};
        isoscelesTrapezoid.setColor(new ColorSupplier().getRandomColor());
        circle.setColor(new ColorSupplier().getRandomColor());
        rectangle.setColor(new ColorSupplier().getRandomColor());
        rightTriangle.setColor(new ColorSupplier().getRandomColor());
        square.setColor(new ColorSupplier().getRandomColor());
        int figureNumber = random.nextInt(FIGURE_COUNT);
        return randomFigure[figureNumber];
    }
    public Figure getDefaultFigure() {
        Circle circle = new Circle(10);
        circle.setColor(Color.WHITE.name());
        return circle;
    }
}
