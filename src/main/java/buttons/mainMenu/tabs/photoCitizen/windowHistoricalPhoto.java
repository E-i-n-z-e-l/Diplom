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

public class windowHistoricalPhoto implements EventHandler<ActionEvent> {
    private Stage primaryStage;

    public windowHistoricalPhoto(Stage primaryStage) {
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

        Text historicalPhoto = new Text("Исторические фотографии города");
        historicalPhoto.setStyle("-fx-font-family: \"Times New Roman\"; " +
                "-fx-font-size: 36pt; " +
                "-fx-font-weight: bold; " +
                "-fx-font-style: italic; ");
        historicalPhoto.setLayoutX(270);
        historicalPhoto.setLayoutY(35);

        Image photoAUS = new Image(this.getClass().getResource("/photoCity/historical/AUS.jpg").toString());
        ImageView AUS;
        AUS = new ImageView(photoAUS);
        AUS.setPreserveRatio(true);
        AUS.setFitHeight(750);
        AUS.setFitWidth(750);
        AUS.setLayoutX(250);
        AUS.setLayoutY(120);

        Image photofirstHospital = new Image(this.getClass().getResource("/photoCity/historical/firstHospital1949.jpg").toString());
        ImageView firstHospital;
        firstHospital = new ImageView(photofirstHospital);
        firstHospital.setPreserveRatio(true);
        firstHospital.setFitHeight(750);
        firstHospital.setFitWidth(750);
        firstHospital.setLayoutX(250);
        firstHospital.setLayoutY(120);

        Image photoBSMP = new Image(this.getClass().getResource("/photoCity/historical/Hospital1984.jpg").toString());
        ImageView BSMP;
        BSMP = new ImageView(photoBSMP);
        BSMP.setPreserveRatio(true);
        BSMP.setFitHeight(750);
        BSMP.setFitWidth(750);
        BSMP.setLayoutX(250);
        BSMP.setLayoutY(120);

        Image photoKarlMarksStreet = new Image(this.getClass().getResource("/photoCity/historical/squareKarlMarks1979.jpg").toString());
        ImageView KarlMarksStreet;
        KarlMarksStreet = new ImageView(photoKarlMarksStreet);
        KarlMarksStreet.setPreserveRatio(true);
        KarlMarksStreet.setFitHeight(750);
        KarlMarksStreet.setFitWidth(750);
        KarlMarksStreet.setLayoutX(250);
        KarlMarksStreet.setLayoutY(120);


        // Создаем список;
        ObservableList<String> PhotoCitizens = FXCollections.observableArrayList(
                "Выберите название фотографии","Ангарское управление строительства",
                "Первая больница поселок Майск 1949 год", "БСМП - больница скорой медицинской помощи 1984 год",
                "Улица Карла Маркса 1979 год");
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
                    AUS.setVisible(false);
                    firstHospital.setVisible(false);
                    BSMP.setVisible(false);
                    KarlMarksStreet.setVisible(false);
                }
                if(new_val.equals("Ангарское управление строительства")){
                    AUS.setVisible(true);
                    firstHospital.setVisible(false);
                    BSMP.setVisible(false);
                    KarlMarksStreet.setVisible(false);
                }
                if(new_val.equals("Первая больница поселок Майск 1949 год")){
                    AUS.setVisible(false);
                    firstHospital.setVisible(true);
                    BSMP.setVisible(false);
                    KarlMarksStreet.setVisible(false);
                }
                if(new_val.equals("БСМП - больница скорой медицинской помощи 1984 год")){
                    AUS.setVisible(false);
                    firstHospital.setVisible(false);
                    BSMP.setVisible(true);
                    KarlMarksStreet.setVisible(false);
                }
                if (new_val.equals("Улица Карла Маркса 1979 год")) {
                    AUS.setVisible(false);
                    firstHospital.setVisible(false);
                    BSMP.setVisible(false);
                    KarlMarksStreet.setVisible(true);
                }
            }
        });
        choice.setLayoutX(50);
        choice.setLayoutY(50);

        pane.getChildren().add(choice);
        pane.getChildren().add(historicalPhoto);
        pane.getChildren().add(AUS);
        pane.getChildren().add(firstHospital);
        pane.getChildren().add(BSMP);
        pane.getChildren().add(KarlMarksStreet);

        // Скрываем при открытии нового окна всю информацию;
        AUS.setVisible(false);
        firstHospital.setVisible(false);
        BSMP.setVisible(false);
        KarlMarksStreet.setVisible(false);

        // Создаем сцену и устанавливаем контент в новое окно
        Scene scene = new Scene(pane);
        newStage.setScene(scene);
        newStage.setTitle("Герб города Ангарска");
        newStage.getIcons().add(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/icons/icon.png"))));

        primaryStage.toFront(); // Перемещаем исходное окно вверх стека окон
        newStage.show();
    }
}
