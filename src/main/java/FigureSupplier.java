import core.basesyntax.Figure;
import java.util.Random;

public class FigureSupplier {
    public static final int NUM = 5;
    public static final int VALUE = 30;
    private final ColourSupplier colour = new ColourSupplier();

    public Figure getFigure() {
        Random random = new Random();
        int randomFigure = random.nextInt(NUM);
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
        Random random = new Random();
        int randomBase = random.nextInt(VALUE);
        int randomHeight = random.nextInt(VALUE);
        return new RightTriangle(randomBase, randomHeight,
                ColourSupplier.getColour(colour.getColours()));
    }

    private Circle getNewCircle() {
        Random random = new Random();
        int randomRadius = random.nextInt(VALUE);
        return new Circle(randomRadius,ColourSupplier.getColour(colour.getColours()));
    }

    private Square getNeSquare() {
        Random random = new Random();
        int randomSide = random.nextInt(VALUE);
        return new Square(randomSide,ColourSupplier.getColour(colour.getColours()));
    }

    private Rectangle getNewRectangle() {
        Random random = new Random();
        int randomWidth = random.nextInt(VALUE);
        int randomHeight = random.nextInt(VALUE);
        return new Rectangle(randomWidth, randomHeight,
                ColourSupplier.getColour(colour.getColours()));
    }

    private IsoscelesTrapezoid getNewTrapezoid() {
        Random random = new Random();
        int randomSideA = random.nextInt(VALUE);
        int randomSideB = random.nextInt(VALUE);
        int randomHeight = random.nextInt(VALUE);
        return new IsoscelesTrapezoid(randomSideA, randomSideB, randomHeight,
                ColourSupplier.getColour(colour.getColours()));
    }

}

