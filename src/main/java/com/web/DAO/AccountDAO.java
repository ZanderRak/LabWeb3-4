package com.web.DAO;

import com.web.domain.Account;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountDAO {
    List<Account> getAll();
}
