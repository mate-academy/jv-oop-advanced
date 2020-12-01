package core.basesyntax;

import core.basesyntax.model.Figure;
import core.basesyntax.model.FigureGenerator;
import java.util.List;

public class Main {

    public static void main(String...args) {
        printFigures(FigureGenerator.generateRandomFigureList());
    }

    private static void printFigures(List<Figure> listOfFigures) {
        for (Figure figure : listOfFigures) {
            System.out.println(figure.draw());
        }
    }
}
