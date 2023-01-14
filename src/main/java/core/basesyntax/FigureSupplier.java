package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int Figure_Count = 5;
    private static final Random random = new Random();
    private ColorSupplier supplier = new ColorSupplier();

    public Figure getRandomFigure() {

        switch (random.nextInt(Figure_Count)) {
            case 0:
                return new Circle(supplier.getRandomColor(), Circle.Max_Value);
            case 1:
                return new Square(supplier.getRandomColor(), Square.Max_Value);
            case 2:
                return new Rectangle(supplier.getRandomColor(),
                        Rectangle.Max_Value,
                        Rectangle.Max_Value);
            case 3:
                return new IsoscelesTrapezoid(supplier.getRandomColor(),
                        IsoscelesTrapezoid.Max_Value,
                        IsoscelesTrapezoid.Max_Value,
                        IsoscelesTrapezoid.Max_Value);
            case 4:
                return new RightTriangle(supplier.getRandomColor(),
                        RightTriangle.Max_Value,
                        RightTriangle.Max_Value);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, 10);
    }
}
