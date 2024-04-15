package buttons.mainMenu.logicsMenu;

import buttons.mainMenu.tabs.tabHumans;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;

public class ButtonHumansHandler implements EventHandler<ActionEvent> {
    private boolean isTabCreated = false;
    private final TabPane tabPane;
    private final tabHumans tabHumans;

    public ButtonHumansHandler(TabPane tabPane, buttons.mainMenu.tabs.tabHumans tabHumans) {
        this.tabPane = tabPane;
        this.tabHumans = tabHumans;
    }


    @Override
    public void handle(ActionEvent event) {
        if (!isTabCreated) {
            // Создаем новую вкладку только если она еще не создана
            Tab newTab = tabHumans.tabHumans();
            tabPane.getTabs().add(newTab);
            isTabCreated = true; // Устанавливаем флаг, что вкладка уже создана

            // Добавляем слушатель событий для закрытия вкладки
            newTab.setOnClosed(e -> {
                isTabCreated = false; // Сбрасываем флаг, чтобы можно было создать новую вкладку
            });
        }

    }
}
