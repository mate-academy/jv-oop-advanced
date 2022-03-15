package core.basesyntax;

import core.basesyntax.model.Circle;
import core.basesyntax.model.Figures;
import core.basesyntax.model.IsoscelesTrapezoid;
import core.basesyntax.model.Rectangle;
import core.basesyntax.model.RightTriangle;
import core.basesyntax.model.Square;
import java.util.Random;

public class FigureSupplier {
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figures getDefaultFigure() {
        Figures circle = new Circle("WHITE", 10);
        return circle;
    }

    public Figures getRandomFigures() {
        int figuresIndex = new Random().nextInt(4);
        switch (figuresIndex) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(),
                        getRandomDouble());
            case 1:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        getRandomDouble(),
                        getRandomDouble(),
                        getRandomDouble());
            case 2:
                return new Rectangle(colorSupplier.getRandomColor(),
                        getRandomDouble(),
                        getRandomDouble());
            case 3:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        getRandomDouble(),
                        getRandomDouble());
            default:
                return new Square(colorSupplier.getRandomColor(),
                        getRandomDouble());
        }
    }

    private double getRandomDouble() {
        return new Random().nextDouble();
    }
}
