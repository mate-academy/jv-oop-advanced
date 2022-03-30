package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int DATE_OF_PARAM = 50;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(DATE_OF_PARAM);
        switch (random.nextInt(FIGURE_COUNT)) {
            case 0 :
                return new Circle(colorSupplier.getRandomColor(),"Circle", index);
            case 1 :
                return new Square(colorSupplier.getRandomColor(),"Square", index);
            case 2 :
                return new Rectangle(colorSupplier.getRandomColor(),"Rectangle", index);
            case 3 :
                return new RightTriangle(colorSupplier.getRandomColor(), "RightTriangle",
                        index, index);
            case 4 :
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        "IsoscelesTrapezoid", index, index, index);
            default:
                return new FigureSupplier().getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle(Color.WHITE.toString(), "Circle", 10);
        return circle;
    }
}
