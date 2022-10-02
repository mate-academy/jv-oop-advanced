package core.basesyntax;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Figure> figures = new ArrayList<>();
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < 3; i++) {
            Figure figure = figureSupplier.getRandomFigure();
            figures.add(figure);
        }
        ColorSupplier colorSupplier = new ColorSupplier();
        Figure trapezoid = new IsoscelesTrapezoid(6,10,5,
                colorSupplier.getRandomColor());
        figures.add(trapezoid);
        Figure circle = new Circle(3, colorSupplier.getRandomColor());
        figures.add(circle);
        Figure rightTriangle = new RightTriangle(4,5,
                colorSupplier.getRandomColor());
        figures.add(rightTriangle);

        for (Figure f : figures) {
            f.draw();
        }
    }
}
