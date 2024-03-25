// refer : https://www.w3schools.com/java/java_arraylist.asp
import java.util.ArrayList;
public class DataTypeArrayLists {
    public static void main(String[] args){     // static 과 main은 한 쌍으로 이루어진다.(규칙)
        ArrayList listFrist = new ArrayList();
        // 값 넣기
        listFrist.add("Volvo");
        listFrist.add("BMW");
        listFrist.add("Ford");
        // 값 가져오기
        //listFrist.get(0)
        // "Volvo"
        // listFrist.get(1)
        // "BMW"
        // listFrist.get(2)
        // "Ford"
        // listFrist.get(3)
        // IndexOutOfBoundsException@33 "java.lang.IndexOutOfBoundsException: Index 3 out of bounds for length 3"
        // listFrist.size()
        // 3
        // listFrist.remove(2)
        // "Ford"
        // System.out.println("Hello Main !");
    }
}
