/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package testSparkMontag;
import spark.Spark;
public class App {
    public String getGreeting() {
        return "/welcome";
    }

    public static void main(String[] args) {
     Spark.get("/welcome", (req, res) -> {return "Hello DevOps;";});

                
    }
}
