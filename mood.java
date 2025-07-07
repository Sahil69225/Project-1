import java.util.HashMap;
import java.util.Scanner;
public class mood {
      public static void main(String []args)
    {
        HashMap<String,String> moodmap=new HashMap<>();
        moodmap.put("Happy","😊 Stay Happy");
        moodmap.put("Angry","😡 Keep Calm");
        moodmap.put("Sad", "😢 Don't be Sad");
        moodmap.put("Tired","😴 Get some Rest");

        Scanner sc=new Scanner(System.in);
        System.out.println("enter Your Mood");
        String Usermood=sc.nextLine().toLowerCase();

        if(moodmap.containsKey(Usermood))
        {
            System.out.println(moodmap.get(Usermood));
        }
        else{
            System.out.println("mood is not present in the map");
        }
    sc.close();
}
}