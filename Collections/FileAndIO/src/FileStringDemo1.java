public class FileStringDemo1 {
public static void main(String [] args){
    String str = "ai你呦";
    byte[] bytes1 = str.getBytes();
    for(byte b : bytes1){
        System.out.println(b);
    }
}


}