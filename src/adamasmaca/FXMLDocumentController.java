/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adamasmaca;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.util.Duration;
import javax.swing.JOptionPane;

/**
 *
 * @author yamak
 */
public class FXMLDocumentController implements Initializable {
    
    
    @FXML
    private Rectangle rect1;
    @FXML
    private Rectangle rect2;
    @FXML
    private Rectangle rect3;
    @FXML
    private Rectangle rect4;
    @FXML
    private Rectangle rect5;
    @FXML
    private Rectangle rect6;
    @FXML
    private Rectangle rect7;
    @FXML
    private Rectangle rect8;
    @FXML
    private Rectangle rect9;
    @FXML
    private TextArea txtA;
    @FXML
    private Text txtK;
    @FXML
    private GridPane gp;
    @FXML
    private Button btnYO;
    
    
    String alttire="";
    int counter=0;
    
    
    String sorular[]= {"ENDER'BABASININ ADI NEDİR","BREZİLYANIN BASKENTİ NERESİ",
        "ATATÜRK HANGİ KONGRE'DE MİLLETVEKİLİ SEÇİLMİŞTİR?","SDÜ AÇILIMI NASILDIR?"};
    String cevaplar[]= {"ibrahim","rio ","erzurum","SÜLEYMAN DEMİREL ÜNİVERSİTESİ"};
    
    Random rnd=new Random();
    int i=rnd.nextInt(sorular.length);
    String secilenSoruCevap=cevaplar[i];
    char [] kelime=secilenSoruCevap.toCharArray();
    
    @FXML
    private Label label;
   
    
  
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         txtA.setText(sorular[i]);
         char bosluk=' ';
         
         for(int k=0;k<kelime.length;k++){
             if(kelime[k]==bosluk)
                 alttire=alttire+" ";
             else
                 alttire=alttire+"_";
             
                 
         }
         
        
         label.setText(alttire);
         gridPaneDoldur();
         
          
    }    

   

    @FXML
    private void buttonBasildi(MouseEvent event) {
        Button btn=(Button)event.getSource();//gridpane de hangi butona tıklandıgı bulundu
        int sayac=0;
        for(int z=0;z<secilenSoruCevap.length();z++){
            if(secilenSoruCevap.substring(z, z+1).equalsIgnoreCase(btn.getText())){
                char [] alttire2=alttire.toCharArray();
                alttire2[z]=secilenSoruCevap.charAt(z);
                alttire=String.valueOf(alttire2);
                label.setText(alttire);
                sayac++;
                btn.setDisable(true);
                kontrol();
            }
        }
        if(sayac==0){
            counter++;
        if(counter==9){
            gp.setDisable(true);
            JOptionPane.showMessageDialog(null, "Üzgünüz, doğru cevabı bulamadınız."
+ "Doğru Cevap :"+secilenSoruCevap);
        }
        rectGoster(counter);
        sayac=0;
        }
    }

    
    
    
    
    
    @FXML
    private void yenidenOyna(ActionEvent event) {
    }

    
    
    
    
    
    
  public void gridPaneDoldur(){
      int sutun=0,satir=0;
      String kelime="abcçdefgğhıijklmnoöprsştuüvyz";
      for(int i=0;i<29;i++){
          Button btn=new Button(kelime.substring(i,i+1));
          btn.setOnMouseClicked(this::buttonBasildi);
          
          gp.add(btn, sutun, satir);
          sutun++;
          if(sutun==8){
              sutun=0;
              satir++;
          }
          
      }
  }
  
  
  
  
  public void kontrol(){
      if(secilenSoruCevap.equalsIgnoreCase(label.getText()))
          JOptionPane.showMessageDialog(null, "Tebrikler Kelimeyi Doğru Bildiniz.");
  }
  
  
  
  
  
  
  
  public void rectGoster(int i){
if(i==1){
rect1.setVisible(true);
FadeTransition ft = new FadeTransition(Duration.millis(3000), rect1);
ft.setFromValue(1.0);
ft.setToValue(0.1);
ft.setCycleCount(2);
ft.setAutoReverse(true);
ft.play();
}
if(i==2){
rect2.setVisible(true);
FadeTransition ft = new FadeTransition(Duration.millis(3000), rect2);
ft.setFromValue(1.0);
ft.setToValue(0.1);
ft.setCycleCount(2);
ft.setAutoReverse(true);
ft.play();
}
if(i==3){
rect3.setVisible(true);
FadeTransition ft = new FadeTransition(Duration.millis(3000), rect3);
ft.setFromValue(1.0);
ft.setToValue(0.1);
ft.setCycleCount(2);
ft.setAutoReverse(true);
ft.play();
}
if(i==4){
rect4.setVisible(true);
FadeTransition ft = new FadeTransition(Duration.millis(3000), rect4);
ft.setFromValue(1.0);
ft.setToValue(0.1);
ft.setCycleCount(2);
ft.setAutoReverse(true);
ft.play();
}
if(i==5){
rect5.setVisible(true);
FadeTransition ft = new FadeTransition(Duration.millis(3000), rect5);
ft.setFromValue(1.0);
ft.setToValue(0.1);
ft.setCycleCount(2);
ft.setAutoReverse(true);
ft.play();
}
if(i==6){
rect6.setVisible(true);
FadeTransition ft = new FadeTransition(Duration.millis(3000), rect6);
ft.setFromValue(1.0);
ft.setToValue(0.1);
ft.setCycleCount(2);
ft.setAutoReverse(true);
ft.play();
}
if(i==7){
rect7.setVisible(true);
FadeTransition ft = new FadeTransition(Duration.millis(3000), rect7);
ft.setFromValue(1.0);
ft.setToValue(0.1);
ft.setCycleCount(2);
ft.setAutoReverse(true);
ft.play();
}
if(i==8){
rect8.setVisible(true);
FadeTransition ft = new FadeTransition(Duration.millis(3000), rect8);
ft.setFromValue(1.0);
ft.setToValue(0.1);
ft.setCycleCount(2);
ft.setAutoReverse(true);
ft.play();
}
if(i==9){
rect9.setVisible(true);
FadeTransition ft = new FadeTransition(Duration.millis(3000), rect9);
ft.setFromValue(1.0);
ft.setToValue(0.1);
ft.setCycleCount(2);
ft.setAutoReverse(true);
ft.play();
}

}
    
  
  
  
  
}

