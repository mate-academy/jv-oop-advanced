package core.basesyntax;

import core.basesyntax.fiqures.Circle;
import core.basesyntax.fiqures.IsoscelesTrapezoid;
import core.basesyntax.fiqures.Rectangle;
import core.basesyntax.fiqures.RightTriangle;
import core.basesyntax.fiqures.Square;
import java.util.Random;

public class FigureSupplier {
    private final int maxValue = 4;
    private Random random = new Random();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(maxValue);
        Figure rez = new Circle(new Random().nextInt(10));
        switch (figureNumber) {
            case 0:
                rez = new Circle(new Random().nextInt(10));
                break;
            case 1:
                rez = new IsoscelesTrapezoid(new Random().nextInt(10),
                        new Random().nextInt(10));
                break;
            case 2:
                rez = new Rectangle(new Random().nextInt(10),
                        new Random().nextInt(10));
                break;
            case 3:
                rez = new RightTriangle(new Random().nextInt(10),
                        new Random().nextInt(10));
                break;
            case 4:
                rez = new Square(new Random().nextInt(10));
                break;
            default:
                break;
        }
        return rez;
    }
}
