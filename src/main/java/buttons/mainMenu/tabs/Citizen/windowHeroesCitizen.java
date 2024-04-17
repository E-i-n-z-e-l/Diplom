package buttons.mainMenu.tabs.Citizen;

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

public class windowHeroesCitizen implements EventHandler<ActionEvent> {
    private Stage primaryStage;
    public windowHeroesCitizen(Stage primaryStage) {
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

        Text nameHeroes = new Text("Герои СССР");
        nameHeroes.setStyle("-fx-font-family: \"Times New Roman\"; " +
                "-fx-font-size: 36pt; " +
                "-fx-font-weight: bold; " +
                "-fx-font-style: italic; ");
        nameHeroes.setLayoutX(500);
        nameHeroes.setLayoutY(35);

        Image imEgorov = new Image(this.getClass().getResource("/heroes/Egorov.jpg").toString());
        ImageView Egorov;
        Egorov = new ImageView(imEgorov);
        Egorov.setPreserveRatio(true);
        Egorov.setFitHeight(550);
        Egorov.setFitWidth(550);
        Egorov.setLayoutX(50);
        Egorov.setLayoutY(120);

        Text textEgorov = new Text("Родился 29 июня 1914 года в г.Благовещенске Амурской области в семье рабочего " +
                "каменоломни. В 1931 году закончил профессионально-техническую школу и поступил работать механиком " +
                "в Средне-Бельский зерносовхоз Благовещенской МТС. В 1935 – 1937г.г. без отрыва от производства " +
                "обучался  в Благовещенском  аэроклубе.  С 1938 по 1941 годы он -  пилот-инструктор Амурского и " +
                "Биробиджанского аэроклубов. В 1940 году был призван в армию, окончил военную школу летчиков, служил " +
                "в войсках на Дальнем Востоке и Урале. \n \n" +
                "С ноября 1941 года П.В.Егоров на фронте. В должности пилота 732-го ночного бомбардировочного полка " +
                "участвовал в Московском сражении. Овладев полетами на ИЛ-2, до конца войны сражался в штурмовой " +
                "авиации. В 62-м штурмовом авиаполку он проходит боевой путь от командира звена до штурмана полка " +
                "на Западном и 2-м Белорусском фронтах.  К маю 1944 года капитан П.В.Егоров совершил 83 успешных " +
                "боевых вылета, из них 6 - по уничтожению самолетов противника на аэродромах. Нанес врагу серьезный " +
                "урон в живой силе и технике.\n \n" +
                " 29 сентября 1944 года  выполнил особо важное задание – ведущим сорока семи «илов» нанес мощный " +
                "штурмовой удар по танкосборочным мастерским фашистов. Всего за годы войны совершил 149 успешных " +
                "боевых вылетов. На его счету: 8 самолетов, 50 автомашин, 14 танков, 15 орудий зенитной артиллерии, " +
                "16 железнодорожных вагонов, железнодорожный мост, сотни солдат и офицеров противника. \n \n" +
                "     После войны занимал командные должности в Военно-Воздушных Силах Северной группы войск и " +
                "Дальневосточного округа. В августе 1959 года был уволен в запас и переехал  в город Ангарск, " +
                "где работал в составе военного представительства по приемке продукции  нефтехимического  комбината. \n \n" +
                "     Умер 9 марта 1989 года в Ангарске.");
        textEgorov.setFont(Font.font("Times New Roman", FontWeight.BOLD, 16));
        textEgorov.setFill(Color.BLACK);
        textEgorov.setWrappingWidth(700);
        textEgorov.setLayoutX(520);
        textEgorov.setLayoutY(150);

        Image imKosov = new Image(this.getClass().getResource("/heroes/Kosov.jpg").toString());
        ImageView Kosov;
        Kosov = new ImageView(imKosov);
        Kosov.setPreserveRatio(true);
        Kosov.setFitHeight(550);
        Kosov.setFitWidth(550);
        Kosov.setLayoutX(50);
        Kosov.setLayoutY(120);

        Text textKosov = new Text("Косов Анатолий Васильевич родился 2 марта 1916 года в г.Томске. " +
                "Воспитывался и рос в рабочей семье. В 1937 году был призван в армию и в 1940 году закончил " +
                "действительную службу на Дальнем Востоке. Перед самой Великой Отечественной войной работал на " +
                "шахте. Несмотря на бронь, он добровольно записался в маршевую роту и в её составе осенью 1941 " +
                "года прибыл в Москву и попал в 129 стрелковую дивизию. Его определили артиллеристом в " +
                "истребительно-противотанковый дивизион. Сначала он был заряжающим, затем разведчиком. " +
                "Анатолий Васильевич прошел всю войну: Москва, Курская дуга, Бобруйск, Берлин. Ему не раз " +
                "приходилось быть в тяжелейшей боевой обстановке, открыто смотреть смерти в глаза и побеждать " +
                "своим мужеством и храбростью. Об этом говорят ордена солдатской славы, украшающие грудь героя.\n \n"+
                "Умер 16 октября 2002 года в Ангарске и похоронен на городском кладбище «Березовая роща». " +
                "В память об А.В.Косове на доме, в котором он проживал (г.Ангарск, микрорайон 19, дом 10), " +
                "постановлением мэра Ангарского муниципального образования от 17.01.2003 года № 123 установлена " +
                "мемориальная доска «В этом доме жил участник Великой Отечественной войны, полный кавалер орденов " +
                "Славы, ветеран труда Косов Анатолий Васильевич». И в этом же районе решением  Думы Ангарского " +
                "муниципального образования от 27.04.2005г. № 395- 59Д (4) проезд назван его именем.");
        textKosov.setFont(Font.font("Times New Roman", FontWeight.BOLD, 16));
        textKosov.setFill(Color.BLACK);
        textKosov.setWrappingWidth(700);
        textKosov.setLayoutX(520);
        textKosov.setLayoutY(150);

        Image imSokolov = new Image(this.getClass().getResource("/heroes/Sokolov.jpg").toString());
        ImageView Sokolov;
        Sokolov = new ImageView(imSokolov);
        Sokolov.setPreserveRatio(true);
        Sokolov.setFitHeight(550);
        Sokolov.setFitWidth(550);
        Sokolov.setLayoutX(50);
        Sokolov.setLayoutY(120);

        Text textSokolov = new Text("Родился 19 октября 1953 года в г.Улан-Удэ Бурятской АССР в семье служащего. " +
                "После окончания 8 класса средней школы № 17 г.Ангарска (квартал 73) поступил в Иркутский авиационный " +
                "техникум. По окончанию работал на машиностроительном заводе г.Иркутска. В ряды Советской Армии был " +
                "призван в мае 1973 года и отправлен на службу в Забайкальский военный округ. После службы поступил " +
                "в Казанское высшее военно-инженерное училище. Служил в инженерных частях Ленинградского военного " +
                "округа.\n \n" +
                "С августа 1981 года работал в органах КГБ СССР. В 1982 году окончил Высшие курсы военной контрразведки " +
                "КГБ СССР в Новосибирске. Служил в Особых отделах КГБ в частях Ленинградского военного округа.\n \n" +
                "С декабря 1983 года в течение двух с половиной лет Соколов Борис проходил службу в составе " +
                "ограниченного контингента советских войск в Демократической Республике Афганистан в качестве " +
                "оперуполномоченного Особого отдела КГБ по 108-й мотострелковой дивизии 40-й армии Туркестанского" +
                " военного округа. Принимал участие в 64 войсковых операциях общей продолжительностью 269 суток. " +
                "В ходе операций проявил смелость, отвагу и мужество. В сложной боевой обстановке действовал уверенно, " +
                "принимал грамотные решения, не раз обеспечивал успешное выполнение подразделением боевых задач. В боях " +
                "был дважды контужен и получил осколочное ранение. Оставался в Афганистане до конца срока командировки, " +
                "даже после присвоения звания Героя Советского Союза отказался от права досрочно уехать " +
                "в Советский Союз.\n \n" +
                "В 1986-1991 годах Соколов Б.И. проходил службу в особом отделе  Комитета государственной " +
                "безопасности СССР по Московскому военному округу. С 1992 года служил в органах военной контрразведки " +
                "Министерства безопасности и ФСК России, затем в Управлении экономической контрразведки – " +
                "Департаменте экономической безопасности Федеральной службы Российской Федерации. Возглавлял " +
                "правительство ФСБ России в одном из зарубежных государств.  Сейчас проживает в Москве.\n");
        textSokolov.setFont(Font.font("Times New Roman", FontWeight.BOLD, 16));
        textSokolov.setFill(Color.BLACK);
        textSokolov.setWrappingWidth(700);
        textSokolov.setLayoutX(550);
        textSokolov.setLayoutY(150);

        // Создаем список граждан;
        ObservableList<String> InstitutesCitizens = FXCollections.observableArrayList(
                "Выберите гражданина-героя СССР","Егоров Павел Васильевич",
                "Косов Анатолий Васильевич", "Соколов Борис Иннокентьевич");
        ChoiceBox<String> choice = new ChoiceBox<String>(InstitutesCitizens);
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
        choice.setTooltip(new Tooltip("Выберите гражданина"));
        choice.getSelectionModel().selectFirst();

        choice.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            public void changed(ObservableValue<? extends String> ov, String old_val, String new_val) {
                if (new_val.equals("Выберите гражданина-героя СССР")) {
                    Egorov.setVisible(false);
                    textEgorov.setVisible(false);
                    Kosov.setVisible(false);
                    textKosov.setVisible(false);
                    Sokolov.setVisible(false);
                    textSokolov.setVisible(false);
                }
                if(new_val.equals("Егоров Павел Васильевич")){
                    Egorov.setVisible(true);
                    textEgorov.setVisible(true);
                    Kosov.setVisible(false);
                    textKosov.setVisible(false);
                    Sokolov.setVisible(false);
                    textSokolov.setVisible(false);
                }
                if(new_val.equals("Косов Анатолий Васильевич")){
                    Egorov.setVisible(false);
                    textEgorov.setVisible(false);
                    Kosov.setVisible(true);
                    textKosov.setVisible(true);
                    Sokolov.setVisible(false);
                    textSokolov.setVisible(false);
                }
                if(new_val.equals("Соколов Борис Иннокентьевич")){
                    Egorov.setVisible(false);
                    textEgorov.setVisible(false);
                    Kosov.setVisible(false);
                    textKosov.setVisible(false);
                    Sokolov.setVisible(true);
                    textSokolov.setVisible(true);
                }
            }
        });
        choice.setLayoutX(50);
        choice.setLayoutY(50);

        pane.getChildren().add(choice);
        pane.getChildren().add(nameHeroes);
        pane.getChildren().add(Egorov);
        pane.getChildren().add(textEgorov);
        pane.getChildren().add(Kosov);
        pane.getChildren().add(textKosov);
        pane.getChildren().add(Sokolov);
        pane.getChildren().add(textSokolov);


        // Скрываем при открытии нового окна всю информацию о людях;
        Egorov.setVisible(false);
        textEgorov.setVisible(false);
        Kosov.setVisible(false);
        textKosov.setVisible(false);
        Sokolov.setVisible(false);
        textSokolov.setVisible(false);

        // Создаем сцену и устанавливаем контент в новое окно
        Scene scene = new Scene(pane);
        newStage.setScene(scene);
        newStage.setTitle("Их именами названы улицы");
        newStage.getIcons().add(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/icons/icon.png"))));

        primaryStage.toFront(); // Перемещаем исходное окно вверх стека окон
        newStage.show();
    }
}
