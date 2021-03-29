package core.basesyntax.state;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;

public class FigureSupplier {
    private static String []figureArr = {"Circle", "Isosceles Trapezoid", "Rectangle",
            "Right Triangle", "Square"};

    public static Figure getRandomFigure() {
        int rndNum = (int)(Math.random() * figureArr.length);

        if (rndNum == 0) {
            return new Circle(figureArr[rndNum]);
        } else if (rndNum == 1) {
            return new IsoscelesTrapezoid(figureArr[rndNum]);
        } else if (rndNum == 2) {
            return new Rectangle(figureArr[rndNum]);
        } else if (rndNum == 3) {
            return new RightTriangle(figureArr[rndNum]);
        } else {
            return new Square(figureArr[rndNum]);
        }
    }
}
