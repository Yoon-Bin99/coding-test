class Solution {
    public String solution(String new_id) {
        // 1단계: 소문자로
        String s = new_id.toLowerCase();

        // 2단계: 허용 문자 외 제거
        s = s.replaceAll("[^a-z0-9-_.]", "");

        // 3단계: 연속 마침표 → 하나
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '.' && sb.length() > 0 && sb.charAt(sb.length() - 1) == '.') continue;
            sb.append(c);
        }
        s = sb.toString();

        // 4단계: 앞뒤 마침표 제거
        if (s.startsWith(".")) s = s.substring(1);
        if (s.endsWith(".")) s = s.substring(0, s.length() - 1);

        // 5단계: 빈 문자열이면 "a"
        if (s.isEmpty()) s = "a";

        // 6단계: 16자 이상이면 15자로 자르고 끝 마침표 제거
        if (s.length() >= 16) {
            s = s.substring(0, 15);
            if (s.endsWith(".")) s = s.substring(0, s.length() - 1);
        }

        // 7단계: 2자 이하면 마지막 글자를 3자 될 때까지 반복
        while (s.length() < 3) {
            s += s.charAt(s.length() - 1);
        }

        return s;
    }
}