package core.basesyntax;

public class RightTriangle extends Figure{
    private int heightTriangle;
    private int base;
    public RightTriangle(String color, int heightTriangle, int base) {
        super(color);
        this.heightTriangle = heightTriangle;
        this.base = base;
    }

    public int getHeightTriangle() {
        return heightTriangle;
    }

    public void setHeightTriangle(int heightTriangle) {
        this.heightTriangle = heightTriangle;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    @Override
    public double getArea() {
        return (base * heightTriangle) / 2 ;
    }

    @Override
    public void drawable() {
        System.out.println("This figure is RightTriangle area " + getArea() + " square units" + " and properties: " +
                getBase() + ", " +
                getHeightTriangle());
    }
}
