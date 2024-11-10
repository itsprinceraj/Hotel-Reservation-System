import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteReserve {

//    function to delete reservaion;
    void deleteReservation(Connection connection ,Scanner sc, Statement statement){
        System.out.print("Enter reservation id: ");
        int id = sc.nextInt();
        sc.nextLine();
        String query = "delete from reservations where reservation_id = " + id;

//         check if that id is present of not;
         try{
             if(checkData(connection, statement, id)){
                 int rowAffected = statement.executeUpdate(query);

                 if(rowAffected > 0){
                     System.out.println("Reservation Deleted. Thank You for choosing us :)");
                 }else {
                     System.out.println("Unable to delete reservation");
                 }

             }else{
                 System.out.println("Invalid Reservation id! Try Again!!!");
             }
         }catch (SQLException e){
             e.printStackTrace();
         }
    }

//     checkData Function ;
    private boolean checkData(Connection conection, Statement statement, int id){
        try{
            String query = "select reservation_id from reservations where reservation_id = " + id;
            ResultSet result = statement.executeQuery(query);

            return result.next();  // if there is any result than the id is valid;
        }catch (SQLException e){
            e.printStackTrace();
        }
        return false;
    }
}
