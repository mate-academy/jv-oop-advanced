package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_RADIUS = 10;
    private FigureList object;
    private Figure randomFigure;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        int index = random.nextInt(FigureList.values().length);
        object = FigureList.values()[index];
        switch (object) {
            case CIRCLE:
                randomFigure = new Circle(random.nextInt(20));
                randomFigure.setColor(colorSupplier.getRandomColor());
                break;
            case ISOSCELESTRAPEZOID:
                randomFigure = new IsoscelesTrapezoid(random.nextInt(20),
                        random.nextInt(10), random.nextInt(10));
                randomFigure.setColor(colorSupplier.getRandomColor());
                break;
            case RECTANGLE:
                randomFigure = new Rectangle(random.nextInt(10), random.nextInt(20));
                randomFigure.setColor(colorSupplier.getRandomColor());
                break;
            case RIGHTTRIANGLE:
                randomFigure = new RightTriangle(random.nextInt(20), random.nextInt(20));
                randomFigure.setColor(colorSupplier.getRandomColor());
                break;
            default:
                randomFigure = new Square(random.nextInt(20));
                randomFigure.setColor(colorSupplier.getRandomColor());
        }
        return randomFigure;
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(),DEFAULT_RADIUS);
    }
}
