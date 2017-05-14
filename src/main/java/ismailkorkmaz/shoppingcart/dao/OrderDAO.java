package ismailkorkmaz.shoppingcart.dao;

import java.util.List;

import ismailkorkmaz.shoppingcart.model.CartInfo;
import ismailkorkmaz.shoppingcart.model.OrderDetailInfo;
import ismailkorkmaz.shoppingcart.model.OrderInfo;
import ismailkorkmaz.shoppingcart.model.PaginationResult;
 
public interface OrderDAO {
 
    public void saveOrder(CartInfo cartInfo);
 
    public PaginationResult<OrderInfo> listOrderInfo(int page,
            int maxResult, int maxNavigationPage);
    
    public OrderInfo getOrderInfo(String orderId);
    
    public List<OrderDetailInfo> listOrderDetailInfos(String orderId);
 
}