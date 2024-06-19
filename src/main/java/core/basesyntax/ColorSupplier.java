package core.basesyntax;
public class ColorSupplier {
  private String[] colors = {"red", "blue", "green", "yellow", "pink", "white", "black"};

    public String getRandomColor() {
        Random random = new Random();
        return colors[random.nextInt(colors.length)];
    }
}
