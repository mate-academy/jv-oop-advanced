package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_SIZE = 100;
    private Random random = new Random();

    public Figure getRandomFigure() {
        ColorSupplier spl = new ColorSupplier();

        String rndFigure = FiguresName.values()[random.nextInt(FiguresName.values().length)]
                .toString();

        switch (rndFigure) {
            case "Circle":
                return new Circle(random.nextInt(MAX_SIZE), spl.getRandomColor());
            case "Square":
                return new Square(random.nextInt(MAX_SIZE), spl.getRandomColor());
            case "Rectangle":
                return new Rectangle(random.nextInt(MAX_SIZE), random.nextInt(MAX_SIZE),
                        spl.getRandomColor());
            case "RightTriangle" :
                return new RightTriangle(random.nextInt(MAX_SIZE), random.nextInt(MAX_SIZE),
                        spl.getRandomColor());
            case "IsoscelesTrapezoid" :
                return new IsoscelesTrapezoid(random.nextInt(MAX_SIZE), random.nextInt(MAX_SIZE),
                        random.nextInt(MAX_SIZE), spl.getRandomColor());
            default:
                return getRandomFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, "white");
    }
}
