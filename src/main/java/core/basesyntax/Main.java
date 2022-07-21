package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Figure[] array = new Figure[6];
        array[0] = new FigureSuplier().getRandomFigure();
        array[1] = new FigureSuplier().getRandomFigure();
        array[2] = new FigureSuplier().getRandomFigure();
        array[3] = new FigureSuplier().getDefaultFigure();
        array[4] = new FigureSuplier().getDefaultFigure();
        array[5] = new FigureSuplier().getDefaultFigure();
        for (int i = 0; i < 6; i++) {
            System.out.println(array[i].draw());
        }
    }
}
