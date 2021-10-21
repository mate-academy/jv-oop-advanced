package core.basesyntax;

public class Circle extends Figure implements AreaObtainer, InfoPrinter {
    private int radius;

    public Circle(String color, int radius) {
        this.radius = radius;
        setColor(color);
    }

    @Override
    public double areaCalculater() {
        return Math.round(Math.PI * radius * radius * 100) / 100;
    }

    @Override
    public void infoDrawer() {
        System.out.println("Figure: circle, area: " + areaCalculater() + " sq.units, radius: "
                + radius + " units, color " + getColor());
    }
}
