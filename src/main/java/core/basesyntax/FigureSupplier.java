package core.basesyntax;

import core.basesyntax.figure.Circle;
import core.basesyntax.figure.Figure;
import core.basesyntax.figure.IsoscelesTrapezoid;
import core.basesyntax.figure.Rectangle;
import core.basesyntax.figure.RightTriangle;
import core.basesyntax.figure.Square;
import java.util.Locale;
import java.util.Random;

public class FigureSupplier {
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figure = new Random().nextInt(4);
        switch (figure) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(),getRandomInt());
            case 1:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        getRandomDouble(), getRandomDouble(), getRandomInt());
            case 2:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        getRandomInt(), getRandomInt());
            case 3:
                return new Rectangle(colorSupplier.getRandomColor(),
                        getRandomInt(), getRandomInt());
            case 4:
            default:
                return new Square(colorSupplier.getRandomColor(), getRandomInt());
        }
    }

    private int getRandomInt() {
        int count = new Random().nextInt(100);
        return count;
    }

    private double getRandomDouble() {
        double number = new Random().nextDouble();
        return number;
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name().toLowerCase(Locale.ROOT), 10);
    }
}
