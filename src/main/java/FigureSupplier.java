import core.basesyntax.Figure;
import java.util.Random;

public class FigureSupplier {
    public static final int RANDOM_FIGURE = 5;
    public static final int RANDOM_VALUE = 30;
    private final Random random = new Random();

    public Figure getFigure() {
        int randomFigure = random.nextInt(RANDOM_FIGURE);
        switch (randomFigure) {
            case 1:
                return getNewCircle();
            case 2:
                return getNeSquare();
            case 3:
                return getNewRectangle();
            case 4:
                return getNewTrapezoid();
            default:
                return getNewTriangle();
        }

    }

    private RightTriangle getNewTriangle() {
        int randomBase = random.nextInt(RANDOM_VALUE);
        int randomHeight = random.nextInt(RANDOM_VALUE);
        return new RightTriangle(randomBase, randomHeight,
                ColorSupplier.getColour());
    }

    private Circle getNewCircle() {
        int randomRadius = random.nextInt(RANDOM_VALUE);
        return new Circle(randomRadius, ColorSupplier.getColour());
    }

    private Square getNeSquare() {
        int randomSide = random.nextInt(RANDOM_VALUE);
        return new Square(randomSide, ColorSupplier.getColour());
    }

    private Rectangle getNewRectangle() {
        int randomWidth = random.nextInt(RANDOM_VALUE);
        int randomHeight = random.nextInt(RANDOM_VALUE);
        return new Rectangle(randomWidth, randomHeight,
                ColorSupplier.getColour());
    }

    private IsoscelesTrapezoid getNewTrapezoid() {
        int randomSideA = random.nextInt(RANDOM_VALUE);
        int randomSideB = random.nextInt(RANDOM_VALUE);
        int randomHeight = random.nextInt(RANDOM_VALUE);
        return new IsoscelesTrapezoid(randomSideA, randomSideB, randomHeight,
                ColorSupplier.getColour());
    }

}

