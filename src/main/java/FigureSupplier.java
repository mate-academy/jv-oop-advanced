import core.basesyntax.Figure;
import java.util.Random;

public class FigureSupplier {
    public static final int FIGURES_NUMBER = 5;
    public static final int RANDOM_NUMBER = 30;
    private Random random = new Random();
    private ColorSupplier colourSupplier = new ColorSupplier();

    public Figure getFigure() {
        int randomFigure = random.nextInt(FIGURES_NUMBER);
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
        int randomBase = random.nextInt(RANDOM_NUMBER);
        int randomHeight = random.nextInt(RANDOM_NUMBER);
        return new RightTriangle(randomBase, randomHeight,
                colourSupplier.getColour());
    }

    private Circle getNewCircle() {
        int randomRadius = random.nextInt(RANDOM_NUMBER);
        return new Circle(randomRadius, colourSupplier.getColour());
    }

    private Square getNeSquare() {
        int randomSide = random.nextInt(RANDOM_NUMBER);
        return new Square(randomSide, colourSupplier.getColour());
    }

    private Rectangle getNewRectangle() {
        int randomWidth = random.nextInt(RANDOM_NUMBER);
        int randomHeight = random.nextInt(RANDOM_NUMBER);
        return new Rectangle(randomWidth, randomHeight,
                colourSupplier.getColour());
    }

    private IsoscelesTrapezoid getNewTrapezoid() {
        int randomSideA = random.nextInt(RANDOM_NUMBER);
        int randomSideB = random.nextInt(RANDOM_NUMBER);
        int randomHeight = random.nextInt(RANDOM_NUMBER);
        return new IsoscelesTrapezoid(randomSideA, randomSideB, randomHeight,
                colourSupplier.getColour());
    }
}

