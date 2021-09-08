public class CheckStartAndEnd{
    
    static boolean checkStartAndEnd(String s){
        if(s.startsWith("A") && s.endsWith("T")){
            return true;
        }
        return false;
    }
    
    public static void main(String args[]) {
      System.out.println(checkStartAndEnd("A Hello! Java Compiler T"));
    }
}