package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
  int aSide;
  int bSide;
  int height;

    public IsoscelesTrapezoid(String color, String name, int aSide, int bSide, int height) {
        super(color, name);
        this.aSide = aSide;
        this.bSide = bSide;
        this.height = height;
    }

    public void draw() {
        int area;
        area = (aSide + bSide)*height/2;
        System.out.println("Figure: " + getName() + ",  area: " + area+"sq.units" + "  aSide: " + aSide+"units" + "  color: " + getColor());
    }
}
