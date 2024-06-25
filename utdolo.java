public class Circle implements Shape {
    private Container container;

    public Circle(Container container) {
        this.container = container;
    }

    public Container getContainer() {
        return container;
    }
}
