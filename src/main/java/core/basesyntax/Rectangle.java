
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
        StringBuilder builder = new StringBuilder();
        builder.append("firstleg: ");
        builder.append(this.getFirstLeg());
        builder.append(" units, ");
        builder.append("secondleg: ");
        builder.append(this.getSecondLeg());
        builder.append(" units ");
        builder.append(", color: ");
        builder.append(this.getColor());
        System.out.println(builder.toString());
    }
}