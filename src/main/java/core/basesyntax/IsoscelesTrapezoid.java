package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private float innerSide;
    private float downSide;
    private float heightTrapezoid;

    public IsoscelesTrapezoid(float innerSide, float downSide, float heightTrapezoid) {
        this.innerSide = innerSide;
        this.downSide = downSide;
        this.heightTrapezoid = heightTrapezoid;
    }

    @Override
    public float area() {
        return (innerSide + downSide) / 2 * heightTrapezoid;
    }

    public String draw() {
        return "Figure: isosceles trapezoid, area: " + area()
                + " sq.units, innerSide: " + innerSide
                + " sq.units, downSide: " + downSide
                + " sq.units, heightTrapezoid: " + heightTrapezoid
                + " units, color: " + getColor();
    }
}
