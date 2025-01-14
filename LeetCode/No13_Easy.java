package LeetCode;

public class No13_Easy {
    // 題型條件:
    // 羅馬數字的規律 -> 
    // 1.順序不會亂MDCLXVI，但前後位可能會對調
    // 2.前位數字比後位數字小要相減
    // 3.後位數字比前位數字小要相加
    public int romanToInt(String s) {
        char ch[] = s.toCharArray();
        int count = 0;
        for (int i = 0; i < ch.length - 1; i++) {
            int current = getRomanValue(ch[i]);
            int next = getRomanValue(ch[i + 1]);
            if (current < next) {
                count -= current;
            } else {
                count += current;
            }
        }
        // Add the value of the last character
        count += getRomanValue(ch[ch.length - 1]);
        return count;
    }
    private  int getRomanValue(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(new No13_Easy().romanToInt("MCMXCIV"));
        System.out.println(new No13_Easy().romanToInt("III"));
        System.out.println(new No13_Easy().romanToInt("LVIII"));
    }
}
