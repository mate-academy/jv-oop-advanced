package model;

public class IsoscelesTrapezoid extends Figure implements FiguresBehaviour {
    private int baseA;
    private int baseB;
    private int height;

    public IsoscelesTrapezoid(String color) {
        super(color);
    }

    public int getBaseA() {
        return baseA;
    }

    public int getBaseB() {
        return baseB;
    }

    public int getHeight() {
        return height;
    }

    public String getFigureName() {
        return "isosceles trapezoid";
    }

    public void setBaseA(int baseA) {
        this.baseA = baseA;
    }

    public void setBaseB(int baseB) {
        this.baseB = baseB;
    }

    public void setHeight(int sideC) {
        this.height = sideC;
    }

    @Override
    public double getArea() {
        return (baseA + baseB) * height * 0.5;
    }

    @Override
    public void drow() {
        System.out.println("Figure: " + getFigureName()
                + ", area: " + getArea() + " sq.units"
                + ", firstLeg: " + getBaseA() + " units"
                + ", secondLeg:  " + getBaseB() + " units"
                + ", height: " + getHeight() + " units"
                + ", color: " + getColor());
    }

    @Override
    public void setParams(int[] params) {
        setBaseA(params[0]);
        setBaseB(params[1]);
        setHeight(params[2]);
    }
}
