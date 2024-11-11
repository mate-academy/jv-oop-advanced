package core.basesyntax.service;

import core.basesyntax.model.*;

import java.util.Random;

public class FigureSupplier {

    public Figure getRandomFigure() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Random random = new Random();

        Figure circle = new Circle(colorSupplier.getRandomColor(), random.nextDouble());
        Figure rectangle = new Rectangle(colorSupplier.getRandomColor(), random.nextDouble(), random.nextDouble());
        Figure isoscelesTrapezoid = new IsoscelesTrapezoid(colorSupplier.getRandomColor(), random.nextDouble(), random.nextDouble(), 4);
        Figure rightTriangle = new RightTriangle(colorSupplier.getRandomColor(), random.nextDouble(), random.nextDouble());
        Figure square = new Square(colorSupplier.getRandomColor(), random.nextDouble());

        Figure[] figures = {
                circle, rectangle,
                isoscelesTrapezoid,
                rightTriangle, square};

        return figures[random.nextInt(figures.length)];
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.White.name(), 2);
    }
}
