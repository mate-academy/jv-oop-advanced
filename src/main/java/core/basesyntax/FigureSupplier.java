package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();
    private static final int FIGURE_COUNT = Figures.values().length;

    public Figure getRandomFigure() {
        int index = random.nextInt(FIGURE_COUNT);
        Figure figure;
        switch (index) {
            case 0:
                figure = new Square(random.nextInt(100),colorSupplier.getRandomColor());
                break;
            case 1:
                figure = new Rectangle(random.nextInt(100), random.nextInt(100),
                        colorSupplier.getRandomColor());
                break;
            case 2:
                figure = new RightTriangle(random.nextInt(100), random.nextInt(100),
                        colorSupplier.getRandomColor());
                break;
            case 3:
                figure = new Circle(random.nextInt(100), colorSupplier.getRandomColor());
                break;
            case 4:
                figure = new IsoscelesTrapezoid(random.nextInt(100), random.nextInt(100),
                        random.nextInt(100), colorSupplier.getRandomColor());
                break;
            default:
                figure = new FigureSupplier().getRandomFigure();
                break;
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        return new Circle(10, "white");
    }
}
