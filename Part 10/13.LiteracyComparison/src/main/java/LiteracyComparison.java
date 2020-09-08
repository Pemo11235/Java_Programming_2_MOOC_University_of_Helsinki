
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LiteracyComparison {

    public static void main(String[] args) {

        String file = "literacy.csv";
        List<String> fileList = readFile(file);
        //System.out.println(fileList);
        List<Person> dataList = formatData(fileList);
        dataList.stream().sorted((p1,p2) -> {
            return p1.compareTo(p2);})
            .forEach(p -> System.out.println(p));
      
    }

    public static List<String> readFile(String file) {
        List<String> list = new ArrayList<>();
        try {
            Files.lines(Paths.get(file)).forEach(row -> list.add(row));

        } catch (IOException e) {
            System.out.println("Error!" + e.getLocalizedMessage());
        }
        return list;
    }

    public static List<Person> formatData(List<String> fileList) {
        List<Person> toRet = new ArrayList<>();
        for (String row : fileList) {
            String[] pieces = row.split(",");
            for (String piece : pieces) {
                piece = piece.trim();
            }
            Person input = new Person(
                    sanitazeGender(pieces[2]),
                    pieces[3],
                    Integer.valueOf(pieces[4]),
                    Double.valueOf(pieces[5]));
            toRet.add(input);
        }

        return toRet;
    }

    public static String sanitazeGender(String gen) {
        if (gen.contains("female")) {
            return "female";
        }
        return "male";
    }

    public static void printList(List<Person> list){
        for(Person one:list){
            System.out.println(one);
        }
    }
}
