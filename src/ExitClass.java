public class ExitClass {
//     function for exit the hotel reservation ;
    void exit(){
        System.out.print("Exiting System");
        int i = 5;
        while(i!=0){
            System.out.print(".");  // prints dot after 500ms
            try{
                Thread.sleep(500);
            }catch (InterruptedException e){
                e.printStackTrace();
                System.out.println("Error while exit");
            }
            i--;
        }
        System.out.println();
        System.out.println("Thank you for Choosing us :)");
    }
}
