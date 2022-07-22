package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSuplier figureSuplier = new FigureSuplier();
        Figure[] array = new Figure[6];
        for (int i = 0; i < 3; i++) {
            array[i] = figureSuplier.getRandomFigure();
            array[i + 3] = figureSuplier.getDefaultFigure();
            array[i].draw();
            array[i + 3].draw();
        }
    }
}
