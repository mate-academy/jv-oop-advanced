package core.basesyntax;

public class RightTriangle extends Figure implements Drawing {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(String name, double area, double firstLeg,
                         double secondLeg, String color) {
        super(name, area, color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public RightTriangle(String name, double area, String color) {
        super(name, area, color);
    }

    public double getFirstLeg() {
        return firstLeg;
    }

    public double getSecondLeg() {
        return secondLeg;
    }

    @Override
    public void draw() {
        System.out.println(new StringBuilder().append("Figure: ").append(getName())
                .append(", ").append("area: ").append(getArea()).append(", ")
                .append("firstLeg: ").append(getFirstLeg()).append(", ")
                .append("secondLeg: ").append(getSecondLeg()).append(", ")
                .append("color: ").append(getColor()).toString());
    }
}
