package gitpractice.advanced;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    CustomerRepo repo;

    public void save(Customer customer) {
        repo.save(customer);
    }
    public Customer findById(int cid) {
       return repo.findById(cid).get();
    }
}
