package zju.se.modelandrepository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SecurityStockRepository extends JpaRepository<SecurityStock, String> {
    public Optional<SecurityStock> findBySecurityId(String securityId);
}
