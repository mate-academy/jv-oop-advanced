package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {

    private int firstBase;
    private int secondBase;
    private int height;

    public IsoscelesTrapezoid(int firstBase,int secondBase,int height) {
        this.setName("isosceles trapezoid");
        this.setFirstBase(firstBase);
        this.setSecondBase(secondBase);
        this.setHeight(height);
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
    public double obtainArea() {
        return ((this.firstBase + this.secondBase) * this.height / 2);
    }

    @Override
    public void draw() {
        super.draw();
        StringBuilder builder = new StringBuilder();
        builder.append(", firstbase: ");
        builder.append(this.getFirstBase());
        builder.append(" units, secondbase: ");
        builder.append(getSecondBase());
        builder.append(" units, height: ");
        builder.append(this.getHeight());
        builder.append(" units");
        System.out.println(builder.toString());
    }
}
