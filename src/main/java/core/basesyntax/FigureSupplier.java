package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    private Random random = new Random();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        // generate a specific figure based on the `figureNumber` value
        ColorSupplier color = new ColorSupplier();
        Figure randomFigure = new Circle(10.0);
        randomFigure.setColor(color.getRandomColor());
        switch (figureNumber) {
            case 0:
                randomFigure = new Circle(random.nextDouble(100));
                break;
            case 1:
                randomFigure = new Rectangle(random.nextDouble(100), random.nextDouble(100));
                break;
            case 2:
                randomFigure = new RightTriangle(random.nextDouble(100), random.nextDouble(100));
                break;
            case 3:
                randomFigure = new Square(random.nextDouble(100));
                break;
            case 4:
                randomFigure = new IsoscelesTrapezoid(random.nextDouble(100),
                        random.nextDouble(100),random.nextDouble(100));
                break;
            default:
                return randomFigure;
        }
        randomFigure.setColor(color.getRandomColor());
        return randomFigure;
    }

    public Figure getDefaultFigure() {
        Figure defaultFigure = new Circle(10);
        defaultFigure.setColor("WHITE");
        return defaultFigure;
    }
}
