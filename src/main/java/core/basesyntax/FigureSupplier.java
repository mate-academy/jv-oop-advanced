package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 6;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();
    
    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        Figure figure;
        switch (figureNumber) {
            case 1:
                figure = new Square(colorSupplier.getRandomColor(),
                        random.nextInt(20));
                break;
            case 2:
                figure = new Circle(colorSupplier.getRandomColor(),
                        random.nextInt(20));
                break;
            case 3:
                figure = new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(20), random.nextInt(20));
                break;
            case 4:
                figure = new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(20), random.nextInt(20));
                break;
            case 5:
                figure = new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(20), random.nextInt(20), random.nextInt(20));
                break;
            default:
                return null;
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), 10);
    }
}
