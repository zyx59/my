package unit52;

public class MysqlDataFactory implements DataFactory {
    public Connection ChooseConnection() {
        return new MysqlConnection();
    }
    public Staternent ChooseStaternent() {
        return new MysqlStaternent();
    }
}
