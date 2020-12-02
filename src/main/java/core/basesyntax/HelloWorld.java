package core.basesyntax;

import java.util.Random;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {

    public static void main(String[] args) {
        Figure circle = new Circle();
        Figure square = new Square();
        Figure rectangle = new Rectangle();
        Figure rightTriangle = new RightTriangle();
        Figure isoscelesTrapezoid = new IsoscelesTrapezoid();

        FigureProducer figureProducer = new FigureProducer();
        Figure [] figures = new Figure[new Random().nextInt(10)];
        for (int i = 0; i < figures.length; i++) {
            figures [i] = figureProducer.get();
        }
        printAll(figures);
    }

    private static void printAll(Figure[] figures) {
        for (Figure figure: figures) {
            figure.printParameter();
        }
    }

}
