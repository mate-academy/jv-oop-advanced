package core.basesyntax;

import java.util.List;
import java.util.Random;

public class FigureSupplier {
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int random = new Random().nextInt(10) + 1;
        int randomSecond = new Random().nextInt(10) + 1;
        Color color = colorSupplier.getRandomColor();
        List<Figure> figures = List.of(
                new Square(color, random),
                new RightTriangle(color, random, randomSecond),
                new Rectangle(color, random, randomSecond),
                new IsoscelesTrapezoid(color, random, randomSecond, random),
                new Circle(color, random));

        return figures.get(new Random().nextInt(figures.size()));
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, 10.0);
    }
}
