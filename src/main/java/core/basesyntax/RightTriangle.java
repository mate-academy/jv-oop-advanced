package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(int firstLeg,int secondLeg,String color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.setColor(color);
    }

    public void setFirstLeg(int firstLeg) {
        this.firstLeg = firstLeg;
    }

    public int getFirstLeg() {
        return firstLeg;
    }

    public void setSecondLeg(int secondLeg) {
        this.secondLeg = secondLeg;
    }

    public int getSecondLeg() {
        return secondLeg;
    }

    @Override
    public double calculateArea() {
        return this.firstLeg * this.secondLeg / 2;
    }

    @Override
    public void draw() {
        super.draw();
        String string = ", firstleg: " + firstLeg + " units,";
        string += " secondleg: " + secondLeg + " units, color:" + this.getColor();
        System.out.println(string);
    }
}
