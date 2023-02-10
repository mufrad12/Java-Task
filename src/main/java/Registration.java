import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import org.json.simple.JSONObject;
public class Registration {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        JSONObject userInfo = new JSONObject();

        System.out.print("Enter Full Name: ");
        userInfo.put("Full Name", input.nextLine());

        System.out.print("Enter Email: ");
        userInfo.put("Email", input.nextLine());

        System.out.print("Enter Password: ");
        userInfo.put("Password", input.nextLine());

        System.out.print("Enter Address: ");
        userInfo.put("Address", input.nextLine());

        System.out.print("Enter Mobile No: ");
        userInfo.put("Mobile No", input.nextLine());
        System.out.println(userInfo);
        System.out.println("User info saved to json file");

        FileWriter file = new FileWriter("./src/main/resources/UserRegistration.json");
        file.write(userInfo.toJSONString());
        file.flush();
        file.close();
    }
}
