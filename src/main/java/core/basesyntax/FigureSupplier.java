package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        String color = colorSupplier.getRandomColor(random);
        int index = random.nextInt(5);
        switch (index) {
            case 1:
                return new Circle(color, getIntRandom());
            case 2:
                return new Square(color, getIntRandom());
            case 3:
                return new Rectangle(color, getIntRandom(), getIntRandom());
            case 4:
                return new RightTriangle(color, getIntRandom(), getIntRandom());
            default:
                return new IsoscelesTrapezoid(color, getIntRandom(), getIntRandom(),
                        getIntRandom());

        }
    }

    public Figure getDefaultFigure() {
        return new Circle("WHITE", 10);
    }

    private int getIntRandom() {
        return random.nextInt(100);
    }
}
