package buttons.mainMenu.tabs;

import buttons.mainMenu.tabs.Symbolism.windowCoatCitizen;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Tab;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class tabSymbolism {
    private static Stage primaryStage; // Добавляем статическое поле для ссылки на primaryStage
    public static void setPrimaryStage(Stage stage) {
        primaryStage = stage;
    }
    public static Tab tabSymbolism () {
        Tab newTab = new Tab();

        Button coatBTN = buttons.mainMenu.tabs.logicsTabsButtons.coatBTN.btnCoat();
        coatBTN.setOnAction(new windowCoatCitizen(primaryStage));

        Button flagBTN = buttons.mainMenu.tabs.logicsTabsButtons.flagBTN.btnFlag();

        VBox contentPane = new VBox(coatBTN, flagBTN);

        newTab.setContent(contentPane);

        return newTab;
    }
}
