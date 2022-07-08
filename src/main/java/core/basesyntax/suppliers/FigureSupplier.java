package core.basesyntax.suppliers;

import core.basesyntax.model.Circle;
import core.basesyntax.model.Figure;
import core.basesyntax.model.IsoscelesTrapezoid;
import core.basesyntax.model.Rectangle;
import core.basesyntax.model.RightTriangle;
import core.basesyntax.model.Square;
import java.util.Random;

public class FigureSupplier {

    private static final int BOUND = 100;
    private static final int RADIUS = 10;
    private static final String WHITE = "WHITE";
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Circle getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(), getRandomInt());
    }

    public IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                getRandomDouble(), getRandomDouble(), getRandomDouble());
    }

    public Rectangle getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),
                getRandomDouble(), getRandomDouble());
    }

    public RightTriangle getRandomRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                getRandomInt(), getRandomInt());
    }

    public Square getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(), getRandomInt());
    }

    public Figure getRandomFigure() {
        int figureIndex = random.nextInt(5);
        switch (figureIndex) {
            case 0:
                return getRandomCircle();
            case 1:
                return getRandomIsoscelesTrapezoid();
            case 2:
                return getRandomRectangle();
            case 3:
                return getRandomRightTriangle();
            case 4:
            default:
                return getRandomSquare();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(WHITE, RADIUS);
    }

    private int getRandomInt() {
        return new Random().nextInt(BOUND);
    }

    private double getRandomDouble() {
        return new Random().nextDouble();
    }
}
