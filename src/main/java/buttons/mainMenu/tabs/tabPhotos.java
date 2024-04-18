package buttons.mainMenu.tabs;

import buttons.mainMenu.tabs.Symbolism.windowCoatCitizen;
import buttons.mainMenu.tabs.photoCitizen.windowHistoricalPhoto;
import buttons.mainMenu.tabs.photoCitizen.windowModernPhoto;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Tab;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class tabPhotos {
    private static Stage primaryStage; // Добавляем статическое поле для ссылки на primaryStage
    public static void setPrimaryStage(Stage stage) {
        primaryStage = stage;
    }
    public static Tab tabPhotos() {
        Tab newTab = new Tab();

        Button modernPhotoBTN = buttons.mainMenu.tabs.logicsTabsButtons.modernPhotoBTN.modernbtn();
        modernPhotoBTN.setOnAction(new windowModernPhoto(primaryStage));

        Button historicalPhotoBTN = buttons.mainMenu.tabs.logicsTabsButtons.historicalPhotoBTN.hisoricalbtn();
        historicalPhotoBTN.setOnAction(new windowHistoricalPhoto(primaryStage));

        VBox contentPane = new VBox(modernPhotoBTN, historicalPhotoBTN);

        newTab.setContent(contentPane);
        return newTab;
    }
}
