package utility;

import java.util.Random;
import model.Color;
import model.Figure;
import model.figure.Circle;
import model.figure.IsoscelesTrapezoid;
import model.figure.Rectangle;
import model.figure.RightTriangle;
import model.figure.Square;

public class FigureSupplier {
    public static final String DEFAULT_COLOR = "white";
    public static final int DEFAULT_DATA = 10;
    public static final int MAX_RANDOM_VALUE = 100;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();
    private final Color[] colors = Color.values();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(colors.length);
        return switch (figureType) {

            case 0 -> new Circle(colorSupplier.getRandomColor(),
                    getRandomSide());
            case 1 -> new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                    getRandomSide(),
                    getRandomSide(),
                    getRandomSide());
            case 2 -> new Rectangle(colorSupplier.getRandomColor(),
                    getRandomSide(),
                    getRandomSide());
            case 3 -> new RightTriangle(colorSupplier.getRandomColor(),
                    getRandomSide(),
                    getRandomSide());
            default -> new Square(colorSupplier.getRandomColor(),
                    getRandomSide());
        };

    }

    public int getRandomSide() {
        return random.nextInt(MAX_RANDOM_VALUE);
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_DATA);
    }
}
