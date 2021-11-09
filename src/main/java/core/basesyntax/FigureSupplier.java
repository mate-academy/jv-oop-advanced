package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();
    private int maxFig = 6;
    private int maxBound = 50;

    public int getMaxBound() {
        return maxBound;
    }

    public void setMaxBound(int maxBound) {
        this.maxBound = maxBound;
    }

    public int getMaxFig() {
        return maxFig;
    }

    public void setMaxFig(int maxFig) {
        this.maxFig = maxFig;
    }

    private final int rndCol = random.nextInt(Colors.values().length);
    private final String randomColor = Colors.values()[rndCol].toString();

    public Figure getRandomFigure() {
        int rndFig = random.nextInt(maxFig);
        switch (rndFig) {
            case 0:
                return new Square("Square", randomColor, random.nextInt(maxBound),
                        random.nextInt(maxBound));
            case 1:
                return new RightTriangle(random.nextInt(maxBound), random.nextInt(maxBound),
                        "RightTriangle", randomColor);
            case 2:
                return new Rhombus("Rhombus", randomColor, random.nextInt(maxBound),
                        random.nextInt(maxBound));
            case 3:
                return new Rectangle("Rectangle", randomColor, random.nextInt(),
                        random.nextInt(maxBound));
            case 4:
                return new IsoscelesTrapezoid("IsoscelesTrapezoid", randomColor,
                        random.nextInt(maxBound),
                        random.nextInt(maxBound), random.nextInt(maxBound));
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
         Circle circle = new Circle("Circle", "White", 10);
         return circle;
    }
}
