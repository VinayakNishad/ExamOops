/*
Author : Vinayak Nishad
Seat Number : 24P0320057
Topic : Infofest and Hackafest Event Management system
Description : This is a main class of event management, where there is a menu base system
for your to check Infofest information, add infofest event ,add hackafest event, display both event details

 */

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Generic array list is used for storing hackafest details
        ArrayList<Hackafest> h1= new ArrayList<>();
        //Generic array list is used for storing Infofest details
        ArrayList<Infofest> i1=new ArrayList<>();
        Infofest infofest= new Infofest();
        Scanner sc = new Scanner(System.in);
        Hackafest hackafest= new Hackafest();
        int choice=0;
        do{
            System.out.println("1 : Infofest Date\n2 : Hackafest Date\n3 : Add Event Hackafest\n4 : Add Event Infofest\n5 : Display Infofest Event\n6 : Display Hackafest Event\n7 : Exit!!\n\n\n");
            System.out.println("Enter your choice : ");
            choice= sc.nextInt();
            switch(choice){
                case 1: infofest.display();
                break;
                case 2 : hackafest.display();
                break;
                case 3 :

                    try{
                        System.out.println("Enter Event Id : ");
                        int e_id_h= sc.nextInt();
                        System.out.println("Enter Event Name : ");
                        String e_name_h= sc.next();
                        System.out.println("Enter Event location : ");
                        String e_location_h=sc.next();
                        h1.add(new Hackafest(e_id_h,e_name_h,e_location_h));
                    }
                    catch (InputMismatchException e){
                        System.out.println("Please enter number :"+e);
                    }
                    catch (Exception e){
                        System.out.println("Some error :"+e);
                    }
                    finally {
                        System.out.println("Id added for event\n");
                    }


                    break;
                case 4 :
                    try{
                        System.out.println("Enter Event Id : ");
                        int e_id_i= sc.nextInt();
                        System.out.println("Enter Event Name : ");
                        String e_name_i= sc.next();
                        System.out.println("Enter Event location : ");
                        String e_location_i=sc.next();
                        i1.add(new Infofest(e_id_i,e_name_i,e_location_i));
                    }
                    catch (InputMismatchException e){
                        System.out.println("Please enter number :"+e);
                    }
                    catch (Exception e){
                        System.out.println("Some error :"+e);
                    }
                    finally {
                        System.out.println("Id added for event\n");
                    }

                    break;
                case 5 :
                    int i;
                    for(i=0; i<i1.size(); i++){
                        i1.get(i).displayEvent();
                    }
                    break;
                case 6 :
                    int j;
                    for(j=0; j<h1.size(); j++){
                        h1.get(j).displayEvent();
                    }
                    break;
                default:
                    System.out.println("Exit!");
            }
        }while(choice!=7);

    }
}