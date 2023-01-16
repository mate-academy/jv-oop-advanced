package core.basesyntax;
import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();
    public static final int bound = 100;
    private ColorSupplier colorSupplier = new ColorSupplier();
    public static final int FIGURE_COUNT = 5;
    public Figure getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(), "Circle", random.nextInt(bound));
    }
    public Figure getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(), "Rectangle", random.nextInt(bound), random.nextInt(bound));
    }
    public Figure getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(), "Square", random.nextInt(bound));
    }
    public Figure getRandomRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(), "RightTriangle", random.nextInt(bound), random.nextInt(bound));
    }
    public Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), "IsoscelesTrapezoid", random.nextInt(bound), random.nextInt(bound), random.nextInt(bound));
    }
    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        switch (figureNumber) {
            case 0: return getRandomCircle();
            case 1: return getRandomRectangle();
            case 2: return getRandomSquare();
            case 3: return getRandomRightTriangle();
            default:
                return getRandomIsoscelesTrapezoid();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("WHITE", "Circle", 10);
    }
}
