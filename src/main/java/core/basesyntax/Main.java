package core.basesyntax;
import java.util.Random;

public class Main {
    public final static int COUNTFIGURES = 10;

    public static void main(String[] args) {
        Random random = new Random();
        Figure[] allFigure = new Figure[random.nextInt(COUNTFIGURES)];

        for(int i = 0; i < allFigure.length; i++) {
            allFigure[i] = new FigureSupplier().getFigure();
        }

        for(Figure f : allFigure) {
            f.draw();
        }
    }
}
