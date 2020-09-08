package application;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class PartiesApplication extends Application {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(PartiesApplication.class);
    }

    @Override
    public void start(Stage stage) throws Exception {
        NumberAxis xAxis = new NumberAxis(1968, 2008, 4);
        NumberAxis yAxis = new NumberAxis(0, 30, 5);

        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        Map<String, Map<Integer, Double>> values = read();
        values.keySet().stream().forEach(party -> {
            XYChart.Series data = new XYChart.Series();
            data.setName(party);

            values.get(party).entrySet().stream().forEach(pair -> {
                data.getData().add(new XYChart.Data(pair.getKey(), pair.getValue()));
            });
            
            lineChart.getData().add(data);
        });
        
        Scene view = new Scene(lineChart, 640,480);
        stage.setScene(view);
        stage.show();
    }

    public Map<String, Map<Integer, Double>> read() throws IOException {
        ArrayList<String> lines = new ArrayList<>();

        Map<String, Map<Integer, Double>> allData = new HashMap<>();

        try (Scanner scanner = new Scanner(Paths.get("partiesdata.tsv"))) {
            while (scanner.hasNextLine()) {
                lines.add(scanner.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        String[] years = lines.get(0).split("\t");
        lines.remove(0);
        for (String line : lines) {
            Map<Integer, Double> data = new HashMap<>();
            String[] pieces = line.split("\t");

            for (int i = 1; i < years.length; i++) {
                if (pieces[i].equals("-")) {
                    continue;
                }
                data.put(Integer.valueOf(years[i]), Double.valueOf(pieces[i]));
            }
            allData.put(pieces[0], data);
        }

        return allData;
    }
}
