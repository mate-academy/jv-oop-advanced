package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureProducer figureProducer = new FigureProducer();
        Figure [] figures = new Figure[RandomLongProducer.get()];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = figureProducer.get();
            System.out.println(figures[i].draw());
        }
    }
}
