package model;

public class RightTriangle extends Figure {
    private int baseA;
    private int height;

    public RightTriangle(int[] params, Color color) {
        super(color);
        setBaseA(params[0]);
        setHeight(params[1]);
        setColour(color);
    }

    public int getBaseA() {
        return baseA;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String getFigureName() {
        return "triangle";
    }

    public void setBaseA(int baseA) {
        this.baseA = baseA;
    }

    public void setHeight(int sideC) {
        this.height = sideC;
    }

    @Override
    public double getArea() {
        return (baseA) * height * 0.5;
    }

    @Override
    public void drow() {
        System.out.println("Figure: " + getFigureName()
                + ", area: " + getArea() + " sq.units"
                + ", firstLeg: " + getBaseA() + " units"
                + ", secondLeg: " + getHeight() + " units"
                + ", color: " + getColor());
    }

    public void setParams(int[] params, Color color) {
        setBaseA(params[0]);
        setHeight(params[1]);
        setColour(color);
    }
}
