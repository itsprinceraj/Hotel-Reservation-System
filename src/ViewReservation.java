import com.mysql.cj.protocol.Resultset;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ViewReservation {

//    Function for viewing reservation ;
     void viewReservation(Statement statement){
          try{
               String query = "select * from reservations;";
               ResultSet result = statement.executeQuery(query);

//               check if data is found or not;
               if(!result.next()){
                    System.out.println("No reservations found. Please make a reservation.");
               }else{
                    //                now show data:
                    while(result.next()){
                         int id = result.getInt("reservation_id");
                         String guestName = result.getString("guest_Name");
                         int roomNum = result.getInt("room_num");
                         String phoneNum = result.getString("phone_num");
                         String date = result.getTimestamp("reservation_date").toString();

//                    now print data;
                         System.out.println("===========================");
                         System.out.println("Reservation id: "+ id);
                         System.out.println("Guest Name: "+ guestName);
                         System.out.println("Room Number: "+ roomNum);
                         System.out.println("Phone: "+ phoneNum);
                         System.out.println("Date: "+ date);
                         System.out.println("===========================");
                    }
               }

          }catch (SQLException e){
               e.printStackTrace();
          }
     }
}
