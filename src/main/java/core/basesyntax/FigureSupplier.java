package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final int figuresTypeCount = 5;
    private final int maxSideLength = 10;
    private final Random random = new Random();
    private final ColorSupplier color = new ColorSupplier();

    public Figure getRandomFigure() {
        switch (random.nextInt(figuresTypeCount)) {
            case 0 :
                return new Square(random.nextInt(maxSideLength) + 1,
                                        color.getRandomColor());
            case 1 :
                return new Rectangle(random.nextInt(maxSideLength) + 1,
                                     random.nextInt(maxSideLength) + 1,
                                            color.getRandomColor());
            case 2 :
                return new RightTriangle(random.nextInt(maxSideLength) + 1,
                                         random.nextInt(maxSideLength) + 1,
                                               color.getRandomColor());
            case 3 :
                return new Circle(random.nextInt(maxSideLength) + 1,
                                                color.getRandomColor());
            default :
                return new IsoscelesTrapezoid(random.nextInt(maxSideLength) + 1,
                                            random.nextInt(maxSideLength) + 1,
                                                random.nextInt(maxSideLength) + 1,
                                                        color.getRandomColor());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, "WHITE");
    }
}
