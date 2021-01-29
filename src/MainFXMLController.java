/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author Asus
 */
public class MainFXMLController implements Initializable {

    @FXML
    private Button b11, b12, b13, b14, b15, b16, b17, b18, b19;
    @FXML
    private Button b21, b22, b23, b24, b25, b26, b27, b28, b29;
    @FXML
    private Button b31, b32, b33, b34, b35, b36, b37, b38, b39;

    @FXML
    private Button again,reset;
    @FXML
    private ImageView i11, i12, i13, i14, i15, i16, i17, i18, i19;
    @FXML
    private ImageView i21, i22, i23, i24, i25, i26, i27, i28, i29;
    @FXML
    private ImageView i31, i32, i33, i34, i35, i36, i37, i38, i39;
    @FXML
    private Label player1score;
    @FXML
    private Label player2score;
    @FXML
    private Label turn;

    private boolean victory;
    private List<Button> arrayButton1;
    private List<Button> arrayButton2;
    private List<Button> arrayButton3;

    private List<ImageView> arrayImage1;
    private List<ImageView> arrayImage2;
    private List<ImageView> arrayImage3;

    private List<Integer> array1;
    private List<Integer> array2;
    private List<Integer> array3;

    private List<Boolean> clicked1;
    private List<Boolean> clicked2;
    private List<Boolean> clicked3;
    private int player = 1;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
 player1score.setText(Main.score1+"");
  player2score.setText(Main.score2+"");
        
  again.setOnAction(e->{ try {
       Parent root = FXMLLoader.load(getClass().getResource("MainFXML.fxml"));
      Scene scene = new Scene(root);
      Main.stage.setScene(scene);
     } catch (IOException ex) {
         Logger.getLogger(MainFXMLController.class.getName()).log(Level.SEVERE, null, ex);
     }
});
  
   reset.setOnAction(e->{
       Main.score1 =0;
       Main.score2 =0;
       try {
       Parent root = FXMLLoader.load(getClass().getResource("MainFXML.fxml"));
      Scene scene = new Scene(root);
      Main.stage.setScene(scene);
     } catch (IOException ex) {
         Logger.getLogger(MainFXMLController.class.getName()).log(Level.SEVERE, null, ex);
     }
});
        
        array1 = new ArrayList<>();
        array2 = new ArrayList<>();
        array3 = new ArrayList<>();

        clicked1 = new ArrayList<>();
        clicked2 = new ArrayList<>();
        clicked3 = new ArrayList<>();

        arrayButton1 = new ArrayList<Button>(Arrays.asList(b11, b12, b13, b14, b15, b16, b17, b18, b19));
        arrayButton2 = new ArrayList<Button>(Arrays.asList(b21, b22, b23, b24, b25, b26, b27, b28, b29));
        arrayButton3 = new ArrayList<Button>(Arrays.asList(b31, b32, b33, b34, b35, b36, b37, b38, b39));

        arrayImage1 = new ArrayList<ImageView>(Arrays.asList(i11, i12, i13, i14, i15, i16, i17, i18, i19));
        arrayImage2 = new ArrayList<ImageView>(Arrays.asList(i21, i22, i23, i24, i25, i26, i27, i28, i29));
        arrayImage3 = new ArrayList<ImageView>(Arrays.asList(i31, i32, i33, i34, i35, i36, i37, i38, i39));

        for (int i = 0; i < 9; i++) {
            arrayButton1.get(i).setStyle("-fx-background-color: transparent;");
            arrayButton2.get(i).setStyle("-fx-background-color: transparent;");
            arrayButton3.get(i).setStyle("-fx-background-color: transparent;");
            array1.add(0);
            array2.add(0);
            array3.add(0);

            clicked1.add(false);
            clicked2.add(false);
            clicked3.add(false);
        }

