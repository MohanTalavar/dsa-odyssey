import java.util.*;

public class M2L49_GroupAnagram {

    public static boolean isValidAnagram(String s, String t) {

        if (s.length() != t.length()) return false;

        char[] sarr = s.toCharArray();
        char[] tarr = t.toCharArray();

        Arrays.sort(sarr);
        Arrays.sort(tarr);

        s = new String(sarr);
        t = new String(tarr);

        return s.equals(t);
    }

    public static List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> listOfList = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        int ln = strs.length;

        for (int i = 0; i < ln; i++) {

            if (set.contains(i)) continue;

            String currElem = strs[i];
            set.add(i);

            ArrayList<String> list = new ArrayList<>();
            list.add(currElem);

            for (int j = i + 1; j < ln; j++) {

                String nextElem = strs[j];

                if (!set.contains(j) && isValidAnagram(currElem, nextElem)) {
                    set.add(j);
                    list.add(nextElem);
                }

            }

            listOfList.add(list);
        }

        return listOfList;

    }

    public static List<List<String>> groupAnagrams2(String[] strs) {

        // Optimal Solution

        // base cases
        if (strs == null || strs.length == 0) return new ArrayList<>();

        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {

            char[] carr = str.toCharArray();
            Arrays.sort(carr);
            String key = new String(carr);

            // eg key will be eat , and value will be list of anagrams
            // first it checks if the key is present if not then it will
            // put the key and will add the new arrayList and then add the anagram
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(str);

        }
        return new ArrayList<>(map.values());
    }


    public static void main(String[] args) {

        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};

        System.out.println(groupAnagrams(strs));
        System.out.println(groupAnagrams2(strs));
    }
}
