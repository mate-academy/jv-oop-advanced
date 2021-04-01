import core.basesyntax.Figure;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[new Random().nextInt(15)];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = new FigureSupplier().getFigure();
        }
        for (Figure figure : figures) {
            System.out.println(figure.draw());
        }
    }
}
