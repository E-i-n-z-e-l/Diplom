package buttons.mainMenu.tabs.logicsTabsButtons;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;

public class honoraryCitizensBTN {
    public static Button honoraryBTN() {
        Button button = new Button("Почетные граждане");
        button.setPrefSize(280,20);
        button.setAlignment(Pos.CENTER); // Выравнивает текст на кнопке по центру;
        button.setContentDisplay(ContentDisplay.RIGHT);
        button.setWrapText(false); // Запрет на перенос строк в тексте кнопки;
        button.setStyle("-fx-font-family: \"Times New Roman\"; " + // задает семейство шрифта текста кнопки;
                "-fx-font-size: 12pt; " + // задает размер шрифта текста кнопки;
                "-fx-font-weight: bold; " + // задает насыщенность шрифта (жирный);
                "-fx-font-style: italic; " + // задает стиль шрифта (курсив);
                "-fx-text-fill: black; " + // устанавливает цвет текста кнопки как черный;
                "-fx-background-color: #99ff99; " + // устанавливает цвет фона кнопки как светло-зеленый (#99ff99);
                "-fx-background-radius: 0; " + // устанавливает радиус скругления углов фона кнопки как 0 пикселей;
                "-fx-border-width: 3px; " + // устанавливает ширину границы кнопки как 3 пикселя;
                "-fx-border-color: black; "); // устанавливает цвет границы кнопки как черный;
        return button;
    }

}