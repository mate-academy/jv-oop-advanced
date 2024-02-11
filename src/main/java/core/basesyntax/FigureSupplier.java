package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    public void setColorSupplier(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
    }

    public ColorSupplier getColorSupplier() {
        return colorSupplier;
    }

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        String figureColor = colorSupplier.getRandomColor();

        switch (figureNumber) {
            case 0:
                return new Square(figureColor, random.nextInt(10) + 1);
            case 1:
                return new Rectangle(figureColor, random.nextInt(10) + 1,
                        random.nextInt(10) + 1);
            case 2:
                return new RightTriangle(figureColor, random.nextInt(10) + 1,
                        random.nextInt(10) + 1);
            case 3:
                return new Circle(figureColor, random.nextInt(10) + 1);
            case 4:
                return new IsoscelesTrapezoid(figureColor, random.nextInt(10) + 1,
                        random.nextInt(10) + 1, random.nextInt(10) + 1);
            default:
                return new IsoscelesTrapezoid(figureColor, random.nextInt(10) + 1,
                        random.nextInt(10) + 1, random.nextInt(10) + 1);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}
