/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Controller.LogIn;
import java.io.IOException;

/**
 *
 * @author ACER
 */
public class Main {
    public static void main(String[] args) throws IOException {
        LogIn lgIn = new LogIn();
        lgIn.start();
    }
}
