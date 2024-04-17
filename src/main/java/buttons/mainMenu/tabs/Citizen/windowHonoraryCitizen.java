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
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.util.Objects;

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

        Pane pane = new Pane(); // Используем Pane;
        pane.setPrefSize(1280, 720); // Устанавливаем размеры Pane равные размерам основного окна;

        // Устанавливаем цвет фона сцены;
        pane.setBackground(new Background(new BackgroundFill(Color.BEIGE, null, null)));

        // Создаем список почетных граждан;
        ObservableList<String> honoraryCitizens = FXCollections.observableArrayList(
                "Выберите почетного гражданина","Авдеев Юрий Иванович", "Алексеев Валерий Анатольевич", "Алёшин Анатолий Константинович");
        ChoiceBox<String> choice = new ChoiceBox<String>(honoraryCitizens);
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
        choice.setPrefSize(500, 50);
        choice.setTooltip(new Tooltip("Выберите почетного гражданина"));
        choice.getSelectionModel().selectFirst();


        Image imAvdeev = new Image(this.getClass().getResource("/honors/Avdeev.jpg").toString());
        ImageView Avdeev;
        Avdeev = new ImageView(imAvdeev);
        Avdeev.setPreserveRatio(true);
        Avdeev.setFitHeight(550);
        Avdeev.setFitWidth(550);
        Avdeev.setLayoutX(50);
        Avdeev.setLayoutY(120);

        Text textAvdeev = new Text("Родился 17 октября 1933 года в городе Ленинграде в семье служащего. " +
                "В 1941 году семья эвакуирована на Урал, где прожила до 1944г. Отец работал шахтостроителем, " +
                "местом жительства были то Урал, то Казахстан, то снова Урал. Окончив 7-летнюю школу, Юрий Иванович " +
                "в 1948 году уезжает к родственникам в Ленинград, через год возвращается на Урал. Оканчивает среднюю" +
                " школу, сдает экзамены в Уральский политехнический институт имени С.М.Кирова и зачисляется студентом " +
                "строительного факультета. Как и многие выпускники Уральского политехнического института, Юрий Иванович " +
                "получает направление на одно из уральских предприятий. \n \nВ  Ангарск переведен в июне 1957 года. Работал прорабом, начальником участка, " +
                "главным инженером, начальником СМУ, заместителем главного инженера и, не минуя ни одной ступеньки, " +
                "в 1983 году назначается начальником Ангарского управления строительства. Начальником Ангарского " +
                "управления строительства Юрия Ивановича назначил министр среднего машиностроения Ефим Павлович " +
                "Славский. Юрию Ивановичу доверили нести огромную ответственность за объемы строительных и монтажных " +
                "работ, за деятельность коллективов всех подразделений стройки." +
                " В эти годы бурно строились новые производства на Ангарском электролизном химическом комбинате," +
                " на разделительном и сублиматном заводах Ангарского производственного объединения «Ангарскнефтеоргсинтез»" +
                ", на производствах этилена-пропилена, карбомида, аммиака. \n \nВелось интенсивное гражданское строительство " +
                "в самом городе: ежегодно вводилось в эксплуатацию до 100 тысяч кв.м. жилья, школы, родильный дом, " +
                "детские сады, ясли, магазины и другие предприятия социально–культурно–бытового назначения. " +
                "Прокладывались новые трамвайные линии, обустраивались улицы и дороги, возводились но-вые предприятия " +
                "стройиндустрии. Таковы были потребности быстро растущего населения города.");

        textAvdeev.setFont(Font.font("Times New Roman", FontWeight.BOLD, 17));
        textAvdeev.setFill(Color.BLACK);
        textAvdeev.setWrappingWidth(700);
        textAvdeev.setLayoutX(520);
        textAvdeev.setLayoutY(150);

        Image imAlekseev = new Image(this.getClass().getResource("/honors/Alekseev.jpg").toString());
        ImageView Alekseev;
        Alekseev = new ImageView(imAlekseev);
        Alekseev.setPreserveRatio(true);
        Alekseev.setFitHeight(550);
        Alekseev.setFitWidth(550);
        Alekseev.setLayoutX(50);
        Alekseev.setLayoutY(120);

        Text textAlekseev = new Text("Родился 21 января 1923 года в Уфе. С 5 лет пристрастился к чтению. " +
                "«Дубовый листок ото-рвался от ветки родимой» – первые прочитанные  самостоятельно стихи М.Ю.Лермонтова. " +
                "С 7 класса стал увлекаться поэзией. В 1939 году в газете «Орский рабочий» появились первые стихи " +
                "Валерия Анатольевича." +
                "Валерий Анатольевич - участник Великой Отечественной войны. В сентябре 1941 года едва не погиб под " +
                "Ельней при бомбежке. В декабре 1941 года, будучи уволенным из армии по состоянию здоровья, вернулся " +
                "в город Орск и сразу же пошел работать на военный завод. Одновременно стал учиться на заочном " +
                "отделении Московского механического института. По окончанию обучения в 1945 году начал работать " +
                "в отделе главного конструктора Южно-Уральского машиностроительного завода. С группой специалистов " +
                "Валерий был направлен в Москву в ЦН ИИТМАШ конструктором." +
                "В 1946 году Центральный Комитет Всесоюзного Ленинского Коммунистического Союза Молодежи (ЦК ВЛКСМ) " +
                "направил В.А.Алексеева в институт международных отношений. В это же время Валерий Анатольевич - " +
                "лектор–международник ЦК ВЛКСМ. Учеба шла успешно, но в феврале 1948 года он был арестован и осужден " +
                "особым совещанием по ст. 58–10 на 10 лет лишения свободы. У него во время обыска на квартире нашли " +
                "сборник «Чтец-декламатор» 1929 года издания, в котором были напечатаны «Песнь о великом походе» Есенина " +
                "и статья Троцкого  «Ленина нет».  Это и явилось основанием для ареста. Отбывать срок довелось в " +
                "нескольких лагерях для заключенных, познать, что такое лесоповал." +
                "     После четырех лагерей в Китойский ИТЛ Валерий Анатольевич был переведен в 1953 году. " +
                "Несмотря на то, что Валерий Анатольевич был заключенным, он  работал по специальности  " +
                "инженера-механика на объектах строительства Ангарска." +
                "      Валерий Алексеев по истечении семи лет заключения, был освобожден досрочно по зачетам " +
                "(1 год шел за 3) 1 июня 1954 года. С 1954  по 1957 год В.А.Алексеев работал на заводе № 3 " +
                "производственного объединения «Ангарскнефтеоргсинтез» в должности мастера, старшего инженера и " +
                "начальника цеха, проявил себя настоящим тружеником и по ходатайствам через год судимость была снята. " +
                "Позже  у Валерия была возможность уехать из Ангар-ска. Не смог. Этот город стал его судьбой. " +
                "Здесь родились дети, здесь растут его внуки.");
        textAlekseev.setFont(Font.font("Times New Roman", FontWeight.BOLD, 17));
        textAlekseev.setFill(Color.BLACK);
        textAlekseev.setWrappingWidth(700);
        textAlekseev.setLayoutX(520);
        textAlekseev.setLayoutY(150);

        Image imAleshin = new Image(this.getClass().getResource("/honors/Aleshin.jpg").toString());
        ImageView Aleshin;
        Aleshin = new ImageView(imAleshin);
        Aleshin.setPreserveRatio(true);
        Aleshin.setFitHeight(550);
        Aleshin.setFitWidth(550);
        Aleshin.setLayoutX(50);
        Aleshin.setLayoutY(120);

        Text textAleshin = new Text("Родился  26 июля 1934 года в г.Тулуне Иркутской области.\n" +
                "Свою трудовую деятельность начал в 1957 году на Комбинате-16 и прошел трудовой путь от бригадира " +
                "до начальника Ремонтно-строительного управления № 1. В 1970 году окончил Иркутский политехнический " +
                "институт. В 1977 году был назначен начальником Ремонтно-строительного управления Жилищно-коммунального " +
                "управления производственного объединения «Ангарскнефтеоргсинтез». В 1980 году был переведен на " +
                "должность начальника Жилищно-коммунального управления производственного объединения " +
                "«Ангарскнефтеоргсинтез» (ныне - Управление социально-культурной сферы АО «Ангарская " +
                "нефтехимическая компания»), проработав в этой должности до 2011 года. Именно в этой должности " +
                "раскрылся его управленческий талант.\n" +
                "Под его руководством проводилось благоустройство города, своевременный ремонт домов, строились и " +
                "модернизировались детские оздоровительные лагеря, в которых и сегодня ежегодно поддерживают здоровье " +
                "до 3700 маленьких ангарчан. Оздоровительные лагеря «Юбилейный» и «Здоровье» входили в десятку лучших " +
                "в стране, приносили славу городу Ангарску. Базы отдыха «Ангара» и «Утулик» были благоустроены и " +
                "теперь принимают отдыхающих круглый год. Спортивный комплекс «Ангара» стал центром спортивной жизни " +
                "города. Спортивные арены стадиона, спортивные залы АНХК принимали лучших спортсменов страны. " +
                "Именно здесь уложена первая в Сибири искусственная беговая дорожка, а слава о конькобежной дорожке " +
                "стадиона «Ангара» шла по всей стране, как самой быстрой. Много внимания уделял молодежным общежитиям " +
                "комбината, создавая все условия для полноценного отдыха, питания, учебы и занятия спортом.\n" +
                "Анатолий Константинович шесть созывов подряд избирался и работал депутатом Ангарского городского " +
                "Совета депутатов трудящихся и три созыва депутатом районного Совета депутатов трудящихся.\n" +
                "В мае 2013 года ушел на заслуженный отдых. Анатолия Константиновича Алёшина не стало 17 июня 2014 " +
                "года. В память об Алёшине А.К. на здании Управления Комплекса социально-культурной сферы АО «АНХК» " +
                "(улица Восточная, дом 32) установлена мемориальная доска");
        textAleshin.setFont(Font.font("Times New Roman", FontWeight.BOLD, 16));
        textAleshin.setFill(Color.BLACK);
        textAleshin.setWrappingWidth(700);
        textAleshin.setLayoutX(520);
        textAleshin.setLayoutY(150);

        choice.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            public void changed(ObservableValue<? extends String> ov, String old_val, String new_val) {
                if (new_val.equals("Выберите почетного гражданина")) {
                    Avdeev.setVisible(false);
                    textAvdeev.setVisible(false);
                    Alekseev.setVisible(false);
                    textAlekseev.setVisible(false);
                    Aleshin.setVisible(false);
                    textAleshin.setVisible(false);
                }
                if(new_val.equals("Авдеев Юрий Иванович")){
                    Avdeev.setVisible(true);
                    textAvdeev.setVisible(true);
                    Alekseev.setVisible(false);
                    textAlekseev.setVisible(false);
                    Aleshin.setVisible(false);
                    textAleshin.setVisible(false);
                }
                if(new_val.equals("Алексеев Валерий Анатольевич")){
                    Alekseev.setVisible(true);
                    textAlekseev.setVisible(true);
                    Avdeev.setVisible(false);
                    textAvdeev.setVisible(false);
                    Aleshin.setVisible(false);
                    textAleshin.setVisible(false);
                }
                if(new_val.equals("Алёшин Анатолий Константинович")){
                    Avdeev.setVisible(false);
                    textAvdeev.setVisible(false);
                    Alekseev.setVisible(false);
                    textAlekseev.setVisible(false);
                    Aleshin.setVisible(true);
                    textAleshin.setVisible(true);
                }
            }
        });
        choice.setLayoutX(50);
        choice.setLayoutY(50);

        Text nameHonors = new Text("Почетные граждане города");
        nameHonors.setStyle("-fx-font-family: \"Times New Roman\"; " +
                "-fx-font-size: 32pt; " +
                "-fx-font-weight: bold; " +
                "-fx-font-style: italic; ");
        nameHonors.setLayoutX(410);
        nameHonors.setLayoutY(35);

        pane.getChildren().add(nameHonors);
        pane.getChildren().add(choice);
        pane.getChildren().add(Avdeev);
        pane.getChildren().add(textAvdeev);
        pane.getChildren().add(Alekseev);
        pane.getChildren().add(textAlekseev);
        pane.getChildren().add(Aleshin);
        pane.getChildren().add(textAleshin);

        // Скрываем при открытии нового окна всю информацию о людях;
        Avdeev.setVisible(false);
        textAvdeev.setVisible(false);
        Alekseev.setVisible(false);
        textAlekseev.setVisible(false);
        Aleshin.setVisible(false);
        textAleshin.setVisible(false);

        // Создаем сцену и устанавливаем контент в новое окно
        Scene scene = new Scene(pane);
        newStage.setScene(scene);
        newStage.setTitle("Почетные граждане");
        newStage.getIcons().add(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/icons/icon.png"))));

        primaryStage.toFront(); // Перемещаем исходное окно вверх стека окон
        newStage.show();
    }
}
