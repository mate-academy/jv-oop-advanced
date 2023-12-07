package core.basesyntax;

import java.util.Random;

public class FigureSupplier{
    private ColorSupplier supplier = new ColorSupplier();
    private static  final int CLASS_NUM = 5;
    Random random = new Random();


    public Figure getRandomFigure() {
        int classNum = random.nextInt(CLASS_NUM);
        switch (classNum) {
            case 0:
                return new Circle(supplier.getRandomColor(), random.nextInt());
            case 1:
                return new IsoscelesTrapezoid(supplier.getRandomColor(),
                        random.nextInt(), random.nextInt(), random.nextInt());
            case 2:
                return new Rectangle(supplier.getRandomColor(), random.nextInt(), random.nextInt());

            case 3:
                return new Square(supplier.getRandomColor(),
                        random.nextInt());
            case 4:
                return new RightTriangle(supplier.getRandomColor(),
                        random.nextInt(), random.nextInt(), random.nextInt());
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, 10);
    }
}
