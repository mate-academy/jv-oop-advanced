package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 4;
    public static final int MAX_VAL = 100;
    private Random random = new Random();
    private int varInt1 = random.nextInt(MAX_VAL);
    private int varInt2 = random.nextInt(MAX_VAL);
    private ColorSupplier supplier = new ColorSupplier();
    private double var = random.nextDouble();
    private Circle circle = new Circle(var);
    private Square square = new Square(var);
    private Rectangle rectangle = new Rectangle(varInt1, varInt2);
    private RightTriangle rightTriangle = new RightTriangle(var);
    private IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid(varInt1, varInt2);

    private Figure[] figure = new Figure[]
            {circle, square, rectangle, rightTriangle, isoscelesTrapezoid};

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        return figure[figureNumber];
    }

    public Figure getDefaultFigure() {
        return new Circle(10);
    }
}
