import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader fr = new FileReader("src/file.txt");
        Scanner sc = new Scanner(fr);
        List<String> casas = new ArrayList<>();
        while (sc.hasNext()){
            casas.add(sc.nextLine());
        }

        Pattern pNoel = Pattern.compile("\\*<]:-DOo");
        Pattern pRens = Pattern.compile(">:o\\)");
        Pattern pFollets = Pattern.compile("<]:-D");

        for (int x = 0; x < casas.size(); x++){
            String tmpLinea = casas.get(x);
            Matcher mNoel = pNoel.matcher(tmpLinea);
            Matcher mRens = pRens.matcher(tmpLinea);
            Matcher mFollets = pFollets.matcher(tmpLinea);
            int nNoels = 0;
            int nRens = 0;
            int nFollets = 0;

            while (mNoel.find()){nNoels++;}
            while (mRens.find()){nRens++;}
            while (mFollets.find()){nFollets++;}

            System.out.println("Casa " + (x+1) + " = Pare Noel ("+ nNoels +")" + " - Rens ("+ nRens +")" + " - Follets ("+ nFollets +")");
        }

    }
}
