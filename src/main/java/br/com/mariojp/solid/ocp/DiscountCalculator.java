        package br.com.mariojp.solid.ocp;
        import java.util.Map;
        public class DiscountCalculator {
            private final Map<CustomerType, DiscountPolicy> policies;
            // Construtor padrão para compatibilidade com a classe de teste
           
            public DiscountCalculator() {
                this.policies = Map.of(
                    CustomerType.REGULAR, new RegularPolicy(),
                    CustomerType.PREMIUM, new PremiumPolicy(),
                    CustomerType.PARTNER, new PartnerPolicy()
                    
                );
            }
        
            public double apply(double amount, CustomerType type) {
                DiscountPolicy policy = policies.get(type);
                if (policy == null) {
                    return amount; // Sem desconto se não houver política
                }
                return policy.apply(amount);
            }
        }