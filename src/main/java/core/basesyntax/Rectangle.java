package core.basesyntax;

public class Rectangle extends Figure {
    private int sideA;
    private int sideB;

    public Rectangle(int sideA, int sideB, String color, String nameFigure) {
        super(color, nameFigure);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    @Override
    public double getArea() {
        return this.sideA * this.sideB;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getNameFigures() + ", area: "
                + getArea() + " sq. units, sideA length: " + getSideA()
                + " units" + ", sideB length: " + getSideB()
                + " units, color: " + getColor());
    }
}
