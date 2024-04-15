package buttons.mainMenu.logicsMenu;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import buttons.mainMenu.tabs.tabSymbolism;
public class ButtonSymbolismHandler implements EventHandler<ActionEvent> {
    private boolean isTabCreated = false;
    private final TabPane tabPane;
    private final tabSymbolism tabSymbolism;

    public ButtonSymbolismHandler(TabPane tabPane, buttons.mainMenu.tabs.tabSymbolism tabSymbolism) {
        this.tabPane = tabPane;
        this.tabSymbolism = tabSymbolism;
    }

    @Override
    public void handle(ActionEvent event) {
        if (!isTabCreated) {
            // Создаем новую вкладку только если она еще не создана
            Tab newTab = tabSymbolism.tabSymbolism();
            tabPane.getTabs().add(newTab);
            isTabCreated = true; // Устанавливаем флаг, что вкладка уже создана

            // Добавляем слушатель событий для закрытия вкладки
            newTab.setOnClosed(e -> {
                isTabCreated = false; // Сбрасываем флаг, чтобы можно было создать новую вкладку
            });
        }

    }
}
