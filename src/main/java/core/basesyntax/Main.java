package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        
        int[] mas = new int[5];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < mas.length; i++) {
            if (i <= mas.length / 2) {
                System.out.println(figureSupplier.getRandomFigure((int) (Math.random() * (4))));
            } else {
                System.out.println(figureSupplier.getRandomFigure(0));
            }
            
        }
    }
}
