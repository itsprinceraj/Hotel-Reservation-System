import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ReserveRoom {

//     Function for room reservation
     void reserveRoom(Scanner sc, Statement statement){
        System.out.print("Enter Guest Name: ");
        String guestName = sc.nextLine();
        System.out.print("Enter Room Number: ");
        int roomNum = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter contact Number: ");
        String contact = sc.nextLine();
        System.out.println();

//      write sql query;
        String query = "insert into reservations (guest_name , room_num, phone_num)" + "values(' " + guestName + " ' , '" + roomNum + " ', ' " +contact + " ');";

//        insert data into database;
        try{
            int rowAffected = statement.executeUpdate(query);

            if(rowAffected > 0){
                System.out.println("Reservation Successful :)");
                System.out.println();
            }else {
                System.out.println("Reservation Failed");
            }

        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
