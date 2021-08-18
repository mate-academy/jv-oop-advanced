package core.basesyntax;

public class RightTriangle extends Figure {
    private ColorSupplier colorSupplier = new ColorSupplier();
    private String name;
    private String color;
    private int firsLeg;
    private int secondLeg;

    public RightTriangle() {
        this.name = "right triangle";
        this.color = colorSupplier.getRandomColor();
        this.firsLeg = (int)(Math.random() * 100);
        this.secondLeg = (int)(Math.random() * 100);
    }

    public int getFirsLeg() {
        return firsLeg;
    }

    public void setFirsLeg(int firsLeg) {
        this.firsLeg = firsLeg;
    }

    public int getSecondLeg() {
        return secondLeg;
    }

    public void setSecondLeg(int secondLeg) {
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return firsLeg * secondLeg / 2.0;
    }

    @Override
    public String drow() {
        return "Figure: " + name + ", area: " + getArea() + " sq.units, "
                    + "firstLeg: " + firsLeg + " units, " + "secondLeg: "
                    + secondLeg + " units, " + "color: " + color;
    }
}
