package core.basesyntax.suppliers;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int COUNT_FIGURES = 5;
    private static final int LIMIT_VALUE = 100;

    public Figure getFigure() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Random random = new Random();
        int target = random.nextInt(COUNT_FIGURES);
        switch (target) {
            case 0:
                return new Circle(random.nextInt(LIMIT_VALUE),
                        "Circle", colorSupplier.getColor());
            case 1:
                return new Square(random.nextInt(LIMIT_VALUE),
                        "Square", colorSupplier.getColor());
            case 2:
                return new IsoscelesTrapezoid(random.nextInt(LIMIT_VALUE),
                        random.nextInt(LIMIT_VALUE),
                        random.nextInt(LIMIT_VALUE),
                        "IsoscelesTrapezoid", colorSupplier.getColor());
            case 3:
                return new Rectangle(random.nextInt(LIMIT_VALUE),
                        random.nextInt(LIMIT_VALUE),
                        "Rectangle", colorSupplier.getColor());
            case 4:
                return new RightTriangle(random.nextInt(LIMIT_VALUE),
                        random.nextInt(LIMIT_VALUE),
                        "RightTriangle", colorSupplier.getColor());
            default:
                return new Square(random.nextInt(LIMIT_VALUE),
                        "Square", colorSupplier.getColor());
        }
    }
}
