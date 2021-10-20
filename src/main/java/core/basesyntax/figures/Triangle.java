package core.basesyntax.figures;

public class Triangle extends Figure implements Special {
    private int radius;

    public Triangle(String name, String color, int radius) {
        super(name, color);
        this.radius = radius;
    }

    @Override
    public void about() {
        System.out.println("Figure " + getName()
                + ", with color " + getColor()
                + ", and " + radius + " radius" + ", has legs " + hasLeg());
    }

    @Override
    public boolean hasLeg() {
        return true;
    }

}
