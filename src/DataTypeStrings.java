public class DataTypeStrings {
    public static void main(String[] args) {
        String strFirst = "Hello !";
        String strSecond = new String("World !");
        System.out.println("Hello World!");
        // return 0; 
    }
}
// strFirst instanceof String
// true
// strSecond instanceof String
// true
// strFirst.length()
// 7
// strSecond.length()
// 7
// strSecond.concat(strFirst)
// "World !Hello !"
// strThird = strFirst.replaceAll("l","R")
// "HeRRo !"