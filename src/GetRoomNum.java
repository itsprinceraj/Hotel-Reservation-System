import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class GetRoomNum {
    void getRoomNumber(Scanner sc, Statement statement){
        System.out.print("Enter Reservation id: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Guest Name: ");
        String name = sc.nextLine();
        String query = "select room_num from reservations where reservation_id = " + id + ";";

//         execute query;
        try{
            ResultSet result = statement.executeQuery(query);

//             print data;
            if(result.next()){
                int roomNum = result.getInt("room_num");
                System.out.print("Room number of Guest " + name + " is: ");
                System.out.println(roomNum);
            }else{
                System.out.println("unable to get Room number");
            }

        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
