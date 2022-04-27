package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_INT = 2147483647;
    private Random random = new Random();
    private Figure[] figures = { new Circle(random.nextInt(MAX_INT)),
            new IsoscelesTrapezoid(random.nextInt(MAX_INT),
                    random.nextInt(MAX_INT),
                    random.nextInt(MAX_INT)),
            new Rectangle(random.nextInt(MAX_INT),
                    random.nextInt(MAX_INT)),
            new RightRectangle(random.nextInt(MAX_INT),
                    random.nextInt(MAX_INT)),
            new Square(random.nextInt(MAX_INT)) };

    public Figure getRandomFigure() {
        int randomFiguresIndex = random.nextInt(figures.length);
        return figures[randomFiguresIndex];
    }

    public Figure getDefaultFigure() {
        Figure defaultFigure = new Circle(10);
        defaultFigure.setColor(Color.WHITE.toString());
        return defaultFigure;
    }
}
