package Module_1.FanApp;
/*
 Suddala, Deepthi. (2025). CIS 505 Intermediate Java Programming.
 Bellevue University.
*/
public class TestFanApp
{
    public static void main(String[] args)
    {
        Fan f1 = new Fan();
        Fan f2 = new Fan(Fan.FAST, true, 23.5, "blue");

        System.out.println(f2.toString());
        System.out.println(f1.toString());
    }
}

