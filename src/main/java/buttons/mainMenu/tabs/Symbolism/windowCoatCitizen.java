package buttons.mainMenu.tabs.Symbolism;

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
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.util.Objects;

public class windowCoatCitizen implements EventHandler<ActionEvent> {
    private Stage primaryStage;

    public windowCoatCitizen(Stage primaryStage) {
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

        Text nameCoat = new Text("Герб");
        nameCoat.setStyle("-fx-font-family: \"Times New Roman\"; " +
                "-fx-font-size: 36pt; " +
                "-fx-font-weight: bold; " +
                "-fx-font-style: italic; ");
        nameCoat.setLayoutX(570);
        nameCoat.setLayoutY(35);

        Image imcoat1969 = new Image(this.getClass().getResource("/coat/Coat1969.png").toString());
        ImageView coat1969;
        coat1969 = new ImageView(imcoat1969);
        coat1969.setPreserveRatio(true);
        coat1969.setFitHeight(550);
        coat1969.setFitWidth(550);
        coat1969.setLayoutX(50);
        coat1969.setLayoutY(120);

        Text textcoat1969 = new Text("Первый раз о символе города задумались в 1969 году. Исполком Ангарского " +
                "городского Совета депутатов трудящихся (председатель исполкома П.М. Громович) своим решением № 147 " +
                "от 12 мая 1969 года постановил: \"Представить на рассмотрение очередной сессии городского Совета " +
                "депутатов трудящихся герб города с описанием\". \n \n Из приложения к решению: «Плоскость щита (герба) " +
                "разделена в направлении диагонали (слева вверх, направо) тремя цветными поясами: верхнее поле - " +
                "голубое, символизирующее цвет Ангары, давшей название городу; центральное поле - красное, цвет " +
                "нашей действительности, нашего времени; нижнее поле - зеленое, цвет тайги, окружающей город. " +
                "По проложенной диагонали на красном поле, выступая на голубое и зелёное, расположены соприкасающиеся " +
                "между собой символы промышленного города — реторта (химия), стекловидная молния (энергетика), " +
                "мастерок (строительство). Эти символы белого цвета\". Однако, несмотря на решение исполкома, вопрос " +
                "о гербе так и не был включен в повестку дня, и герб просуществовал без официального утверждения " +
                "до 1976 года.");
        textcoat1969.setFont(Font.font("Times New Roman", FontWeight.BOLD, 20));
        textcoat1969.setFill(Color.BLACK);
        textcoat1969.setWrappingWidth(700);
        textcoat1969.setLayoutX(550);
        textcoat1969.setLayoutY(150);

        Image imcoat1976 = new Image(this.getClass().getResource("/coat/Coat1976.png").toString());
        ImageView coat1976;
        coat1976 = new ImageView(imcoat1976);
        coat1976.setPreserveRatio(true);
        coat1976.setFitHeight(550);
        coat1976.setFitWidth(550);
        coat1976.setLayoutX(50);
        coat1976.setLayoutY(120);
        Text textcoat1976 = new Text("В 1971 году город был награжден орденом Трудового Красного Знамени и в " +
                "связи с 25-летием Ангарска исполком городского Совета утвердил новый герб города " +
                "(решение исполкома № 48 от 9 февраля 1976 года). \n \n" +
                "Согласно описанию наружная кромка щита была обрамлена полоской золотистого цвета, остальная " +
                "поверхность — красного цвета. От левой верхней кромки щита (одна четвертая ширины всего щита) к " +
                "правой его наружной кромке (на половину от верхнего правого угла) опускается изображение серо-голубой " +
                "муаровой ленты ордена Трудового Красного Знамени, которым награжден Ангарск. Ниже ленты и левее оси " +
                "изображение нефтехимической установки, символизирующей основу развития и достижений города». " +
                "\n \nАвтором герба был ангарский художник Исай Александрович Моценок. Но второй герб также не " +
                "прошел утверждения на сессии городского Совета депутатов трудящихся. Этот герб использовался в " +
                "оформлении города и был выпущен в виде значка.");
        textcoat1976.setFont(Font.font("Times New Roman", FontWeight.BOLD, 20));
        textcoat1976.setFill(Color.BLACK);
        textcoat1976.setWrappingWidth(700);
        textcoat1976.setLayoutX(550);
        textcoat1976.setLayoutY(150);


        Image imcoat1992 = new Image(this.getClass().getResource("/coat/Coat1992.jpg").toString());
        ImageView coat1992;
        coat1992 = new ImageView(imcoat1992);
        coat1992.setPreserveRatio(true);
        coat1992.setFitHeight(550);
        coat1992.setFitWidth(550);
        coat1992.setLayoutX(50);
        coat1992.setLayoutY(120);
        Text textcoat1992 = new Text("В 1992 году родилась идея нового, третьего по счету, герба Ангарска. " +
                "\n \nОн представлял собой сложную красочную композицию: в лазурном поле щита - лазурный вилообразный " +
                "крест, очертания креста волнообразные, в центре щита на фоне креста круглый венок из трех сосновых " +
                "или кедровых шишек с иглами хвои. В верхней части венка число 1951, внутри венка — шестиугольник " +
                "(бензольное кольцо), внутри последнего в белом круге красная стекловидная ломаная молния. Во главе " +
                "щита надпись белыми буквами: \"Ангарск\". Щит наложен на серебряный картуш, увенчанный червленой " +
                "городской короной с тремя башнями. Слева и справа картуш и корона обрамлены ветками дуба, которые " +
                "переплетены, огибая корону, единой трехцветной лентой флага Российской Федерации. Автором этого " +
                "проекта герба города был ангарский художник Владимир Вавилович Баженов. Официального утверждения " +
                "этого герба не было.");
        textcoat1992.setFont(Font.font("Times New Roman", FontWeight.BOLD, 20));
        textcoat1992.setFill(Color.BLACK);
        textcoat1992.setWrappingWidth(650);
        textcoat1992.setLayoutX(600);
        textcoat1992.setLayoutY(150);

        Image imcoat1996 = new Image(this.getClass().getResource("/coat/Coat1996.png").toString());
        ImageView coat1996;
        coat1996 = new ImageView(imcoat1996);
        coat1996.setPreserveRatio(true);
        coat1996.setFitHeight(550);
        coat1996.setFitWidth(550);
        coat1996.setLayoutX(50);
        coat1996.setLayoutY(120);
        Text textcoat1996 = new Text("14 декабря 1995 года распоряжением мэра города В.А. Непомнящего была " +
                "утверждена рабочая группа по разработке проекта герба в составе скульптора Анатолия Осауленко, " +
                "художников Исая Моценка и Владимира Маркова, а также Валентина Щукина, члена Всероссийского " +
                "Геральдического общества. \n \nВ 1996 году постановлением мэра города № 635 от 4 марта 1996г. " +
                "был объявлен открытый конкурс по созданию герба города, а также состав конкурсной комиссии, " +
                "в которую вошли депутаты городской Думы, члены Союза художников России, архитекторы. " +
                "\n \nПо итогам этого конкурса единогласно лучшим проектом был признан эскиз 081132 " +
                "(художник Олег Ткаченко). Идея сделать символом города фигуру молодой девушки, символизирующей " +
                "героиню народного эпоса красавицу Ангару, давшую название городу, принадлежит Валентину Щукину. " +
                "Как он писал в своем письме в городскую администрацию: «Изображенная в гербе красавица Ангара в " +
                "виде фигуры молодой девушки была бы для горожан символом, отчего дома, Родины». Городская Дума на " +
                "своем заседании 29 апреля 1996 года единодушно одобрила и утвердила решение конкурсной комиссии, " +
                "и гербом Ангарска стал эскиз, выполненный художником-дизайнером Олегом  Михайловичем Ткаченко. " +
                "Впоследствии при работе над эталоном Олег Ткаченко сделал небольшие изменения в рисунке герба. " +
                "Именно в таком варианте герб и вошел в приложение к решению Думы № 159 от 29 апреля 1996 года. " +
                "\n \nРешением Думы Ангарского городского округа от 24 июня 2015 года № 31-05/01рД герб города " +
                "Ангарска утверждён официальным символом Ангарского городского округа.");
        textcoat1996.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));
        textcoat1996.setFill(Color.BLACK);
        textcoat1996.setWrappingWidth(700);
        textcoat1996.setLayoutX(550);
        textcoat1996.setLayoutY(150);


        // Создаем список граждан;
        ObservableList<String> CoatCitizens = FXCollections.observableArrayList(
                "Выберите год","Герб 1969 года",
                "Герб 1976 года", "Герб 1992 года", "Герб 1996 года");
        ChoiceBox<String> choice = new ChoiceBox<String>(CoatCitizens);
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
        choice.setTooltip(new Tooltip("Выберите год"));
        choice.getSelectionModel().selectFirst();

        choice.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            public void changed(ObservableValue<? extends String> ov, String old_val, String new_val) {
                if (new_val.equals("Выберите год")) {
                    coat1969.setVisible(false);
                    textcoat1969.setVisible(false);
                    coat1976.setVisible(false);
                    textcoat1976.setVisible(false);
                    coat1992.setVisible(false);
                    textcoat1992.setVisible(false);
                    coat1996.setVisible(false);
                    textcoat1996.setVisible(false);
                }
                if(new_val.equals("Герб 1969 года")){
                    coat1969.setVisible(true);
                    textcoat1969.setVisible(true);
                    coat1976.setVisible(false);
                    textcoat1976.setVisible(false);
                    coat1992.setVisible(false);
                    textcoat1992.setVisible(false);
                    coat1996.setVisible(false);
                    textcoat1996.setVisible(false);
                }
                if(new_val.equals("Герб 1976 года")){
                    coat1969.setVisible(false);
                    textcoat1969.setVisible(false);
                    coat1976.setVisible(true);
                    textcoat1976.setVisible(true);
                    coat1992.setVisible(false);
                    textcoat1992.setVisible(false);
                    coat1996.setVisible(false);
                    textcoat1996.setVisible(false);
                }
                if(new_val.equals("Герб 1992 года")){
                    coat1969.setVisible(false);
                    textcoat1969.setVisible(false);
                    coat1976.setVisible(false);
                    textcoat1976.setVisible(false);
                    coat1992.setVisible(true);
                    textcoat1992.setVisible(true);
                    coat1996.setVisible(false);
                    textcoat1996.setVisible(false);
                }
                if (new_val.equals("Герб 1996 года")) {
                    coat1969.setVisible(false);
                    textcoat1969.setVisible(false);
                    coat1976.setVisible(false);
                    textcoat1976.setVisible(false);
                    coat1992.setVisible(false);
                    textcoat1992.setVisible(false);
                    coat1996.setVisible(true);
                    textcoat1996.setVisible(true);
                }
            }
        });
        choice.setLayoutX(50);
        choice.setLayoutY(50);


        pane.getChildren().add(choice);
        pane.getChildren().add(nameCoat);
        pane.getChildren().add(coat1969);
        pane.getChildren().add(textcoat1969);
        pane.getChildren().add(coat1976);
        pane.getChildren().add(textcoat1976);
        pane.getChildren().add(coat1992);
        pane.getChildren().add(textcoat1992);
        pane.getChildren().add(coat1996);
        pane.getChildren().add(textcoat1996);

        // Скрываем при открытии нового окна всю информацию о людях;
        coat1969.setVisible(false);
        textcoat1969.setVisible(false);
        coat1976.setVisible(false);
        textcoat1976.setVisible(false);
        coat1992.setVisible(false);
        textcoat1992.setVisible(false);
        coat1996.setVisible(false);
        textcoat1996.setVisible(false);


        // Создаем сцену и устанавливаем контент в новое окно
        Scene scene = new Scene(pane);
        newStage.setScene(scene);
        newStage.setTitle("Герб города Ангарска");
        newStage.getIcons().add(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/icons/icon.png"))));

        primaryStage.toFront(); // Перемещаем исходное окно вверх стека окон
        newStage.show();
    }
}
