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

public class windowInstitutionsCitezen implements EventHandler<ActionEvent> {
    private Stage primaryStage;

    public windowInstitutionsCitezen(Stage primaryStage) {
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

        Text nameInstitutes = new Text("Их именами названы учреждения");
        nameInstitutes.setStyle("-fx-font-family: \"Times New Roman\"; " +
                "-fx-font-size: 32pt; " +
                "-fx-font-weight: bold; " +
                "-fx-font-style: italic; ");
        nameInstitutes.setLayoutX(350);
        nameInstitutes.setLayoutY(35);

        Image imAntonov = new Image(this.getClass().getResource("/institutes/Antonov.jpg").toString());
        ImageView Antonov;
        Antonov = new ImageView(imAntonov);
        Antonov.setPreserveRatio(true);
        Antonov.setFitHeight(550);
        Antonov.setFitWidth(550);
        Antonov.setLayoutX(50);
        Antonov.setLayoutY(120);

        Text textAntonov = new Text("Родился 31 декабря 1933года в городе Иркутске. Начал трудовую деятельность " +
                "в городе Ангарске в 1959 году с должности тренера по  футболу и хоккею с мячом в коллективе " +
                "физической культуры Комбината-16. Дружба со спортом началась в годы учебы, о чем свидетельствует " +
                "грамота ректора Горно-металлургического института «За активное участие в оборонно-спортивной работе " +
                "и отличные организаторские способности».\n \n" +
                "В 1960 году Антонов П.Д. в составе Иркутской команды «Локомотив» стал чемпионом России " +
                "по хоккею с мячом.\n \n" +
                "В 1967 году Антонов П.Д. заочно окончил Омский Государственный институт фи-зической культуры.\n \n" +
                "Первый успех на тренерской работе пришел в 1962 году, когда команда «Ангара» выиграла чемпионат " +
                "области и получила право на участие в первенстве России среди команд мастеров. Антонов П.Д. был " +
                "назначен тренером команды и способствовал становлению в Ангарске команды мастеров. Под его " +
                "руководством в период 1974-1977 годов команды юношей г.Ангарска становятся чемпионами и призерами " +
                "России.\n \n" +
                "В 1978 году Антонов П.Д. назначен старшим тренером команды мастеров, и команда «Ангара», собранная " +
                "из ангарских воспитанников, стала одной из сильнейших в зоне Сибири и Дальнего Востока. Антонов " +
                "П.Д. был включен в десятку лучших тренеров России с вручением памятной медали Федерации Футбола.\n \n" +
                "Свыше 20 воспитанников Антонова П.Д. играли и играют в командах мастеров первой и высшей лигах. " +
                "Некоторые из них стали прекраснейшими тренерами команд ма-стеров: Муратов С. – «Звезда» Иркутск, " +
                "Измайлов О. – «Сибиряк» Братск, Бологов С. – «Кузбасс» Кемерово, Толчев В. – «Иртыш» Омск, " +
                "Бобриков А., Корженко И. – «Ангара» Ангарск.\n");
        textAntonov.setFont(Font.font("Times New Roman", FontWeight.BOLD, 16));
        textAntonov.setFill(Color.BLACK);
        textAntonov.setWrappingWidth(700);
        textAntonov.setLayoutX(520);
        textAntonov.setLayoutY(150);

        Image imBadenikov = new Image(this.getClass().getResource("/institutes/Badenikov.jpg").toString());
        ImageView Badenikov;
        Badenikov = new ImageView(imBadenikov);
        Badenikov.setPreserveRatio(true);
        Badenikov.setFitHeight(550);
        Badenikov.setFitWidth(550);
        Badenikov.setLayoutX(50);
        Badenikov.setLayoutY(120);

        Text textBadenikov = new Text("Родился 12 июля 1937г. в селе Тангуты Нукутского района Иркутской области. " +
                "С 1956 по 1960гг. служил в Вооруженных силах СССР. В 1966г. окончил Иркутский политехнический институт " +
                "по специальности «горный инженер-электромеханик».\n \n" +
                "     Начав с должности ассистента кафедры, он прошел все ступени педагогической и административной " +
                "работы - старшего преподавателя, доцента, заведующего кафедрой автоматизации, заместителя декана " +
                "факультета - и сформировался в высокоэрудированного опытного педагога-воспитателя. В 1974 году ему " +
                "присуждена ученая степень кандидата технических наук. Широта знаний, постоянный творческий поиск, " +
                "организаторские способности, высокое чувство ответственности за порученное дело способствовали " +
                "назначению в 1985г. Баденикова В.Я. на должность директора Ангарского филиала Иркутского " +
                "политехнического института. В 1990 году ему  было присвоено ученое звание профессора, в 1996 году" +
                " он защитил докторскую диссертацию в Томском государственном университете.  \n \n" +
                "     Благодаря инициативе Баденикова В.Я. и активной поддержке руководителя «Ангарскнефтеоргсинтез» " +
                "в Ангарске было создано первое самостоятельное высшее учебное заведение - Ангарский технологический " +
                "институт (с 1988г. завод-втуз, с 2000 г. - Ангарская государственная техническая академия).\n \n" +
                "     Работая в должности ректора АГТА, Бадеников В.Я. внес большой вклад в организацию и формирование " +
                "системы высшего образования в г. Ангарске, коллектив под его руководством вывел академию в разряд " +
                "ведущих вузов Иркутской области по материально-технической базе, уровню квалификации " +
                "профессорско-преподавательского состава, социальной устроенности коллектива.\n");
        textBadenikov.setFont(Font.font("Times New Roman", FontWeight.BOLD, 16));
        textBadenikov.setFill(Color.BLACK);
        textBadenikov.setWrappingWidth(700);
        textBadenikov.setLayoutX(520);
        textBadenikov.setLayoutY(150);

        Image imBakalov = new Image(this.getClass().getResource("/institutes/Bakalov.jpg").toString());
        ImageView Bakalov;
        Bakalov = new ImageView(imBakalov);
        Bakalov.setPreserveRatio(true);
        Bakalov.setFitHeight(550);
        Bakalov.setFitWidth(550);
        Bakalov.setLayoutX(50);
        Bakalov.setLayoutY(120);

        Text textBakalov = new Text("Родился 14 декабря 1940 года в Приморском крае в семье рабочих. Окончив среднюю " +
                "школу, поступил в Уссурийский педагогический институт. В 1963 году окончил институт по специальности " +
                "«английский язык». С 1963 по 1965г.г. служил в рядах Советской Армии.\n \n" +
                "В 1965 году приехал в Ангарск и начал свою профессиональную деятельность учителем английского языка " +
                "в средних школах № 4 и № 7, затем заместителем директора по учебно-воспитательной работе средней " +
                "школы № 7, с 1977 по 1987г.г. – директор средней школы № 35.\n \n" +
                "В 1987 году Бакалов Пётр Григорьевич принял школу-новостройку № 17 (микрорайон 17, дом 17). " +
                "Школа была открыта как экспериментальная. Весь педагогический коллектив состоял из выпускников " +
                "Иркутского педагогического института. Подобная экспериментальная школа была единственной в области. " +
                "Пётр Григорьевич работал директором школы на протяжении 24 лет. Большой опыт работы позволял ему " +
                "успешно руководить школой в современных условиях и добиваться высоких результатов.\n \n" +
                "Пётр Григорьевич – неравнодушный хозяин, он все годы старательно сохранял и пополнял в соответствии " +
                "с современными требованиями материально-техническую базу МБОУ «СОШ № 17». Ежегодно комиссия по приёмке " +
                "отмечала отличную подготовку школы к началу учебного года.\n \n" +
                "Пётр Григорьевич не только хороший хозяйственник, но и умелый организатор. Под его руководством началось " +
                "освоение новаций. Школа являлась экспериментальной площадкой муниципального уровня. Работа " +
                "экспериментальной площадки «Развитие эмоционального интеллекта как условие формирования социальной " +
                "компетенции учащихся и профессиональной компетентности педагогов» и участие в Мега-проекте " +
                "«Одарённые дети» по теме «Выявление латентных талантов» давало положительные результаты: " +
                "увеличивалось количество учащихся, занимающих призовые места в олимпиадах и конкурсах различного " +
                "уровня; выпускники школы сдавали ЕГЭ со 100% успеваемостью. МБОУ «СОШ №17» входило и входит в пятёрку " +
                "лучших общеобразовательных школ города.\n \n" +
                "Заслуга Бакалова П.Г. и в том, что он сформировал стабильный коллектив педагогов-профессионалов и " +
                "отток ученического контингента в инновационные общеобразовательные учреждения был минимальный. " +
                "Пётр Григорьевич пользовался уважением среди учащихся и родителей, его ценили педагоги. Умер в Ангарске " +
                "28 октября 2021 года.\n");
        textBakalov.setFont(Font.font("Times New Roman", FontWeight.BOLD, 14));
        textBakalov.setFill(Color.BLACK);
        textBakalov.setWrappingWidth(700);
        textBakalov.setLayoutX(520);
        textBakalov.setLayoutY(150);

        // Создаем список граждан;
        ObservableList<String> InstitutesCitizens = FXCollections.observableArrayList(
                "Выберите гражданина чьим именем названо учреждение","Антонов Петр Дмитриевич",
                "Бадеников Виктор Яковлевич", "Бакалов Пётр Григорьевич");
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
        choice.setPrefSize(700, 50);
        choice.setTooltip(new Tooltip("Выберите гражданина"));
        choice.getSelectionModel().selectFirst();

        choice.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            public void changed(ObservableValue<? extends String> ov, String old_val, String new_val) {
                if (new_val.equals("Выберите гражданина чьим именем названо учреждение")) {
                    Antonov.setVisible(false);
                    textAntonov.setVisible(false);
                    Badenikov.setVisible(false);
                    textBadenikov.setVisible(false);
                    Bakalov.setVisible(false);
                    textBakalov.setVisible(false);
                }
                if(new_val.equals("Антонов Петр Дмитриевич")){
                    Antonov.setVisible(true);
                    textAntonov.setVisible(true);
                    Badenikov.setVisible(false);
                    textBadenikov.setVisible(false);
                    Bakalov.setVisible(false);
                    textBakalov.setVisible(false);
                }
                if(new_val.equals("Бадеников Виктор Яковлевич")){
                    Antonov.setVisible(false);
                    textAntonov.setVisible(false);
                    Badenikov.setVisible(true);
                    textBadenikov.setVisible(true);
                    Bakalov.setVisible(false);
                    textBakalov.setVisible(false);
                }
                if(new_val.equals("Бакалов Пётр Григорьевич")){
                    Antonov.setVisible(false);
                    textAntonov.setVisible(false);
                    Badenikov.setVisible(false);
                    textBadenikov.setVisible(false);
                    Bakalov.setVisible(true);
                    textBakalov.setVisible(true);
                }
            }
        });
        choice.setLayoutX(50);
        choice.setLayoutY(50);

        pane.getChildren().add(choice);
        pane.getChildren().add(nameInstitutes);
        pane.getChildren().add(Antonov);
        pane.getChildren().add(textAntonov);
        pane.getChildren().add(Badenikov);
        pane.getChildren().add(textBadenikov);
        pane.getChildren().add(Bakalov);
        pane.getChildren().add(textBakalov);


        // Скрываем при открытии нового окна всю информацию о людях;
        Antonov.setVisible(false);
        textAntonov.setVisible(false);
        Badenikov.setVisible(false);
        textBadenikov.setVisible(false);
        Bakalov.setVisible(false);
        textBakalov.setVisible(false);

        // Создаем сцену и устанавливаем контент в новое окно
        Scene scene = new Scene(pane);
        newStage.setScene(scene);
        newStage.setTitle("Их именами названы улицы");
        newStage.getIcons().add(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/icons/icon.png"))));

        primaryStage.toFront(); // Перемещаем исходное окно вверх стека окон
        newStage.show();

    }

}
