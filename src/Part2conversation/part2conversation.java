package Part2conversation;
import java.util.Scanner;
public class part2conversation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Hey! I would be interested to know what you do on a daily basis.");
        System.out.println("I'll try to guess your occupation by your age.");
        System.out.println("May I know your age, please?");

        int age = in.nextInt();

        String activity;

        if (age < 6) {
            activity = "You should spend your day at home, go for a walk, and attend kindergarten.";
        } else if (age >= 7 && age <= 17) {
            activity = "You should be at school, studying interesting subjects.";
        } else if (age >= 18 && age <= 22) {
            activity = "You should be at university, developing your social skills and getting a university degree.";
        } else if (age > 23 && age < 60) {
            activity = "Most likely, you are currently working. I hope you enjoy your work and find time to relax.";
        } else if (age >= 60) {
            activity = "I think you're retired now, so it's time to relax) Have a great day!";
        } else {
            activity = "I'm not sure what daily activity to suggest for your age.";
        }


        System.out.println("Based on your age, here's the suggested daily activity:");
        System.out.println(activity);

        in.close();
    }
}
