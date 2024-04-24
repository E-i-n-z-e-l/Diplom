package buttons.mainMenu.tabs.photoCitizen;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Tooltip;
import javafx.scene.effect.BlendMode;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.util.Objects;

public class windowModernPhoto implements EventHandler<ActionEvent> {
    private Stage primaryStage;

    public windowModernPhoto(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }
    @Override
    public void handle(ActionEvent event) {
        primaryStage.setOpacity(0);
        Stage newStage = new Stage(); // Создаем новое окно
        newStage.initOwner(primaryStage); // Устанавливаем основное окно владельцем нового окна;
        newStage.setResizable(false);
        newStage.initModality(Modality.WINDOW_MODAL); // Устанавливаем режим модального окна (новое окно будет блокировать основное окно до закрытия);

        newStage.setOnCloseRequest(e -> {
            primaryStage.setOpacity(1);
            primaryStage.show();
        });

        Pane pane = new Pane(); // Используем Pane;
        pane.setPrefSize(1280, 720); // Устанавливаем размеры Pane равные размерам основного окна;

        // Устанавливаем цвет фона сцены;
        pane.setBackground(new Background(new BackgroundFill(Color.BEIGE, null, null)));

        Text modernPhoto = new Text("Современные фотографии города");
        modernPhoto.setStyle("-fx-font-family: \"Times New Roman\"; " +
                "-fx-font-size: 36pt; " +
                "-fx-font-weight: bold; " +
                "-fx-font-style: italic; ");
        modernPhoto.setLayoutX(270);
        modernPhoto.setLayoutY(35);

        Image photoLOK = new Image(this.getClass().getResource("/photoCity/modern/LOK.jpg").toString());
        ImageView LOK;
        LOK = new ImageView(photoLOK);
        LOK.setPreserveRatio(true);
        LOK.setFitHeight(750);
        LOK.setFitWidth(750);
        LOK.setLayoutX(250);
        LOK.setLayoutY(120);

        Image photoEFL = new Image(this.getClass().getResource("/photoCity/modern/EFL.jpg").toString());
        ImageView EFL;
        EFL = new ImageView(photoEFL);
        EFL.setPreserveRatio(true);
        EFL.setFitHeight(750);
        EFL.setFitWidth(750);
        EFL.setLayoutX(250);
        EFL.setLayoutY(120);

        Image photoFontan = new Image(this.getClass().getResource("/photoCity/modern/fontanParkStroiteley.jpg").toString());
        ImageView Fontan;
        Fontan = new ImageView(photoFontan);
        Fontan.setPreserveRatio(true);
        Fontan.setFitHeight(750);
        Fontan.setFitWidth(750);
        Fontan.setLayoutX(250);
        Fontan.setLayoutY(120);

        Image photoHram = new Image(this.getClass().getResource("/photoCity/modern/Hram.jpg").toString());
        ImageView Hram;
        Hram = new ImageView(photoHram);
        Hram.setPreserveRatio(true);
        Hram.setFitHeight(750);
        Hram.setFitWidth(750);
        Hram.setLayoutX(250);
        Hram.setLayoutY(120);

        // Создаем список;
        ObservableList<String> PhotoCitizens = FXCollections.observableArrayList(
                "Выберите название фотографии","Ночной город",
                "Утро в городе", "Фонтан в парке Строителей", "Свято-Троицкий кафедральный собор");
        ChoiceBox<String> choice = new ChoiceBox<String>(PhotoCitizens);
        choice.setLayoutX(10);
        choice.setLayoutY(10);
        choice.setBlendMode(BlendMode.HARD_LIGHT);
        choice.setCursor(Cursor.CLOSED_HAND);
        DropShadow effect=new DropShadow();
        effect.setOffsetX(8);
        effect.setOffsetY(8);
        choice.setEffect(effect);
        choice.setStyle("-fx-text-fill:#000000;" +
                "-fx-border-width:5pt;" +
                "-fx-border-color:#d2691e;" +
                "-fx-font:bold italic 14pt Georgia;");
        choice.setPrefSize(750, 50);
        choice.setTooltip(new Tooltip("Выберите название фотографии"));
        choice.getSelectionModel().selectFirst();

        choice.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            public void changed(ObservableValue<? extends String> ov, String old_val, String new_val) {
                if (new_val.equals("Выберите название фотографии")) {
                    LOK.setVisible(false);
                    EFL.setVisible(false);
                    Fontan.setVisible(false);
                    Hram.setVisible(false);
                }
                if(new_val.equals("Ночной город")){
                    LOK.setVisible(true);
                    EFL.setVisible(false);
                    Fontan.setVisible(false);
                    Hram.setVisible(false);
                }
                if(new_val.equals("Утро в городе")){
                    LOK.setVisible(false);
                    EFL.setVisible(true);
                    Fontan.setVisible(false);
                    Hram.setVisible(false);
                }
                if(new_val.equals("Фонтан в парке Строителей")){
                    LOK.setVisible(false);
                    EFL.setVisible(false);
                    Fontan.setVisible(true);
                    Hram.setVisible(false);
                }
                if (new_val.equals("Свято-Троицкий кафедральный собор")) {
                    LOK.setVisible(false);
                    EFL.setVisible(false);
                    Fontan.setVisible(false);
                    Hram.setVisible(true);
                }
            }
        });
        choice.setLayoutX(50);
        choice.setLayoutY(50);


        pane.getChildren().add(choice);
        pane.getChildren().add(modernPhoto);
        pane.getChildren().add(LOK);
        pane.getChildren().add(EFL);
        pane.getChildren().add(Fontan);
        pane.getChildren().add(Hram);


        // Скрываем при открытии нового окна всю информацию;
        LOK.setVisible(false);
        EFL.setVisible(false);
        Fontan.setVisible(false);
        Hram.setVisible(false);


        // Создаем сцену и устанавливаем контент в новое окно
        Scene scene = new Scene(pane);
        newStage.setScene(scene);
        newStage.setTitle("Герб города Ангарска");
        newStage.getIcons().add(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/icons/icon.png"))));

        primaryStage.toFront(); // Перемещаем исходное окно вверх стека окон
        newStage.show();
    }
}
