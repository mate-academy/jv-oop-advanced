package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public Figure getRandomFigure() {
        double side = new Random().nextInt(100);
        Color color = new ColorSupplier().getRandomColor();
        Figure[] figuresArr = {new Circle(side, color), new Rectangle(side, side, color),
                new Square(side, color), new IsoscelesTrapezoid(side, side, side, color),
                new RightTriangle(side, side, color)};
        return figuresArr[new Random().nextInt(figuresArr.length)];
    }

    public Figure getDefaultFigure() {
        return new Circle(10, Color.WHITE);
    }
}
