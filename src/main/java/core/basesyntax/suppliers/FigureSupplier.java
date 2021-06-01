package core.basesyntax.suppliers;

import core.basesyntax.model.Circle;
import core.basesyntax.model.Figure;
import core.basesyntax.model.IsoscelesTrapezoid;
import core.basesyntax.model.Rectangle;
import core.basesyntax.model.RightTriangle;
import core.basesyntax.model.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int COUNT_FIGURES = 5;
    private static final int LIMIT_VALUE = 100;

    public Figure getRandomFigure() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Random random = new Random();
        int target = random.nextInt(COUNT_FIGURES);
        switch (target) {
            case 0:
                return new Circle(random.nextInt(LIMIT_VALUE),
                        "Circle",colorSupplier.getRandomColor());
            case 1:
                return new Rectangle(random.nextInt(LIMIT_VALUE), random.nextInt(LIMIT_VALUE),
                        "Rectangle", colorSupplier.getRandomColor());
            case 2:
                return new RightTriangle(random.nextInt(LIMIT_VALUE), random.nextInt(LIMIT_VALUE),
                        "RightTriangle", colorSupplier.getRandomColor());
            case 3:
                return new Square(random.nextInt(LIMIT_VALUE),
                        "Square", colorSupplier.getRandomColor());
            case 4:
                return new IsoscelesTrapezoid(random.nextInt(LIMIT_VALUE),
                        random.nextInt(LIMIT_VALUE), random.nextInt(LIMIT_VALUE),
                        "IsoscelesTrapezoid", colorSupplier.getRandomColor());
            default:
                return new Square(random.nextInt(LIMIT_VALUE),
                        "Square", colorSupplier.getRandomColor());
        }
    }
}
