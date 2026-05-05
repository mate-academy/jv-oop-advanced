package core.basesyntax;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        FigureSupplier figureSupplier = new FigureSupplier();

        int[] sides = new int[]{
                RandomUtils.getRandomInt(Constants.RANDOM_MAX_NUMBER),
                RandomUtils.getRandomInt(Constants.RANDOM_MAX_NUMBER),
                RandomUtils.getRandomInt(Constants.RANDOM_MAX_NUMBER)
        };

        List<Figure> figures = new ArrayList<>();
        figures.add(figureSupplier.getRandomFigure(sides));
        figures.add(figureSupplier.getRandomFigure(sides));
        figures.add(figureSupplier.getRandomFigure(sides));
        figures.add(figureSupplier.getDefaultFigure());
        figures.add(new Rectangle(Color.BLACK, 10, 20));
        figures.add(new RightTriangle(Color.BLACK, 12, 15));

        figures.forEach(Figure::draw);
    }

}
