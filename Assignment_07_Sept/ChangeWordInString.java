public class ChangeWordInString {
    public static void main(String args[]) {
        String s = "Java is Object Oriented. Java is Programming Language.";
        ChangeWordInString c = new ChangeWordInString();
        System.out.println("Output: " + c.findAndReplaceString(s));
    }
    
    private String findAndReplaceString(String s){
        String c="";
        String given[] = s.split(" ");
        for(int i = 0; i<given.length;i++){
            if("Java".equals(given[i])){
                given[i] = "C++";
            }
            c = c + given[i] + " " ;
        }
        return c;
    }
}