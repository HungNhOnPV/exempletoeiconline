package vn.myclass.api.test;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import vn.myclass.core.dao.UserDao;
import vn.myclass.core.daoimpl.UserDaoImpl;
import vn.myclass.core.persistence.entity.UserEntity;

public class LoginTest {
    private final Logger log = Logger.getLogger(this.getClass());
    @Test
    public void checkIsUserExist() {
        UserDao userDao = new UserDaoImpl();
        String name = "phamviethung";
        String password = "hung2711";
        UserEntity entity = userDao.isUserExist(name, password);
        if (entity != null) {
            log.error("login success");
        } else {
            log.error("login fail");
        }
    }

    public void checkFindRoleByUser() {
        UserDao userDao = new UserDaoImpl();
        String name = "phamviethung";
        String password = "hung2711";
        UserEntity entity = userDao.findRoleByUser(name, password);
        log.error(entity.getRoleEntity().getRoleID() +"-"+ entity.getRoleEntity().getName());
    }
}
