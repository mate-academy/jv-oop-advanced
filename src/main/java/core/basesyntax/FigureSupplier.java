package core.basesyntax;

import java.util.Locale;
import java.util.Random;

public class FigureSupplier {
    private static final double DEFAULT_RADIUS = 10;
    private static final int MAX_NUMBER = 50;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();
    private final Class[] figure = {Circle.class, Square.class, RightTriangle.class,
            Rectangle.class, IsoscelesTrapezoid.class};

    public Figure getRandomFigure() {
        int figureIndex = random.nextInt(figure.length);
        switch (figureIndex) {
            case 0:
                return generateNewCircle();
            case 1:
                return generateNewSquare();
            case 2:
                return generateNewRightTriangle();
            case 3:
                return generateNewRectangle();
            default:
                return generateNewIsoscelesTrapezoid();
        }
    }

    private IsoscelesTrapezoid generateNewIsoscelesTrapezoid() {
        int randomBaseOne = random.nextInt(MAX_NUMBER);
        int randomBaseTwo = random.nextInt(MAX_NUMBER);
        int randomHeight = random.nextInt(MAX_NUMBER);
        return new IsoscelesTrapezoid(colorSupplier.randomColor(),
                randomBaseOne,randomBaseTwo,randomHeight);
    }

    private Rectangle generateNewRectangle() {
        return new Rectangle(colorSupplier.randomColor(), random.nextDouble(),
                random.nextDouble());
    }

    private RightTriangle generateNewRightTriangle() {
        int randomBase = random.nextInt(MAX_NUMBER);
        int randomHeight = random.nextInt(MAX_NUMBER);
        return new RightTriangle(colorSupplier.randomColor(), randomBase, randomHeight);
    }

    private Square generateNewSquare() {
        int randomSide = random.nextInt(MAX_NUMBER);
        return new Square(colorSupplier.randomColor(), randomSide);
    }

    private Circle generateNewCircle() {
        int randomRadius = random.nextInt(MAX_NUMBER);
        return new Circle(colorSupplier.randomColor(), randomRadius);
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name().toLowerCase(Locale.ROOT), DEFAULT_RADIUS);
    }
}
