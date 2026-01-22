package core.basesyntax;

public abstract class Figure {
    private Color color;
    private Unit[] units;

    public Color getColor() {
        return color;
    }

    public class Unit {
        String type;
        int length;

        public Unit(String type, int length) {
            this.type = type;
            this.length = length;
        }
    }

    public abstract Unit[] getUnits ();
}
