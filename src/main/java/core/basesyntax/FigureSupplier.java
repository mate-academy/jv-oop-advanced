package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public Figure getRandomFigure() {
        Random rnd = new Random();
        int i = rnd.nextInt(5);
        if (i == 0) {
            return new Circle(new ColorSupplier().getRandomColor(), rnd.nextInt(100));
        }
        if (i == 1) {
            return new Square(new ColorSupplier().getRandomColor(), rnd.nextInt(100));
        }
        if (i == 2) {
            return new Rectangle(new ColorSupplier().getRandomColor(),
                    rnd.nextInt(100), rnd.nextInt(100));
        }
        if (i == 3) {
            return new RightTriangle(new ColorSupplier().getRandomColor(),
                    rnd.nextInt(100), rnd.nextInt(100));
        }
        return new IsoscelesTrapezoid(new ColorSupplier().getRandomColor(),
                rnd.nextInt(100), rnd.nextInt(100), rnd.nextInt(100));
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}
