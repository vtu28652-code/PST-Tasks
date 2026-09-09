import java.util.*;

class Solution {

    public String[] sortPeople(String[] names, int[] heights) {

        int n = names.length;

        Person[] people = new Person[n];

        for (int i = 0; i < n; i++) {
            people[i] = new Person(names[i], heights[i]);
        }

        Arrays.sort(people, (a, b) -> b.height - a.height);

        String[] result = new String[n];

        for (int i = 0; i < n; i++) {
            result[i] = people[i].name;
        }

        return result;
    }

    class Person {
        String name;
        int height;

        Person(String name, int height) {
            this.name = name;
            this.height = height;
        }
    }
}
#Input 
  names =
["Mary","John","Emma"]
heights =
[180,165,170]

  #Output
  ["Mary","Emma","John"]
