package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        final int figureCount = 5;
        int type = random.nextInt(figureCount);
        String color = colorSupplier.getRandomColor();

        switch (type) {
            case 0:
                double side = 1 + random.nextDouble() * 19;
                return new Square(color, round(side));
            case 1:
                double w = 1 + random.nextDouble() * 19;
                double h = 1 + random.nextDouble() * 19;
                return new Rectangle(color,round(w), round(h));
            case 2:
                double a = 1 + random.nextDouble() * 19;
                double b = 1 + random.nextDouble() * 19;
                return new RightTriangle(color,round(a), round(b));
            case 3:
                double r = 1 + random.nextDouble() * 19;
                return new Circle(color, round(r));
            case 4:
                double top = 1 + random.nextDouble() * 19;
                double bottom = top + random.nextDouble() * 20;
                double height = 1 + random.nextDouble() * 19;
                return new IsoscelesTrapezoid(color,round(top), round(bottom), round(height));
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10.0);
    }

    private double round(double v) {
        return Math.round(v * 10.0) / 10.0;
    }
}
