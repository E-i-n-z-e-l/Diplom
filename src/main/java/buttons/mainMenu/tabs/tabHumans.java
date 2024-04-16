package buttons.mainMenu.tabs;

import buttons.mainMenu.tabs.HonoraryCitizen.windowHonoraryCitizen;
import buttons.mainMenu.tabs.logicsTabsButtons.honoraryCitizensBTN;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Tab;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class tabHumans {
    private static Stage primaryStage; // Добавляем статическое поле для ссылки на primaryStage
    public static void setPrimaryStage(Stage stage) {
        primaryStage = stage;
    }
    public static Tab tabHumans() {
        Tab newTab = new Tab();

        // Добавляем кнопки в табличку;

        Button honoraryCitizensBTN = buttons.mainMenu.tabs.logicsTabsButtons.honoraryCitizensBTN.honoraryBTN();
        honoraryCitizensBTN.setOnAction(new windowHonoraryCitizen(primaryStage));

        Button streetsBTN = buttons.mainMenu.tabs.logicsTabsButtons.streetsBTN.btnsreets();


        Button institutionsBTN = buttons.mainMenu.tabs.logicsTabsButtons.streetsBTN.btnsreets();


        Button heroesBTN = buttons.mainMenu.tabs.logicsTabsButtons.streetsBTN.btnsreets();


        Button socialBTN = buttons.mainMenu.tabs.logicsTabsButtons.streetsBTN.btnsreets();

        VBox contentPane = new VBox(honoraryCitizensBTN, streetsBTN, institutionsBTN, heroesBTN, socialBTN);

        newTab.setContent(contentPane);

        return newTab;
    }
}
