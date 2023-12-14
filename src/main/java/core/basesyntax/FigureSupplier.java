package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int SET_VALUE = 10;
    public static final int MAX_FOR_FIGURE = 15;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    private Figure[] getArrayFigures() {
        Figure circle = new Circle(colorSupplier.getRandomColor(),random.nextInt(MAX_FOR_FIGURE));
        Figure trapezoid = new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                random.nextInt(MAX_FOR_FIGURE),random.nextInt(MAX_FOR_FIGURE),
                random.nextInt(MAX_FOR_FIGURE));
        Figure rectangle = new Rectangle(colorSupplier.getRandomColor(),
                random.nextInt(MAX_FOR_FIGURE),random.nextInt(MAX_FOR_FIGURE));
        Figure triangle = new RightTriangle(colorSupplier.getRandomColor(),
                random.nextInt(MAX_FOR_FIGURE),random.nextInt(MAX_FOR_FIGURE));
        Figure square = new Square(colorSupplier.getRandomColor(),random.nextInt(MAX_FOR_FIGURE));
        Figure[] figures = new Figure[]{circle,trapezoid,rectangle,triangle,square};
        return figures;
    }

    public Figure getRandomFigure() {
        int index = random.nextInt(getArrayFigures().length);
        return getArrayFigures()[index];
    }

    public Figure getDefaultFigure() {
        return new Circle((Color.WHITE).name(),SET_VALUE);
    }
}
