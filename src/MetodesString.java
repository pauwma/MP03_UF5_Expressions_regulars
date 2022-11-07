import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MetodesString {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader fr = new FileReader("src/file.txt");
        Scanner sc = new Scanner(fr);
        List<String> casas = new ArrayList<>();
        while (sc.hasNext()){
            casas.add(sc.nextLine());
        }

        System.out.println("\nMÉTODES STRING");
        String pNoel = "\\*<]:-DOo";
        String pRens = ">:o\\)";
        String pFollets = "<]:-D";

        for (int x = 0; x < casas.size(); x++){
            String tmpLinea = casas.get(x);
            System.out.println("Casa " + (x+1) + "= Pare Noel (" + (tmpLinea.split(pNoel, -1).length-1)+") - Rens ("+  (tmpLinea.split(pRens, -1).length-1) + ") - Follets (" + (tmpLinea.split(pFollets, -1).length-1)+")");
        }

    }
}
