package core.basesyntax.model.state;

import core.basesyntax.Figure;
import core.basesyntax.model.figures.Circle;
import core.basesyntax.model.figures.IsoscelesTrapezoid;
import core.basesyntax.model.figures.Rectangle;
import core.basesyntax.model.figures.RightTriangle;
import core.basesyntax.model.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int LIMIT_VALUE = 100;

    public Figure generateFigure() {
        Random rnd = new Random();
        int figureIndex = rnd.nextInt(FIGURE_COUNT);
        switch (figureIndex) {
            case 0:
                return new Circle(rnd.nextInt(LIMIT_VALUE), ColorSupplier.generateColor(),
                        "circle");
            case 1:
                return new Rectangle(rnd.nextInt(LIMIT_VALUE), rnd.nextInt(LIMIT_VALUE),
                        ColorSupplier.generateColor(), "rectangle");
            case 2:
                return new Square(rnd.nextInt(LIMIT_VALUE), ColorSupplier.generateColor(),
                        "square");
            case 3:
                return new RightTriangle(rnd.nextInt(LIMIT_VALUE), rnd.nextInt(LIMIT_VALUE),
                        ColorSupplier.generateColor(), "right triangle");
            case 4:
                return new IsoscelesTrapezoid(rnd.nextInt(LIMIT_VALUE), rnd.nextInt(LIMIT_VALUE),
                        rnd.nextInt(LIMIT_VALUE), ColorSupplier.generateColor(),
                        "isosceles trapezoid");
            default:
                return new Circle(rnd.nextInt(LIMIT_VALUE), ColorSupplier.generateColor(),
                    "circle");
        }
    }
}
