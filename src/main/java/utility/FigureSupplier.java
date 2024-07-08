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
    public static final int MIN_RANDOM_VALUE = 1;
    public static final int MAX_RANDOM_VALUE = 100;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();
    private final Color[] colors = Color.values();

    public Figure getRandomFigure() {
        int figurIndex = random.nextInt(colors.length);
        String randomColor = colorSupplier.getRandomColor();
        int randomSide = generateRandomSideLength();
        return switch (figurIndex) {

            case 0 -> new Circle(randomColor,
                    randomSide);
            case 1 -> new IsoscelesTrapezoid(randomColor,
                    randomSide,
                    randomSide,
                    randomSide);
            case 2 -> new Rectangle(randomColor,
                    randomSide,
                    randomSide);
            case 3 -> new RightTriangle(randomColor,
                    randomSide,
                    randomSide);
            default -> new Square(randomColor,
                    randomSide);
        };

    }

    public int generateRandomSideLength() {
        return random.nextInt(MIN_RANDOM_VALUE, MAX_RANDOM_VALUE);
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_DATA);
    }
}
