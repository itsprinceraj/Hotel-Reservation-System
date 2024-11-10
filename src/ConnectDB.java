import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ConnectDB {

    private static final String url = "jdbc:mysql://localhost:3306/hotel_management";
    private static final String userName = "root";
    private static final String password = "5466";


//    Function for DB Connection;
    public void connectDb(ReserveRoom reserve , ViewReservation viewReserve, GetRoomNum getRoom, UpdateReservation updateReserve, DeleteReserve deleteReserve, ExitClass exitClass){
        try{
            Connection connect = DriverManager.getConnection(url,userName,password);
            Statement statement = connect.createStatement();
//            System.out.println("DB connected Successful");

            while(true){
                System.out.println("***** HOTEL RESERVATION SYSTEM *****");
                Scanner sc = new Scanner(System.in);
                System.out.println("1. Reserve a Room.");
                System.out.println("2. View Reservation.");
                System.out.println("3. Get Room Number.");
                System.out.println("4. Update Reservation.");
                System.out.println("5. Delete Reservation.");
                System.out.println("0. Exit.");
                System.out.println("Choose an option: ");

//               store the user's choice;
                int choice = sc.nextInt();
                sc.nextLine();

//                call functions according to choice;
                switch (choice){
                    case 1:
                        reserve.reserveRoom(sc , statement);
                        break;

                    case 2:
                        viewReserve.viewReservation(statement);
                        break;

                    case 3:
                        getRoom.getRoomNumber(sc,statement);
                        break;

                    case 4:
                        updateReserve.updateReservation(sc,statement);
                        break;

                    case 5:
                        deleteReserve.deleteReservation(connect, sc,statement);
                        break;

                    case 0:
                        exitClass.exit();
                        sc.close();
                        return;

                    default:
                        System.out.println("Invalid Choice. Try Again!");

                }
            }

        }catch (SQLException e){
            System.out.println("DB connection Failed");
            e.printStackTrace();
        }

    }

//    function to load Drivers;
    public void loadDrivers(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Drivers loaded successfully");

        }catch (ClassNotFoundException e){
            System.out.println("Unable to load Drivers");
            e.printStackTrace();
        }
    }


}
