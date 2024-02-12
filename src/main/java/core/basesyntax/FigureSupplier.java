package core.basesyntax;

import core.basesyntax.model.Circle;
import core.basesyntax.model.Color;
import core.basesyntax.model.Figure;
import core.basesyntax.model.IsoscelesTrapezoid;
import core.basesyntax.model.Rectangle;
import core.basesyntax.model.RightTriangle;
import core.basesyntax.model.Square;
import java.util.Random;

public class FigureSupplier {
    public static final int VALUE = 9;
    public static final int FIGURE_COUNT = 5;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Figure defaultFigure = new Circle(10);
    private Figure figure;

    public Figure getRandomFigure() {
        int chooser = random.nextInt(FIGURE_COUNT);
        switch (chooser) {
            case 0:
                figure = new Circle(random.nextInt(VALUE) + 1);
                break;
            case 1:
                figure = new Square(random.nextInt(VALUE) + 1);
                break;
            case 2:
                figure = new Rectangle(random.nextInt(VALUE) + 1, random.nextInt(VALUE) + 1);
                break;
            case 3:
                figure = new RightTriangle(random.nextInt(VALUE) + 1, random.nextInt(VALUE) + 1);
                break;
            case 4:
                figure = new IsoscelesTrapezoid(random.nextInt(VALUE) + 1,
                        random.nextInt(VALUE) + 1,
                        random.nextInt(VALUE) + 1);
                break;
            default:
        }
        figure.setColor(colorSupplier.getRandomColor());
        return figure;
    }

    public Figure getDefaultFigure() {
        defaultFigure.setColor(Color.WHITE.name());
        return defaultFigure;
    }
}
