import java.util.Scanner;

public class Notes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        NoteH[] obj = new NoteH[2000];
        boolean flag = true;
        System.out.println ( "Welcome to ISI Notes:");
                do {
                    System.out.println ( "**** ***** Notes ***** ****");
                    System.out.println ( "**** 1, Add Notes *****");
                    System.out.println ( "**** 2, Delete Notes *****");
                    System.out.println ( "**** 3, Update Notes *****");
                    System.out.println ( "**** 4, View Notes *****");
                    System.out.println ( "**** 5, exit the system *****");
                    System.out.println ( "**** Please select the operation you need to do: *****");
                    int ch = in.nextInt();
                    switch (ch) {
                        case 1:
                            System.out.println ( "Please Enter Your Name");
                            String name = in.next();
                            System.out.println ( "Please Enter Notes ");
                            String notes = in.next();
                            NoteH obj1 = new NoteH(name, notes);
                            for (int i = 0; i < obj.length; i++) {
                                if (obj[i] == null) {
                                    obj[i] = obj1;
                                    break;
                                }
                                else if (obj[obj.length - 1] != null) {
                                    System.out.println ( "***** Records Full ****");
                                    break;
                                }
                            }
                            for (int i = 0; i < obj.length; i++) {
                                if (obj[i] != null) {
                                    System.out.println(obj[i]);
                                }
                            }
                            break;
                        case 2:
                            System.out.println ( "Please enter the name of the User you want to delete");
                            name = in.next();

                            boolean flag1 = true;
                            for (int i = 0; i < obj.length; i++) {
                                if(obj[0]==null){
                                    System.out.println ( "No User");
                                    break;
                                }
                                if(obj[i]!=null&&!obj[i].getName().equals(name)){
                                    flag1 = false;
                                }
                                if(obj[i]!=null&&obj[i].getName().equals(name)){
                                    obj[i] = null;
                                    System.out.println ( "Record deleted successfully!");
                                    flag1 = true;
                                    break;
                                }
                                if (!flag) {
                                    System.out.println ( "The User do not exist");
                                }
                            }
                            break;
                        case 3:
                            System.out.println ( "Please enter the name of the User to be modified");
                            name = in.next();
                            System.out.println ( "Please enter the New Notes");
                            notes = in.next();
                            boolean flag2=true;
                            for (int i = 0; i < obj.length; i++) {

                                if (obj[i]!=null&&!obj[i].getName().equals(name) ) {
                                    flag2 = false;
                                }
                                if(obj[i]!=null&&obj[i].getNumber().equals(notes)){

                                    flag2 = false;
                                    break;
                                }
                                if(obj[i]!=null&&obj[i].getName().equals(name)){
                                    obj[i].setNumber(notes);
                                    System.out.println ( "modifications are complete");
                                    flag2 = true;
                                    break;
                                }
                            }
                            if (!flag2) {
                                System.out.println ( "This UserName does not exist conflict");
                            }
                            break;
                        case 4:
                            for (int i = obj.length - 1; i >= 0; i--) {
                                if(obj[i]!=null)
                                    System.out.println(obj[i]);
                            }
                            break;
                        case 5:
                            System.exit(0);
                            break;
                        default:
                            break;
                    }
                }while (true);
    }
}