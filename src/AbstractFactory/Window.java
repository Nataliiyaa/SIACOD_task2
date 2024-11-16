package AbstractFactory;

public abstract class Window {
    public abstract void repaint();
    public abstract void toggleExpand();
    public abstract void move(int x, int y);
    public abstract void resize(int height, int width);
}
