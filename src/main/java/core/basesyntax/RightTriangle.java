package core.basesyntax;

public class RightTriangle extends Figure {
    private ColorSupplier colorSupplier = new ColorSupplier();
    private String name = "right triangle";
    private String color = colorSupplier.getRandomColor();
    private int firsLeg = (int)(Math.random() * 100);
    private int secondLeg = (int)(Math.random() * 100);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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
    public void drow() {
        System.out.println("Figure: " + name + ", area: " + getArea() + " sq.units, "
                    + "firstLeg: " + firsLeg + " units, " + "secondLeg: "
                    + secondLeg + " units, " + "color: " + color);
    }
}
