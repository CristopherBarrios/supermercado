package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;

public class Controller {
    //lista
    @FXML
    public void initialize() {

    }
        ObservableList<Person> data = FXCollections.observableArrayList(
                new Person("asdfasdf", "Smiasdfsdfth", "asdfasdf","asasdf"),
                new Person("zxcvzxcv", "zxcvxzcv","zxcvzxcvedfg","asdfesa"));

    //Cambio de ventana
        public void pressButton(ActionEvent event){
        try{

            FXMLLoader fxmlLoader= new FXMLLoader(getClass().getResource("super.fxml"));
            Parent root1= (Parent)fxmlLoader.load();

            Stage stage= new Stage();
            stage.setScene(new Scene(root1));

            stage.show();
            ((Node)event.getSource()).getScene().getWindow().hide();

        }catch (Exception e){e.printStackTrace();}

    }
    public void pressButton2(ActionEvent event){
        try{

            FXMLLoader fxmlLoader= new FXMLLoader(getClass().getResource("sample.fxml"));
            Parent root1= (Parent)fxmlLoader.load();

            Stage stage= new Stage();
            stage.setScene(new Scene(root1));

            stage.show();
            ((Node)event.getSource()).getScene().getWindow().hide();

        }catch (Exception e){e.printStackTrace();}

    }
    public void pressButton3(ActionEvent event){
        try{

            FXMLLoader fxmlLoader= new FXMLLoader(getClass().getResource("articulo.fxml"));
            Parent root1= (Parent)fxmlLoader.load();

            Stage stage= new Stage();
            stage.setScene(new Scene(root1));

            stage.show();
            ((Node)event.getSource()).getScene().getWindow().hide();

        }catch (Exception e){e.printStackTrace();}

    }
    public void pressButton4(ActionEvent event){
        try{

            FXMLLoader fxmlLoader= new FXMLLoader(getClass().getResource("lista.fxml"));
            Parent root1= (Parent)fxmlLoader.load();

            Stage stage= new Stage();
            stage.setScene(new Scene(root1));

            stage.show();
            ((Node)event.getSource()).getScene().getWindow().hide();

        }catch (Exception e){e.printStackTrace();}

    }




    }
