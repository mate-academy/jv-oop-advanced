package core.basesyntax.figures;

public abstract class Figure implements Drawingtool, AreaCalculator {
    private String colour;

    public Figure(String colour) {
        this.colour = colour;
    }

    @Override
    public void draw() {
        System.out.println(this);
    }

    public String getColour() {
        return colour;
    }
}
