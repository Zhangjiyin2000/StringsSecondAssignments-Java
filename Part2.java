
/**
 * Write a description of Part2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Part2 {
    int howMany(String stringa, String stringb) {
        int count = 0;
        int currIndex = 0;
        while(true) {
            int startIndex = stringb.indexOf(stringa, currIndex);
            if (startIndex == -1) {
                break;
            }
            count++;
            currIndex = stringb.indexOf(stringa, currIndex) + stringa.length();
            
        }
        return count;
        
    }
    
    void testHowMany() {
        String stringa1 = "GAA";
        String stringb1 = "ATGAACGAATTGAATC";
        System.out.println(howMany(stringa1, stringb1));
        String stringa2 = "AA";
        String stringb2 = "ATAAAA";
        System.out.println(howMany(stringa2, stringb2));
    }

}
