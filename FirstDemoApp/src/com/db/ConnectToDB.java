/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.db;

import java.sql.*;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author henry
 */
public class ConnectToDB {
    Connection conn= null;

     public static Connection connectDB(){
         
         try {
             Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.
                    getConnection("jdbc:sqlite:info.db");
             JOptionPane.showMessageDialog(null, "Connected");
             System.out.println("We are connected...");
                                   
                 
             
         
                 System.out.println("Select Process: \n "
                                   + "1- Add \n "
                                   + "2- Select \n "
                                   + "3- Update \n "
                                   + "4- Delete");
             //System.out.println("Do you want to perform another Query? Yes or No");
              Statement stm;
              int id;
              int userInput =0;
              Scanner sc = new Scanner(System.in);
             userInput = sc.nextInt();
             do {                 
                 
           
             switch(userInput){
                 case 1:
                     // Add User
                     Scanner unamein = new Scanner(System.in);
                     Scanner pwordin = new Scanner(System.in);
                     System.out.println("Enter username: ");
                     String username = unamein.nextLine();
                     System.out.println("Enter password: ");
                     String password = pwordin.nextLine();
                     String sqlAdd = "insert into users "
                      + "(username, password)"
                      + "values('"+username+"','"+password+"')";
                    stm = conn.createStatement();
                    stm.executeUpdate(sqlAdd); 
                    stm.close();
                    conn.commit();
                    JOptionPane.showMessageDialog(null, "Record is Added..");
                    conn.close();
                    break;
                 case 2:
                     // select user
                    String sqlRead = "select * from users ";
                     stm = conn.createStatement();
                   ResultSet rs = stm.executeQuery(sqlRead);
                   System.out.println("ID\t Username\t Password");
                     while (rs.next()) {
                          id = rs.getInt("id");
                        String UserName = rs.getString("username");
                        String Passowrd = rs.getString("password");
                        System.out.println(id+"\t  "+UserName+"\t\t  "+Passowrd+"\n");
                     }
                     rs.close();
                     stm.close();
                     conn.close();
                     break;
                     case 3:
                     // Update User
                      Scanner idUpdateIn = new Scanner(System.in);
                      Scanner pwUpdateIn = new Scanner(System.in);
                      System.out.println("Enter id: ");
                      id = idUpdateIn.nextInt();
                   System.out.println("Enter password: ");
                   String pwUpdate = pwUpdateIn.nextLine();
                   String sqlUpdate = "update users set password ='"+pwUpdate+"'"
                            + "where id="+id;
                    stm = conn.createStatement();
                    stm.executeUpdate(sqlUpdate); 
                    JOptionPane.showMessageDialog(null, "Record is Updated..");
                    stm.close();
                    conn.commit();
                    conn.close();
                    break;               
                     case 4:
                     // Delete User
                     Scanner idIn = new Scanner(System.in);
                     System.out.println("Enter id: ");
                     id = idIn.nextInt();
                    String sqlDelete = "delete from users where id="+id;
                    stm = conn.createStatement();
                    stm.executeUpdate(sqlDelete); 
                    
                    stm.close();
                    conn.commit();
                    conn.close();
                    JOptionPane.showMessageDialog(null, "Record is Deleted..");
                    break;
                                      
                    default:
                        break;
             }  
             
               } while (userInput !=5);
             
         } catch (Exception e) {
             JOptionPane.showMessageDialog(null, e);
         }
         return null;
     }
                       
}
