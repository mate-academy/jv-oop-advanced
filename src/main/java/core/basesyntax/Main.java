package core.basesyntax;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[new Random().nextInt(7) + 1];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = FigureProducer.get();
            System.out.println("Figure: " + figures[i].getClass().getTypeName().substring(16)
                    + ", area: " + figures[i].getArea() + ", info: " + figures[i].getParametrInfo()
                    + ", color: " + figures[i].getColor());
        }
    }
}
