package jday09_array_practice_task;

public class ClassMatesReversed {
    public static void main(String[] args) {
        String[] classmates = {"Batuhan", "Aysun", "Emir", "Ergin", "Zulfiye", "Muhtar", "Ayse", "Haluk", "Mehmet", "Mustafa"};

        for (String name : classmates) {
            StringBuilder reverseName = new StringBuilder();
            for (int j = name.length() - 1; j >= 0; j--) {
                reverseName.append(name.charAt(j));
            }
            System.out.println(reverseName);
        }
    }
}

