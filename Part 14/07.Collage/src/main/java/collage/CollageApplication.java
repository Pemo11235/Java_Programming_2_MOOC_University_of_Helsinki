package collage;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.PixelReader;
import javafx.scene.image.PixelWriter;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class CollageApplication extends Application {

    @Override
    public void start(Stage stage) {

        // the example opens the image, creates a new image, and copies the opened image
        // into the new one, pixel by pixel
        Image sourceImage = new Image("file:monalisa.png");

        PixelReader imageReader = sourceImage.getPixelReader();

        int width = (int) sourceImage.getWidth();
        int height = (int) sourceImage.getHeight();

        int harlfW = width / 2;
        int harlfH = height / 2;
        WritableImage targetImage = new WritableImage(width, height);
        PixelWriter imageWriter = targetImage.getPixelWriter();
        System.out.println(width);
        System.out.println(height);
        //Background
        int yCoordinate = 0;
        while (yCoordinate < height) {
            int xCoordinate = 0;
            while (xCoordinate < width) {

                Color color = imageReader.getColor(xCoordinate, yCoordinate);
                double red = color.getRed();
                double green = color.getGreen();
                double blue = color.getBlue();
                double opacity = color.getOpacity();
                int h_width = (int) sourceImage.getWidth() / 2;
                int h_height = (int) sourceImage.getHeight() / 2;
                Color newColor = new Color(red, green, blue, opacity);

                imageWriter.setColor(xCoordinate, yCoordinate, newColor);
                xCoordinate++;
            }

            yCoordinate++;
        }

        int yCoordinate_A = 0;
        while (yCoordinate_A < height) {
            int xCoordinate = 0;
            while (xCoordinate < width) {

                Color color = imageReader.getColor(xCoordinate, yCoordinate_A);
                double red = 1.0 - color.getRed();
                double green = 1.0 - color.getGreen();
                double blue = 1.0 - color.getBlue();
                double opacity = color.getOpacity();

                int h_width = (int) sourceImage.getWidth() / 2;
                int h_height = (int) sourceImage.getHeight() / 2;

                Color newColor = new Color(red, green, blue, opacity);

                if (xCoordinate % 2 == 0 && yCoordinate_A % 2 == 0) {
                    imageWriter.setColor(xCoordinate / 2, yCoordinate_A / 2, newColor);
                    imageWriter.setColor(h_width + xCoordinate / 2, yCoordinate_A / 2, newColor);
                    imageWriter.setColor(h_width + xCoordinate / 2, h_height + yCoordinate_A / 2, newColor);
                    imageWriter.setColor(xCoordinate / 2, h_height + yCoordinate_A / 2, newColor);
                }

                xCoordinate++;
            }

            yCoordinate_A++;
        }

        ImageView image = new ImageView(targetImage);

        Pane pane = new Pane();
        pane.getChildren().add(image);

        stage.setScene(new Scene(pane));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
