package core.basesyntax;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final int DEFAULT_RADIUS = 10;
    public static final Color DEFAULT_COLOR = Color.WHITE;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();
    private final Circle defaultCircle = new Circle(DEFAULT_COLOR.name(), DEFAULT_RADIUS);

    public Figure getRandomFigure() {
        int randomIndex = random.nextInt(FIGURE_COUNT);
        String color = colorSupplier.getRandomColor();
        switch (randomIndex) {
            case 0:
                int squareSide = random.nextInt();
                return new Square(color, squareSide);
            case 1:
                double firstLeg = random.nextDouble();
                double secondLeg = random.nextDouble();
                return new RightTriangle(color, firstLeg, secondLeg);
            case 2:
                int width = random.nextInt();
                int height = random.nextInt();
                return new Rectangle(color, width, height);
            case 3:
                int firstSide = random.nextInt();
                int secondSide = random.nextInt();
                int heightTrapezoid = random.nextInt();
                return new IsoscelesTrapezoid(color,firstSide,
                        secondSide, heightTrapezoid);
            case 4:
                int radius = random.nextInt();
                return new Circle(color, radius);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return defaultCircle;
    }
}
