/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.util;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author bruno
 */
public class Encript {
    public static void main(String[] args) {
        Encript enc = new Encript();
        System.out.println("SEnha admin: : \n" + enc.encript("admin"));
        System.out.println("SEnha adminquetenhafe: : \n" + enc.encript("adminquetenhafe"));
        System.out.println("SEnha ad: : \n" + enc.encript("ad"));
    }
    
    private String encript(String senha) {
        try {
            MessageDigest senhaEncript = MessageDigest.getInstance("SHA-256");
            byte digest[] = senhaEncript.digest(senha.getBytes("UTF-8"));
            StringBuilder hexString = new StringBuilder();
            for (byte b: digest) {
                hexString.append(String.format("%02X", 0xFF & b));
            }
            return hexString.toString();
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException ex) {
           
        }
        return senha;
    }
}
