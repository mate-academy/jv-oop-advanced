package auxiliary;

import core.basesyntax.Circle;
import core.basesyntax.IsoscelesTrapezoid;
import core.basesyntax.Rectangle;
import core.basesyntax.RightTriangle;
import core.basesyntax.Square;
import java.util.Random;

public class FigureSupplier {
    private Random random = new Random();

    public Figure getRandomFigure() {
        int number = random.nextInt(TypeOfFigure.values().length);
        if (number == 1) {
            return new Square(getRandNumber());
        } else if (number == 2) {
            return new Circle(getRandNumber());
        } else if (number == 3) {
            return new Rectangle(getRandNumber(), getRandNumber());
        } else if (number == 4) {
            return new RightTriangle(getRandNumber(), getRandNumber());
        } else {
            return new IsoscelesTrapezoid(getRandNumber(), getRandNumber());
        }
    }

    public Figure getDefFigure() {
        int defaultSize = 10;
        Circle circle = new Circle(defaultSize);
        circle.setColor(Color.WHITE.toString());
        return circle;
    }

    public int getRandNumber() {
        return random.nextInt(9) + 1;
    }
}
