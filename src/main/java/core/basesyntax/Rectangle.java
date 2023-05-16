package core.basesyntax;

import java.util.Random;

public class Rectangle extends RightTriangle implements FigureBehaviour {

    private final int MAXLEG = 100;
    private final Random random = new Random();

    public Rectangle() {
        this.setName("rectangle");
    }

    @Override
    public double obtainArea() {
        return this.getFirstLeg()*this.getSecondLeg();
    }

    @Override
    public void setRandomProperties() {
        super.setRandomProperties();
        this.setFirstLeg(this.random.nextInt(MAXLEG));
        this.setSecondLeg(this.random.nextInt(MAXLEG));
    }

}
