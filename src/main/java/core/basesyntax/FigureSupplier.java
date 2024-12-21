package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    public Figure getDefaultFigure() {
        Figure circle = new Circle("white", 10);
        return circle;
    }

    public Figure getRandomFigure() {
        ColorSupplier colorSupplier = new ColorSupplier();
        String color = colorSupplier.getRandomColor();
        Figure [] figures = new Figure[5];
        Random random = new Random();
        int size = random.nextInt(90) + 10;
        figures[0] = new Square(color,size);
        figures[1] = new Circle(color,size);
        figures[2] = new Rectangle(color,size,size);
        figures[3] = new IsoscelesTrapezoid(color,size, size,size);
        figures[4] = new RightTriangle(color,size,size);
        return figures[random.nextInt(figures.length)];
    }
}
