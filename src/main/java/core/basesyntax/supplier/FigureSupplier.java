package core.basesyntax.supplier;

import core.basesyntax.model.Circle;
import core.basesyntax.model.Figure;
import core.basesyntax.model.IsoscelesTrapezoid;
import core.basesyntax.model.Rectangle;
import core.basesyntax.model.RightTriangle;
import core.basesyntax.model.Square;
import core.basesyntax.service.Color;
import java.util.Random;

public class FigureSupplier {

    private final Random random = new Random();

    public Figure getRandomFigure() {
        int number;
        number = random.nextInt(5);
        switch (number) {
            case 1: {
                return new Circle();
            }
            case 2: {
                return new Rectangle();
            }
            case 3: {
                return new Square();
            }
            case 4: {
                return new RightTriangle();
            }
            case 5: {
                return new IsoscelesTrapezoid();
            }
            default:
                return new Circle();
        }
    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle();
        circle.setRadius(10);
        circle.setColor(Color.WHITE.name());
        return circle;
    }
}
