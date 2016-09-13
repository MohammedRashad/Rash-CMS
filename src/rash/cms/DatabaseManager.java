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

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

public class DatabaseManager {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL_FIRST_TIME = "jdbc:mysql://localhost/?useSSL=false";
    static final String DB_URL = "jdbc:mysql://localhost/clinic?useSSL=false&useUnicode=yes&characterEncoding=UTF-8";
    static final String USER = "root";
    static final String PASS = "";

    static Connection conn = null;
    static Statement stmt = null;

    public static void createDatabase() {

        try {

            Class.forName("com.mysql.jdbc.Driver");

            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL_FIRST_TIME, USER, PASS);

            System.out.println("Creating database...");
            stmt = conn.createStatement();

            String sql = "CREATE DATABASE clinic";
            stmt.executeUpdate(sql);
            System.out.println("Database created successfully...");

            sql = "ALTER DATABASE clinic CHARACTER SET utf8 COLLATE utf8_unicode_ci";
            stmt.executeUpdate(sql);
            System.out.println("Database Aletered successfully...");

        } catch (SQLException | ClassNotFoundException se) {

            System.out.println("Error...");

            se.printStackTrace();

        } finally {

            try {

                if (stmt != null) {

                    stmt.close();

                }

            } catch (SQLException se2) {

                System.out.println("Error...");
                se2.printStackTrace();

            }

            try {

                if (conn != null) {

                    conn.close();
                }

            } catch (SQLException se) {

                System.out.println("Error...");
                se.printStackTrace();

            }
        }

