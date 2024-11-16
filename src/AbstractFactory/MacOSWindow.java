package AbstractFactory;

public class MacOSWindow extends Window{
    @Override
    public void repaint() {
        System.out.println("Перерисовываем окно в macOS...");
    }

    @Override
    public void toggleExpand() {
        System.out.println("Сворачиваем/Развертываем окно в macOS...");
    }

    @Override
    public void move(int x, int y) {
        System.out.println("Перемещаем окно в macOS...");
    }

    @Override
    public void resize(int height, int width) {
        System.out.println("Изменяем размер окна в macOS...");
    }
}
