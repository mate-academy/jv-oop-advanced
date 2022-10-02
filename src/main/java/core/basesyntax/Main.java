package core.basesyntax;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Figure> figures = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            Figure figure = new FigureSupplier().getRandomFigure();
            figures.add(figure);
        }

        Figure trapezoid = new IsoscelesTrapezoid(6,10,5,
                new ColorSupplier().getRandomColor());
        figures.add(trapezoid);
        Figure circle = new Circle(3, new ColorSupplier().getRandomColor());
        figures.add(circle);
        Figure rightTriangle = new RightTriangle(4,5,
                new ColorSupplier().getRandomColor());
        figures.add(rightTriangle);

        for (Figure f : figures) {
            f.draw();
        }
    }
}
