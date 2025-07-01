import java.util.HashMap;

public class HashMapApis {
    public static void main(String[] args) {
        System.out.println("Mohan Talavar: HashMap Apis");
        HashMap<String,Integer> map = new HashMap<>();
        map.put("India",1);
        map.put("US",2);
        map.put("China",3);
        System.out.println(map);

        // This will only print values
        for(Integer value: map.values()){
            System.out.println("Value: "+ value );
        }

        // Printing key and value
        map.forEach( (key,value) -> {
            System.out.println("Key: "+ key + " Value: "+ value);
        }  );
    }
}
