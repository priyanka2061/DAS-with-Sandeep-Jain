class Solution {
  public int myAtoi(String s) {
    s = s.trim();
    int sign = 1;
    if (s.length() == 0)
      return 0;
    int i = 0;
    long out = 0;
    if (s.charAt(0) == '+' || s.charAt(0) == '-') {
      sign = (s.charAt(i) == '-') ? -1 : 1;
      i++;
    }
    while (i < s.length()) {
      if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
        out = (out * 10) + s.charAt(i) - '0';
      } else
        break;
      if (out > Integer.MAX_VALUE || out < Integer.MIN_VALUE) {
        return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
      }
      i++;
    }
    return (int) (out * sign);
  }
}