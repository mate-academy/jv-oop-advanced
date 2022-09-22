package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    private Random random = new Random();
    
    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        ColorSupplier colorSupplier = new ColorSupplier();
        switch (figureNumber) {
            case 1:
                return new Circle(colorSupplier.getRandomColor(), random.nextInt(10));
            case 2:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), random.nextInt(10),
                        random.nextInt(10),
                        random.nextInt(10));
            case 3:
                return new Rectangle(colorSupplier.getRandomColor(), random.nextInt(10),
                        random.nextInt(10));
            case 4:
                return new RightTriangle(colorSupplier.getRandomColor(), random.nextInt(10),
                        random.nextInt(10));
            case 5:
                return new Square(colorSupplier.getRandomColor(), random.nextInt(10));
            default:
                return new Circle(colorSupplier.getRandomColor(), 10);
        }
    }
    
    public Figure getDefaultFigure() {
        return new Circle(Color.values()[0].name(), 10);
    }
}

