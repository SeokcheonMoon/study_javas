import java.util.HashMap;

public class DatatypeHashMaps {
    public static void main(String[] args){     // static 과 main은 한 쌍으로 이루어진다.(규칙)
        HashMap<String, String> hashmap = new HashMap();
        // 값넣기
        hashmap.put("England", "London");
        hashmap.put("Germany","Berlin");
        hashmap.put("Norway","Oslo");


        for (String key :hashmap.keySet()){
            System.out.println("hashmap value with key : " + key + ", value : " + hashmap.get(key));
        }

        System.out.println("Hello Main !");
    }
}

// hashmap.get("Norway")
// "Oslo"
// hashmap.size()
// 3
// hashmap.remove("Germany")
// "Berlin"
// hashmap.size()
// 2