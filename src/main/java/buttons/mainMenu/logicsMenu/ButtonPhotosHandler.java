package buttons.mainMenu.logicsMenu;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import buttons.mainMenu.tabs.tabPhotos;
public class ButtonPhotosHandler implements EventHandler<ActionEvent> {
    private boolean isTabCreated = false;
    private final TabPane tabPane;
    private final tabPhotos tabPhotos;

    public ButtonPhotosHandler(TabPane tabPane, buttons.mainMenu.tabs.tabPhotos tabPhotos) {
        this.tabPane = tabPane;
        this.tabPhotos = tabPhotos;
    }

    @Override
    public void handle(ActionEvent event) {
        if (!isTabCreated) {
            // Создаем новую вкладку только если она еще не создана
            Tab newTab = tabPhotos.tabPhotos();
            tabPane.getTabs().add(newTab);
            isTabCreated = true; // Устанавливаем флаг, что вкладка уже создана

            // Добавляем слушатель событий для закрытия вкладки
            newTab.setOnClosed(e -> {
                isTabCreated = false; // Сбрасываем флаг, чтобы можно было создать новую вкладку
            });
        }

    }
}
