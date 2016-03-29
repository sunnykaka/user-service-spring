package com.akkafun.user.service;

import com.akkafun.user.api.dtos.RegisterDto;
import com.akkafun.user.dao.UserRepository;
import com.akkafun.user.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * Created by liubin on 2016/3/29.
 */
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Transactional
    public void save(User user) {
        userRepository.save(user);
    }

    @Transactional(readOnly = true)
    public Optional<User> getById(Long userId) {
        return Optional.ofNullable(userRepository.findOne(userId));
    }

    @Transactional
    public User register(RegisterDto registerDto) {

        return null;
    }


    /**
     * 判断用户名是否存在
     * @param username
     * @param userId 当前用户ID,如果是修改用户的话,需要传,否则可以传empty
     * @return
     */
    @Transactional(readOnly = true)
    public boolean isUsernameExist(String username, Optional<Integer> userId) {

//        String hql = "select u.id from User u where u.userName = :username";
//        Map<String, Object> params = new HashMap<>();
//        params.put("username", username);
//        if(userId.isPresent()) {
//            hql += " and u.userId != :userId ";
//            params.put("userId", userId);
//        }
//        List<Integer> results = generalDao.query(hql, Optional.empty(), params);
//        return !results.isEmpty();

        return false;
    }


}
