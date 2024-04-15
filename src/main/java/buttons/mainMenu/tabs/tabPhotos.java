package buttons.mainMenu.tabs;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Tab;
import javafx.scene.layout.VBox;

public class tabPhotos {
    public static Tab tabPhotos() {
        Tab newTab = new Tab();

        Button button1 = new Button("Исторические");
        button1.setPrefSize(280, 20);
        button1.setAlignment(Pos.CENTER); // Выравнивает текст на кнопке по центру;
        button1.setContentDisplay(ContentDisplay.RIGHT);
        button1.setWrapText(false); // Запрет на перенос строк в тексте кнопки;
        button1.setStyle("-fx-font-family: \"Times New Roman\"; " + // задает семейство шрифта текста кнопки;
                "-fx-font-size: 12pt; " + // задает размер шрифта текста кнопки;
                "-fx-font-weight: bold; " + // задает насыщенность шрифта (жирный);
                "-fx-font-style: italic; " + // задает стиль шрифта (курсив);
                "-fx-text-fill: black; " + // устанавливает цвет текста кнопки как черный;
                "-fx-background-color: #99ff99; " + // устанавливает цвет фона кнопки как светло-зеленый (#99ff99);
                "-fx-background-radius: 0; " + // устанавливает радиус скругления углов фона кнопки как 0 пикселей;
                "-fx-border-width: 3px; " + // устанавливает ширину границы кнопки как 3 пикселя;
                "-fx-border-color: black; "); // устанавливает цвет границы кнопки как черный;

        Button button2 = new Button("Современные");
        button2.setPrefSize(280, 20);
        button2.setAlignment(Pos.CENTER); // Выравнивает текст на кнопке по центру;
        button2.setContentDisplay(ContentDisplay.RIGHT);
        button2.setWrapText(false); // Запрет на перенос строк в тексте кнопки;
        button2.setStyle("-fx-font-family: \"Times New Roman\"; " + // задает семейство шрифта текста кнопки;
                "-fx-font-size: 12pt; " + // задает размер шрифта текста кнопки;
                "-fx-font-weight: bold; " + // задает насыщенность шрифта (жирный);
                "-fx-font-style: italic; " + // задает стиль шрифта (курсив);
                "-fx-text-fill: black; " + // устанавливает цвет текста кнопки как черный;
                "-fx-background-color: #99ff99; " + // устанавливает цвет фона кнопки как светло-зеленый (#99ff99);
                "-fx-background-radius: 0; " + // устанавливает радиус скругления углов фона кнопки как 0 пикселей;
                "-fx-border-width: 3px; " + // устанавливает ширину границы кнопки как 3 пикселя;
                "-fx-border-color: black; "); // устанавливает цвет границы кнопки как черный;

        VBox contentPane = new VBox(button1, button2);

        newTab.setContent(contentPane);
        return newTab;
    }
}
