package core.basesyntax;

public class Rectangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public Rectangle(int firstValue,int secondValue,String color) {
        this.firstLeg = firstValue;
        this.secondLeg = secondValue;
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
        return getFirstLeg() * getSecondLeg();
    }

    @Override
    public void draw() {
        super.draw();
        String string = ", firstleg: " + this.firstLeg + " units,";
        string += " secondleg: " + secondLeg + " units, color:" + getColor();
        System.out.println(string);
    }
}
