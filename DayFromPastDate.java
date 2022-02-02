import java.util.Scanner;

public class DayFromPastDate {
	public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int monthCode=0,centuryCode=0;
        int date,month,year;

        System.out.println("Enter  Day:");
        date = sc.nextInt();
        System.out.println("Enter  Month:");
        month = sc.nextInt();
        System.out.println("Enter  Year:");
        year = sc.nextInt();


        switch(month){
            case 2:case 3:case 11:monthCode=4;
            break;
            case 4:case 7:monthCode=0;
            break;
            case 1:case 10:monthCode=1;
            break;
            case 9:case 12:monthCode=6;
            break;
            case 5:monthCode=2;
            break;
            case 6:monthCode=5;
            break;
            case 8:monthCode=3;
            break;
            default:System.out.println("Invalid month entered");
        }


        //for countryCode
        for(int i=1500;i<=1599;i++){
            if(year==i){
                centuryCode=0;
            }
        }

        for(int i=1600;i<=1699;i++){
            if(year==i){
                centuryCode=6;
            }
        }

        for(int i=1700;i<=1799;i++){
            if(year==i){
                centuryCode=4;
            }
        }

        for(int i=1800;i<=1899;i++){
            if(year==i){
                centuryCode=2;
            }
        }

        for(int i=1900;i<=1999;i++){
            if(year==i){
                centuryCode=0;
            }
        }

        for(int i=2000;i<=2099;i++){
            if(year==i){
                centuryCode=6;
            }
        }

        

        //for getting last remaining years
        int temp = year ;
        int lastYear = temp % 100;

        int numberOfLeapYear = (lastYear)/4;

        int dayCalculate = (date + monthCode + centuryCode + lastYear + numberOfLeapYear);
        
        int resultDay = dayCalculate % 7;
        


        //now compare dayCalculate by dayCode and print the resultant output
        switch(resultDay){
            case 0:System.out.println("The day on "+date+"/"+month+"/"+year+" is Saturday");
            break;
            case 1:System.out.println("The day on "+date+"/"+month+"/"+year+" is Sunday");
            break;
            case 2:System.out.println("The day on "+date+"/"+month+"/"+year+" is Monday");
            break;
            case 3:System.out.println("The day on "+date+"/"+month+"/"+year+" is Tuesday");
            break;
            case 4:System.out.println("The day on "+date+"/"+month+"/"+year+" is Wednesday");
            break;
            case 5:System.out.println("The day on"+date+"/"+month+"/"+year+" is Thrusday");
            break;
            case 6:System.out.println("The day on"+date+"/"+month+"/"+year+" is Friday");
            break;
        }
        sc.close();
    }
}



