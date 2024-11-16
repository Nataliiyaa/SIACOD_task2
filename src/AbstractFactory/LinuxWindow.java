package AbstractFactory;

public class LinuxWindow extends Window{
    @Override
    public void repaint() {
        System.out.println("Перерисовываем окно в Linux...");
    }

    @Override
    public void toggleExpand() {
        System.out.println("Сворачиваем/Развертываем окно в Linux...");
    }

    @Override
    public void move(int x, int y) {
        System.out.println("Перемещаем окно в Linux...");
    }

    @Override
    public void resize(int height, int width) {
        System.out.println("Изменяем размер окна в Linux...");
    }
}
