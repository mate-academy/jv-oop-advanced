package core.basesyntax;

public class Rectangle extends Figure {
    private int sideA;
    private int sideB;

    Rectangle(){
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea()
                            + " sq.units, first side: " + sideA + " units, second side: "
                            + sideB + " units, color: " + color);
    }
}
