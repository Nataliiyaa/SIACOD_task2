package AbstractFactory;

public class MacOSWindowFactory implements WindowFactory{
    @Override
    public Window createWindow() {
        return new MacOSWindow();
    }
}
