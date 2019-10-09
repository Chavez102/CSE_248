package Controllers;

import application.Student;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Dialog;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Introduction_Controller {


    @FXML
    private Text LastName_Warning_Text;
    @FXML
    private TextField first_Name_Textfield;

    @FXML
    private TextField lastName_Insert_Textfield;

    @FXML
    private TextField Username_Textfield;

    @FXML
    private TextField Password_Textfield;

    @FXML
    private TextField GPA_TextField;

    @FXML
    private TextField id_Textfield;

    @FXML
    private Button insert_Btn;

    @FXML
    private TextField LastName_Find_Textfield;

    @FXML
    private Button Find_LasName_Button;

    @FXML
    private Button Delete_LasrName_Btn;

    @FXML
    private TextField Id_Find_Textfield;

    @FXML
    private Button Find_Id_Button;

    @FXML
    private Button Delete_ID_Btn;

    @FXML
    private Button GetAverage_Btn;

    @FXML
    private Text Average_Text;

    @FXML
    private Button Dialog_Done_Btn;

    @FXML
    private Text Dialog_Name_Text;

    @FXML
    private Text Dialog_UserName_Text;

    @FXML
    private Text Dialog_Password_Text;

    @FXML
    private Text Dialog_Id_Text;
    @FXML
    private javafx.scene.control.DialogPane DialogPane;



    
    
    @FXML
    void Insert_Btn_Pressed(ActionEvent event) {
    	String firstname=first_Name_Textfield.getText();
    	String lastname=lastName_Insert_Textfield.getText();
    	String gpa=GPA_TextField.getText();
    	String username=Username_Textfield.getText();
    	String password=Password_Textfield.getText();
    	String id=id_Textfield.getText();
    	Student newstudent=new Student();
    	newstudent.setFirstname(firstname);
    	newstudent.setLastname(lastname);
    	newstudent.setGpa(Double.valueOf(gpa));
    	newstudent.setUsername(username);
    	newstudent.setPassword(password);
    	newstudent.setId(id);	
    	application.Main.bag.insert(newstudent);
    	
    }
    
    
    
    
    @FXML
    void Delete_ID_Btn_Pressed(ActionEvent event) {
    	application.Main.bag.deleteById(Id_Find_Textfield.getText());
    }

    @FXML
    void Delete_LastName_Btn_Pressed(ActionEvent event) {
    	application.Main.bag.deletebyLastName(LastName_Find_Textfield.getText());
    }

    @FXML
    void Find_Id_Button_Pressed(ActionEvent eventa) {
    	Student StudentFound=application.Main.bag.findById(Id_Find_Textfield.getText());
    	setupDialogPane(StudentFound);
    }

    @FXML
    void Find_LastName_Btn_Pressed(ActionEvent event) {
    	System.out.println("getting herer");
    	if (application.Main.bag.findByLastName(LastName_Find_Textfield.getText())!=null)
    	{
    		System.out.println("getting herer");
    	Student StudentFound=application.Main.bag.findByLastName(LastName_Find_Textfield.getText());
    	setupDialogPane(StudentFound);
    	}
    	else {
    		LastName_Warning_Text.setText("Student not found");

    	    LastName_Warning_Text.setVisible(true);
    	}
    	
    	
    	
    }
    
    public void setupDialogPane(Student student) {
    	Dialog_Name_Text.setText(student.getFirstname()+" "+student.getLastname());
    	Dialog_UserName_Text.setText(student.getUsername());
    	Dialog_Password_Text.setText(student.getPassword());
    	Dialog_Id_Text.setText(student.getId());

    	DialogPane.setVisible(true);
    	
    }

    
    
    @FXML
    void Dialog_Done_Btn_Pressed(ActionEvent event) {
    	DialogPane.setVisible(false);

    }
    
    
    
    
    @FXML
    void GetAveragfe_Btn_Pressed(ActionEvent event) {
    	double gpa=application.Main.bag.getAverageGpa();
    	Average_Text.setText(String.valueOf(gpa));
    }
    
 

    



}
