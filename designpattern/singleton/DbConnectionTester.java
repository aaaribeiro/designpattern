package singleton;

public class DbConnectionTester{
    public static void main(String[] args) {
        
        System.out.println("Opening a lot of sessions");
        DbConnection sessionOne = DbConnection.getSession("userOne");
        DbConnection sessionTwo = DbConnection.getSession("userOne");
        DbConnection sessionThree = DbConnection.getSession("userTwo");
        DbConnection sessionFour = DbConnection.getSession("userOne");
        DbConnection sessionFive = DbConnection.getSession("userOne");
        DbConnection sessionSix = DbConnection.getSession("userOne");
        DbConnection sessionSeven = DbConnection.getSession("userTwo");
        System.out.println("Only two sessions are expected");
        System.out.println(DbConnection.sessionPool.size());
    }
}