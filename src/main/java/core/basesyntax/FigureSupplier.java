package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int NUMBER_OF_FIGURES = 5;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Circle defaultCircle = new Circle(Color.WHITE.name().toLowerCase(), 10);

    public Figure getRandomFigure() {
        int index = random.nextInt(NUMBER_OF_FIGURES);
        String randomColor = colorSupplier.getRandomColor();
        int randomValueX = random.nextInt(10) + 1;
        int randomValueY = random.nextInt(10) + 1;
        int randomValueZ = random.nextInt(10) + 1;

        switch (index) {
            case 0:
                return new Circle(randomColor, randomValueX);
            case 1:
                return new IsoscelesTrapezoid(randomColor, randomValueX, randomValueY,
                        randomValueZ);
            case 2:
                return new Rectangle(randomColor, randomValueX, randomValueY);
            case 3:
                return new RightTriangle(randomColor, randomValueX, randomValueY);
            default:
                return new Square(randomColor, randomValueX);
        }
    }

    public Figure getDefaultFigure() {
        return defaultCircle;
    }
}
