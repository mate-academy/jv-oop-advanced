package core.basesyntax.temp;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private Figure rightTriangle = new RightTriangle();
    private Figure isoscelesTrapezoid = new IsoscelesTrapezoid();
    private Figure square = new Square();
    private Figure circle = new Circle();
    private Figure rectangle = new Rectangle();
    private Figure[] figure = new Figure[]{rightTriangle,
            isoscelesTrapezoid, square, circle, rectangle};

    public Figure getRandomFigure() {
        int index = new Random().nextInt(figure.length);
        Figure randomFigure = figure[index];
        randomFigure.setColor(new ColorSupplier().getRandomColor());

        fillFields(randomFigure.getFields());
        randomFigure.calculatingSquare();
        return randomFigure;
    }

    public double [] fillFields(double [] fields) {
        for (int i = 0; i < fields.length; i++) {
            double index = new Random().nextDouble();
            fields[i] = index;
        }
        return fields;
    }

    public Figure getDefaultFigure() {
        Figure figure = new Circle();
        figure.setColor("WHITE");
        figure.setDefaultRadius(10.0);
        figure.calculatingSquare();
        return figure;
    }
}
