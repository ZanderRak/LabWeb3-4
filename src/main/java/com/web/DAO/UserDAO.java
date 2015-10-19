package com.web.DAO;

import com.web.domain.User;

import java.util.List;

/**
 * Created by Zander on 10/19/2015.
 */
public interface UserDAO {
    List<User> getAll();
}
