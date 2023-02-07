package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    public static final Random RANDOM = new Random();
    public static final ColorSupplier COLOR_SUPPLIER = new ColorSupplier();
    public static final String DEFAULT_COLOR = "WHITE";
    public static final int DEFAULT_RADIUS = 10;

    public Figure getRandomFigure() {
        int i = FigureSupplier.RANDOM.nextInt(5);

        switch(i){
            case 0:
                return new Circle(COLOR_SUPPLIER.getRandomColor(), FigureSupplier.RANDOM.nextInt(100));
            case 1:
                return new Square(COLOR_SUPPLIER.getRandomColor(), FigureSupplier.RANDOM.nextInt(100));
            case 2:
                return new Rectangle(COLOR_SUPPLIER.getRandomColor(),
                        FigureSupplier.RANDOM.nextInt(100), FigureSupplier.RANDOM.nextInt(100));
            case 3:
                return new RightTriangle(COLOR_SUPPLIER.getRandomColor(),
                        FigureSupplier.RANDOM.nextInt(100), FigureSupplier.RANDOM.nextInt(100));
            default:
                return new IsoscelesTrapezoid(COLOR_SUPPLIER.getRandomColor(),
                        FigureSupplier.RANDOM.nextInt(100), FigureSupplier.RANDOM.nextInt(100), FigureSupplier.RANDOM.nextInt(100));
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
