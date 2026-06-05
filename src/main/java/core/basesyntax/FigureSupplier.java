package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public Figure getRandomFigure() {
        String color = new ColorSupplier().getRandomColor();
        int sideX = new Random().nextInt(100) + 1;
        int sideY = new Random().nextInt(100) + 1;
        int sideZ = new Random().nextInt(100) + 1;

        Figure[] figure = {new Square(sideX, color),
                new RightTriangle(sideX, sideY, color),
                new Rectangle(sideX, sideY, color),
                new IsoscelesTrapezoid(sideX, sideY, sideZ, color),
                new Circle(sideX, color)};
        int random = new Random().nextInt(figure.length);
        return figure[random];
    }

    public Figure getDefaultFigure() {
        return new Circle(10, Color.WHITE.name());
    }
}
