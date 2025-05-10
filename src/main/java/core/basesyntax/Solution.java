package core.basesyntax;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        List<Figure> figuresArray = new ArrayList<>();
        FigureSupplier randomFigure = new FigureSupplier();
        int arrayLength = (int) (Math.random() * 50);
        for (int i = 0; i < arrayLength; i++) {
            figuresArray.add(randomFigure.getRandomFigure());
        }
        for (Figure figure : figuresArray) {
            figure.draw();
        }
    }
}
