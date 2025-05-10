package model;

public class Rectangle extends Figure {
    private int sideA;
    private int sideB;

    public Rectangle(int[] params, Color color) {
        super(color);
        setSideA(params[0]);
        setSideB(params[1]);
        setColour(color);
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
    public String getFigureName() {
        return "rectangle";
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }

    @Override
    public void drow() {
        System.out.println("Figure: " + getFigureName()
                + ", area: " + getArea() + " sq.units"
                + ", firstLeg: " + getSideA() + " units"
                + ", secondLeg:  " + getSideB() + " units"
                + ", color: " + getColor());
    }

    public void setParams(int[] params, Color color) {
        setSideA(params[0]);
        setSideB(params[1]);
        setColour(color);
    }

}
