public class TwoDimenssionArrays {
    public static void main(String[] args) {
        Status[][]  roomStatus = new Status[12][31 ];
        for (int month=0; month<12; month++){
            for (int day=0; day<31; day++){
                roomStatus[month][day] = Status.OPEN;
                int a = 1;
            }
        }
        setNaDays(roomStatus, 2016);
        setBooking(roomStatus, 2, 14, Status.BOOKED);

        System.out.println("Status for 2/13: " + checkBookings(roomStatus, 2, 13));
        System.out.println("Status for 2/14: " + checkBookings(roomStatus, 2, 14));
        System.out.println("Status for 2/31: " + checkBookings(roomStatus, 2, 31));
    }
    public static void setBooking(Status[][] statusArr, int month, int day, Status status){
        if (month<1 || month>12 || day<1 || day>31){
            throw new IllegalArgumentException("Invalid month or day specified");
        }
        statusArr[month-1][day-1] = status;
    }
    public static void setNaDays(Status[][] statusArr, int year){
        // For all years
        setBooking(statusArr, 2, 30, Status.NA);
        setBooking(statusArr, 2, 31, Status.NA);
        setBooking(statusArr, 4, 31, Status.NA);
        setBooking(statusArr, 6, 31, Status.NA);
        setBooking(statusArr, 9, 31, Status.NA);
        setBooking(statusArr, 11, 31, Status.NA);

        if (year % 4 !=0){
            setBooking(statusArr, 2, 29, Status.NA);
        }
    }
    public static Status checkBookings(Status[][] statusArr, int month, int day){
        if (month<1 || month>12 || day<1 || day>31){
            throw new IllegalArgumentException("Invalid month or day specified");
        }
        return statusArr[month-1][day-1];
    }
}
