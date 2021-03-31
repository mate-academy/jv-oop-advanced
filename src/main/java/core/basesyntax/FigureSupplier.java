package core.basesyntax;

public class FigureSupplier {

    public static void getRandomFigure() {

        StringBuilder tes = new StringBuilder();
        int figureRandom;
        int j = 0;

        while (!tes.toString().equals("12345")) {
            figureRandom = (int) (Math.random() * 6 + 1);
            //System.out.println(FigureRandom);
            int a = (int) (Math.random() * 25 + 1);
            int b = (int) (Math.random() * 25 + 1);

            if (j == 1) {
                new Circle(a, ColorSupplier.getRandomColor()).drawFigure();
            }
            if (j == 2) {
                double c = Math.sqrt(a * a + b * b);
                new RightTriangle(a, b, c,ColorSupplier.getRandomColor()).drawFigure();
            }
            if (j == 3) {
                new IsoscelesTrapezoid(a, b, Math.random(),ColorSupplier.getRandomColor())
                        .drawFigure();
            }
            if (j == 4) {
                new Rectangle(a, b, ColorSupplier.getRandomColor()).drawFigure();
            }
            if (j == 5) {
                new Square(a, ColorSupplier.getRandomColor()).drawFigure();
            }

            if (figureRandom == j + 1) {
                tes.append(figureRandom);
                j++;
            }
        }

    }
}
