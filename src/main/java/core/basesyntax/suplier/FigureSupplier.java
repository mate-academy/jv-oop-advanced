package core.basesyntax.suplier;

import core.basesyntax.Figures;
import core.basesyntax.figure.Circle;
import core.basesyntax.figure.Figure;
import core.basesyntax.figure.IsoscelesTrapezoid;
import core.basesyntax.figure.Rectangle;
import core.basesyntax.figure.RightTriangle;
import core.basesyntax.figure.Square;

public class FigureSupplier extends Supplier {
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        Figure figure;
        switch (Figures.values()[getRandom().nextInt(Figures.values().length)]) {
            case CIRCLE:
                int radius = getRandom().nextInt(Supplier.MAX_VALUE) + Supplier.MIN_VALUE;
                figure = new Circle(colorSupplier.getRandomColor(), radius);
                break;
            case SQUARE:
                int side = getRandom().nextInt(Supplier.MAX_VALUE) + Supplier.MIN_VALUE;
                figure = new Square(colorSupplier.getRandomColor(), side);
                break;
            case RECTANGLE:
                int width = getRandom().nextInt(Supplier.MAX_VALUE) + Supplier.MIN_VALUE;
                int length = getRandom().nextInt(Supplier.MAX_VALUE) + Supplier.MIN_VALUE;
                figure = new Rectangle(colorSupplier.getRandomColor(), width, length);
                break;
            case RIGHT_TRIANGLE:
                int firstLeg = getRandom().nextInt(Supplier.MAX_VALUE) + Supplier.MIN_VALUE;
                int secondLeg = getRandom().nextInt(Supplier.MAX_VALUE) + Supplier.MIN_VALUE;
                figure = new RightTriangle(colorSupplier.getRandomColor(), firstLeg, secondLeg);
                break;
            default:
                int a = getRandom().nextInt(Supplier.MAX_VALUE) + Supplier.MIN_VALUE;
                int b = getRandom().nextInt(Supplier.MAX_VALUE) + Supplier.MIN_VALUE;
                int h = getRandom().nextInt(Supplier.MAX_VALUE) + Supplier.MIN_VALUE;
                figure = new IsoscelesTrapezoid(colorSupplier.getRandomColor(), a, b, h);
                break;
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        return new Circle(colorSupplier.getRandomColor(), 10);
    }
}
