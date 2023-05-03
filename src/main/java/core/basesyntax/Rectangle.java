package core.basesyntax;

public class Rectangle extends Figure implements Drawable{

    private double firstLeg;
    private double secondLeg;
    private double thirdLeg;

    public Rectangle(String color, double firstLeg, double secondLeg, double thirdLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.thirdLeg = thirdLeg;
    }

    public double getFirstLeg() {
        return firstLeg;
    }

    public void setFirstLeg(double firstLeg) {
        this.firstLeg = firstLeg;
    }

    public double getSecondLeg() {
        return secondLeg;
    }

    public void setSecondLeg(double secondLeg) {
        this.secondLeg = secondLeg;
    }

    public double getThirdLeg() {
        return thirdLeg;
    }

    public void setThirdLeg(double thirdLeg) {
        this.thirdLeg = thirdLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Rectangle\nColor: " + getColor() + "\nFirst leg: " + thirdLeg
                + "\nSecond leg: " + secondLeg + "\nThird leg: " + thirdLeg);
    }
}
