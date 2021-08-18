package core.basesyntax;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
//    Square s = new Square();
//    s.setColor(new ColorSupplier().getRandomColor());
//    s.draw();
        Figure f = new FigureSupplier().getRandomFigure();

        Figure s1 = new Square();

        System.out.println(f.getColor());
    }
}
