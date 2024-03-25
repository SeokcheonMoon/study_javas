public class ifs {
    public static void main(String[] args){     // static 과 main은 한 쌍으로 이루어진다.(규칙)
        
        // if 절 기본 구문
        // if (condition) {
        // } else if (condition) {
        // } else {
        // }

        // /* */ ==> 여기 안에 있는 것만 주석처리 하는 코드
        /* 예제 : 시간에 따른 영어 인사
        Good morning : 6~11
        Good afternoon : 11~17
        Good evening : 17~23
        */
        
        int hour = 11;
        if (hour <= 11) {
            System.out.println("Good morning : 6~11");
        } else if (hour <=17) {
            System.out.println("Good afternoon : 11~17");
        } else {
            System.out.println("Good evening : 17~23");
        }

        System.out.println("Hello Main !");
 
        // error : Duplicate local variable hour
        // int hour = 11;
        hour = 24;
        if (hour >= 6 && hour <= 11) {
            System.out.println("Good morning : 6~11");
        } else if (hour >= 12 && hour <= 17) {
            System.out.println("Good afternoon : 12~17");
        } else if (hour >= 18 && hour <= 23) {
            System.out.println("Good evening : 18~23");
        } else {
            System.out.println("I don't know!");
        }

        System.out.println("Hello Main !");
    }
}

