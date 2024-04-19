package testBattons;

import buttons.mainMenu.tabs.tabHumans;
import javafx.application.Platform;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class TabHumansTest {
    private static Stage primaryStage; // Добавляем статическое поле для ссылки на primaryStage
    public static void setPrimaryStage(Stage stage) {
        primaryStage = stage;
    }
    @BeforeClass
    public static void initToolkit() {
        // Инициализация JavaFX Toolkit
        Platform.startup(() -> {});
    }
    @Test
    public void testTabCreation() {

        // Устанавливаем primaryStage
        tabHumans.setPrimaryStage(primaryStage);

        // Вызываем метод tabHumans() для создания вкладки
        Tab tab = tabHumans.tabHumans();

        // Проверяем, что метод tabHumans() возвращает объект типа Tab
        assertNotNull(tab);

        // Проверяем, что вкладка содержит нужное количество дочерних элементов (кнопок)
        assertEquals(5, ((VBox) tab.getContent()).getChildren().size());

        // Проверяем, что вкладка содержит нужные кнопки
        assertTrue(checkButtonExists(tab, "Почетные граждане"));
        assertTrue(checkButtonExists(tab, "Их именами названы улицы"));
        assertTrue(checkButtonExists(tab, "Их именами названы учреждения"));
        assertTrue(checkButtonExists(tab, "Герои Советского Союза"));
        assertTrue(checkButtonExists(tab, "Герои Соц труда"));
    }
    // Метод для проверки наличия кнопки с указанным текстом внутри вкладки
    private boolean checkButtonExists(Tab tab, String buttonText) {
        VBox contentPane = (VBox) tab.getContent();
        for (javafx.scene.Node node : contentPane.getChildren()) {
            if (node instanceof Button) {
                Button button = (Button) node;
                if (button.getText().equals(buttonText)) {
                    return true;
                }
            }
        }
        return false;
    }
}
