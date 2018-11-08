package sample;
import javafx.print.*;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.scene.control.ScrollPane;
import java.io.File;
import javafx.scene.transform.Scale;
import javafx.stage.*;

public class Controller {

    //window toolbar
    double x, y;

    @FXML
    void pressed(MouseEvent event) {
    x=event.getSceneX();
    y=event.getSceneY();
    }

    @FXML
    void dragged(MouseEvent event) {
    Stage stage=(Stage)((Node) event.getSource()).getScene().getWindow();
    stage.setX(event.getScreenX()- x);
    stage.setY(event.getScreenY()- y);
    }

    //exit button
    @FXML
    void exit(ActionEvent event) {
        Stage stage=(Stage)((Node) event.getSource()).getScene().getWindow();
    stage.close();
    }

    //minimize button
    @FXML
    void min(ActionEvent event) {
        Stage stage=(Stage)((Node) event.getSource()).getScene().getWindow();
        stage.setIconified(true);

    }

    @FXML
    private TextField txt_name;

    @FXML
    private TextField txt_age;

    @FXML
    private TextField txt_nose;

    @FXML
    private TextField txt_naaso;

    @FXML
    private TextField txt_base;

    @FXML
    private TextField txt_valle;

    @FXML
    private TextField txt_epig;

    @FXML
    private TextField txt_hypo;

    @FXML
    private TextField txt_supra;

    @FXML
    private TextField txt_vocal;

    @FXML
    private TextField txt_diag;

    @FXML
    private TextArea txt_advice;

    @FXML
    private TextField txt_ref;

    @FXML
    private TextField txt_right;

    @FXML
    private TextField txt_left;

    @FXML
    public Button img_btn_1;

    @FXML
    public Button img_btn_2;

    @FXML
    public Button img_btn_3;

    @FXML
    public Button img_btn_4;

    @FXML
    private Button del_img_1;

    @FXML
    private Button del_img_2;

    @FXML
    private Button del_img_3;

    @FXML
    private Button del_img_4;

    @FXML
    public ImageView image1;

    @FXML
    public ImageView image2;

    @FXML
    public ImageView image3;

    @FXML
    private ImageView image4;

    @FXML
    private DatePicker datePicker;

    @FXML
    private ComboBox cmb_done;

    @FXML
    private ComboBox cmb_check;




    @FXML
    private Pane jPanel1;

    private String imageFile;

    @FXML
    private void initialize(){
        //combo box initialize && data
        cmb_done.getItems().removeAll(cmb_done.getItems());
        cmb_done.getItems().addAll("DR. Mostofa Qaiyoum","DR. Mithun Kumar Paul","DR. Saifullah","DR. Komolesh","DR. Ekhlasur Rahman");
        cmb_done.getSelectionModel().select("DR. Mostofa Qaiyoum");

        cmb_check.getItems().removeAll(cmb_check.getItems());
        cmb_check.getItems().addAll("DR. Md.Kamaruzzaman," +
                        " Assosiate Professor.",
                "DR. Sutanu Kumar Mondol," +
                        " Assosiate Professor.",
                "DR. Mahmudul Huq," +
                        " Assosiate Professor.");
        cmb_check.getSelectionModel().select("DR. Md.Kamaruzzaman, Assosiate Professor.");


      }


