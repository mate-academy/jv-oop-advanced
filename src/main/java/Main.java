import core.basesyntax.Figure;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Figure[] figures = new Figure[new Random().nextInt(15)];
        for (int i = 0; i < shape.length; i++) {
            shape[i] = new FigureSupplier().getFigure();
        }

        for (Figure i : shape) {
            System.out.println(i.draw());
        }
    }
}
