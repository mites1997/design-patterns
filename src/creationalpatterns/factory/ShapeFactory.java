package creationalpatterns.factory;

public class ShapeFactory {
    public Shape getFood(String type) {
        if (type == null)
            return null;
        if (type == "Round")
            return new Pizza();
        if (type == "Cylinder")
            return new Burrito();
        else
            throw new IllegalArgumentException("Unknown Shape");
    }
}
