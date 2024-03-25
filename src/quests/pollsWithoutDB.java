package quests;

import java.util.ArrayList;
import java.util.Scanner;

public class pollsWithoutDB {
    public static void main(String[] args){     // static 과 main은 한 쌍으로 이루어진다.(규칙)
        ArrayList<String> listFrist = new ArrayList<String>();
        listFrist.add("인터스텔라");
        listFrist.add("해리포터");
        listFrist.add("트랜스포머");

        ArrayList<String> listSecond = new ArrayList<String>();
        listSecond.add("좋음");
        listSecond.add("중간");
        listSecond.add("나쁨");

        ArrayList<String> listThird = new ArrayList<String>();

        for(int i=0; i<listFrist.size(); i++){
            System.out.println((i+1)+ ". " +listFrist.get(i) + " 선호도");
            for(int j=0; j<listFrist.size(); j++){
                System.out.println((j+1)+ ") " +listSecond.get(j) + " ");

            }
            Scanner scanner = new Scanner(System.in);
            System.out.print("답하기 : ");
            listThird.add(scanner.nextLine());
        }
        System.out.println(listThird);
    }
}

// Scanner scanner = new Scanner(System.in);
// System.out.print("답하기 : ");
// int answer = scanner.nextInt();