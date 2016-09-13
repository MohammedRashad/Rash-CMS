/*
 * Copyright (C) 2016 Mohamed Rashad
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package rash.cms;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Main {

    static File file;
    static int usedBefore;
    static HomeScreen home;
    static Properties properties;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /* Set the Metal look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        //</editor-fold>
        /* Create and display the form */

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                home = new HomeScreen();

                if (CheckIfUserLoggedIn() == 1) {

                    System.err.println("Welcome Back");

                    home.setTitle("Rash, Clinic Management System");
                    home.setGraphics();
                    home.displayDataAtAllTable();
                    home.setVisible(true);

                } else {

                    setUserAsLogged();

                    DatabaseManager.createDatabase();
                    DatabaseManager.createTable();

                    System.err.println("Hello for the first Time");

                    home.setTitle("Rash, Clinic Management System");
                    home.setVisible(true);
                    home.setGraphics();

                }
            }
        });

    }

    /**
     *
     *
     *
     * @return usedBefore
     */
    private static int CheckIfUserLoggedIn() {

        try {

            file = new File("data.properties");

            try (FileInputStream fileInput = new FileInputStream(file)) {

                properties = new Properties();
                properties.load(fileInput);

            }

            usedBefore = Integer.parseInt(properties.getProperty("UsedBefore"));

        } catch (IOException | NumberFormatException e) {

            System.err.println("ERROR");

            e.printStackTrace();

        }

        return usedBefore;
    }

    /**
     *
     *
     *
     */
    public static void setUserAsLogged() {

        try {

            properties = new Properties();
            properties.setProperty("UsedBefore", "1");

            file = new File("data.properties");
            try (FileOutputStream fileOut = new FileOutputStream(file)) {

                properties.store(fileOut, "DATAA");

            }

        } catch (FileNotFoundException e) {

            System.err.println("ERRoOR");
            e.printStackTrace();

        } catch (IOException e) {

            System.err.println("ERROoR");

            e.printStackTrace();

        }

    }

}
