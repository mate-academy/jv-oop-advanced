package core.basesyntax.entities;

import core.basesyntax.service.ColorSupplier;
import java.util.Random;

public class IsoscelesTrapezoid extends Figure {
    private Double angle;
    private Integer upperBase;
    private Integer lowerBase;
    private Integer side;

    public IsoscelesTrapezoid() {
    }

    public IsoscelesTrapezoid(Random random) {
        this.random = random;
    }

    public Double getAngle() {
        return angle;
    }

    public void setAngle(Double angle) {
        this.angle = angle;
    }

    public Integer getUpperBase() {
        return upperBase;
    }

    public void setUpperBase(Integer upperBase) {
        this.upperBase = upperBase;
    }

    public Integer getLowerBase() {
        return lowerBase;
    }

    public void setLowerBase(Integer lowerBase) {
        this.lowerBase = lowerBase;
    }

    public Integer getSide() {
        return side;
    }

    public void setSide(Integer side) {
        this.side = side;
    }

    @Override
    double getArea() {
        return side * Math.sin(angle) * (lowerBase - side * Math.cos(angle));
    }

    @Override
    double getPerimeter() {
        return COEFFICIENT_TWO * side + upperBase + lowerBase;
    }

    @Override
    public String toString() {
        return "Figure: IsoscelesTrapezoid, area: " + getArea() + " sq.units"
                + ", perimeter: " + getPerimeter()
                + ", angle: " + angle
                + ", upper base: " + upperBase
                + ", lower base: " + lowerBase
                + ", side: " + side
                + ", color: " + color;
    }

    @Override
    public Figure setRandomProperties(ColorSupplier colorSupplier) {
        super.setRandomProperties(colorSupplier);
        this.angle = DOUBLE_BOUND * random.nextDouble();
        this.lowerBase = random.nextInt(BOUND);
        this.upperBase = random.nextInt(BOUND);
        this.side = random.nextInt(BOUND);
        return this;
    }
}
