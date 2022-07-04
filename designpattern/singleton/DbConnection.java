package singleton;
import java.util.*;

public class DbConnection {
    public String username;
    public static ArrayList<DbConnection> sessionPool = new ArrayList<>();

    DbConnection(String username){
        this.username = username;
    }

    public static DbConnection getSession(String username){
        if (sessionPool.size() != 0){
            for (DbConnection session : sessionPool){
                if (session.username == username){
                    return session;
                }
            }
        }
        DbConnection session = new DbConnection(username);
        sessionPool.add(session);
        return session; 
    }

}
