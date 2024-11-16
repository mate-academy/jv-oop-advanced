package core.basesyntax;

public String getRandomColor() {
    public Color getRandomedColor() {
         int i = new Random().nextInt(Color.values().length);
         return Color.values()[i];
    }
}