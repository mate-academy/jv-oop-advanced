package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private static final int DEFAULT_RADIUS = 10;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Object getRandomFigure() {
        Figure newFigure;
        int figureIndex = random.nextInt(FigureType.values().length);
        FigureType newFigureType = FigureType.values()[figureIndex];
        switch (newFigureType) {
            case CIRCLE:
                newFigure = createRandomCircle();
                break;
            case SQUARE:
                newFigure = createRandomSquare();
                break;
            case RECTANGLE:
                newFigure = createRandomRectangle();
                break;
            case RIGRHT_TRIANGLE:
                newFigure = createRandomRightTriangle();
                break;
            case ISOSCELES_TRAPEZOID:
                newFigure = createRandomIsoscelesTrapezoid();
                break;
            default:
                return getDefaultFigure();
        }
        return newFigure;
    }

    private Circle createRandomCircle() {
        int radius = new Random().nextInt(20);
        Color color = colorSupplier.getRandomColor();
        return new Circle(color, radius);
    }

    private Square createRandomSquare() {
        int side = new Random().nextInt(20);
        Color color = colorSupplier.getRandomColor();
        return new Square(color, side);
    }

    private Rectangle createRandomRectangle() {
        Color color = colorSupplier.getRandomColor();
        int side1 = new Random().nextInt(20);
        int side2 = new Random().nextInt(20);
        return new Rectangle(color, side1, side2);
    }

    private RightTriangle createRandomRightTriangle() {
        Color color = colorSupplier.getRandomColor();
        int leg1 = new Random().nextInt(20);
        int leg2 = new Random().nextInt(20);
        return new RightTriangle(color, leg1, leg2);
    }

    private IsoscelesTrapezoid createRandomIsoscelesTrapezoid() {
        Color color = colorSupplier.getRandomColor();
        int height = new Random().nextInt(20);
        int topSide = new Random().nextInt(20);
        int downside = new Random().nextInt(20);
        return new IsoscelesTrapezoid(color, height, topSide, downside);
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
