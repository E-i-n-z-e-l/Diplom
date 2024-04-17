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

public class windowStreetsCitezen implements EventHandler<ActionEvent> {
    private Stage primaryStage;

    public windowStreetsCitezen(Stage primaryStage) {
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

        Text nameStreets = new Text("Их именами названы улицы");
        nameStreets.setStyle("-fx-font-family: \"Times New Roman\"; " +
                "-fx-font-size: 32pt; " +
                "-fx-font-weight: bold; " +
                "-fx-font-style: italic; ");
        nameStreets.setLayoutX(410);
        nameStreets.setLayoutY(35);

        Image imJadnov = new Image(this.getClass().getResource("/streets/Jadnov.jpg").toString());
        ImageView Jadnov;
        Jadnov = new ImageView(imJadnov);
        Jadnov.setPreserveRatio(true);
        Jadnov.setFitHeight(550);
        Jadnov.setFitWidth(550);
        Jadnov.setLayoutX(50);
        Jadnov.setLayoutY(120);

        Text textJadnov = new Text("Родился 6 июня 1924 года в городе Болхове Орловской области. До войны работал " +
                "учеником токаря транспортно- ремонтных мастерских станции Ак-Булак. С августа 1942 года по февраль " +
                "1943 года учился в военно-техническом училище. Пётр Петрович воевал в составе 971-го стрелкового " +
                "полка 273-й стрелковой дивизии.\n \n" +
                "После окончания Великой Отечественной войны с августа 1946 по июль 1951 года – студент Московского " +
                "института химического машиностроения. Окончив его, в 1951 году получил направление в город Ангарск " +
                "принимать оборудование для комбината-16. С августа 1951г. работал на комбинате в должности механика," +
                " заместителя начальника, начальника цеха компрессии (объект 78). В 1958 году назначен главным " +
                "механиком завода полукоксования. В 1959 году – главный механик химического завода. С 1961 по 1968 " +
                "год работал руководителем капитального строительства УКСа (Управление капитального строительства).\n \n" +
                "При участии Петра Петровича Жаднова введены в эксплуатацию важнейшие производства минеральных " +
                "удобрений, аммиака, карбамида, аммиачной селитры. Пётр Петрович активно занимался вопросами " +
                "благоустройства города. \n \n" +
                "Жаднов Пётр Петрович умер 2 ноября 1968 года.");
        textJadnov.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));
        textJadnov.setFill(Color.BLACK);
        textJadnov.setWrappingWidth(700);
        textJadnov.setLayoutX(520);
        textJadnov.setLayoutY(150);


        Image imNasurov = new Image(this.getClass().getResource("/streets/Nasurov.jpg").toString());
        ImageView Nasurov;
        Nasurov = new ImageView(imNasurov);
        Nasurov.setPreserveRatio(true);
        Nasurov.setFitHeight(550);
        Nasurov.setFitWidth(550);
        Nasurov.setLayoutX(50);
        Nasurov.setLayoutY(120);

        Text textNasurov = new Text("Родился 5 декабря 1924 года. Отец был репрессирован, поэтому маленького Юру " +
                "отправили учиться в детский дом. После окончания обучения и до призыва в армию работал пионерским " +
                "вожатым в поселковой школе золотодобытчиков на Маме. Очень талантливый и энергичный юноша был " +
                "призван в недействующую армию.\n \n" +
                "После окончания службы в Советской армии Юрий Григорьевич поступил учиться на исторический факультет " +
                "Иркутского государственного педагогического института, окончил его с «красным» дипломом. Все годы " +
                "учёбы он ходил в солдатской форме, другой одежды у него не было. В марте 1949 года его оставили " +
                "работать в институте на должности секретаря комитета комсомола.\n \n" +
                "В 1950 году Юрия Григорьевича перевели на должность ассистента кафедры педагогики, а в 1955 году – " +
                "преподавателя. В 1956 году его назначили заместителем декана историко-филологического факультета.\n \n" +
                " Юрия Григорьевича Насырова ждала блестящая карьера учёного, но он круто изменил свою судьбу. В июле " +
                "1958 года он ушёл из института в систему Областного отдела народного образования и возглавил первую " +
                "школу-интернат № 2 в Ангарске.\n \n" +
                "В 1965 году Юрий Григорьевич готовил к открытию и возглавлял педагогический коллектив школы-интерната " +
                "№ 7. В 1968 году Юрия Григорьевича Насырова утвердили на должность заведующего городским отделом " +
                "народного образования. Но в 1974 году он вновь вернулся на работу в школу-интернат № 7, считая его " +
                "своим детищем. 15 августа 1981 года он ушёл на пенсию. \n");
        textNasurov.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));
        textNasurov.setFill(Color.BLACK);
        textNasurov.setWrappingWidth(700);
        textNasurov.setLayoutX(520);
        textNasurov.setLayoutY(150);

        Image imNovokshenov = new Image(this.getClass().getResource("/streets/Novokshenov.jpg").toString());
        ImageView Novokshenov;
        Novokshenov = new ImageView(imNovokshenov);
        Novokshenov.setPreserveRatio(true);
        Novokshenov.setFitHeight(550);
        Novokshenov.setFitWidth(550);
        Novokshenov.setLayoutX(50);
        Novokshenov.setLayoutY(120);

        Text textNovokshenov = new Text("Родился 13 апреля 1915 года в г. Кирове. В 1923 году его семья переехала " +
                "в г. Свердловск. В 1932 году Виктор окончил Свердловский энергетический техникум и был распределен " +
                "для работы в системе Уралэнерго, где трудился диспетчером энергосистемы, дежурным инженером Кизел-ГРЭС, " +
                "главным диспетчером энергосистемы. \n \n" +
                "В 1945 году В.Ф.Новокшенов без отрыва  от производства поступил учиться в Уральский политехнический " +
                "институт, который окончил в 1951 году, получив квалификацию инженера-теплоэнергетика. В 1950 году " +
                "Виктор Федорович в соответствии с Постановлением Совета Министров СССР был направлен на первый в " +
                "стране завод по разделению изотопов урана, где прошел стажировку и был назначен начальником цеха. " +
                "Очень быстро он проявил себя как высоко эрудированный, талантливый инженер, целеустремленный и " +
                "опытный организатор производства. \n \n" +
                "В сентябре 1954 года, с началом строительства Ангарского электролизного химического комбината " +
                "В.Ф.Новокшенов, уже участвовавший в пуске и эксплуатации аналогичного оборудования, был назначен " +
                "директором строящегося предприятия. Строительство комбината шло в небывало сжатые сроки. Не прошло " +
                "и 3-х лет, как 21 октября 1957 года состоялся пуск производства, и была получена первая продукция, " +
                "а  к 1963 году - возведены и сданы в эксплуатацию все основные объекты, в том числе Иркутская ТЭЦ-10. " +
                "Вместе с комбинатом был построен жилой район г.Ангарска с необходимой социальной инфраструктурой.\n \n" +
                "В.Ф.Новокшенов проработал директором комбината до 28 мая 1985 года. Под его руководством комбинат " +
                "вышел на проектную мощность, проведена реконструкция  химического завода с использованием " +
                "конструкторских решений, не имеющих аналогов в мире, приняты принципиальные решения, позволившие " +
                "позднее его преемникам  произвести замену энергоёмкого оборудования на электролизном заводе и " +
                "создавшие предпосылки для успешной конкуренции комбината на мировом рынке обогащенного урана.\n");
        textNovokshenov.setFont(Font.font("Times New Roman", FontWeight.BOLD, 16));
        textNovokshenov.setFill(Color.BLACK);
        textNovokshenov.setWrappingWidth(700);
        textNovokshenov.setLayoutX(520);
        textNovokshenov.setLayoutY(150);

        // Создаем список почетных граждан;
        ObservableList<String> SreetsCitizens = FXCollections.observableArrayList(
                "Выберите гражданина чьим именем названа улица","Жаднов Пётр Петрович",
                "Насыров Юрий Григорьевич", "Новокшенов Виктор Фёдорович");
        ChoiceBox<String> choice = new ChoiceBox<String>(SreetsCitizens);
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
                if (new_val.equals("Выберите гражданина")) {
                    Jadnov.setVisible(false);
                    textJadnov.setVisible(false);
                    Nasurov.setVisible(false);
                    textNasurov.setVisible(false);
                    Novokshenov.setVisible(false);
                    textNovokshenov.setVisible(false);
                }
                if(new_val.equals("Жаднов Пётр Петрович")){
                    Jadnov.setVisible(true);
                    textJadnov.setVisible(true);
                    Nasurov.setVisible(false);
                    textNasurov.setVisible(false);
                    Novokshenov.setVisible(false);
                    textNovokshenov.setVisible(false);
                }
                if(new_val.equals("Насыров Юрий Григорьевич")){
                    Jadnov.setVisible(false);
                    textJadnov.setVisible(false);
                    Nasurov.setVisible(true);
                    textNasurov.setVisible(true);
                    Novokshenov.setVisible(false);
                    textNovokshenov.setVisible(false);
                }
                if(new_val.equals("Новокшенов Виктор Фёдорович")){
                    Jadnov.setVisible(false);
                    textJadnov.setVisible(false);
                    Nasurov.setVisible(false);
                    textNasurov.setVisible(false);
                    Novokshenov.setVisible(true);
                    textNovokshenov.setVisible(true);
                }
            }
        });

        choice.setLayoutX(50);
        choice.setLayoutY(50);
        pane.getChildren().add(choice);
        pane.getChildren().add(nameStreets);
        pane.getChildren().add(Jadnov);
        pane.getChildren().add(textJadnov);
        pane.getChildren().add(Nasurov);
        pane.getChildren().add(textNasurov);
        pane.getChildren().add(Novokshenov);
        pane.getChildren().add(textNovokshenov);

        // Скрываем при открытии нового окна всю информацию о людях;
        Jadnov.setVisible(false);
        textJadnov.setVisible(false);
        Nasurov.setVisible(false);
        textNasurov.setVisible(false);
        Novokshenov.setVisible(false);
        textNovokshenov.setVisible(false);

        // Создаем сцену и устанавливаем контент в новое окно
        Scene scene = new Scene(pane);
        newStage.setScene(scene);
        newStage.setTitle("Их именами названы улицы");
        newStage.getIcons().add(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/icons/icon.png"))));

        primaryStage.toFront(); // Перемещаем исходное окно вверх стека окон
        newStage.show();
    }


}
