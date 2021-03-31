package core.basesyntax;

public class RightTrieangle extends FigureMain implements AreaMethod, Draw {
    private int base;
    private int perpendicular;

    public RightTrieangle(String name, String color, int base, int perpendicular) {
        super(name, color);
        this.base = base;
        this.perpendicular = perpendicular;
    }

    public void setName(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    @Override
    public double getArea() {
        return (double) (base * perpendicular) / 2;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getPerpendicular() {
        return perpendicular;
    }

    public void setPerpendicular(int perpendicular) {
        this.perpendicular = perpendicular;
    }

    @Override
    public void draw() {
        System.out.println("Figure : "
                + getName() + ", area: "
                + getArea() + " sq.units, radius : "
                + getBase() + ", perpendicular : "
                + getPerpendicular()
                + ", color : "
                + getColor());
    }
}
