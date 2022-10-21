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
    private final int boundNumber = 25;
    private final String defaultColor = Color.WHITE.name();
    private final int defaultRadius = 10;
    private final int figureNumber = 5;

    public Figure getRandomFigure() {
        int number = random.nextInt(figureNumber);
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
        return new Circle(defaultColor, "Circle", defaultRadius);
    }

    public void printInfo(Figure[] figures) {
        Arrays.stream(figures).forEach(figure -> System.out.println(figure.getInfo()));
    }

    public Figure getRandomCircle(ColorSupplier supplier, int boundNumber) {
        return new Circle(
                supplier.getRandomColor(),
                "Circle",
                random.nextInt(boundNumber)
        );
    }

    public Figure getRandomSquare(ColorSupplier supplier, int boundNumber) {
        return new Square(
                supplier.getRandomColor(),
                "Square",
                random.nextInt(boundNumber)
        );
    }

    public Figure getRandomRectangle(ColorSupplier supplier, int boundNumber) {
        return new Rectangle(
                supplier.getRandomColor(),
                "Rectangle", random.nextInt(boundNumber),
                random.nextInt(boundNumber)
        );
    }

    public Figure getRandomRightTriangle(ColorSupplier supplier, int boundNumber) {
        return new RightTriangle(
                supplier.getRandomColor(),
                "Triangle", random.nextInt(boundNumber),
                random.nextInt(boundNumber)
        );
    }

    public Figure getRandomIsoscelesTrapezoid(ColorSupplier supplier, int boundNumber) {
        return new IsoscelesTrapezoid(
                supplier.getRandomColor(),
                "Trapezoid",
                random.nextInt(boundNumber),
                random.nextInt(boundNumber),
                random.nextInt(boundNumber)
        );
    }
}
