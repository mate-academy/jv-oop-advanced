package core.basesyntax;

import core.basesyntax.model.Circle;
import core.basesyntax.model.IsoscelesTrapezoid;
import core.basesyntax.model.Rectangle;
import core.basesyntax.model.RightTriangle;
import core.basesyntax.model.Square;
import core.basesyntax.model.abstraction.Color;
import core.basesyntax.model.abstraction.Figure;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {
    public static void main(String[] args) {

        Circle circle = new Circle(Color.PURPLE,3);
        Square square = new Square(Color.ORANGE,5);
        Rectangle rectangle = new Rectangle(Color.RED,2,1);
        IsoscelesTrapezoid trapezoid = new IsoscelesTrapezoid(Color.BLACK,1,2,3);
        RightTriangle rightTriangle = new RightTriangle(Color.GREEN,2,3);

        Figure[] figures = {circle, square, rectangle, trapezoid, rightTriangle};
        for (Figure figure : figures) {
            System.out.println(figure.drawFigure());
        }
    }
}
