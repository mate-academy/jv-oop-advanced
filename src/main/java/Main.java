import model.Figure;
import model.FigureSupplier;

public class Main {
    public static void main(String[] args) {
        double a = Math.random();
        double b = Math.random();
        int arrayLength = (int)Math.round(a * b * 10000) + 2;
        System.out.println(arrayLength);
        Figure[] figures = new Figure[arrayLength];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = new FigureSupplier().getRandomFigure();
        }
        for (int i = 0; i < figures.length; i++) {
            figures[i].drow();
        }
    }
}
