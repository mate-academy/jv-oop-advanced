package core.basesyntax;

import java.util.Random;

public class FigureSupplier{
    private ColorSupplier supplier = new ColorSupplier();
    private static  final int CLASS_NUM = 5;
    Random random = new Random();


    public Figure getRandomFigure() {
        int classNum = random.nextInt(CLASS_NUM);
        Color randomColor = supplier.getRandomColor();
        int randomInt = random.nextInt();

        switch (classNum) {
            case 0:
                return new Circle(randomColor, randomInt);
            case 1:
                return new IsoscelesTrapezoid(randomColor,
                        randomInt, randomInt, randomInt);
            case 2:
                return new Rectangle(randomColor, randomInt, randomInt);

            case 3:
                return new Square(randomColor,
                        randomInt);
            case 4:
                return new RightTriangle(randomColor,
                        randomInt, randomInt, randomInt);
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, 10);
    }
}
