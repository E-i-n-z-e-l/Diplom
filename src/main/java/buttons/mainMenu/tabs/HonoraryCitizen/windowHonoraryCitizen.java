package buttons.mainMenu.tabs.HonoraryCitizen;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class windowHonoraryCitizen implements EventHandler<ActionEvent> {
    private Stage primaryStage;

    public windowHonoraryCitizen(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    @Override
    public void handle(ActionEvent event) {
        primaryStage.setOpacity(0);
        Stage newStage = new Stage(); // Создаем новое окно
        newStage.initOwner(primaryStage); // Устанавливаем основное окно владельцем нового окна;
        newStage.initModality(Modality.WINDOW_MODAL); // Устанавливаем режим модального окна (новое окно будет блокировать основное окно до закрытия);

        newStage.setOnCloseRequest(e -> {
            primaryStage.setOpacity(1);
            primaryStage.show();
        });

        // Создаем контент нового окна
//        GridPane gridPane = new GridPane();
//        gridPane.setAlignment(Pos.CENTER);
//        gridPane.setHgap(10);
//        gridPane.setVgap(10);
        Pane pane = new Pane(); // Используем Pane вместо GridPane
        pane.setPrefSize(primaryStage.getWidth(), primaryStage.getHeight()); // Устанавливаем размеры Pane равные размерам основного окна;
        // Устанавливаем цвет фона сцены
        pane.setBackground(new Background(new BackgroundFill(Color.BEIGE, null, null)));

        Button button = new Button("Кнопка");
        button.setLayoutX(50); // Устанавливаем координату X
        button.setLayoutY(50); // Устанавливаем координату Y
        pane.getChildren().add(button);

        // Создаем сцену и устанавливаем контент в новое окно
        Scene scene = new Scene(pane);
        newStage.setScene(scene);
        newStage.setTitle("Новое окно");

        primaryStage.toFront(); // Перемещаем исходное окно вверх стека окон

        newStage.show();
    }
}
