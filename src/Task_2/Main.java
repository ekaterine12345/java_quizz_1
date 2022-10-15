package Task_2;

public class Main {
    public static void main(String[] args) {
        String[] names = {"Olivia", "Emma", "Charlotte", "Amelia", "Ava", "Sophia", "Isabella", "Mia"};

        System.out.println("Most little String is "+ getLittleString(names));

        String[] names_2 = {"Isabelle", "Rosalina","Brielle", "Alyn", "Aria", "Eden", "Remi","Mackenzie","Maeve", "Margaret"};

        System.out.println("Most little String = "+ getLittleString(names_2));

    }

    public static String getLittleString(String[] names){
        String ans=names[0];
        for (int i=1; i<names.length; i++)
        {
            if (names[i].length() < ans.length()) ans=names[i];
        }
        return ans;
    }
}
