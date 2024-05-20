package Classu;

public class ZagruzkaOs extends ZagruzkaAb {

    public void loading() {
        // Імітація завантаження на 10 секунд
        try {
            System.out.println("Завантаження розпочалось...");
            Thread.sleep(5000); // Затримка на 5 секунд
            System.out.println("Завантаження завершено.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
