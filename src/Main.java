
public class Main {
    public static void main(String[] args) {

//        creating  object;
        ConnectDB connect = new ConnectDB();
        ReserveRoom reserve = new ReserveRoom();
        ViewReservation viewReserve = new ViewReservation();
        GetRoomNum getRoom = new GetRoomNum();
        UpdateReservation updateReserve = new UpdateReservation();
        DeleteReserve deleteReserve = new DeleteReserve();
        ExitClass exitClass = new ExitClass();

//       Load Drivers;
        connect.loadDrivers();

//Connect to Database and pass all the object instance to use class functions;
        connect.connectDb(reserve, viewReserve,getRoom, updateReserve,deleteReserve , exitClass);

    }
}