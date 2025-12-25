package core.basesyntax.suppliers;

import core.basesyntax.enums.Colors;
import core.basesyntax.enums.Figures;
import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private static final String WHITE_COLOR = Colors.WHITE.name();
    private static final int MAX_VALUE = 100;
    private static final int DEFAULT_RADIUS = 10;

    private final Random random = new Random();
    private final Figures[] figures = Figures.values();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        Figures figureName = figures[random.nextInt(figures.length)];
        String randomColor = colorSupplier.getRandomColor();
        Figure figure;
        switch (figureName) {
            case CIRCLE:
                int radius = getRandomNumber();

                figure = new Circle(randomColor, radius);
                break;
            case ISOSCELES_TRAPEZOID:
                int firstLeg = getRandomNumber();
                int secondLeg = getRandomNumber();
                int height = getRandomNumber();

                figure = new IsoscelesTrapezoid(
                        randomColor,
                        firstLeg,
                        secondLeg,
                        height);
                break;
            case RECTANGLE:
                int firstSide = getRandomNumber();
                int secondSide = getRandomNumber();

                figure = new Rectangle(
                        randomColor,
                        firstSide,
                        secondSide);
                break;
            case RIGHT_TRIANGLE:
                int firstTriangleSide = getRandomNumber();
                int secondTriangleSide = getRandomNumber();
                figure = new RightTriangle(
                        randomColor,
                        firstTriangleSide,
                        secondTriangleSide);
                break;
            default:
                int squareSide = getRandomNumber();
                figure = new Square(randomColor, squareSide);
        }
        
        return figure;
    }

    public Figure getDefaultFigure() {
        return new Circle(WHITE_COLOR, DEFAULT_RADIUS);
    }

    private int getRandomNumber() {
        return random.nextInt(MAX_VALUE);
    }
}
