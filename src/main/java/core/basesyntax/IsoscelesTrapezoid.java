package core.basesyntax;

import static java.lang.Math.sin;

public class IsoscelesTrapezoid extends Figure {
    private int radiusInscribedCircle;
    private int angleBase;

    public IsoscelesTrapezoid(String color, int radiusInscribedCircle, int angleBase) {
        this.radiusInscribedCircle = radiusInscribedCircle;
        this.color = color;
        this.angleBase = angleBase;
    }

    @Override
    public double getArea() {

        return 4 * (radiusInscribedCircle * radiusInscribedCircle) / sin(angleBase);
    }

    @Override
    public void draw() {
        System.out.println("We have the figure isosceles trapezoid with the angle at the base "
                  + angleBase + " and the radius of the inscribed circle "
                  + radiusInscribedCircle + " with area "
                  + 4 * (radiusInscribedCircle * radiusInscribedCircle) / sin(angleBase)
                  + " and color " + color);
    }
}
