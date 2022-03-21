package core.basesyntax;

import core.basesyntax.modul.Circle;
import core.basesyntax.modul.IsoscelesTrapezoid;
import core.basesyntax.modul.Rectangle;
import core.basesyntax.modul.RightTriangle;
import core.basesyntax.modul.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int BOUND = 25;
    private Random rnd = new Random();

    public Figure getRandomFigure() {
        Figure[] figures = {new Square(rnd.nextInt(BOUND)),
                new Circle(rnd.nextInt(BOUND)),
                new RightTriangle(rnd.nextInt(BOUND), rnd.nextInt(BOUND)),
                new IsoscelesTrapezoid(rnd.nextInt(BOUND),rnd.nextInt(BOUND),rnd.nextInt(BOUND)),
                new Rectangle(rnd.nextInt(BOUND), rnd.nextInt(BOUND))};
        return figures[rnd.nextInt(figures.length)];
    }

    public Figure getDefaultFigure() {
        Figure circle = new Circle(10);
        circle.setColor(Color.WHITE.toString().toLowerCase());
        return circle;
    }
}