    @FXML
    void imgAdd(ActionEvent event) {
        if (event.getSource()==img_btn_1) {

            FileChooser fileChooser = new FileChooser();
            fileChooser.setTitle("Select Image File");
            fileChooser.getExtensionFilters().addAll(
                    new FileChooser.ExtensionFilter("Image Files",
                            "*.bmp", "*.png", "*.jpg", "*.gif")); // limit fileChooser options to image files
            File selectedFile = fileChooser.showOpenDialog(null);

            if (selectedFile != null) {
                fileChooser.setInitialDirectory(selectedFile.getParentFile());
                imageFile = selectedFile.toURI().toString();

                Image image = new Image(imageFile);
                image1.setImage(image);

            }

        }
        if (event.getSource()==img_btn_2) {
            FileChooser fileChooser = new FileChooser();
            fileChooser.setTitle("Select Image File");
            fileChooser.getExtensionFilters().addAll(
                    new FileChooser.ExtensionFilter("Image Files",
                            "*.bmp", "*.png", "*.jpg", "*.gif")); // limit fileChooser options to image files
            File selectedFile = fileChooser.showOpenDialog(null);

            if (selectedFile != null) {
                fileChooser.setInitialDirectory(selectedFile.getParentFile());
                imageFile = selectedFile.toURI().toString();

                Image image = new Image(imageFile);
                image2.setImage(image);

            }

        }
        if (event.getSource()==img_btn_3) {
            FileChooser fileChooser = new FileChooser();
            fileChooser.setTitle("Select Image File");
            fileChooser.getExtensionFilters().addAll(
                    new FileChooser.ExtensionFilter("Image Files",
                            "*.bmp", "*.png", "*.jpg", "*.gif")); // limit fileChooser options to image files
            File selectedFile = fileChooser.showOpenDialog(null);

            if (selectedFile != null) {
                fileChooser.setInitialDirectory(selectedFile.getParentFile());
                imageFile = selectedFile.toURI().toString();

                Image image = new Image(imageFile);
                image3.setImage(image);

            }



        }
        if (event.getSource()==img_btn_4) {
            FileChooser fileChooser = new FileChooser();
            fileChooser.setTitle("Select Image File");
            fileChooser.getExtensionFilters().addAll(
                    new FileChooser.ExtensionFilter("Image Files",
                            "*.bmp", "*.png", "*.jpg", "*.gif")); // limit fileChooser options to image files
            File selectedFile = fileChooser.showOpenDialog(null);

            if (selectedFile != null) {
                fileChooser.setInitialDirectory(selectedFile.getParentFile());
                imageFile = selectedFile.toURI().toString();

                Image image = new Image(imageFile);
                image4.setImage(image);

            }



        }
    }

    @FXML
    void imgDel(ActionEvent event) {
        if (event.getSource()==del_img_1){
            image1.setImage(null);
        }
        if (event.getSource()==del_img_2){
            image2.setImage(null);
        }
        if (event.getSource()==del_img_3){
            image3.setImage(null);
        }
        if (event.getSource()==del_img_4){
            image4.setImage(null);
        }

    }



//printing jpane event
    @FXML
    void print(ActionEvent event) {
        printNode(jPanel1);
    }
    //print and resize
    private void printNode(Node node) {
        Printer printer = Printer.getDefaultPrinter();
        PageLayout pageLayout
                = printer.createPageLayout(Paper.A4, PageOrientation.PORTRAIT, Printer.MarginType.HARDWARE_MINIMUM);
        PrinterAttributes attr = printer.getPrinterAttributes();
        PrinterJob job = PrinterJob.createPrinterJob();
        double scaleX
                = pageLayout.getPrintableWidth() / node.getBoundsInParent().getWidth();
        double scaleY
                = pageLayout.getPrintableHeight() / node.getBoundsInParent().getHeight();
        Scale scale = new Scale(scaleX, scaleY);
        node.getTransforms().add(scale);

        if (job != null && job.showPrintDialog(node.getScene().getWindow())) {
            boolean success = job.printPage(pageLayout, node);
            if (success) {
                job.endJob();

            }
        }
        node.getTransforms().remove(scale);
    }

    @FXML
    void reset(ActionEvent event) {
        txt_advice.setText("NAD");
        txt_age.setText(null);
        txt_base.setText("NAD");
        txt_diag.setText("NAD");
        txt_epig.setText("NAD");
        txt_hypo.setText("NAD");
        txt_left.setText("NAD");
        txt_naaso.setText("NAD");
        txt_name.setText(null);
        txt_nose.setText("NAD");
        txt_ref.setText(null);
        txt_right.setText("NAD");
        txt_supra.setText("NAD");
        txt_valle.setText("NAD");
        txt_vocal.setText("NAD");
        image1.setImage(null);
        image2.setImage(null);
        image3.setImage(null);
        image4.setImage(null);
        datePicker.setValue(null);
    }



    }
