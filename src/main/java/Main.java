import model.Figure;
import model.FigureSupplier;

public class Main {
    public static void main(String[] args) {
        int arrayLength = (int)Math.round(Math.random() * Math.random() * 100000) + 2;
        Figure[] figures = new Figure[arrayLength];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = new FigureSupplier().getRandomFigure();
            figures[i].drow();
        }
    }
}
