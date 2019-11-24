package k0.junit4.mockito;

import java.sql.SQLException;

public abstract class OrderDbUtil {

    abstract Integer createOrder(Order order) throws SQLException;

    abstract void setOrderStatusCancel(Integer orderId) throws SQLException;
}
