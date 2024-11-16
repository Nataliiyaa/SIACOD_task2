package AbstractFactory;

public class Main {
    public static void main(String[] args) {
        // Создание окна для Windows
        WindowFactory factory = new WindowsWindowFactory();
        Window window = factory.createWindow();
        window.repaint();

        // Создание окна для Linux
        factory = new LinuxWindowFactory();
        window = factory.createWindow();
        window.toggleExpand();

        // Создание окна для macOS
        factory = new MacOSWindowFactory();
        window = factory.createWindow();
        window.move(100, 100);
    }
}
