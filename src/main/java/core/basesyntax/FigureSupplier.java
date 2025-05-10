package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 4;
    private Random random = new Random();

    public Figure getRandomFigure() {
        Color color = new ColorSupplier().getRandomColor();
        int index = new Random().nextInt(FIGURE_COUNT);
        TypeOfFigure figure = TypeOfFigure.values()[index];

        if (figure.equals(TypeOfFigure.CIRCLE)) {
            return new Circle(color, random.nextInt(10) + 1);
        } else if (figure.equals(TypeOfFigure.SQUARE)) {
            return new Square(color, random.nextInt(10) + 1);
        } else if (figure.equals(TypeOfFigure.TRIANGLE)) {
            return new RightTriangle(color, random.nextInt(10) + 1);
        } else {
            return new IsoscelesTrapezoid(color, random.nextInt(10) + 1,
                    + random.nextInt(10) + 1, random.nextInt(10) + 1);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.ORANGE, 10);
    }
}
