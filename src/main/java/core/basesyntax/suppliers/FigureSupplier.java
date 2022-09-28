package core.basesyntax.suppliers;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int randomNumber = random.nextInt(5);
        switch (randomNumber) {
            case 0:
                return new Square().getRandomProperties();
            case 1:
                return new Rectangle().getRandomProperties();
            case 2:
                return new RightTriangle().getRandomProperties();
            case 3:
                return new Circle().getRandomProperties();
            default:
                return new IsoscelesTrapezoid().getRandomProperties();
        }
    }

    public Figure getDefaultFigure() {
        Figure figure = new Circle(10, "white");
        return figure;
    }
}
