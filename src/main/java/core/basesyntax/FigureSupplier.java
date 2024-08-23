package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final double BOUND = 10.0;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureIndex = random.nextInt(Figures.values().length);
        String figureName = Figures.values()[figureIndex].name();
        switch (figureName) {
            case "ISOSCELESTRAPEZOID" :
                return new IsoscelesTrapezoid(random.nextDouble(BOUND), random.nextDouble(BOUND),
                random.nextDouble(BOUND),colorSupplier.getRandomColor());
            case "CIRCLE" :
                return new Circle(random.nextDouble(BOUND),colorSupplier.getRandomColor());
            case "RECTANGLE" :
                return new Rectangle(random.nextDouble(BOUND), random.nextDouble(BOUND),
                        colorSupplier.getRandomColor());
            case "RIGHTTRIANGLE" :
                return new RightTriangle(random.nextDouble(BOUND), random.nextDouble(BOUND),
                        colorSupplier.getRandomColor());
            case "SQUARE" :
                return new Square(random.nextDouble(BOUND), colorSupplier.getRandomColor());
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, "white");
    }
}
