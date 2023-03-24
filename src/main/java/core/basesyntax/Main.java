package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[4];
        for (int a = 0; a < figures.length; a++) {
            if (a <= figures.length / 2) {
                figures[a] = FigureSupplier.getRandomFigure();
                figures[a].color = figures[a].getColor();
                figures[a].area = figures[a].getArea();
                String data = figures[a].getData();
                System.out.println(data);
            } else {
                figures[a] = FigureSupplier.getDefaultFigure();
                figures[a].color = Color.WHITE.toString();
                figures[a].area = figures[a].getArea();
                figures[a].data = figures[a].getData();
                System.out.println(figures[a].data);
            }
        }
    }
}
