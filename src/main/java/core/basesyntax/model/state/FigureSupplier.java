package core.basesyntax.model.state;

import core.basesyntax.Figure;
import core.basesyntax.model.figures.Circle;
import core.basesyntax.model.figures.IsoscelesTrapezoid;
import core.basesyntax.model.figures.Rectangle;
import core.basesyntax.model.figures.RightTriangle;
import core.basesyntax.model.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private Random random = new Random();
    private int limitValue = random.nextInt(100);
    private String[] figures = new String[]{
            "Circle",
            "Rectangle",
            "Square",
            "RightTriangle",
            "IsoscelesTrapezoid"
    };

    public Figure generateFigure() {
        String figure = figures[random.nextInt(figures.length)];
        switch (figure) {
            case "Circle":
                return new Circle(limitValue);
            case "Rectangle":
                return new Rectangle(limitValue, limitValue);
            case "Square":
                return new Square(limitValue);
            case "RightTriangle":
                return new RightTriangle(limitValue, limitValue);
            case "IsoscelesTrapezoid":
                return new IsoscelesTrapezoid(limitValue, limitValue, limitValue);
            default:
                return null;
        }
    }
}
