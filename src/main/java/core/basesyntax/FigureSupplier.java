package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final String DefaultColor = "WHITE";
    private static final double DefaultRadius = 10;
    private static final int figureType = 5;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final double getRandomSize = 1 + random.nextDouble() * 20;

    public Drawable getRandomFigure() {
        Color color = colorSupplier.getRandomColor();
        int figureType = random.nextInt(5);
        switch (figureType) {
            case 0 :
                double radius = getRandomSize;
                return new Circle(color.name(), getRandomSize);
            case 1 :
                double side = getRandomSize;
                return new Square(color.name(), getRandomSize);
            case 2 :
                double firstLeg = getRandomSize;
                double secondLeg = getRandomSize;
                return new Rectangle(color.name(), getRandomSize, getRandomSize);
            case 3 :
                double firstLine = getRandomSize;
                double secondLine = getRandomSize;
                return new RightTriangle(color.name(), getRandomSize, getRandomSize);
            case 4 :
                double legFirst = getRandomSize;
                double legSecond = getRandomSize;
                double height = getRandomSize;
                return new IsoscelesTrapezoid(color.name(), getRandomSize, getRandomSize,
                        getRandomSize);
            default:
                return getRandomFigure();
        }
    }

    public Drawable getDefaultFigure() {
        return new Circle(DefaultColor, DefaultRadius);
    }
}
