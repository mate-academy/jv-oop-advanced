package core.basesyntax;
import java.util.Random;
public class FigureSupplier {
    private final Random random = new Random();
    public Figure getRandomFigure() {
        String color = ColorSupplier.getRandomColor();

        switch (random.nextInt(5)) {
            case 0:
                return createSquare(color);
            case 1:
                return createRectangle(color);
            case 2:
                return createRightTriangle(color);
            case 3:
                return createCircle(color);
            case 4:
                return createIsoscelesTrapezoid(color);
            default:
                throw new RuntimeException("Unexpected figure type");
        }
    }

    public static Figure getDefaultFigure() {
        return new Circle(10, "white");
    }
}
