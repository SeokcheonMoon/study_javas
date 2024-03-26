package quests;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class problemsWithoutDB {
    public static void main(String[] args) { // static 과 main은 한 쌍으로 이루어진다.(규칙)
        ArrayList<String> listQuest = new ArrayList();
        listQuest.add("Python에서 변수를 선언하는 방법은? (점수 : 10점)");
        listQuest.add("Python에서 리스트(List)의 특징은 무엇인가요? (점수 : 15점)");
        listQuest.add("Python에서 조건문을 작성하는 방법은 (점수 : 10점)");
        listQuest.add("Python에서 함수를 정의하는 방법은? (점수 : 10점)");

        HashMap<String, String> hashmap = new HashMap();
        hashmap.put("Python에서 변수를 선언하는 방법은? (점수 : 10점)", "1) var name, 2) name = value, 3) set name, 4) name == value");
        hashmap.put("Python에서 리스트(List)의 특징은 무엇인가요? (점수 : 15점)",
                " 1) 순서가 있고 변경 가능하다, 2) 중복된 값을 가질 수 없다, 3) 원소를 추가하거나 삭제할 수 없다, 4) 정렬된 상태로 유지된다");
        hashmap.put("Python에서 조건문을 작성하는 방법은 (점수 : 10점)", "1) if-else, 2) for-in, 3) while, 4) def");
        hashmap.put("Python에서 함수를 정의하는 방법은? (점수 : 10점)", "1) class, 2) def, 3) import, 4) return");

        ArrayList<String> listAnswer = new ArrayList<String>();

        for (int i = 0; i < listQuest.size(); i++) {
            System.out.println((i + 1) + ". 문제 : " + listQuest.get(i));
            System.out.println(hashmap.get(listQuest.get(i)));
            Scanner scanner = new Scanner(System.in);
            System.out.print("답하기 : ");
            listAnswer.add(scanner.nextLine());
        }
        System.out.println(listAnswer);
    }
}