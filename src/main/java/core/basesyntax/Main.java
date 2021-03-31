package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Figure[] figuresList = new Figure[(int) (Math.random() * 23)];
        for (int i = 0; i < figuresList.length; i++) {
            figuresList[i] = new FigureSupplier().randomFigure();
        }

        for (int i = 0; i < figuresList.length; i++) {
            System.out.println(figuresList[i].figureDraw());
        }
    }
}
