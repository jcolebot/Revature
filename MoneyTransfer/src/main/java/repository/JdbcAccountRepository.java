package repository;


import account.Account;
import database.DatabaseConnection;
import org.apache.log4j.Logger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;


public class JdbcAccountRepository implements AccountRepository {

    private static final Logger logger = Logger.getLogger("mts");

    @Override
    public Optional<Account> loadAccount(String accountNumber) {
        logger.info("Loading account... " + accountNumber);
        Connection connection = null;
        Account account = null;

        try {
            connection = DatabaseConnection.getConnection();
            String sql = "SELECT * FROM ACCOUNTS WHERE NUMBER =?";
            PreparedStatement prepStatement = connection.prepareStatement(sql);
            prepStatement.setString(1, accountNumber);
            ResultSet resultSet = prepStatement.executeQuery();

            if (resultSet.next()) {
                account = new Account();
                account.setNumber(resultSet.getString("number"));
                account.setBalance(resultSet.getDouble("balance"));
            }
        } catch (SQLException e) {
            logger.warn(e.getMessage());
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        if (account == null) {
            return Optional.empty();
        } else {
            return Optional.of(account);
        }
    }
    @Override
    public void updateAccount(Account account) {
        logger.info("Updating account... " + account.getNumber());
        Connection connection = null;
        try {
            connection = DatabaseConnection.getConnection();
            String sql = "UPDATE accounts SET balance =? WHERE NUMBER =?";
            PreparedStatement prepStatement = connection.prepareStatement(sql);
            prepStatement.setDouble(1, account.getBalance());
            prepStatement.setString(2, account.getNumber());
            prepStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