        arrayButton1.get(0).setOnAction(e -> khedma(0, arrayImage1, clicked1, array1));
        arrayButton1.get(1).setOnAction(e -> khedma(1, arrayImage1, clicked1, array1));
        arrayButton1.get(2).setOnAction(e -> khedma(2, arrayImage1, clicked1, array1));
        arrayButton1.get(3).setOnAction(e -> khedma(3, arrayImage1, clicked1, array1));
        arrayButton1.get(4).setOnAction(e -> khedma(4, arrayImage1, clicked1, array1));
        arrayButton1.get(5).setOnAction(e -> khedma(5, arrayImage1, clicked1, array1));
        arrayButton1.get(6).setOnAction(e -> khedma(6, arrayImage1, clicked1, array1));
        arrayButton1.get(7).setOnAction(e -> khedma(7, arrayImage1, clicked1, array1));
        arrayButton1.get(8).setOnAction(e -> khedma(8, arrayImage1, clicked1, array1));

        arrayButton2.get(0).setOnAction(e -> khedma(0, arrayImage2, clicked2, array2));
        arrayButton2.get(1).setOnAction(e -> khedma(1, arrayImage2, clicked2, array2));
        arrayButton2.get(2).setOnAction(e -> khedma(2, arrayImage2, clicked2, array2));
        arrayButton2.get(3).setOnAction(e -> khedma(3, arrayImage2, clicked2, array2));
        arrayButton2.get(4).setOnAction(e -> khedma(4, arrayImage2, clicked2, array2));
        arrayButton2.get(5).setOnAction(e -> khedma(5, arrayImage2, clicked2, array2));
        arrayButton2.get(6).setOnAction(e -> khedma(6, arrayImage2, clicked2, array2));
        arrayButton2.get(7).setOnAction(e -> khedma(7, arrayImage2, clicked2, array2));
        arrayButton2.get(8).setOnAction(e -> khedma(8, arrayImage2, clicked2, array2));

