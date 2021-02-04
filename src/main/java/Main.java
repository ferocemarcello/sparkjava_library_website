import static spark.Spark.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Cacca");
        //port(8080);//change port
        get("/hello", (req, res) -> "Hello World");
    }
}