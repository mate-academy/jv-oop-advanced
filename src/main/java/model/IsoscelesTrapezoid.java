package model;

public class IsoscelesTrapezoid extends Figure {
    private int baseA;
    private int baseB;
    private int height;

    public IsoscelesTrapezoid(int[] params, Color color) {
        super(color);
        setBaseA(params[0]);
        setBaseB(params[1]);
        setHeight(params[2]);
        setColour(color);
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
                + ", first side: " + getBaseA() + " units"
                + ", second side:  " + getBaseB() + " units"
                + ", height: " + getHeight() + " units"
                + ", color: " + getColor());
    }

    public void setParams(int[] params, Color color) {
        setBaseA(params[0]);
        setBaseB(params[1]);
        setHeight(params[2]);
        setColour(color);
    }
}
