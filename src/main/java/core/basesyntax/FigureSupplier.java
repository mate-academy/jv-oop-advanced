package core.basesyntax;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Arrays;
import java.util.Random;

public class FigureSupplier {
    private final ColorSupplier supplier = new ColorSupplier();
    private final Random random = new Random();
    private final static int boundNumber = 25;
    private final String DEFAULT_COLOR = Color.WHITE.name();
    private final static int DEFAULT_RADIUS = 10;
    private final static int FIGURE_NUMBER = 5;

    public Figure getRandomFigure() {
        int number = random.nextInt(FIGURE_NUMBER);
        switch (number) {
            case 0:
                return getRandomSquare(supplier, boundNumber);
            case 1:
                return getRandomCircle(supplier, boundNumber);
            case 2:
                return getRandomRectangle(supplier, boundNumber);
            case 3:
                return getRandomIsoscelesTrapezoid(supplier, boundNumber);
            case 4:
                return getRandomRightTriangle(supplier, boundNumber);
            default:
                throw new RuntimeException("something gone wrong");
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, "Circle", DEFAULT_RADIUS);
    }

    public void printInfo(Figure[] figures) {
        Arrays.stream(figures).forEach(figure -> System.out.println(figure.getInfo()));
    }

    public Figure getRandomCircle(ColorSupplier supplier, int BOUND_NUMBER) {
       return new Circle(
               supplier.getRandomColor(),
               "Circle",
               random.nextInt(BOUND_NUMBER)
       );
    }

    public Figure getRandomSquare(ColorSupplier supplier, int BOUND_NUMBER) {
        return new Square(
                supplier.getRandomColor(),
                "Square",
                random.nextInt(BOUND_NUMBER)
        );
    }

    public Figure getRandomRectangle(ColorSupplier supplier, int BOUND_NUMBER) {
        return new Rectangle(
                supplier.getRandomColor(),
                "Rectangle", random.nextInt(BOUND_NUMBER),
                random.nextInt(BOUND_NUMBER)
        );
    }

    public Figure getRandomRightTriangle(ColorSupplier supplier, int BOUND_NUMBER) {
        return new RightTriangle(
                supplier.getRandomColor(),
                "Triangle", random.nextInt(BOUND_NUMBER),
                random.nextInt(BOUND_NUMBER)
        );
    }

    public Figure getRandomIsoscelesTrapezoid(ColorSupplier supplier, int BOUND_NUMBER) {
        return new IsoscelesTrapezoid(
                supplier.getRandomColor(),
                "Trapezoid",
                random.nextInt(BOUND_NUMBER),
                random.nextInt(BOUND_NUMBER),
                random.nextInt(BOUND_NUMBER)
        );
    }
}
