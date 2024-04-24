package buttons.mainMenu.tabs;

import buttons.mainMenu.tabs.Citizen.*;
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
        heroesBTN.setOnAction(new windowHeroesCitizen(primaryStage));

        Button socialBTN = buttons.mainMenu.tabs.logicsTabsButtons.socialBTN.btnsocial();
        socialBTN.setOnAction(new windowHeroesWork(primaryStage));

        VBox contentPane = new VBox(honoraryCitizensBTN, streetsBTN, institutionsBTN, heroesBTN, socialBTN);
        newTab.setContent(contentPane);
        return newTab;
    }
}
