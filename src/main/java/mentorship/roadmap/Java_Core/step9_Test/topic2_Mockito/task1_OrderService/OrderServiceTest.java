package mentorship.roadmap.Java_Core.step9_Test.topic2_Mockito.task1_OrderService;

import mentorship.roadmap.Java_Core.step9_Test.topic2_Mockito.task1_OrderService.forTest.InventoryService;
import mentorship.roadmap.Java_Core.step9_Test.topic2_Mockito.task1_OrderService.forTest.Order;
import mentorship.roadmap.Java_Core.step9_Test.topic2_Mockito.task1_OrderService.forTest.OrderRepository;
import mentorship.roadmap.Java_Core.step9_Test.topic2_Mockito.task1_OrderService.forTest.OrderService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

class OrderServiceTest {

    @Mock
    private InventoryService inventoryService;

    @Mock
    private OrderRepository orderRepository;

    @InjectMocks
    private OrderService orderService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        /*//создаем моки для зависимостей
        inventoryService = mock(InventoryService.class);
        orderRepository = mock(OrderRepository.class);
        //экземпляр OrderService с моками
        orderService = new OrderService(inventoryService, orderRepository);
         */
    }

    @Test
    void processOrderSuccess() {
        Order order = new Order("product1", 3, 10.1);

        //определяем поведение мока чтобы возвращал true при проверке наличия товара
        when(inventoryService.isProductAvailable(order.getProductId(), order.getQuantity())).thenReturn(true);

        boolean result = orderService.processOrder(order);
        assertTrue(result);

        //проверяем что методы были вызваны
        verify(inventoryService).isProductAvailable(order.getProductId(), order.getQuantity());
        verify(orderRepository).saveOrder(order);
    }

    @Test
    void processOrderFailure() {
        Order order = new Order("product2", 2, 12.0);

        //определяем поведение мока чтобы возвращал false при проверке наличия товара
        when(inventoryService.isProductAvailable(order.getProductId(), order.getQuantity())).thenReturn(false);

        boolean result = orderService.processOrder(order);
        assertFalse(result);

        verify(inventoryService).isProductAvailable(order.getProductId(), order.getQuantity());

        //проверяем что метод не был вызван так как товара нет в наличии
        verify(orderRepository, never()).saveOrder(order);
    }
}
