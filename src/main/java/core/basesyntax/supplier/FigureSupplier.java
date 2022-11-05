package core.basesyntax.supplier;

import core.basesyntax.model.Circle;
import core.basesyntax.model.IsoscelesTrapezoid;
import core.basesyntax.model.Rectangle;
import core.basesyntax.model.RightTriangle;
import core.basesyntax.model.Square;
import core.basesyntax.model.abstraction.Color;
import core.basesyntax.model.abstraction.Figure;
import java.util.Random;

public class FigureSupplier {
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random randome = new Random();

    public Figure getRandomFigure() {
        switch (randome.nextInt(5)) {
            case 0:
                return new Square(colorSupplier.getRandomColor(), getRandomInt());
            case 1:
                return new Rectangle(colorSupplier.getRandomColor(),
                        getRandomInt(), getRandomInt());
            case 2:
                return new RightTriangle(colorSupplier.getRandomColor(), getRandomInt(),
                        getRandomInt());
            case 3:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        getRandomInt(), getRandomInt(), getRandomInt());
            case 4:
                return new Circle(colorSupplier.getRandomColor(), getRandomInt());
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, 10);
    }

    private int getRandomInt() {
        int randomInt = randome.nextInt(50);
        if (randomInt == 0) {
            return 1;
        }
        return randomInt;
    }
}
