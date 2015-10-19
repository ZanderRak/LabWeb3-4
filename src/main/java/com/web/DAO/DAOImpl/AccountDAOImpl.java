package com.web.DAO.DAOImpl;

import com.web.DAO.AccountDAO;
import com.web.domain.Account;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class AccountDAOImpl implements AccountDAO {

    @Autowired
    public SessionFactory sessionFactory;


        @Transactional
        public List<Account> getAll(){
            @SuppressWarnings("unchecked")
            List<Account> listUser = (List<Account>) sessionFactory.getCurrentSession()
                    .createCriteria(Account.class)
                    .setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
            return listUser;
        }
}
