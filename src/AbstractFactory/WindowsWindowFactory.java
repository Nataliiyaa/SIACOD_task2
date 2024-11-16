package AbstractFactory;

public class WindowsWindowFactory implements WindowFactory{
    @Override
    public Window createWindow() {
        return new WindowsWindow();
    }
}
