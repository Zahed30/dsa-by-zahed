public class LinearSearchString {
    public static void main(String[] args) {
        String name="Zahed";
        char target='h';
        System.out.println(SearchString(name, target));
        
    }
    static boolean SearchString(String str,char target){
        if (str.length()==0) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (target==str.charAt(i)) {
                return true;
                
            }
            
        }
        return false;
    }
}