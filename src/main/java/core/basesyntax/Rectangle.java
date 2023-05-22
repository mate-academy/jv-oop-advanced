package core.basesyntax;

public class Rectangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public Rectangle(int firstValue,int secondValue) {
        this.setName("rectangle");
        this.firstLeg = firstValue;
        this.secondLeg = secondValue;
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
    public double obtainArea() {
        return this.getFirstLeg() * this.getSecondLeg();
    }

    @Override
    public void draw() {
        super.draw();
        String string = ", firstleg: " + this.getFirstLeg() + " units,";
        string += " secondleg: " + this.getSecondLeg() + " units, color:" + this.getColor();
        System.out.println(string);
    }
}
