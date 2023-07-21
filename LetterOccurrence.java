
public class LetterOccurrence {
public static void main(String[] args) {
String str = "Capgemini";
countLetterOccurrences(str);
}
public static void countLetterOccurrences(String str) {
str = str.toLowerCase();
int[] count = new int[26];
for (int i = 0; i < str.length(); i++) {
char ch = str.charAt(i);
if (ch >= 'a' && ch <= 'z') {
count[ch - 'a']++;
}
}
for (char ch = 'a'; ch <= 'z'; ch++) {
int occurrences = count[ch - 'a'];
if (occurrences > 0) {
System.out.println("'" + ch + "' occurs " + occurrences + " times");
}
}
}
}
