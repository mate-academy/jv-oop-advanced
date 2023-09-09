package core.basesyntax;

public class RightTriangle extends Figure implements AreaCalculator, InformationDrawer {
    private final int base;
    private final int height;

    public RightTriangle(Colors color, int base, int height) {
        this.color = color;
        this.base = base;
        this.height = height;
    }

    @Override
    public int areaCalculator() {
        return base * height / 2;
    }

    @Override
    public void informationCalculator() {
        String triangleInformation = "Figure: right triangle, area: " + areaCalculator() + "sq.units, base: " + this.base + " units, height: " + this.height + " units, color: " + color;
        System.out.println(triangleInformation);
    }

}
