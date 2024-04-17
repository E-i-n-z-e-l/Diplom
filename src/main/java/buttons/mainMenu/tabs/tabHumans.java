package buttons.mainMenu.tabs;

import buttons.mainMenu.tabs.Citizen.windowHonoraryCitizen;
import buttons.mainMenu.tabs.Citizen.windowInstitutionsCitezen;
import buttons.mainMenu.tabs.Citizen.windowStreetsCitezen;
import javafx.scene.control.Button;
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
        streetsBTN.setOnAction(new windowStreetsCitezen(primaryStage));

        Button institutionsBTN = buttons.mainMenu.tabs.logicsTabsButtons.institutionsBTN.btnInstitutions();
        institutionsBTN.setOnAction(new windowInstitutionsCitezen(primaryStage));

        Button heroesBTN = buttons.mainMenu.tabs.logicsTabsButtons.heroesBTN.btnheroes();


        Button socialBTN = buttons.mainMenu.tabs.logicsTabsButtons.socialBTN.btnsocial();

        VBox contentPane = new VBox(honoraryCitizensBTN, streetsBTN, institutionsBTN, heroesBTN, socialBTN);

        newTab.setContent(contentPane);

        return newTab;
    }
}
