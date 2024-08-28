package br.com.foods.pagamentos.repository;

import br.com.foods.pagamentos.model.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PagamentoRepository  extends JpaRepository<Pagamento,Long> {

}
