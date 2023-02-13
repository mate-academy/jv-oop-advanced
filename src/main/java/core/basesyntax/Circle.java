package core.basesyntax;

public abstract class Circle implements CountArea {
    privat int radius;

    public Circle (int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void getDraw() {
        System.out.println("Figure: circle, "
                + "area: " + Math.floor(getArea()) + " sq.units, "
                + "radius: " + radius + " units, "
                + "color: " + color.toString().toLowerCase());
    }
}
