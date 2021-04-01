import core.basesyntax.Figure;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Figure[] shape = new Figure[new Random().nextInt(15)];
        for (int i = 0; i < shape.length; i++) {
            shape[i] = new FigureSupplier().getFigure();
        }
        for (Figure figure : shape) {
            System.out.println(figure.draw());
        }
    }
}
