package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int DefaultSize = 10;
    public static final String DefaultColor = "White";
    public static final int Limit = 100;
    public static final int TotalFigure = 5;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int indexFigure = random.nextInt(TotalFigure);
        switch (indexFigure) {
            case 1:
                return new Square(colorSupplier.getRandomColor(),
                        random.nextInt(Limit));
            case 2:
                return new Circle(colorSupplier.getRandomColor(),
                        random.nextInt(Limit));

            case 3:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(Limit),
                        random.nextInt(Limit));
            case 4:
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(Limit),
                        random.nextInt(Limit));
            case 5:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(Limit),
                        random.nextInt(Limit),
                        random.nextInt(Limit));
            default: return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DefaultColor, DefaultSize);
    }
}

