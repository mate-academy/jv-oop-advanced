package core.basesyntax.suplier;

import core.basesyntax.Figures;
import core.basesyntax.figure.AbstractFigure;
import core.basesyntax.figure.Circle;
import core.basesyntax.figure.IsoscelesTrapezoid;
import core.basesyntax.figure.Rectangle;
import core.basesyntax.figure.RightTriangle;
import core.basesyntax.figure.Square;

public class FigureSupplier extends Supplier {
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public AbstractFigure getRandomFigure() {
        AbstractFigure figure = null;
        switch (Figures.values()[Supplier.RANDOM.nextInt(Figures.values().length)]) {
            case CIRCLE:
                int radius = Supplier.RANDOM.nextInt(Supplier.MAX_VALUE) + Supplier.MIN_VALUE;
                figure = new Circle(colorSupplier.getRandomColor(), radius);
                break;
            case SQUARE:
                int side = Supplier.RANDOM.nextInt(Supplier.MAX_VALUE) + Supplier.MIN_VALUE;
                figure = new Square(colorSupplier.getRandomColor(), side);
                break;
            case RECTANGLE:
                int width = Supplier.RANDOM.nextInt(Supplier.MAX_VALUE) + Supplier.MIN_VALUE;
                int length = Supplier.RANDOM.nextInt(Supplier.MAX_VALUE) + Supplier.MIN_VALUE;
                figure = new Rectangle(colorSupplier.getRandomColor(), width, length);
                break;
            case RIGHT_TRIANGLE:
                int firstLeg = Supplier.RANDOM.nextInt(Supplier.MAX_VALUE) + Supplier.MIN_VALUE;
                int secondLeg = Supplier.RANDOM.nextInt(Supplier.MAX_VALUE) + Supplier.MIN_VALUE;
                figure = new RightTriangle(colorSupplier.getRandomColor(), firstLeg, secondLeg);
                break;
            case ISOSCELES_TRAPEZOID:
                int a = Supplier.RANDOM.nextInt(Supplier.MAX_VALUE) + Supplier.MIN_VALUE;
                int b = Supplier.RANDOM.nextInt(Supplier.MAX_VALUE) + Supplier.MIN_VALUE;
                int h = Supplier.RANDOM.nextInt(Supplier.MAX_VALUE) + Supplier.MIN_VALUE;
                figure = new IsoscelesTrapezoid(colorSupplier.getRandomColor(), a, b, h);
                break;
            default:
                break;
        }
        return figure;
    }

    public AbstractFigure getDefaultFigure() {
        return new Circle(colorSupplier.getRandomColor(), 10);
    }
}
