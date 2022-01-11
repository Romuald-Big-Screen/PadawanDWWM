package PadawanDWWM.PadawanDWWM.repository;


import PadawanDWWM.PadawanDWWM.model.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AccountRepository extends CrudRepository<Account, Long> {

}