package core.basesyntax;

import core.basesyntax.enums.Colors;
import core.basesyntax.figures.*;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(Colors.WHITE, 5);
        Rectangle rect = new Rectangle(Colors.RED, 10, 12);
        RightTriangle rightTriangle = new RightTriangle(Colors.GREEN, 5, 12);
        Circle circle = new Circle(Colors.AQUA, 5);
        IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid(Colors.TEAL, 6,12,4);

        square.draw();
        rect.draw();
        rightTriangle.draw();
        circle.draw();
        isoscelesTrapezoid.draw();
    }
}
