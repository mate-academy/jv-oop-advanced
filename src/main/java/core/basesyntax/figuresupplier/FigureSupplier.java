package core.basesyntax.figuresupplier;

import core.basesyntax.Figure;
import core.basesyntax.colorsupplier.ColorSupplier;
import core.basesyntax.figures.Circle;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private static final Random random = new Random();
    public static final String COLOR = "WHITE";
    public static final int RADIUS = 10;
    double firstLine = new Random().nextInt(50);
    double secondLine = new Random().nextInt(50);
    double thirdLine = new Random().nextInt(50);

    public final Figure getDefaultFigure() {
        return new Circle(COLOR,RADIUS);
    }

    public Figure getRandomFigure() {
        int rundomFigura = random.nextInt(6);
        ColorSupplier colorSupplier = new ColorSupplier();

        switch (rundomFigura) {
            case 1:
                return new Circle(colorSupplier.getRandomColor(),
                        firstLine);
            case 2:
                return new Square(colorSupplier.getRandomColor(),
                        firstLine);
            case 3:
                return new Rectangle(colorSupplier.getRandomColor(),
                        firstLine, secondLine);
            case 4:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        firstLine, secondLine);
            case 5:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        firstLine, secondLine, thirdLine);
            default:
                return getDefaultFigure();
        }
    }
}
