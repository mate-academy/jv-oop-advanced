package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int LIMIT = 10;

    public Figure getRandomFigure() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Random random = new Random();
        Figure[] figures = new Figure[]
                {new Circle(colorSupplier.getRandomColor(), random.nextInt(LIMIT)),
                new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(LIMIT), random.nextInt(LIMIT)),
                new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(LIMIT), random.nextInt(LIMIT),random.nextInt(LIMIT)),
                new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(LIMIT), random.nextInt(LIMIT)),
                new Square(colorSupplier.getRandomColor(), random.nextInt(LIMIT))};

        int index = new Random().nextInt(5);
        return figures[index];
    }

    public Figure getDefaultFigure() {
        Figure whiteCircle = new Circle(Color.WHITE.toString(), 10);
        return whiteCircle;
    }
}
