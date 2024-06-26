
import buttons.mainMenu.buttonsMenu.ButtonHuman;
import buttons.mainMenu.buttonsMenu.ButtonSongs;
import buttons.mainMenu.buttonsMenu.ButtonSymbolism;
import buttons.mainMenu.buttonsMenu.ButtonsPhotos;
import buttons.mainMenu.logicsMenu.ButtonHumansHandler;
import buttons.mainMenu.logicsMenu.ButtonPhotosHandler;
import buttons.mainMenu.logicsMenu.ButtonSymbolismHandler;
import buttons.mainMenu.tabs.tabHumans;
import buttons.mainMenu.tabs.tabPhotos;
import buttons.mainMenu.tabs.tabSymbolism;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TabPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Objects;

public class Main extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Энциклопедия Ангарска от А до Я");

        // Создание главного окна;
        Group root = new Group(); // Создаем контейнер в котором будем все размещать;
        Scene scene = new Scene(root, 1280, 720, Color.BEIGE); // Устанавливаем размеры окна;
        primaryStage.setScene(scene); // Помещаем сцену в контейнер;
        primaryStage.setResizable(false); // Запрещаем менять размеры этого окна;
        primaryStage.show(); // Показываем окно пользователю;

        // Добавляем иконку к главному окну;
        primaryStage.getIcons().add(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/logo/Logo.png"))));

        // _________________________________Создание кнопок________________________________________________________

        // Создание кнопки "Ангарчане";
        Button buttonHuman = ButtonHuman.buttonHuman();
        tabHumans tabHumans = new tabHumans();
        TabPane tabPaneHuman = new TabPane(); // Создаем TabPane;
        tabPaneHuman.setLayoutX(60);
        tabPaneHuman.setLayoutY(140);
        tabHumans.setPrimaryStage(primaryStage);
        ButtonHumansHandler handlerHuman = new ButtonHumansHandler(tabPaneHuman, tabHumans);
        buttonHuman.setOnAction(handlerHuman);

        // Создание кнопки "Символика";
        Button buttonSymbolism = ButtonSymbolism.buttonSymbolism();
        tabSymbolism tubSymbolism = new tabSymbolism();
        TabPane tabPaneSymbolism = new TabPane();
        tabPaneSymbolism.setLayoutX(360);
        tabPaneSymbolism.setLayoutY(140);
        tabSymbolism.setPrimaryStage(primaryStage);
        ButtonSymbolismHandler handlerSymbolism = new ButtonSymbolismHandler(tabPaneSymbolism, tubSymbolism);
        buttonSymbolism.setOnAction(handlerSymbolism);

        // Создание кнопки "Ангарск в фотографиях";
        Button buttonPhotos = ButtonsPhotos.buttonPhotos();
        tabPhotos tabPhotos = new tabPhotos();
        TabPane tabPanePhotos = new TabPane();
        tabPanePhotos.setLayoutX(660);
        tabPanePhotos.setLayoutY(140);
        tabPhotos.setPrimaryStage(primaryStage);
        ButtonPhotosHandler handlerPhoto = new ButtonPhotosHandler(tabPanePhotos, tabPhotos);
        buttonPhotos.setOnAction(handlerPhoto);

        // Добавление логотипа Музея Победы
        Image imLogo = new Image(this.getClass().getResource("/logo/Logo.png").toString());
        ImageView Logo;
        Logo = new ImageView(imLogo);
        Logo.setPreserveRatio(true);
        Logo.setFitHeight(250);
        Logo.setFitWidth(250);
        Logo.setLayoutX(1000);
        Logo.setLayoutY(40);


        // Создание надписи "Энциклопедия Ангарска от А до Я";
        Text nameMain = new Text("Энциклопедия Ангарска от А до Я");
        nameMain.setStyle("-fx-font-family: \"Times New Roman\"; " +
                "-fx-font-size: 36pt; " +
                "-fx-font-weight: bold; " +
                "-fx-font-style: italic; ");
        nameMain.setLayoutX(280);
        nameMain.setLayoutY(500);


        root.getChildren().add(buttonPhotos);
        root.getChildren().add(buttonHuman);
        root.getChildren().add(buttonSymbolism);

        root.getChildren().add(tabPaneHuman);
        root.getChildren().add(tabPanePhotos);
        root.getChildren().add(tabPaneSymbolism);

        root.getChildren().add(nameMain);
        root.getChildren().add(Logo);
    }
}

/*
- Ось X будет от 0 до 1280 по горизонтали.
- Ось Y будет от 0 до 720 по вертикали.
*/
