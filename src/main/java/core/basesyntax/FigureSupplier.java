package core.basesyntax;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    public Figure getRandomFigure() {
        ColorSupplier randomColor = new ColorSupplier();

        Figure circle = new Circle(randomColor.getRandomColor(), "Circle", new Random().nextInt(20) + 1);
        Figure isoscelesTrapezoid = new IsoscelesTrapezoid(randomColor.getRandomColor(),
                "Isosceles trapezoid", new Random().nextInt(20) + 1, new Random().nextInt(20) + 1,
                new Random().nextInt(20) + 1);
        Figure rectangle = new Rectangle(randomColor.getRandomColor(),"Rectangle",
                new Random().nextInt(20) + 1, new Random().nextInt(20) + 1);
        Figure rightTriangle = new RightTriangle(randomColor.getRandomColor(), "Right triangle",
                new Random().nextInt(20) + 1, new Random().nextInt(20) + 1);
        Figure square = new Square(randomColor.getRandomColor(), "Square", new Random().nextInt(20) + 1);

        Figure[] figure = {circle, isoscelesTrapezoid, rectangle, rightTriangle, square};
        int randomIndex = new Random().nextInt(5);

        return figure[randomIndex];
    }

    public Figure getDefaultFigure() {
        return new Circle("white", "", 10);
    }
}
