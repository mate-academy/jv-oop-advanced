package core.basesyntax.figure;

public class Square extends Figure {
    private int sideA;

    public Square(int sideA, String color) {
        this.sideA = sideA;
        super.setFigureColor(color);
    }

    public void getSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideA() {
        return sideA;
    }

    @Override
    public double getArea() {
        return Math.pow(sideA, 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: square. Area: " + getArea()
                + " sq.units. Side: " + getSideA()
                + " units. Color: " + getFigureColor() + "\n");
    }
}
