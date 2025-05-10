package classes;

import java.util.Random;

public class FigureSupplier {
    public static final double DEFAULT_CIRCLE_RADIUS = 10.0;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    private double getPositiveRandomNumber() {
        return 1 + random.nextDouble(10);
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, DEFAULT_CIRCLE_RADIUS);
    }

    public Figure getRandomFigure() {
        Figures[] figures = Figures.values();
        Color randomColor = colorSupplier.getRandomColor();
        Figures randomFigureName = figures[random.nextInt(figures.length)];
        double randomDouble = getPositiveRandomNumber();
        return switch (randomFigureName.name()) {
            case "Square" -> new Square(randomColor, randomDouble);
            case "Rectangle" -> new Rectangle(randomColor, randomDouble, randomDouble);
            case "Circle" -> new Circle(randomColor, randomDouble);
            case "Right_triangle" -> new RightTriangle(randomColor, randomDouble, randomDouble);
            case "Isosceles_Trapezoid" ->
                    new IsoscelesTrapezoid(randomColor, randomDouble, randomDouble, randomDouble);
            default -> this.getDefaultFigure();
        };
    }
}
