package core.basesyntax;

import java.lang.invoke.SwitchPoint;
import java.util.Random;

public class FigureSuplier {
    public Figure getRandomFigure() {
        int index = new Random().nextInt(5);
        return switch (index) {
            case 1 -> new Circle();
            case 2 -> new IsoscelesTrapezoid();
            case 3 -> new Rectangle();
            case 4 -> new RightTriangle();
            case 5 -> new Square();
            default -> null;
        };
    }

    public Figure getDeafoltFigure() {
        return new Circle(10, "WHITE");
    }
}
