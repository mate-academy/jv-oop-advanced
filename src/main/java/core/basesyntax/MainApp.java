package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        int arraysLength = (int)(1 * Math.random() * 10);
        Figure[] figures = new Figure[arraysLength];

        for (int i = 0; i < figures.length; i++) {
            figures[i] = new FigureSupplier().getRandomFigure();
            figures[i].setArea(figures[i].areaCalculator());
        }

        for (Figure figure : figures) {
            System.out.println(figure);
        }
    }
}
