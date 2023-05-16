package core.basesyntax;

import java.util.Random;

public class RightTriangle extends Figure implements FigureBehaviour {

    private final int MAXLEG = 100;
    private int firstLeg;
    private int secondLeg;
    private final Random random = new Random();


    public RightTriangle() {
        this.setName("triangle");
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
        return this.firstLeg*this.secondLeg/2;
    }

    @Override
    public void setRandomProperties() {
        super.setRandomProperties();
        this.setFirstLeg(this.random.nextInt(MAXLEG));
        this.setSecondLeg(this.random.nextInt(MAXLEG));
    }

    @Override
    public void draw() {
        StringBuilder builder = new StringBuilder(this.getName());
        builder.append(", area: ");
        builder.append(String.format("%.2f", this.obtainArea()));
        builder.append(" sq.units, color ");
        builder.append("firstleg: ");
        builder.append(this.getFirstLeg());
        builder.append(" units, ");
        builder.append("secondleg: ");
        builder.append(this.getFirstLeg());
        builder.append(" units, color: ");
        builder.append(this.getColor());
        System.out.println(builder.toString());
    }
}
