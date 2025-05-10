package core.basesyntax.figure;

import core.basesyntax.figuretype.Circle;
import core.basesyntax.figuretype.IsoscelesTrapezoid;
import core.basesyntax.figuretype.Rectangle;
import core.basesyntax.figuretype.RightTriangle;
import core.basesyntax.figuretype.Square;
import core.basesyntax.misc.ColorSupplier;
import java.util.Random;

public class FigureSupplier {
    private static final int UNITS = 100;
    private Random random = new Random();
    private ColorSupplier colorSupply = new ColorSupplier();

    public Figure getRandomFigure() {
        String color = colorSupply.getRandomColor();
        Figures type = Figures.values()[random.nextInt(Figures.values().length)];
        switch (type) {
            case SQUARE:
                return new Square(color, getRandomNum());
            case RECTANGLE:
                return new Rectangle(color, getRandomNum(), getRandomNum());
            case RIGHT_TRIANGLE:
                return new RightTriangle(color, getRandomNum(), getRandomNum());
            case CIRCLE:
                return new Circle(color, getRandomNum());
            case ISOSCELES_TRAPEZOID:
                return new IsoscelesTrapezoid(color, getRandomNum(),
                        getRandomNum(), getRandomNum());
            default:
                throw new IllegalArgumentException(type + " is not implemented");
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }

    public int getRandomNum() {
        return random.nextInt(UNITS);
    }
}
