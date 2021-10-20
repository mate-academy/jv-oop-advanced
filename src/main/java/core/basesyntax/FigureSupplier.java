package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public Figure getRandomFigure() {
        Color color = new ColorSupplier().getRandomColor();
        int index = new Random().nextInt(Type.values().length);
        int randNumber = new Random().nextInt(10);
        randNumber++;
        if (Type.values()[index].equals(Type.CIRCLE)) {
            return new Circle(color, randNumber);
        } else if (Type.values()[index].equals(Type.SQUARE)) {
            return new Square(color, randNumber);
        } else if (Type.values()[index].equals(Type.TRIANGLE)) {
            return new RightTriangle(color, randNumber);
        } else {
            return new IsoscelesTrapezoid(color, new Random().nextInt(10),
                    + new Random().nextInt(10), new Random().nextInt(10));
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.ORANGE, 10);
    }
}
