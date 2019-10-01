// given an int number of days  and a day of the week 
// figure which day will it be if you increment the day of the week by the number of days
//EX int =2 day of the week = sat 
// sat+2 days = mon
public class AddToDayOfWeek {


public static void main(String []w)
{
         System.out.println(    new AddToDayOfWeek().solution("Wed", 2));
         System.out.println(    new AddToDayOfWeek().solution("Sat", 23));
}
    public String solution(String S, int K) {
        int i =K%7;
        String  result = "";
        String [] days = {"Mon","Tue","Wed","Thu","Fri","Sat","Sun"};
        for (int j =0;j<days.length-1;j++)
        {
            if (days[j]==S)
            {
                if ((j+i)<days.length-1)// if the number of days added to the array will not be out side the array index ex:mon +2=wed
                {
                    result= days[j+i];

                }
                else
                {
                    result = days[j+i-7]; // if the number of days added will pass the end of the week if added to the array index ex: sat +2==mon
                }
            }

        }

        return result;
    }
}
