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
        String randomColor = new ColorSupplier().getRandomColor();
        int randomNumber = new Random().nextInt(20) + 1;

        Figure circle = new Circle(randomColor, randomNumber);
        Figure isoscelesTrapezoid = new IsoscelesTrapezoid(randomColor, randomNumber,
                randomNumber, randomNumber);
        Figure rectangle = new Rectangle(randomColor, randomNumber, randomNumber);
        Figure rightTriangle = new RightTriangle(randomColor, randomNumber, randomNumber);
        Figure square = new Square(randomColor, randomNumber);

        Figure[] figure = {circle, isoscelesTrapezoid, rectangle, rightTriangle, square};
        int randomIndex = new Random().nextInt(5);

        return figure[randomIndex];
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}
