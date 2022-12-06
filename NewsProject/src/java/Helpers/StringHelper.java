/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helpers;

public class StringHelper {
    
    public static boolean verifyPassword(String orginPassword, String dbGet){
        return orginPassword.equals(dbGet);
    }
    
    public static String hashPassword(String orginPassword){
        return "";
    }
}
