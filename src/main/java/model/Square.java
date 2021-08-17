package model;

public class Square extends Figure {
    private int side;

    public Square(Color color) {
        super(color);
    }

    public int getSide() {
        return side;
    }

    @Override
    public String getFigureName() {
        return "square";
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void drow() {
        System.out.println("Figure: " + getFigureName()
                + ", area: " + getArea() + " sq.units"
                + ", side: " + getSide() + " units"
                + ", color: " + getColor());
    }

    @Override
    public void setParams(int[] params, Color color) {
        setSide(params[0]);
        setColour(color);
    }
}
