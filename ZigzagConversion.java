
public class ZigzagConversion {

    public String convert(String s, int numRows) {
        int len = s.length();
        StringBuffer[] sb = new StringBuffer[numRows];

        for (int i = 0; i < sb.length; i++) sb[i] = new StringBuffer();
        
        int i = 0;
        while (i < len) {
            for (int idx = 0; idx < numRows && i < len; idx++) // vertically down
                sb[idx].append(s.charAt(i++));
            for (int idx = numRows-2; idx >= 1 && i < len; idx--) // obliquely up
                sb[idx].append(s.charAt(i++));
        }
        for (int idx = 1; idx < sb.length; idx++)
            sb[0].append(sb[idx]);

        return sb[0].toString();
    }

    public int calculateNext(int numRows, int currentRow) {

        return 0;                                                                                                                                                                                                                                                                                                                                                           
    }

    public static void main(String[] args) {
        ZigzagConversion algo = new ZigzagConversion();
        algo.convert("PAYPALISHIRING", 1);
    }
}
