class Solution {
    public int solution(String s) {
        StringBuilder answer = new StringBuilder();
        StringBuilder sb = new StringBuilder();       

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= '0' && c <= '9') {
                answer.append(c);                      
            } else {
                sb.append(c);
                String digit = checkWord(sb);
                if (digit != "false") {                    
                    answer.append(digit);
                    sb.setLength(0);
                }
            }
        }
        return Integer.parseInt(answer.toString());
    }

    String checkWord(StringBuilder sb) {
        switch (sb.toString()) {
            case "zero":  
                return "0";
            case "one":   
                return "1";
            case "two":   
                return "2";
            case "three": 
                return "3";
            case "four":  
                return "4";
            case "five":  
                return "5";
            case "six":   
                return "6";
            case "seven": 
                return "7";
            case "eight": 
                return "8";
            case "nine":  
                return "9";
            default:      
                return "false";                  
        }
    }
}