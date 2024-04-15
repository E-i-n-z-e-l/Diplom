package buttons.mainMenu.tabs;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Tab;
import javafx.scene.layout.VBox;

public class tabHumans {
    public static Tab tabHumans() {
        Tab newTab = new Tab();

        Button button1 = new Button("Почетные граждане");
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

        Button button2 = new Button("Их именами названы улицы");
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

        Button button3 = new Button("Их именами названы учреждения");
        button3.setPrefSize(280, 20);
        button3.setAlignment(Pos.CENTER); // Выравнивает текст на кнопке по центру;
        button3.setContentDisplay(ContentDisplay.RIGHT);
        button3.setWrapText(false); // Запрет на перенос строк в тексте кнопки;
        button3.setStyle("-fx-font-family: \"Times New Roman\"; " + // задает семейство шрифта текста кнопки;
                "-fx-font-size: 12pt; " + // задает размер шрифта текста кнопки;
                "-fx-font-weight: bold; " + // задает насыщенность шрифта (жирный);
                "-fx-font-style: italic; " + // задает стиль шрифта (курсив);
                "-fx-text-fill: black; " + // устанавливает цвет текста кнопки как черный;
                "-fx-background-color: #99ff99; " + // устанавливает цвет фона кнопки как светло-зеленый (#99ff99);
                "-fx-background-radius: 0; " + // устанавливает радиус скругления углов фона кнопки как 0 пикселей;
                "-fx-border-width: 3px; " + // устанавливает ширину границы кнопки как 3 пикселя;
                "-fx-border-color: black; "); // устанавливает цвет границы кнопки как черный;

        Button button4 = new Button("Герои Советского Союза");
        button4.setPrefSize(280, 20);
        button4.setAlignment(Pos.CENTER); // Выравнивает текст на кнопке по центру;
        button4.setContentDisplay(ContentDisplay.RIGHT);
        button4.setWrapText(false); // Запрет на перенос строк в тексте кнопки;
        button4.setStyle("-fx-font-family: \"Times New Roman\"; " + // задает семейство шрифта текста кнопки;
                "-fx-font-size: 12pt; " + // задает размер шрифта текста кнопки;
                "-fx-font-weight: bold; " + // задает насыщенность шрифта (жирный);
                "-fx-font-style: italic; " + // задает стиль шрифта (курсив);
                "-fx-text-fill: black; " + // устанавливает цвет текста кнопки как черный;
                "-fx-background-color: #99ff99; " + // устанавливает цвет фона кнопки как светло-зеленый (#99ff99);
                "-fx-background-radius: 0; " + // устанавливает радиус скругления углов фона кнопки как 0 пикселей;
                "-fx-border-width: 3px; " + // устанавливает ширину границы кнопки как 3 пикселя;
                "-fx-border-color: black; "); // устанавливает цвет границы кнопки как черный;

        Button button5 = new Button("Герои Соц труда");
        button5.setPrefSize(280, 20);
        button5.setAlignment(Pos.CENTER); // Выравнивает текст на кнопке по центру;
        button5.setContentDisplay(ContentDisplay.RIGHT);
        button5.setWrapText(false); // Запрет на перенос строк в тексте кнопки;
        button5.setStyle("-fx-font-family: \"Times New Roman\"; " + // задает семейство шрифта текста кнопки;
                "-fx-font-size: 12pt; " + // задает размер шрифта текста кнопки;
                "-fx-font-weight: bold; " + // задает насыщенность шрифта (жирный);
                "-fx-font-style: italic; " + // задает стиль шрифта (курсив);
                "-fx-text-fill: black; " + // устанавливает цвет текста кнопки как черный;
                "-fx-background-color: #99ff99; " + // устанавливает цвет фона кнопки как светло-зеленый (#99ff99);
                "-fx-background-radius: 0; " + // устанавливает радиус скругления углов фона кнопки как 0 пикселей;
                "-fx-border-width: 3px; " + // устанавливает ширину границы кнопки как 3 пикселя;
                "-fx-border-color: black; "); // устанавливает цвет границы кнопки как черный;

        VBox contentPane = new VBox(button1, button2, button3, button4, button5);

        newTab.setContent(contentPane);

        return newTab;
    }
}
