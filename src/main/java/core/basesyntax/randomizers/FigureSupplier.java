package core.basesyntax.randomizers;

import core.basesyntax.Color;
import core.basesyntax.Figure;
import core.basesyntax.figureshapes.Circle;
import core.basesyntax.figureshapes.IsoscelesTrapezoid;
import core.basesyntax.figureshapes.Rectangle;
import core.basesyntax.figureshapes.RightTriangle;
import core.basesyntax.figureshapes.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int NUMBEROFFIGURES = 5;
    private static final int DEFAULTCIRCLESIZE = 10;
    private static final int MAXVALUE = 1000;
    private Random random = new Random();
    private ColorSupplier color = new ColorSupplier();

    public Figure getDefaultFigure() {
        return new Circle(DEFAULTCIRCLESIZE,Color.WHITE.name());
    }

    public Figure getRandomFigure() {
        switch (random.nextInt(NUMBEROFFIGURES)) {
            case 0:
                return new Circle(random.nextInt(MAXVALUE), color.getRandomColor());
            case 1:
                return new Square(random.nextInt(MAXVALUE), color.getRandomColor());
            case 2:
                return new Rectangle(random.nextInt(MAXVALUE),random.nextInt(MAXVALUE),
                        color.getRandomColor());
            case 3:
                return new RightTriangle(random.nextInt(MAXVALUE),random.nextInt(MAXVALUE),
                        color.getRandomColor());
            case 4:
                return new IsoscelesTrapezoid(random.nextInt(MAXVALUE),random.nextInt(MAXVALUE),
                        random.nextInt(MAXVALUE),
                        color.getRandomColor());
            default:
                return new Circle(DEFAULTCIRCLESIZE,Color.WHITE.name());
        }
    }
}
