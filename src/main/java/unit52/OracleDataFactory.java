package unit52;

public class OracleDataFactory implements DataFactory {
    public Connection ChooseConnection() {
        return new OracleConnection();
    }
    public Staternent ChooseStaternent() {
        return new OracleStaternent();
    }
}
