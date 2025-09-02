
import java.util.Map;

import br.com.mariojp.solid.ocp.CustomerType;
import br.com.mariojp.solid.ocp.DiscountCalculator;
import br.com.mariojp.solid.ocp.DiscountPolicy;
import br.com.mariojp.solid.ocp.PartnerPolicy;
import br.com.mariojp.solid.ocp.PremiumPolicy;
import br.com.mariojp.solid.ocp.RegularPolicy;
public class Main {
    public static void main(String[] args) {
        Map<CustomerType, DiscountPolicy> policies = Map.of(
            CustomerType.REGULAR, new RegularPolicy(),
            CustomerType.PREMIUM, new PremiumPolicy(),
            CustomerType.PARTNER, new PartnerPolicy()
        );
        DiscountCalculator calculator = new DiscountCalculator();
        double amount = 100;
        System.out.println(calculator.apply(amount, CustomerType.PARTNER)); // Deve imprimir 88.0
    }
}