package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int base1;
    private int base2;
    private int height;
    public void setBase1(int base1) {
        this.base1 = base1;
    }
    public void setBase2(int base2) {
        this.base2 = base2;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public int getBase1() {
        return base1;
    }
    public int getBase2() {
        return base2;
    }
    public int getHeight() {
        return height;
    }
    @Override
    public void draw() {
        System.out.println( "isoscelesTrapezoid, " +
                "area: " + getArea() + "sq. units, " +
                "upperBase: " + base1 + "units, " +
                "lowerBase: " + base2 + "units, " +
                "height: " + height  + "units, " +
                "color: " + getColor());
    }
    @Override
    public int getArea() {
        return (base1 + base2) * height / 2;
    }
}
