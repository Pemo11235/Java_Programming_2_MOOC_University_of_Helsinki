package application;

import java.util.HashMap;
import java.util.Map;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class ShanghaiApplication extends Application{

    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(ShanghaiApplication.class);
    }
    
    
    @Override
    public void start(Stage stage) throws Exception{
        
        NumberAxis xAxis = new NumberAxis(2006,2018,2);
        NumberAxis yAxis = new NumberAxis(0,100,10);
        
        xAxis.setLabel("Year");
        yAxis.setLabel("Ranking");
        
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("University of Helsinki, Shanghai ranking");
        
        Map<Integer,Integer> data = new HashMap<>();
        data.put(2007, 73);
        data.put(2008, 68);
        data.put(2009, 72);
        data.put(2010, 72);
        data.put(2011, 74);
        data.put(2012, 73);
        data.put(2013, 76);
        data.put(2014, 73);
        data.put(2015, 67);
        data.put(2016, 56);
        data.put(2017, 56);
        //Map<String, Map<Integer,Integer>> values = new HashMap<>();
         XYChart.Series xyData = new XYChart.Series();
         
        data.entrySet().stream().forEach(pair -> {
            xyData.getData().add(new XYChart.Data(pair.getKey(), pair.getValue()));
        });
        
        lineChart.getData().add(xyData);
        
        Scene view = new Scene(lineChart,640,480);
        stage.setScene(view);
        stage.show();
    }

}
