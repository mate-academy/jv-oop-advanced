package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();
    private final int sideOfFigureA = random.nextInt(1,10);
    private final int sideOfFigureB = random.nextInt(1,10);
    private final int height = random.nextInt(1, 10);

    public Figure getRandomFigure() {
        Figure[] figure = new Figure[] {new Square("square",
                sideOfFigureA, colorSupplier.getRandomColor()),
                new RightTriangle("RightTriangle", sideOfFigureA, sideOfFigureB,
                colorSupplier.getRandomColor()),
                new Circle("circle", sideOfFigureA,
                colorSupplier.getRandomColor()),
                new Rectangle("rectangle", sideOfFigureA, sideOfFigureB,
                colorSupplier.getRandomColor()),
                new IsoscelesTrapezoid("IsoscelesTrapezoid", sideOfFigureA, sideOfFigureB,
                height, colorSupplier.getRandomColor())};
        int index = random.nextInt(figure.length);
        return figure[index];
    }

    public Figure getDefault() {
        return new Circle("DefaultCircle", 10,
                Color.WHITE.toString().toLowerCase());
    }
}
