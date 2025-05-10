package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int firstBase;
    private int secondBase;
    private int height;

    public IsoscelesTrapezoid(int firstBase,int secondBase,int height,String color) {
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.height = height;
        this.setColor(color);
    }

    public void setFirstBase(int firstBase) {
        this.firstBase = firstBase;
    }

    public int getFirstBase() {
        return firstBase;
    }

    public void setSecondBase(int secondBase) {
        this.secondBase = secondBase;
    }

    public int getSecondBase() {
        return secondBase;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public double calculateArea() {
        return ((firstBase + secondBase) * height / 2);
    }

    @Override
    public void draw() {
        super.draw();
        String string = ", firstbase: " + firstBase + " units,";
        string += " secondbase: " + secondBase + " units, color:" + getColor();
        System.out.println(string);
    }
}
