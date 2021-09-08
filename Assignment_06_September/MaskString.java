public class MaskString {
    
    static String maskGivenString(String s){
        String[] a =s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i =0;i<a.length;i++){
            sb.append(a[i].substring(0, 2));
            for(int j = 2; j<a[i].length();j++){
                sb.append("X");
            }
            sb.append(" ");
        }
        return sb.toString();
    }
    
    public static void main(String args[]) {
      System.out.println(maskGivenString("ROMIL WADHWANI"));
    }
}