        arrayButton3.get(0).setOnAction(e -> khedma(0, arrayImage3, clicked3, array3));
        arrayButton3.get(1).setOnAction(e -> khedma(1, arrayImage3, clicked3, array3));
        arrayButton3.get(2).setOnAction(e -> khedma(2, arrayImage3, clicked3, array3));
        arrayButton3.get(3).setOnAction(e -> khedma(3, arrayImage3, clicked3, array3));
        arrayButton3.get(4).setOnAction(e -> khedma(4, arrayImage3, clicked3, array3));
        arrayButton3.get(5).setOnAction(e -> khedma(5, arrayImage3, clicked3, array3));
        arrayButton3.get(6).setOnAction(e -> khedma(6, arrayImage3, clicked3, array3));
        arrayButton3.get(7).setOnAction(e -> khedma(7, arrayImage3, clicked3, array3));
        arrayButton3.get(8).setOnAction(e -> khedma(8, arrayImage3, clicked3, array3));
    }

    public void khedma(int i, List<ImageView> images, List<Boolean> clicked, List<Integer> array) {
       
        if (!clicked.get(i)) {

            if (player == 1) {
                array.set(i, 1);
                images.get(i).setImage(new Image("images/circle1.png"));
                

                if (checkPlayerWin2d(array) != 0 || checkPlayerWin3d() !=0) {
                        victory = true;
                          Alert alert = new Alert(Alert.AlertType.INFORMATION);
                          alert.setTitle("Victory");
                          alert.setHeaderText("Player "+player+" Win !");
                          alert.showAndWait();
                          
                    Main.score1++;
                    player1score.setText(Main.score1+"");
                    again.setVisible(true);
                    
                    for (int b = 0; b < 9; b++) {
                        clicked1.set(b, true);
                        clicked2.set(b, true);
                        clicked3.set(b, true);
                    }

                }
                if (!victory){
                player = 2;
                turn.setText("Player 2 turn");
                turn.setTextFill(Color.BLUE);}
                 else{
            turn.setText("");
            }
                
            } else if (player == 2) {
                array.set(i, 2);

                images.get(i).setImage(new Image("images/ex1.png"));
                
                if (checkPlayerWin2d(array) != 0 || checkPlayerWin3d() !=0) {
                     victory = true;
                             Alert alert = new Alert(Alert.AlertType.INFORMATION);
                             alert.setTitle("Victory");
                             alert.setHeaderText("Player "+player+" Win !");
                             alert.showAndWait();
                                
                    Main.score2++;
                     player2score.setText(Main.score2+"");
                     again.setVisible(true);
                   
                    for (int b = 0; b < 9; b++) {
                        clicked1.set(b, true);
                        clicked2.set(b, true);
                        clicked3.set(b, true);
                    
                    }
                }
             if (!victory){
                player = 1;
                turn.setText("Player 1 turn");
                turn.setTextFill(Color.RED);}
            }
            else{
            turn.setText("");
            }

            clicked.set(i, true);
        }

    }

    public int checkPlayerWin2d(List<Integer> array) {
        if (array.get(0) == 1 && array.get(1) == 1 && array.get(2) == 1) {
            return 1;
        }
        if (array.get(3) == 1 && array.get(4) == 1 && array.get(5) == 1) {
            return 1;
        }
        if (array.get(6) == 1 && array.get(7) == 1 && array.get(8) == 1) {
            return 1;
        }
        if (array.get(0) == 1 && array.get(3) == 1 && array.get(6) == 1) {
            return 1;
        }
        if (array.get(1) == 1 && array.get(4) == 1 && array.get(7) == 1) {
            return 1;
        }
        if (array.get(2) == 1 && array.get(5) == 1 && array.get(8) == 1) {
            return 1;
        }
        if (array.get(0) == 1 && array.get(4) == 1 && array.get(8) == 1) {
            return 1;
        }
        if (array.get(2) == 1 && array.get(4) == 1 && array.get(6) == 1) {
            return 1;
        }

        if (array.get(0) == 2 && array.get(1) == 2 && array.get(2) == 2) {
            return 2;
        }
        if (array.get(3) == 2 && array.get(4) == 2 && array.get(5) == 2) {
            return 2;
        }
        if (array.get(6) == 2 && array.get(7) == 2 && array.get(8) == 2) {
            return 2;
        }
        if (array.get(0) == 2 && array.get(3) == 2 && array.get(6) == 2) {
            return 2;
        }
        if (array.get(1) == 2 && array.get(4) == 2 && array.get(7) == 2) {
            return 2;
        }
        if (array.get(2) == 2 && array.get(5) == 2 && array.get(8) == 2) {
            return 2;
        }
        if (array.get(0) == 2 && array.get(4) == 2 && array.get(8) == 2) {
            return 2;
        }
        if (array.get(2) == 2 && array.get(4) == 2 && array.get(6) == 2) {
            return 2;
        }

        return 0;
    }

    public int checkPlayerWin3d(){
        if(array1.get(0)==1 && array2.get(0)==1 && array3.get(0)==1){return 1;}
        if(array1.get(1)==1 && array2.get(1)==1 && array3.get(1)==1){return 1;}
        if(array1.get(2)==1 && array2.get(2)==1 && array3.get(2)==1){return 1;}
        if(array1.get(3)==1 && array2.get(3)==1 && array3.get(3)==1){return 1;}
        if(array1.get(4)==1 && array2.get(4)==1 && array3.get(4)==1){return 1;}
        if(array1.get(5)==1 && array2.get(5)==1 && array3.get(5)==1){return 1;}
        if(array1.get(6)==1 && array2.get(6)==1 && array3.get(6)==1){return 1;}
        if(array1.get(7)==1 && array2.get(7)==1 && array3.get(7)==1){return 1;}
        if(array1.get(8)==1 && array2.get(8)==1 && array3.get(8)==1){return 1;}
        
        if (array1.get(0) == 1 && array2.get(1) == 1 && array3.get(2) == 1) {return 1;}
        if (array1.get(3) == 1 && array2.get(4) == 1 && array3.get(5) == 1) {return 1;}
        if (array1.get(6) == 1 && array2.get(7) == 1 && array3.get(8) == 1) {return 1;} 
        if (array1.get(0) == 1 && array2.get(3) == 1 && array3.get(6) == 1) {return 1;}
        if (array1.get(1) == 1 && array2.get(4) == 1 && array3.get(7) == 1) {return 1;}
        if (array1.get(2) == 1 && array2.get(5) == 1 && array3.get(8) == 1) {return 1;}  
        if (array1.get(0) == 1 && array2.get(4) == 1 && array3.get(8) == 1) {return 1;}
        if (array1.get(2) == 1 && array2.get(4) == 1 && array3.get(6) == 1) {return 1;}
        
        if (array3.get(0) == 1 && array2.get(1) == 1 && array1.get(2) == 1) {return 1;}
        if (array3.get(3) == 1 && array2.get(4) == 1 && array1.get(5) == 1) {return 1;}
        if (array3.get(6) == 1 && array2.get(7) == 1 && array1.get(8) == 1) {return 1;}
        if (array3.get(0) == 1 && array2.get(3) == 1 && array1.get(6) == 1) {return 1;}
        if (array3.get(1) == 1 && array2.get(4) == 1 && array1.get(7) == 1) {return 1;}
        if (array3.get(2) == 1 && array2.get(5) == 1 && array1.get(8) == 1) {return 1;}
        if (array3.get(0) == 1 && array2.get(4) == 1 && array1.get(8) == 1) {return 1;}
        if (array3.get(2) == 1 && array2.get(4) == 1 && array1.get(6) == 1) {return 1;}
        
        //player 2
        
        if(array1.get(0)==2 && array2.get(0)==2 && array3.get(0)==2){return 2;}
        if(array1.get(1)==2 && array2.get(1)==2 && array3.get(1)==2){return 2;}
        if(array1.get(2)==2 && array2.get(2)==2 && array3.get(2)==2){return 2;}
        if(array1.get(3)==2 && array2.get(3)==2 && array3.get(3)==2){return 2;}
        if(array1.get(4)==2 && array2.get(4)==2 && array3.get(4)==2){return 2;}
        if(array1.get(5)==2 && array2.get(5)==2 && array3.get(5)==2){return 2;}
        if(array1.get(6)==2 && array2.get(6)==2 && array3.get(6)==2){return 2;}
        if(array1.get(7)==2 && array2.get(7)==2 && array3.get(7)==2){return 2;}
        if(array1.get(8)==2 && array2.get(8)==2 && array3.get(8)==2){return 2;}
        
        if (array1.get(0) == 2 && array2.get(1) == 2 && array3.get(2) == 2) {return 2;}
        if (array1.get(3) == 2 && array2.get(4) == 2 && array3.get(5) == 2) {return 2;}
        if (array1.get(6) == 2 && array2.get(7) == 2 && array3.get(8) == 2) {return 2;} 
        if (array1.get(0) == 2 && array2.get(3) == 2 && array3.get(6) == 2) {return 2;}
        if (array1.get(1) == 2 && array2.get(4) == 2 && array3.get(7) == 2) {return 2;}
        if (array1.get(2) == 2 && array2.get(5) == 2 && array3.get(8) == 2) {return 2;}  
        if (array1.get(0) == 2 && array2.get(4) == 2 && array3.get(8) == 2) {return 2;}
        if (array1.get(2) == 2 && array2.get(4) == 2 && array3.get(6) == 2) {return 2;}
        
        if (array3.get(0) == 2 && array2.get(1) == 2 && array1.get(2) == 2) {return 2;}
        if (array3.get(3) == 2 && array2.get(4) == 2 && array1.get(5) == 2) {return 2;}
        if (array3.get(6) == 2 && array2.get(7) == 2 && array1.get(8) == 2) {return 2;}
        if (array3.get(0) == 2 && array2.get(3) == 2 && array1.get(6) == 2) {return 2;}
        if (array3.get(1) == 2 && array2.get(4) == 2 && array1.get(7) == 2) {return 2;}
        if (array3.get(2) == 2 && array2.get(5) == 2 && array1.get(8) == 2) {return 2;}
        if (array3.get(0) == 2 && array2.get(4) == 2 && array1.get(8) == 2) {return 2;}
        if (array3.get(2) == 2 && array2.get(4) == 2 && array1.get(6) == 2) {return 2;}

    return 0;
    }
    

}
