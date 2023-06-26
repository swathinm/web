package java8.Stream;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Streams2 {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<String>();
        al.add("Swathi");
        al.add("Kothi");
        al.add("Potti");
        al.add("Giddy");
        al.add("PottiPokadi");
        al.add("Pokemon");
        al.add("Doctree");
        al.add("Sweety");

        List el= al.stream().filter(name->name.startsWith("S"))
                .collect(Collectors.toList());
        System.out.println(el);
    }
}
