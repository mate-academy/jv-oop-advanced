package core.basesyntax.supplier;

import core.basesyntax.color.Color;
import core.basesyntax.figure.Circle;
import core.basesyntax.figure.Figure;
import core.basesyntax.figure.IsoscelesTrapezoid;
import core.basesyntax.figure.Rectangle;
import core.basesyntax.figure.RightTriangle;
import core.basesyntax.figure.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_OF_FIGURES = 5;
    private static final int DEFAULT_CIRCLE_SIZE = 10;
    private static final int MAXVALUE = 1000;
    private Random random = new Random();
    private ColorSupplier color = new ColorSupplier();

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_CIRCLE_SIZE,Color.WHITE.name());
    }

    public Figure getRandomFigure() {
        Figure figure = null;
        switch (random.nextInt(NUMBER_OF_FIGURES)) {
            case 0:
                figure = new Circle(random.nextInt(MAXVALUE), color.getRandomColor());
                break;
            case 1:
                figure = new Square(random.nextInt(MAXVALUE), color.getRandomColor());
                break;
            case 2:
                figure = new Rectangle(random.nextInt(MAXVALUE),random.nextInt(MAXVALUE),
                        color.getRandomColor());
                break;
            case 3:
                figure = new RightTriangle(random.nextInt(MAXVALUE),random.nextInt(MAXVALUE),
                        color.getRandomColor());
                break;
            case 4:
                figure = new IsoscelesTrapezoid(random.nextInt(MAXVALUE),random.nextInt(MAXVALUE),
                        random.nextInt(MAXVALUE),
                        color.getRandomColor());
                break;
            default:
                figure = getDefaultFigure();
                break;
        }
        return figure;
    }
}
