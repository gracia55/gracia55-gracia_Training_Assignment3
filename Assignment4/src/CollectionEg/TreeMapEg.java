package CollectionEg;
import java.util.TreeMap;
import java.util.Map;

public class TreeMapEg {
	public static void main(String[] args)
	{
	TreeMap<Integer, String> map = new TreeMap<>();

    map.put(3, "Ramya");
    map.put(1, "Alamu");
    map.put(4, "Ram");
    map.put(2, "Prem");

    System.out.println("Ascending Order:");
    for (Map.Entry<Integer, String> entry : map.entrySet()) {
        System.out.println(entry.getKey() + " : " + entry.getValue());
    }

    System.out.println("\nDescending Order:");
    for (Map.Entry<Integer, String> entry : map.descendingMap().entrySet()) {
        System.out.println(entry.getKey() + " : " + entry.getValue());
    }
}

}
