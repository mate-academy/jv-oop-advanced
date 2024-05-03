package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static int magic = 100;

    public Figure getRandomFigure() {
        int figureRandomiser = 4;
        int paramsRandomizer1 = new Random().nextInt(magic);
        int paramsRandomizer2 = new Random().nextInt(magic);
        String randomColor = new ColorSupplier().generateRandomColor();
        switch (new Random().nextInt(4)) {
            case 0:
                return new Circle(randomColor, paramsRandomizer1);
            case 1:
                return new Rectangle(randomColor, paramsRandomizer1, paramsRandomizer2);
            case 2:
                return new IsoscelesTrapezoid(randomColor, paramsRandomizer1,
                        paramsRandomizer2, new Random().nextInt(magic));
            case 3:
                return new Square(randomColor, paramsRandomizer1);
            case 4:
                return new RightTriangle(randomColor, paramsRandomizer1);
            default:
                return getDefaultFigure();
        }
    }

    public static Circle getDefaultFigure() {
        return new Circle("white", 10);
    }
}
