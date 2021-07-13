public class Dayweek {
    public static String main(String[] args) {      
	int dayweek;
	int c,y,m,d;
	String 
    int cc,yy;
    String dayString;
    int y0 = y - (14 - m) / 12;
    int x = y0 + y0/4 - y0/100 +y0/400;
    int m0 = m + 12 * ((14 - m) / 12) - 2;
    int d0 = (d + x + 31 * m0 / 12) % 7;  
   
    switch(dayweek)
    {
        case 0: dayString = "sunday";
            break;
        case 1: dayString = "monday";
            break;
        case 2: dayString = "tuesday";
            break;
        case 3: dayString = "thursday";
            break;
        case 4: dayString = "friday";
            break;
        default:
            System.out.println("Weekend");
            break;
            return dayString;
    }
}
}

