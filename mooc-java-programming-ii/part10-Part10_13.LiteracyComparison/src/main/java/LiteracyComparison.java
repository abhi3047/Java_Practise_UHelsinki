
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        List<LiteraryStat> statList = new ArrayList<>();

        try{
            Files.lines(Paths.get("literacy.csv"))
            .map(row -> row.split(","))
            .map(parts -> new LiteraryStat(parts[3],Integer.valueOf(parts[4]),parts[2].split(" ")[1],Double.valueOf(parts[5])))
            .forEach(stat -> statList.add(stat));



        }catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

      statList.stream().sorted((p1,p2) ->{
            if(p1.getLiteraryPercentage()>p2.getLiteraryPercentage()){
                return 1;
            }else if (p1.getLiteraryPercentage()<p2.getLiteraryPercentage()){
                return -1;
            }
            return 0;
        }).forEach(t -> System.out.println(t));

    }
}
