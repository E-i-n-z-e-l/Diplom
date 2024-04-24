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

public class windowHeroesWork implements EventHandler<ActionEvent> {
    private Stage primaryStage;

    public windowHeroesWork(Stage primaryStage) {
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

        Text nameHeroesWorks = new Text("Герои Труда");
        nameHeroesWorks.setStyle("-fx-font-family: \"Times New Roman\"; " +
                "-fx-font-size: 36pt; " +
                "-fx-font-weight: bold; " +
                "-fx-font-style: italic; ");
        nameHeroesWorks.setLayoutX(500);
        nameHeroesWorks.setLayoutY(35);

        Image imAstashkevich = new Image(this.getClass().getResource("/heroeswork/Astashkevich.jpg").toString());
        ImageView Astashkevich;
        Astashkevich = new ImageView(imAstashkevich);
        Astashkevich.setPreserveRatio(true);
        Astashkevich.setFitHeight(550);
        Astashkevich.setFitWidth(550);
        Astashkevich.setLayoutX(50);
        Astashkevich.setLayoutY(120);

        Text textAstashkevich = new Text("Родился в 1919 году в г.Калуге в семье рабочего. В 1936-1941 году учился " +
                "в Донецком индустриальном институте имени Хрущёва, был сталинским стипендиатом, избирался " +
                "заместителем секретаря комитета ВЛКСМ института. Окончив институт, работал горным инженером по " +
                "подземной разработке угольных месторождений. С 01.07.1941г. по 01.12.1941г. – студент Харьковского " +
                "училища химзащиты. Участник Великой Отечественной войны. Боевой путь прошел офицером отделения " +
                "снабжения и ремонта имущества связи штаба 13-й армии. После демобилизации в 1946 году был принят " +
                "на работу начальником Центральных электромеханических мастерских Львовского треста «Укрсельэнерго» " +
                "(г. Львов.). С 1948 года – инженер, старший инженер, прораб монтажного участка № 12 треста " +
                "«Донбассэлектромонтаж».\n \n" +
                "В 1951 году командирован в г.Ангарск. В феврале 1952 года назначен начальником механизированной " +
                "колонны № 30 треста «Востсибэлектросетьстрой», которая проводила электрофикацию железнодорожной " +
                "Транссибирской магистрали на участке от Москвы до Иркутска, которая была осуществлена к 1961 году. \n \n" +
                "03.04.1963 года Асташкевич С.С. был назначен управляющим трестом в г.Кемерово. В июне 1966 года " +
                "Семён Семёнович был переведён на работу в Москву на должность начальника Главного управления " +
                "предприятия  «Главэлектромонтаж».\n \n" +
                "Умер в сентябре 1995 года в Москве.\n");
        textAstashkevich.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));
        textAstashkevich.setFill(Color.BLACK);
        textAstashkevich.setWrappingWidth(700);
        textAstashkevich.setLayoutX(550);
        textAstashkevich.setLayoutY(150);

        Image imBaev = new Image(this.getClass().getResource("/heroeswork/Baev.jpg").toString());
        ImageView Baev;
        Baev = new ImageView(imBaev);
        Baev.setPreserveRatio(true);
        Baev.setFitHeight(550);
        Baev.setFitWidth(550);
        Baev.setLayoutX(50);
        Baev.setLayoutY(120);
        Text textBaev = new Text("Родился 6 июля 1929 года в деревне Нижняя Слобода Жигаловского района Иркутской " +
                "области в семье крестьянина.\n \n" +
                "Несколько раз убегал на фронт. В 1943 году добрался до Иркутска и сумел добиться приема в одну из " +
                "воинских частей в качестве воспитанника. В дальнейшем был направлен в Кировоградское суворовское " +
                "училище, однако в 1945 году перешел в Симферопольскую школу ФЗО связи. Получил специальность " +
                "электромонтера и стал работать надсмотрщиком в линейно-техническом узле связи.\n \n" +
                "В 1947 году Баев Л.И. переехал в город Якутск, где поступил учиться в техникум связи, затем окончил " +
                "ускоренные курсы руководящих работников связи. В 1948 году назначен начальником районного отделения " +
                "связи Большая Марха Якутской АССР.\n \n" +
                "С 1949 по 1953 год Леонид Иосифович служил в рядах Советской Армии. Окончил с «отличием» школу по " +
                "подготовке специалистов дальней авиации и дальнейшую службу проходил в Киевском военном округе " +
                "механиком по эксплуатации самолетов. Был избран секретарем комсомольской организации авиаотряда. \n \n" +
                "С 1953 года работал на Иркутском почтамте начальником отделения связи.\n \n" +
                "В 1956 году Баев Л.И. окончил заочную среднюю школу, а в 1957 году поступил в Иркутский " +
                "финансово-экономический институт на вечернее отделение экономики промышленности, которое закончил " +
                "в 1962 году. Одновременно работал на Иркутском почтамте в должности старшего инженера.\n \n" +
                "После окончания института с 14 сентября 1962 года по 1 февраля 1990 года работал начальником " +
                "Ангарского городского узла связи. Добился строительства и ввода в эксплуатацию нового здания " +
                "Узла связи общей площадью 7900 кв.м., оснащенного самым современным в то время оборудованием, " +
                "а также автоматической телефонной станции, цеха сортировки почты. Ангарский узел связи много " +
                "раз становился победителем Всесоюзного социалистического соревнования, а коллектив был признан " +
                "предприятие высокой культуры производства. Леонид Иосифович постоянно занимался рационализаторством, " +
                "он автор ряда изобретений и рационализаторских предложений. \n \n" +
                "С 1963 года избирался депутатом Городского Совета депутатов трудящихся. С 1977г. - член ЦК профсоюза " +
                "Министерства связи. \n \n" +
                "Умер 16.08.2006 года в Ангарске.\n");
        textBaev.setFont(Font.font("Times New Roman", FontWeight.BOLD, 14));
        textBaev.setFill(Color.BLACK);
        textBaev.setWrappingWidth(700);
        textBaev.setLayoutX(550);
        textBaev.setLayoutY(150);

        Image imBlunskay = new Image(this.getClass().getResource("/heroeswork/Blunskay.jpg").toString());
        ImageView Blunskay;
        Blunskay = new ImageView(imBlunskay);
        Blunskay.setPreserveRatio(true);
        Blunskay.setFitHeight(550);
        Blunskay.setFitWidth(550);
        Blunskay.setLayoutX(50);
        Blunskay.setLayoutY(120);
        Text textBlunskay = new Text("Родилась 8 ноября 1925 года в с.Сергеевка Анжеро-Судженского района " +
                "Кемеровской области. Родители были крестьянами. Отец Павел Гаврилович был объездчиком на полях, " +
                "мать Пелагея Дмитриевна занималась хозяйством и детьми. Семья была большая и очень бедная. Когда " +
                "объявили коллективизацию, их семья одной из первых вступила в колхоз.\n \n" +
                "\tРаботать Анастасия Павловна начала очень рано, нужно было помогать семье. Учиться ей из-за этого " +
                "не довелось, хотя была очень способной.\n \n" +
                "\tКогда началась война, было очень тяжело. С сентября по апрель работала на лесозаготовках, ведь " +
                "для фронта нужна была древесина, копали траншеи. В остальное время работали на полях, приходилось " +
                "вместе с другими женщинами боронить, сеять, убирать урожай. В 1944 году работала звеньевой " +
                "полеводческой бригады в совхозе «Анжерский».\n \n" +
                "\tВ Ангарск переехала в феврале 1960 года по приглашению подруги. Работать устроилась уборщицей " +
                "на комбинат-16. В 1972 году перевелась работать в ОКБА, на пенсию вышла в 1985 году. \n \n" +
                "\tУмерла 03.02.2008 года в Ангарске.\n");
        textBlunskay.setFont(Font.font("Times New Roman", FontWeight.BOLD, 20));
        textBlunskay.setFill(Color.BLACK);
        textBlunskay.setWrappingWidth(700);
        textBlunskay.setLayoutX(550);
        textBlunskay.setLayoutY(150);


        // Создаем список граждан;
        ObservableList<String> InstitutesCitizens = FXCollections.observableArrayList(
                "Выберите героя Труда","Асташкевич Семён Семёнович",
                "Баев Леонид Иосифович", "Блюнская Анастасия Павловна");
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
                if (new_val.equals("Выберите гражданина-героя труда")) {
                    Astashkevich.setVisible(false);
                    textAstashkevich.setVisible(false);
                    Baev.setVisible(false);
                    textBaev.setVisible(false);
                    Blunskay.setVisible(false);
                    textBlunskay.setVisible(false);
                }
                if(new_val.equals("Асташкевич Семён Семёнович")){
                    Astashkevich.setVisible(true);
                    textAstashkevich.setVisible(true);
                    Baev.setVisible(false);
                    textBaev.setVisible(false);
                    Blunskay.setVisible(false);
                    textBlunskay.setVisible(false);
                }
                if(new_val.equals("Баев Леонид Иосифович")){
                    Astashkevich.setVisible(false);
                    textAstashkevich.setVisible(false);
                    Baev.setVisible(true);
                    textBaev.setVisible(true);
                    Blunskay.setVisible(false);
                    textBlunskay.setVisible(false);
                }
                if(new_val.equals("Блюнская Анастасия Павловна")){
                    Astashkevich.setVisible(false);
                    textAstashkevich.setVisible(false);
                    Baev.setVisible(false);
                    textBaev.setVisible(false);
                    Blunskay.setVisible(true);
                    textBlunskay.setVisible(true);
                }
            }
        });
        choice.setLayoutX(50);
        choice.setLayoutY(50);

        pane.getChildren().add(choice);
        pane.getChildren().add(nameHeroesWorks);
        pane.getChildren().add(Astashkevich);
        pane.getChildren().add(textAstashkevich);
        pane.getChildren().add(Baev);
        pane.getChildren().add(textBaev);
        pane.getChildren().add(Blunskay);
        pane.getChildren().add(textBlunskay);


        // Скрываем при открытии нового окна всю информацию о людях;
        Astashkevich.setVisible(false);
        textAstashkevich.setVisible(false);
        Baev.setVisible(false);
        textBaev.setVisible(false);
        Blunskay.setVisible(false);
        textBlunskay.setVisible(false);


        // Создаем сцену и устанавливаем контент в новое окно
        Scene scene = new Scene(pane);
        newStage.setScene(scene);
        newStage.setTitle("Их именами названы улицы");
        newStage.getIcons().add(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/icons/icon.png"))));

        primaryStage.toFront(); // Перемещаем исходное окно вверх стека окон
        newStage.show();
    }
}
