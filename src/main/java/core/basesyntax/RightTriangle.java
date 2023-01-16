package core.basesyntax;

public class RightTriangle extends Figure {
    int firstLeg;
    int secondLeg;

    public RightTriangle(String color, String name, int firstLeg, int secondLeg) {
        super(color, name);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public void draw() {
        int area;
        area = firstLeg*secondLeg/2;
        System.out.println("Figure: " + getName() + ",  area: " + area+"sq.units" + "  firstLeg: " + firstLeg+"units" +  "  secondLeg: " + secondLeg+"units" + "  color: " + getColor());
    }
}
