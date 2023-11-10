package core.basesyntax;

import core.basesyntax.model.Circle;
import core.basesyntax.model.Figure;
import core.basesyntax.model.IsoscelesTrapezoid;
import core.basesyntax.model.Rectangle;
import core.basesyntax.model.RightTriangle;
import core.basesyntax.model.Square;
import core.basesyntax.model.enums.Color;
import java.util.Random;

public class FigureSupplier {

    private final Integer randomNumber = 20;
    private final Integer defaulSize = 10;
    private final Integer fiduresCount = 5;

    public Figure getRandomFigure() {
        Random random = new Random();
        return switch (random.nextInt(fiduresCount)) {
            case 0 -> new Circle(new ColorSupplier().getRandomColor(),
                    random.nextInt(randomNumber));
            case 1 -> new IsoscelesTrapezoid(new ColorSupplier().getRandomColor(),
                    random.nextInt(randomNumber),
                    random.nextInt(randomNumber),
                    random.nextInt(randomNumber));
            case 2 -> new Rectangle(new ColorSupplier().getRandomColor(),
                    random.nextInt(randomNumber),
                    random.nextInt(randomNumber));
            case 3 -> new RightTriangle(new ColorSupplier().getRandomColor(),
                    random.nextInt(randomNumber),
                    random.nextInt(randomNumber));
            default -> new Square(new ColorSupplier().getRandomColor(),
                    random.nextInt(randomNumber));
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, defaulSize);
    }
}
