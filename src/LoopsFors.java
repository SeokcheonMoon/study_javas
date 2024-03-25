import java.util.ArrayList;

public class LoopsFors {
    public static void main(String[] args){     // static 과 main은 한 쌍으로 이루어진다.(규칙)
        /*
            for문 동작하기 위한 조건 : 시작점, 최종점, 반복횟수
            statement 1 : 시작 시점
            statement 2 : 종료 시점
            statement 3 : 반복횟수
        for (statement 1 ; statement 2 ; statement 3){
        }
        */ 
        /*
        예제 : 1부터 5까지 1씩 증가하면서 출력하기
         */
        // for (int count = 1 ; count <= 5 ; count = count + 1){
        for (int count = 1 ; count <= 5 ; count++){
            System.out.println("For count : " + count);
        }
        ArrayList<String> listFrist = new ArrayList<String>();
        // 값 넣기
        listFrist.add("Volvo");
        listFrist.add("BMW");
        listFrist.add("Ford");        
        for(int i=0; i<listFrist.size(); i++){
            System.out.println(listFrist.get(i));
        }
        for (String str:listFrist){
            System.out.println(str);
        }
        // for (type variableName : arrayName){
        //     code block to be excuted
        // }

        System.out.println("Hello Main !");
    }
}
