package core.basesyntax;

import java.util.ArrayList;

public class Solution {

    public static void main(String[] args) {
        ArrayList<Figure> figuresArray = new ArrayList<>();
        FigureSupplier randomFigure = new FigureSupplier();
        int arrayLength = (int) ((Math.random() * 10) * (Math.random() * 10));
        for (int i = 0; i < arrayLength; i++) {
            figuresArray.add(randomFigure.getRandomFigure());
        }
        for (Figure figure : figuresArray) {
            figure.draw();
        }
    }
}
