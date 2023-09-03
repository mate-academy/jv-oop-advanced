package core.basesyntax.suppliers;

import core.basesyntax.abstracts.Figure;
import core.basesyntax.enums.Colors;
import core.basesyntax.figures.Circle;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int ALL_FIGURES = 5;
    private static final int DEF_PARAMETER = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int trueRandom = random.nextInt(ALL_FIGURES);
        switch (trueRandom) {
            case 0 : {
                return new Circle(random.nextInt(DEF_PARAMETER),
                        colorSupplier.getRandomColor());
            }
            case 1 : {
                return new IsoscelesTrapezoid(random.nextInt(DEF_PARAMETER),
                        random.nextInt(DEF_PARAMETER),
                        colorSupplier.getRandomColor());
            }
            case 2 : {
                return new Rectangle(random.nextInt(DEF_PARAMETER),
                        random.nextInt(DEF_PARAMETER),
                        colorSupplier.getRandomColor());
            }
            case 3 : {
                return new RightTriangle(random.nextInt(DEF_PARAMETER),
                        random.nextInt(DEF_PARAMETER),
                        colorSupplier.getRandomColor());
            }
            default : {
                return new Square(random.nextInt(DEF_PARAMETER),
                        colorSupplier.getRandomColor());
            }
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, Colors.WHITE.name().toLowerCase());
    }
}
