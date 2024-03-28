import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculator {
    // Database connection
    static Connection conn = null;

    // Connect to SQLite database
    static {
        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection("jdbc:sqlite:calculations.db");
            Statement stmt = conn.createStatement();
            stmt.execute("CREATE TABLE IF NOT EXISTS calculations (id INTEGER PRIMARY KEY, operation TEXT, result REAL)");
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Perform calculation and save result to the database
    static void performCalculation(String operation, double result) {
        try {
            PreparedStatement pstmt = conn.prepareStatement("INSERT INTO calculations (operation, result) VALUES (?, ?)");
            pstmt.setString(1, operation);
            pstmt.setDouble(2, result);
            pstmt.executeUpdate();
            pstmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Get last 10 calculations from the database
    static List<String> getLast10Calculations() {
        List<String> calculations = new ArrayList<>();
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT operation, result FROM calculations ORDER BY id DESC LIMIT 10");
            while (rs.next()) {
                String operation = rs.getString("operation");
                double result = rs.getDouble("result");
                calculations.add(operation + ": " + result);
            }
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return calculations;
    }

    // Addition
    static double add(double a, double b) {
        double result = a + b;
        performCalculation("Addition", result);
        return result;
    }

    // Subtraction
    static double subtract(double a, double b) {
        double result = a - b;
        performCalculation("Subtraction", result);
        return result;
    }

    // Multiplication
    static double multiply(double a, double b) {
        double result = a * b;
        performCalculation("Multiplication", result);
        return result;
    }

    // Division
    static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero");
            return Double.NaN;
        }
        double result = a / b;
        performCalculation("Division", result);
        return result;
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter two numbers or type '10' to see last 10 calculations:");
            if (scanner.hasNextDouble()) {
                double num1 = scanner.nextDouble();
                double num2 = scanner.nextDouble();
                System.out.println("Choose operation (+, -, *, /):");
                String operation = scanner.next();
                double result = 0;
                switch (operation) {
                    case "+":
                        result = add(num1, num2);
                        break;
                    case "-":
                        result = subtract(num1, num2);
                        break;
                    case "*":
                        result = multiply(num1, num2);
                        break;
                    case "/":
                        result = divide(num1, num2);
                        break;
                    default:
                        System.out.println("Invalid operation");
                }
                System.out.println("Result: " + result);
            } else if (scanner.hasNext("10")) {
                List<String> calculations = getLast10Calculations();
                System.out.println("Last 10 calculations:");
                for (String calculation : calculations) {
                    System.out.println(calculation);
                }
            } else {
                System.out.println("Invalid input");
                break;
            }
        }

        scanner.close();
    }
}

