package core.basesyntax;

import java.util.Random;

public class FigureSupplier extends Figure {
    public static final int FIGURE_COUNT = 4;
    public static final int MAX_VAL = 100;
    private ColorSupplier supplier = new ColorSupplier();
    private Random random = new Random();

    public FigureSupplier(String color) {
        super(color);
    }

    public FigureSupplier() {
        super();
    }

    public Figure getRandomFigure() {
        int varInt1 = random.nextInt(MAX_VAL);
        int varInt2 = random.nextInt(MAX_VAL);

        double var = random.nextDouble();
        Circle circle = new Circle(var, supplier.getRandomColor());
        Square square = new Square(var, supplier.getRandomColor());
        Rectangle rectangle = new Rectangle(varInt1, varInt2, supplier.getRandomColor());
        RightTriangle rightTriangle = new RightTriangle(var, supplier.getRandomColor());
        IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid(varInt1,
                varInt2, supplier.getRandomColor());
        Figure[] figure = new Figure[]
                {circle, square, rectangle, rightTriangle, isoscelesTrapezoid};
        int figureNumber = random.nextInt(FIGURE_COUNT);
        return figure[figureNumber];
    }

    public Figure getDefaultFigure() {
        return new Circle(10, supplier.getDefaultColor());
    }
}
