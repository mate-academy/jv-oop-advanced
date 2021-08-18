package core.basesyntax;

public class FigureSupplier {

    public double getNum() {
        return Math.random() * 5 + 1;
    }

    public Figures getRandomFigure() {
        String randomColor = new ColorSupplier().getRandomColor();
        double randomNumber = Math.random() * 4 + 1;
        if ((int)randomNumber == 1) {
            return new Square(randomColor, (int) getNum());
        } else if ((int) randomNumber == 2) {
            return new Rectangle(randomColor, (int) getNum(), (int) getNum());
        } else if ((int)randomNumber == 3) {
            return new RightTriangle(randomColor, (int) getNum(), (int) getNum());
        } else if ((int)randomNumber == 5) {
            return new IsoscelesTrapezoid(randomColor, (int) getNum(), (int) getNum(),
                    (int) getNum());
        } else {
            return new Circle(randomColor, (int) getNum());
        }
    }
}
