package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        final int ARAYLENGTH = 60;
        Figure[] arr  = new Figure[ARAYLENGTH];
        int halfArr = ARAYLENGTH - (ARAYLENGTH / 2);
        for (int i = 0; i < ARAYLENGTH / 2; i++) {
            switch (FigureSupplier.getRandomFigureName()) {
                case ("CIRCLE"):
                    arr[i] = FigureSupplier.getRandomFigure(new Circle());
                    break;
                case ("SQUARE"):
                    arr[i] = FigureSupplier.getRandomFigure(new Square());
                    break;
                case ("RECTANGLE"):
                    arr[i] = FigureSupplier.getRandomFigure(new Rectangle());
                    break;
                case ("RIGHTTRIANGLE"):
                    arr[i] = FigureSupplier.getRandomFigure(new RightTriangle());
                    break;
                case ("ISOSCELESTRAPEZOID"):
                    arr[i] = FigureSupplier.getRandomFigure(new IsoscelesTrapezoid());
                    break;
                default:
                    System.out.println("Some wrong");
            }
            System.out.println(arr[i]);
        }
        for (int i = halfArr; i < ARAYLENGTH; i++) {
            arr[i] = FigureSupplier.getDefaultFigure();
            System.out.println(arr[i]);
        }
    }
}
