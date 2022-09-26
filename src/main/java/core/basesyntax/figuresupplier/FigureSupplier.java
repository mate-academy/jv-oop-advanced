package core.basesyntax.figuresupplier;

import core.basesyntax.Figure;
import core.basesyntax.colorsupplier.ColorSupplier;
import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private static final Random random = new Random();
    private final Figure figureDefault = new Circle("WHITE", 10);

    public Figure getDefaultFigure() {
        return figureDefault;
    }

    public Figure getRandomFigure() {
        int rundomFigura = random.nextInt(6);
        double firstline = new Random().nextInt(50);
        double secondline = new Random().nextInt(50);
        double thirdline = new Random().nextInt(50);
        ColorSupplier colorSupplier = new ColorSupplier();

        switch (rundomFigura) {
            case 1:
                return new Circle(colorSupplier.getRandomColor(),
                        firstline);
            case 2:
                return new Square(colorSupplier.getRandomColor(),
                        firstline);
            case 3:
                return new Rectangle(colorSupplier.getRandomColor(),
                        firstline, secondline);
            case 4:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        firstline, secondline);
            case 5:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        firstline, secondline, thirdline);
            default:
                return getDefaultFigure();
        }
    }
}
