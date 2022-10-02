package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final String[] FIGURES = {"Square", "RightTriangle", "Rectangle",
            "IsoscelesTrapezoid","Circle"};
    private ColorSupplier colorSupplier;
    private Random random;

    FigureSupplier(Random random, ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
        this.random = random;
    }

    public Figure getRandomFigure() {
        String figure = FIGURES[random.nextInt(FIGURES.length)];
        switch (figure) {
            case "Square": return new Square(random.nextDouble(), colorSupplier.getRandomColor());
            case "RightTriangle":
                return new RightTriangle(random.nextDouble(), random.nextDouble(),
                        colorSupplier.getRandomColor());
            case "IsoscelesTrapezoid":
                return new IsoscelesTrapezoid(random.nextDouble(), random.nextDouble(),
                        random.nextDouble(), colorSupplier.getRandomColor());
            case "Rectangle": return new Rectangle(random.nextDouble(),
                    random.nextDouble(), colorSupplier.getRandomColor());
            case "Circle": return new Circle(random.nextDouble(), colorSupplier.getRandomColor());
            default: return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, "White");
    }

}
