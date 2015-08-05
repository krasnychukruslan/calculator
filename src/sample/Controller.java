package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.PopupWindow;
import javafx.stage.Stage;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Controller {
    @FXML
    TextField text;
    @FXML
    Button one;
    @FXML
    Button two;
    @FXML
    Button three;
    @FXML
    Button four;
    @FXML
    Button five;
    @FXML
    Button six;
    @FXML
    Button seven;
    @FXML
    Button eight;
    @FXML
    Button nine;
    @FXML
    Button zero;
    @FXML
    Button add;
    @FXML
    Button min;
    @FXML
    Button dot;
    @FXML
    Button equal;
    String mem;
    @FXML
    public void dotListener(){
        String str = new String(text.getText());
        String[] ar = str.split(" ");
//        System.out.println(ar[0]);
//        System.out.println(ar[1]);
//        System.out.println(ar[2]);

        if(!ar[0].contains(".")){
            text.appendText(".");
        } else
        if(!ar[2].contains(".")){
            text.appendText(".");
        }

    }
    public void numberListener(ActionEvent event) {
        String digit = ((Button) event.getSource()).getText();
        text.appendText(digit);
    }
    public void result (){


        System.out.println(text.getText());
        String res = text.getText();
        String[] ar = res.split(" ");
//        System.out.println(ar[0]);
//        System.out.println(ar[1]);
//        System.out.println(ar[2]);
        String value2 = ar[1];
            double value1 = Double.parseDouble(ar[0]);
//          double value2 = Double.parseDouble(qq);
            double value3 = Double.parseDouble(ar[2]);
        String add = "+";
        String min = "-";
        String mno = "*";
        String dil = "/";
            if (value2.equals(add)){
                 double resRes = value1 + value3;
                String resRes1 = Double.toString(resRes);
                text.setText(resRes1);
            } else
            if (value2.equals(min)){
            double resRes = value1 - value3;
                String resRes1 = Double.toString(resRes);
                text.setText(resRes1);
            } else
            if (value2.equals(mno)){
            double resRes = value1 * value3;
                String resRes1 = Double.toString(resRes);
                text.setText(resRes1);
            } else
            if (value2.equals(dil)){
            double resRes = value1 / value3;
                String resRes1 = Double.toString(resRes);
                text.setText(resRes1);
        }



  //          System.out.println(valueRes);

    }
    public void functionAdd (){
//        String add = ((Button) event.getSource()).getText();
//        text.appendText(add);

       String add = new String(text.getText());
        if(!add.contains(" + ")){
            text.appendText(" + ");
        }
        result();
        text.appendText(" + ");
    }
    public void functionMin(){

        String min = new String(text.getText());
        if(!min.contains(" - ")){
            text.appendText(" - ");
        }
        result();
        text.appendText(" - ");
    }
    public void functionMno(ActionEvent event){

        String mno = new String(text.getText());
        if(!mno.contains(" * ")){
            text.appendText(" * ");
        }
        result();
        text.appendText(" * ");

    }
    public void functionDil() {

        String dil = new String(text.getText());
        if (!dil.contains(" / ")) {
            text.appendText(" / ");
        }
        result();
        text.appendText(" / ");
    }
    public void erase () {
        String res = new String(text.getText());
        text.deleteText(0,res.length());
    }
    public void eraseType(){
        String res = new String(text.getText());
        text.deleteText(res.length() - 1, res.length());
    }
    public void root (){
        String res = new String(text.getText());
        double res1 = Double.parseDouble(res);
        String resRes = Double.toString( Math.sqrt(res1));
        text.setText(resRes);
    }
        @FXML
        Button pM;
    public void plusMinus() {

        String res = new String(text.getText());
        double res1 = Double.parseDouble(res);
        if (res.length() == 0) {
            text.appendText("Error");
        } else {
            double res2 = res1 * (-1);
            String resRes = Double.toString(res2);
            text.setText(resRes);
        }
    }

    public void oneDil() {
        String res = new String(text.getText());
        double res1 = Double.parseDouble(res);
        double res2 = 1 / res1;
        String resRes = Double.toString(res2);
        text.setText(resRes);
    }
    public void interest(){
        String res = new String(text.getText());
        String[] ar = res.split(" ");

        double res1 = Double.parseDouble(ar[0]);
     // double res2 = Double.parseDouble(ar[1]);
        double res3 = Double.parseDouble(ar[2]);
        double res4 = res1 * res3 / 100;
        String add = "+";
        String min = "-";
        String mno = "*";
        String dil = "/";
        if (ar[1].equals(add)){
            double resRes = res1 + res4;
            String resRes1 = Double.toString(resRes);
            text.setText(resRes1);
        } else
        if (ar[1].equals(min)){
            double resRes = res1 - res4;
            String resRes1 = Double.toString(resRes);
            text.setText(resRes1);
        } else
        if (ar[1].equals(mno)){
            double resRes = res1 * res4;
            String resRes1 = Double.toString(resRes);
            text.setText(resRes1);
        } else
        if (ar[1].equals(dil)){
            double resRes = res1 / res4;
            String resRes1 = Double.toString(resRes);
            text.setText(resRes1);
        }
     }
    public void eraseString() {
        String res = new String(text.getText());
        String[] ar = res.split(" ");
        text.deleteText(ar[2].length(), res.length());
    }

    public void memoryAdd(){
        String res = new String(text.getText());
        double mem1;
        if(this.mem != null){
            mem1 = Double.parseDouble(mem);
        }else{
            mem1 = 0;
        }
        double res2 = Double.parseDouble(res);
        double resRes = mem1 + res2;
        String resRes1 = Double.toString(resRes);
        this.mem = resRes1;
        text.setText("");
    }
    public void memoryMin() {
        String res = new String(text.getText());
        double mem1;
        if(this.mem != null){
            mem1 = Double.parseDouble(mem);
        }else{
            mem1 = 0;
        }
        double res2 = Double.parseDouble(res);
        double resRes = mem1 - res2;
        String resRes1 = Double.toString(resRes);
        this.mem = resRes1;
        text.setText("");

    }
    public void memorySave(){
        String res = new String(text.getText());
        this.mem = res;
        text.setText("");
    }
    public void memoryClean(){
        //String mem = new String(text.getText());
        double mem1;
        mem1 = 0;
        String mem2 = Double.toString(mem1);
        this.mem = mem2;
        text.setText("");

    }
    public void memoryR(){
        text.setText(mem);
    }

    public void menuClose(){
      System.exit(0);
    }
//    public void menuAbout (Stage primaryStage) throws Exception{
//        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
//        primaryStage.setTitle("About");
//        primaryStage.setScene(new Scene(root));
//        primaryStage.show();
//    }
//    }
}




