package core.basesyntax;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ColorSupplier supplier = new ColorSupplier();
        double number = new Random().nextDouble(5);
        Figure[] figures = new Figure[] {
                new Circle(number, supplier.getRandomColor()),
                new Rectangle(number, number, supplier.getRandomColor()),
                new RightTriangle(number, number, supplier.getRandomColor()),
                new Square(number, number, supplier.getRandomColor()),
                new IsoscelesTrapezoid(number, number, number, supplier.getRandomColor()),
                new FigureSupplier().getDefaultFigure()
        };

        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
