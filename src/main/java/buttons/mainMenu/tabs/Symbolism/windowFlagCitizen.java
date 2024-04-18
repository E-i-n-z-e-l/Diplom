package buttons.mainMenu.tabs.Symbolism;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.util.Objects;

public class windowFlagCitizen implements EventHandler<ActionEvent> {
    private Stage primaryStage;

    public windowFlagCitizen(Stage primaryStage) {
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

        Pane pane = new Pane(); // Используем Pane;
        pane.setPrefSize(1280, 720); // Устанавливаем размеры Pane равные размерам основного окна;

        // Устанавливаем цвет фона сцены;
        pane.setBackground(new Background(new BackgroundFill(Color.BEIGE, null, null)));

        Text nameFlag = new Text("Флаг");
        nameFlag.setStyle("-fx-font-family: \"Times New Roman\"; " +
                "-fx-font-size: 36pt; " +
                "-fx-font-weight: bold; " +
                "-fx-font-style: italic; ");
        nameFlag.setLayoutX(570);
        nameFlag.setLayoutY(35);

        Image imFlag = new Image(this.getClass().getResource("/coat/flag.png").toString());
        ImageView Flag;
        Flag = new ImageView(imFlag);
        Flag.setPreserveRatio(true);
        Flag.setFitHeight(350);
        Flag.setFitWidth(450);
        Flag.setLayoutX(50);
        Flag.setLayoutY(120);
        Text textFlag = new Text("Флаг города Ангарска  был утвержден Думой Ангарского муниципального образования " +
                "Решением от 3 марта  2003 года № 105-20Д(4) (в ред. Решения Думы АМО от 23. 03. 2004 № 232-39Д(4)). " +
                "Решением Думы Ангарского городского округа от 24 июня 2015 года № 31-05/01рД флаг города Ангарска " +
                "утверждён официальным символом Ангарского городского округа.\n \n" +
                "     Описание Флага: «Флаг состоит из двухстороннего полотнища и древка. Полотнище Флага прямоугольное, " +
                "состоящее из двух горизонтальных полос: верхняя полоса Флага изумрудного цвета, нижняя полоса - " +
                "лазуревая с пятью серебряными шиповидными поясами (вода). В центре верхней полосы помещается изображение " +
                "основного элемента герба Ангарского городского округа: золотой фигуры бегущей влево от зрителя молодой " +
                "женщины в развевающихся одеждах. Отношение высоты полотнища к его длине - 2/3. Высота нижней полосы " +
                "составляет 1/4 общей высоты Флага. Цвета Флага символизируют: изумрудный цвет - изобилие зелени, " +
                "тайги; желтый цвет - богатство, свидетельствует о высоком промышленном потенциале округа; " +
                "лазуревый цвет - символ воды, свидетельствует о том, что город, который является административным " +
                "центром Ангарского городского округа, построен на берегу реки Ангары.».\n \n" +
                "     Решением Геральдического совета при Президенте Российской Федерации " +
                "(протокол № 19-д от 21.09.2004 года) флаг города Ангарска внесён в Государственный геральдический " +
                "регистр РФ с присвоением регистрационного номера 1492.\n");
        textFlag.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));
        textFlag.setFill(Color.BLACK);
        textFlag.setWrappingWidth(700);
        textFlag.setLayoutX(550);
        textFlag.setLayoutY(150);

        pane.getChildren().add(nameFlag);
        pane.getChildren().add(Flag);
        pane.getChildren().add(textFlag);

        // Создаем сцену и устанавливаем контент в новое окно
        Scene scene = new Scene(pane);
        newStage.setScene(scene);
        newStage.setTitle("Флаг города Ангарска");
        newStage.getIcons().add(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/icons/icon.png"))));

        primaryStage.toFront(); // Перемещаем исходное окно вверх стека окон
        newStage.show();
    }
}
