package core.basesyntax;

import core.basesyntax.modul.Circle;
import core.basesyntax.modul.IsoscelesTrapezoid;
import core.basesyntax.modul.Rectangle;
import core.basesyntax.modul.RightTriangle;
import core.basesyntax.modul.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int BOUND = 25;
    private static final int FIGURE_COUNT = 4;
    private static final int DEFAULT_RADIUS = 10;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        switch (random.nextInt(FIGURE_COUNT)) {
            case 0: return new Circle(random.nextInt(BOUND), colorSupplier.getRandomColor());
            case 1: return new Square(random.nextInt(BOUND), colorSupplier.getRandomColor());
            case 2: return new Rectangle(random.nextInt(BOUND),
                        random.nextInt(BOUND),
                        colorSupplier.getRandomColor());
            case 3: return new RightTriangle(random.nextInt(BOUND),
                    random.nextInt(BOUND),
                    colorSupplier.getRandomColor());
            case 4: return new IsoscelesTrapezoid(random.nextInt(BOUND),
                    random.nextInt(BOUND),
                    random.nextInt(BOUND),
                    colorSupplier.getRandomColor());
            default:
        }
        return new Circle(0,null);
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, Color.WHITE.toString().toLowerCase());
    }
}
