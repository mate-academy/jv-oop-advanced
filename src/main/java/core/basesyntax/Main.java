package core.basesyntax;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Figures> figuresList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            figuresList.add(FigureSupplier.figuresRandomGenerator());
        }

        for (Figures object : figuresList) {
            object.draw();
        }
    }
}
