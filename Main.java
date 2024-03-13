package org.example;
import org.example.Models.Order;
import org.example.Models.Shoe;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static final String SHOE_TABLE = "Shoes";
    public static final String COLUMN_BRAND ="Brand";
    public static final String COLUMN_NAME_OF_THE_SHOE = "Name";
    public static final String COLUMN_COLOR = "Color";
    public static final String COLUMN_COLLABORATION = "Collab";
    public static final String COLUMN_PRICE = "Price";

    public static void main(String[] args) {

        Shoe shoe1 = new Shoe("Nike", "Air Jordan 1", "White, Blue and Black Swoosh", true, 1099.99, new String[]{"7", "8", "9"});
        Shoe shoe2 = new Shoe("Adidas", "BadBunny", "Black and white", true, 279.99, new String[]{"6", "7", "8"});

        String url = "jdbc:sqlite:studentdb.db";

        String createTableSQL = "CREATE TABLE IF NOT EXISTS "+SHOE_TABLE+" (id integer PRIMARY KEY NOT NULL," +
                "Brand text," +
                "Name text"+
                "Color text"+
                "Collab boolean," +
                "Price double)";

        String insertRecordSQL = "INSERT INTO" +SHOE_TABLE+ " (brand, Name_of_the_Shoe, color, Collab, price) values (Shoe.getBrand(), Shoe.getName_of_the_Shoe(), Shoe.getColor(), Shoe.isCollab(), Shoe.getPrice())";
        String selectData = "SELECT * FROM " + SHOE_TABLE;

        System.out.println(insertRecordSQL);


        try {
            Connection connection = DriverManager.getConnection(url);
            System.out.println("Connected");

            Statement statement = connection.createStatement();
            statement.execute(createTableSQL);

            Order order = new Order(List.of(shoe1, shoe2), List.of());

            connection.close();

        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}