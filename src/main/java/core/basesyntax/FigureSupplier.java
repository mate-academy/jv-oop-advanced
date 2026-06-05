package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final String colorDefault = "white";
    private final int radiusDefault = 10;
    private final int maxValue = 100;
    private String color = new ColorSupplier().getRandomColor();
    private int sideX = new Random().nextInt(maxValue) + 1;
    private int sideY = new Random().nextInt(maxValue) + 1;
    private int sideZ = new Random().nextInt(maxValue) + 1;

    public Figure getRandomFigure() {
        Figure[] figure = {new Square(sideX, color),
                new RightTriangle(sideX, sideY, color),
                new Rectangle(sideX, sideY, color),
                new IsoscelesTrapezoid(sideX, sideY, sideZ, color),
                new Circle(sideX, color)};
        return figure[new Random().nextInt(figure.length)];
    }

    public Figure getDefaultFigure() {
        return new Circle(radiusDefault, colorDefault);
    }
}
