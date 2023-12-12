package PRAKTIKUM6;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) {
        TableView tabel = new TableView();
        tabel.setPlaceholder(new Label("Belum ada data!"));
        TableColumn <Mahasiswa, String> nama = new TableColumn <> ("NAMA");
        TableColumn <Mahasiswa, String> nim = new TableColumn <> ("NIM");
        nama.setCellValueFactory(new PropertyValueFactory <> ("nama"));
        nim.setCellValueFactory(new PropertyValueFactory <> ("nim"));
        tabel.getColumns().addAll(nim, nama);
        tabel.getItems().add(new Mahasiswa("Bima", "008", 1));
        tabel.getItems().add(new Mahasiswa("Hafizh", "007", 2));
        tabel.getItems().add(new Mahasiswa("Trisna", "021", 3));
        tabel.getItems().add(new Mahasiswa("Kevin", "031", 4));
        tabel.getItems().add(new Mahasiswa("Raihan", "001", 5));
        tabel.getItems().add(new Mahasiswa("Ryan", "013", 6));
        tabel.getItems().add(new Mahasiswa("Reza", "016", 7));
        tabel.getItems().add(new Mahasiswa("Jaya", "002", 8));
        tabel.getItems().add(new Mahasiswa("Pratama", "011", 9));
        tabel.getItems().add(new Mahasiswa("Permadi", "020", 10));
        VBox box = new VBox(tabel);
        Scene scene = new Scene(box);
        primaryStage.setMinWidth(350);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}