package jianzaozhe;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Director director = new Director(new FairyBuilder());
        Actor fairy = director.construct();
        System.out.println(fairy);

        director.setBuilder(new DemonBuilder());
        Actor demon = director.construct();
        System.out.println(demon);

       Class.forName("");
        Connection conn = DriverManager.getConnection("jdbc:odbc:wombat","login","password");
        PreparedStatement ps =conn.prepareStatement("");
    }
}
