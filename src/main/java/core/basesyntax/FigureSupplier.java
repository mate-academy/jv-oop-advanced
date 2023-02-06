package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public Figure getRandomFigure() {
        Random random = new Random();
        ColorSupplier supplier = new ColorSupplier();
        switch (Figures.values()[random.nextInt(Figures.values().length)]) {
            case SQUARE: return new Square(random.nextInt(100), supplier.getColor());
            case RECTANGLE: return new Rectangle(random.nextInt(100), random.nextInt(100),
                    supplier.getColor());
            case CIRCLE: return new Circle(random.nextInt(100),
                    supplier.getColor());
            case RIGHTTRIANGLE: return new RightTriangle(random.nextInt(100),
                    random.nextInt(100), supplier.getColor());
            case ISOSCELESTRAPEZOID: return new IsoscelesTrapezoid(random.nextInt(100),
                random.nextInt(100), random.nextInt(100), supplier.getColor());
            default: return null;
        }
    }
}
