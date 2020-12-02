package core.basesyntax;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Information {
    static void showAllFigure(List<Figure> list) {
        for (Figure figure : list) {
            System.out.println(figure.draw());
        }
    }

    public static void main(String[] args) {
        List<Figure> list = new ArrayList<>();
        for (int i = 0; i < new Random().nextInt(20); i++) {
            list.add(FabricFigure.createRandomFigure());
        }
        showAllFigure(list);

    }
}