        System.out.println("Done My Work!");

    }

    public static void createTable() {

        try {

            Class.forName("com.mysql.jdbc.Driver");

            System.out.println("Connecting to a selected database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Connected database successfully...");

            System.out.println("Creating table in given database...");
            stmt = conn.createStatement();

            String sql = "CREATE TABLE DATAM"
                    + "(id INT AUTO_INCREMENT PRIMARY KEY,"
                    + "name VARCHAR(255), "
                    + " age VARCHAR(255), "
                    + " number VARCHAR(255), "
                    + " service VARCHAR(255), "
                    + " notes VARCHAR(255), "
                    + " history VARCHAR(3000))";

            stmt.executeUpdate(sql);

            System.out.println("Created table in given database...");

        } catch (SQLException | ClassNotFoundException se) {
            se.printStackTrace();

            System.out.println("Error...");

        } finally {

            try {

                if (stmt != null) {

                    conn.close();

                }

            } catch (SQLException se) {

                System.out.println("Error...");
                se.printStackTrace();

            }
            try {

                if (conn != null) {

                    conn.close();

                }

            } catch (SQLException se) {

                System.out.println("Error...");
                se.printStackTrace();

            }
        }

        System.out.println("Done My Work!");
    }

    public static void insertToDataBase(String name, String age, String number, String service, String history, String notes) {

        try {

            Class.forName("com.mysql.jdbc.Driver");

            System.out.println("Connecting to a selected database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Connected database successfully...");

            System.out.println("Inserting records into the table...");
            stmt = conn.createStatement();

            String sql = "INSERT INTO DATAM "
                    + "VALUES ('" + 0 + "' , '" + name + "', '" + age + "','" + number + "', '" + service + "', '" + notes + "' ,'" + history + "')";
            stmt.executeUpdate(sql);

            System.out.println("Inserted records into the table...");

        } catch (SQLException | ClassNotFoundException se) {

            System.out.println("Error...1");
            se.printStackTrace();

        } finally {

            try {

                if (stmt != null) {
                    conn.close();
                }

            } catch (SQLException se) {

                System.out.println("Error...2");

            }
            try {

                if (conn != null) {
                    conn.close();
                }

            } catch (SQLException se) {
                se.printStackTrace();

                System.out.println("Error...3");

            }
        }

        System.out.println("Done My Work!");
    }

    public static Vector<Vector<String>> selectFromDatabase() {

        Vector<Vector<String>> data = new Vector<Vector<String>>();

        String[] str = new String[7];

        try {

            Class.forName("com.mysql.jdbc.Driver");

            System.out.println("Connecting to a selected database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Connected database successfully...");

            System.out.println("Creating statement...");
            stmt = conn.createStatement();

            String sql = "SELECT * FROM DATAM";

            try (ResultSet rs = stmt.executeQuery(sql)) {

                while (rs.next()) {

                    Vector<String> vstring = new Vector<String>();

                    str[6] = String.valueOf(rs.getInt("id"));
                    str[5] = rs.getString("name");
                    str[4] = rs.getString("age");
                    str[3] = rs.getString("number");
                    str[2] = rs.getString("service");
                    str[0] = rs.getString("history");
                    str[1] = rs.getString("notes");

                    vstring.add(str[1]);
                    vstring.add(str[0]);
                    vstring.add(str[2]);
                    vstring.add(str[3]);
                    vstring.add(str[4]);
                    vstring.add(str[5]);
                    vstring.add(str[6]);

                    data.add(vstring);

                }

            }

        } catch (SQLException | ClassNotFoundException se) {

            System.out.println("Error...");
            se.printStackTrace();

        } finally {

            try {
                if (stmt != null) {
                    conn.close();
                }
            } catch (SQLException se) {
            }
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException se) {

                System.out.println("Error...");
                se.printStackTrace();

            }
        }

        System.out.println("Done My Work!");

        return data;
    }

    public static void updateDatabase(String name, String age, String number, String service, String history, String notes , int id) {

        try {

            Class.forName("com.mysql.jdbc.Driver");

            System.out.println("Connecting to a selected database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Connected database successfully...");

            System.out.println("Creating statement...");
            stmt = conn.createStatement();
            String sql = "UPDATE DATAM SET age ='" + age + "',name ='" + name + "' ,number ='" + number + "' ,service ='" + service + "' ,history ='" + history + "' ,  notes ='" + notes + "'  WHERE id ='" + id + "'";
            stmt.executeUpdate(sql);

        } catch (SQLException | ClassNotFoundException se) {

            System.out.println("Error...");
            se.printStackTrace();

        } finally {

            try {

                if (stmt != null) {
                    conn.close();
                }

            } catch (SQLException se) {

                System.out.println("Error...");

            }

            try {

                if (conn != null) {
                    conn.close();
                }

            } catch (SQLException se) {

                System.out.println("Error...");

            }
        }

        System.out.println("Done My Work!");

    }

    public static void deleteFromDatabase(String key) {

        try {

            Class.forName("com.mysql.jdbc.Driver");

            System.out.println("Connecting to a selected database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Connected database successfully...");

            System.out.println("Creating statement...");
            stmt = conn.createStatement();
            String sql = "DELETE FROM DATAM WHERE id = '" + key + "'";

            System.err.println(sql);
            stmt.executeUpdate(sql);

        } catch (SQLException | ClassNotFoundException se) {

            System.out.println("Error...");
            se.printStackTrace();

        } finally {

            try {

                if (stmt != null) {
                    conn.close();
                }

            } catch (SQLException se) {

                System.out.println("Error...");

            }

            try {

                if (conn != null) {
                    conn.close();
                }

            } catch (SQLException se) {

                System.out.println("Error...");
                se.printStackTrace();

            }
        }

        System.out.println("Done My Work!");

    }

    public static void truncateTable() {

        try {

            Class.forName("com.mysql.jdbc.Driver");

            System.out.println("Connecting to a selected database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Connected database successfully...");

            System.out.println("Creating statement...");
            stmt = conn.createStatement();
            String sql = "TRUNCATE TABLE DATAM";
            stmt.executeUpdate(sql);

            selectFromDatabase();

        } catch (SQLException | ClassNotFoundException se) {

            System.out.println("Error...");

        } finally {

            try {

                if (stmt != null) {
                    conn.close();
                }

            } catch (SQLException se) {

                System.out.println("Error...");
                se.printStackTrace();

            }

            try {

                if (conn != null) {
                    conn.close();
                }

            } catch (SQLException se) {

                System.out.println("Error...");

            }
        }

        System.out.println("Done My Work!");

    }

    public static Vector<Vector<String>> searchDatabase(String column, String key) {

        Vector<Vector<String>> data = new Vector<Vector<String>>();

        String[] str = new String[7];

        try {

            Class.forName("com.mysql.jdbc.Driver");

            System.out.println("Connecting to a selected database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Connected database successfully...");

            System.out.println("Creating statement...");
            stmt = conn.createStatement();

            String sql = "SELECT * FROM DATAM WHERE " + column + " LIKE '%" + key + "%'";

            try (ResultSet rs = stmt.executeQuery(sql)) {

                while (rs.next()) {

                    Vector<String> vstring = new Vector<String>();

                    str[6] = String.valueOf(rs.getInt("id"));
                    str[5] = rs.getString("name");
                    str[4] = rs.getString("age");
                    str[3] = rs.getString("number");
                    str[2] = rs.getString("service");
                    str[0] = rs.getString("history");
                    str[1] = rs.getString("notes");

                    vstring.add(str[1]);
                    vstring.add(str[0]);
                    vstring.add(str[2]);
                    vstring.add(str[3]);
                    vstring.add(str[4]);
                    vstring.add(str[5]);
                    vstring.add(str[6]);

                    data.add(vstring);

                }

            }

        } catch (SQLException | ClassNotFoundException se) {

            se.printStackTrace();
        } finally {

            try {
                if (stmt != null) {
                    conn.close();
                }
            } catch (SQLException se) {
            }
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException se) {

                System.out.println("Error...");

            }
        }

        System.out.println("Done My Work!");

        return data;
    }

}
