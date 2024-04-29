package core.basesyntax;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;

public class HelloWorld {
    public static void main(String[] args) {
        Figure defCircle = new Circle().getDefaultFigure();

        for (int i = 1; i <= 6; i++) {
            if (i < 4) {
                chooseFigure((int)(Math.random() * 6) + 1);
            } else {
                defCircle.draw();
            }
        }
    }

    private static void chooseFigure(int a) {
        switch (a) {
            case 1:
                new Circle().draw();
                break;
            case 2:
                new IsoscelesTrapezoid().draw();
                break;
            case 3:
                new Rectangle().draw();
                break;
            case 4:
                new RightTriangle().draw();
                break;
            case 5:
                new Square().draw();
                break;
            default:
                break;
        }
    }
}
