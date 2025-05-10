package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private static final double DEFAULT_RADIUS = 10;
    private ColorSupplier color = new ColorSupplier();
    private RandomDoubleGenerator randomDoubleGenerator = new RandomDoubleGenerator();
    private Random random = new Random();

    public Circle getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    public Figure getRandomFigure() {
        int randomNumber = random.nextInt(FigureName.values().length);
        switch (FigureName.values()[randomNumber]) {
            case CIRCLE :
                return getRandomCircle();
            case SQUARE :
                return getRandomSquare();
            case RECTANGLE :
                return getRandomRectangle();
            case RIGHT_TRIANGLE :
                return getRandomRightTriangle();
            case ISOSCELES_TRAPEZOID :
                return getRandomIsoscelesTrapezoid();
            default:
                return getDefaultFigure();
        }
    }

    private Circle getRandomCircle() {
        return new Circle(color.getRandomColor(), randomDoubleGenerator.getRandomDouble());
    }

    private Square getRandomSquare() {
        return new Square(color.getRandomColor(), randomDoubleGenerator.getRandomDouble());
    }

    private Rectangle getRandomRectangle() {
        return new Rectangle(color.getRandomColor(), randomDoubleGenerator.getRandomDouble(),
                randomDoubleGenerator.getRandomDouble());
    }

    private RightTriangle getRandomRightTriangle() {
        return new RightTriangle(color.getRandomColor(), randomDoubleGenerator.getRandomDouble(),
                randomDoubleGenerator.getRandomDouble());
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(color.getRandomColor(),
                randomDoubleGenerator.getRandomDouble(), randomDoubleGenerator.getRandomDouble(),
                randomDoubleGenerator.getRandomDouble());
    }
}
