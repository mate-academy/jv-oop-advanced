package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private float innerSide;
    private float downSide;
    private float heightTrapezoid;

    public IsoscelesTrapezoid(float innerSide, float downSide, float heightTrapezoid,
                              String color) {
        super(color);
        this.innerSide = innerSide;
        this.downSide = downSide;
        this.heightTrapezoid = heightTrapezoid;
    }

    @Override
    public float getArea() {
        return (innerSide + downSide) / 2 * heightTrapezoid;
    }

    public String draw() {
        return "Figure: isosceles trapezoid, area: " + getArea()
                + " sq.units, innerSide: " + innerSide
                + " sq.units, downSide: " + downSide
                + " sq.units, heightTrapezoid: " + heightTrapezoid
                + " units, color: " + getColor();
    }
}
