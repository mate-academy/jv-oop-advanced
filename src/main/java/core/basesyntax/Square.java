package core.basesyntax;

public class Square extends Figure {
    private final int sideS;
    private String squareColor = new Figure().getColor();

    public Square(int sideS, String color) {
        this.sideS = sideS;
        this.squareColor = color;
    }

    @Override
    public double getArea() {
        return sideS * sideS;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + getArea() + " sq. units, sideS: " + sideS
                + " units, color: " + squareColor);
    }
}
