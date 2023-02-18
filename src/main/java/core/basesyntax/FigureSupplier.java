package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {

        Figure figure;
        switch (getRandomFigures()) {
            case CIRCLE:
                figure = new Circle(random.nextInt(100), colorSupplier.getRandomColor());
                break;
            case ISOSCELESTRAPEZOID:
                figure = new IsoscelesTrapezoid(random.nextInt(100), random.nextInt(100),
                        random.nextInt(100), colorSupplier.getRandomColor());
                break;
            case RECTANGLE:
                figure = new Rectangle(random.nextInt(100), random.nextInt(100),
                        colorSupplier.getRandomColor());
                break;
            case RIGHTTRIANGLE:
                figure = new RightTriangle(random.nextInt(100),
                        random.nextInt(100), colorSupplier.getRandomColor());
                break;
            default:
                figure = new Square(random.nextInt(100), colorSupplier.getRandomColor());
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        return new Circle(10, Color.WHITE.name());
    }

    private Figures getRandomFigures() {
        int index = random.nextInt(Figures.values().length);
        return Figures.values()[index];
    }
}
