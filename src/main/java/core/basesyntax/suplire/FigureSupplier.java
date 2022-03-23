package core.basesyntax.suplire;

import core.basesyntax.figure.Circle;
import core.basesyntax.figure.Figure;
import core.basesyntax.figure.IsoscelesTrapezoid;
import core.basesyntax.figure.Rectangle;
import core.basesyntax.figure.RightTriangle;
import core.basesyntax.figure.Square;
import java.util.Random;

public class FigureSupplier {

    private static final Color WHITE_COLOR = Color.WHITE;
    private static final int RADIUS = 10;

    public Figure getRandomFigure() {
        ColorSupplier colorSupplier = new ColorSupplier();
        int index = new Random().nextInt(4);
        switch (index) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(),randomNumber());
            case 1:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        randomNumber(),
                        randomNumber(),
                        randomNumber());
            case 2:
                return new Rectangle(colorSupplier.getRandomColor(),randomNumber(),randomNumber());
            case 3:
                return new Square(colorSupplier.getRandomColor(),randomNumber());
            default:
                return new RightTriangle(colorSupplier.getRandomColor(),randomNumber(),
                        randomNumber());
        }
    }

    public int randomNumber() {
        return new Random().nextInt(1000);
    }

    public Figure getDefaultFigure() {
        return new Circle(WHITE_COLOR.toString(),RADIUS);
    }

}
