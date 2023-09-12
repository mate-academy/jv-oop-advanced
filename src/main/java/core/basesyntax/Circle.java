package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public int areaCalculation() {
        return (int) (Math.PI * radius * radius);
    }

    @Override
    public void ableToDraw() {
        System.out.println(
                "Figure : circle, area: "
                        + areaCalculation()
                        + " sq.units, "
                        + "radius: "
                        + radius
                        + " units, "
                        + "color: "
                        + color);
    }

}
