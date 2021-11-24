package core.basesyntax;

public class Square extends Figure {
    private double oneLeg;
    private String color;

    public double getOneLeg() {
        return oneLeg;
    }

    public void setOneLeg(double oneLeg) {
        this.oneLeg = oneLeg;
    }

    @Override
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Square(double oneLeg, String color) {
        this.color = color;
        this.oneLeg = oneLeg;
    }

    @Override
    public double getArea() {
        return oneLeg * oneLeg;
    }

    @Override
    public void getDraw() {
        System.out.println("Figure " + "rectangle "
                + "area: " + getArea()
                + " sq.units,  firstLeg: "
                + oneLeg + " units,"
                + " color: " + getColor().toLowerCase());
    }
}
