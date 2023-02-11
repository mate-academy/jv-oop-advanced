package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int RANDOM_LENGHT = 20;
    private static final int CIRCLE_RADIUS = 10;
    private final int numberOfTypes = TypeOfFigure.values().length;
    private final ColorSupplier randomColor = new ColorSupplier();
    private final Random random = new Random();

    public int getRandomNumber() {
        return random.nextInt(RANDOM_LENGHT);
    }

    public TypeOfFigure getRandomTypeOfFigure() {
        return TypeOfFigure.values()[random.nextInt(numberOfTypes)];
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, CIRCLE_RADIUS);
    }

    private Circle getRandomCircle() {
        return new Circle(randomColor.getRandomColor(), random.nextInt(RANDOM_LENGHT));
    }

    private Square getRandomSquare() {
        return new Square(randomColor.getRandomColor(), random.nextInt(RANDOM_LENGHT));
    }

    private RightTriangle getRandomRightTriangle() {
        return new RightTriangle(randomColor.getRandomColor(),
                random.nextInt(RANDOM_LENGHT), random.nextInt(RANDOM_LENGHT));
    }

    private Rectangle getRandomRectangle() {
        return new Rectangle(randomColor.getRandomColor(),
                random.nextInt(RANDOM_LENGHT), random.nextInt(RANDOM_LENGHT));
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(randomColor.getRandomColor(),
                random.nextInt(RANDOM_LENGHT), random.nextInt(RANDOM_LENGHT),
                random.nextInt(RANDOM_LENGHT));
    }


    public Figure getRandomFigure() {
        switch (getRandomTypeOfFigure()) {
            case CIRCLE:
                return getRandomCircle();
            case SQUARE:
                return getRandomSquare();
            case TRIANGLE:
                return getRandomRightTriangle();
            case RECTANGLE:
                return getRandomRectangle();
            case TRAPEZOID:
                return getRandomIsoscelesTrapezoid();
            default:
                return getDefaultFigure();
        }
    }
}
