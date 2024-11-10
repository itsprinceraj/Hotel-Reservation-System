import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateReservation {

//    Function for Updating reservation ;
    void updateReservation(Scanner sc, Statement statement){
        System.out.print("Enter Reservation id: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter New name: ");
        String name = sc.nextLine();
        System.out.print("Enter New Phone: ");
        String number = sc.nextLine();
        System.out.print("Enter New Room number: ");
        int roomNum = sc.nextInt();
        String query = "update reservations SET guest_name = '"+ name + "' , room_num = " + roomNum + " , phone_num = '" + number + "' where reservation_id = " + id ;

//        update data into the database;
        try{
            int rowAffected = statement.executeUpdate(query);
//            apply checks;
            if(rowAffected > 0){
                System.out.println("Data updated Successfully");
            }
        }catch (SQLException e){
            e.printStackTrace();
        }

    }
}
