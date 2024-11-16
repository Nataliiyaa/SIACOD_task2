package AbstractFactory;

public class LinuxWindowFactory implements WindowFactory{
    @Override
    public Window createWindow() {
        return new LinuxWindow();
    }
}
