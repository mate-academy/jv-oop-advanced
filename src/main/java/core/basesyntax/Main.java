package core.basesyntax;

import core.basesyntax.figure.Figure;
import core.basesyntax.figure.IsoscelesTrapezoid;
import core.basesyntax.figure.Rectangle;
import core.basesyntax.figure.RightTriangle;
import core.basesyntax.figure.Square;
import core.basesyntax.supplier.ColorSupplier;
import core.basesyntax.supplier.FigureSupplier;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        ColorSupplier colorSupplier = new ColorSupplier();

        Figure trapezoid = new IsoscelesTrapezoid(
                "Isosceles Trapezoid", colorSupplier.getRandomColor(),
                figureSupplier.getRandomFigureProperties(),
                figureSupplier.getRandomFigureProperties(),
                figureSupplier.getRandomFigureProperties()
        );

        Figure rectangle = new Rectangle(
                "Rectangle", colorSupplier.getRandomColor(),
                figureSupplier.getRandomFigureProperties(),
                figureSupplier.getRandomFigureProperties()
        );

        Figure square = new Square("Square", colorSupplier.getRandomColor(),
                figureSupplier.getRandomFigureProperties()
        );

        Figure rightTriangle = new RightTriangle("Right Triangle", colorSupplier.getRandomColor(),
                figureSupplier.getRandomFigureProperties(),
                figureSupplier.getRandomFigureProperties()
        );

        Figure[] figure = {trapezoid, rectangle, square, rightTriangle,
                figureSupplier.getDefaultFigure(), figureSupplier.getDefaultFigure()};
        for (Figure figures : figure) {
            figures.draw();
        }
    }
}
