package cn.star.service.impl;
import cn.star.dao.UsersDao;
import cn.star.domain.Users;
import cn.star.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service("usersService")
public class UsersServiceImpl implements UsersService {
    @Autowired
    private UsersDao usersDao;

    @Override
    public List<Users> findUsers() {
        System.out.println("业务层：查询用户");
        return usersDao.findUsers();
    }

    @Override
    public void insertUsers(Users users) {
        System.out.println("业务层：用户注册");
        usersDao.insertUsers(users);
    }

    @Override
    public boolean login(Users users) {
        System.out.println("业务层：用户登录");
        if(usersDao.login(users) == null){
            return false;
        }else{
            return true;
        }

    }

    @Override
    public void update(Users users) {
        System.out.println("业务层：修改密码");
        usersDao.update(users);
    }

    @Override
    public void delete(int id) {
        System.out.println("业务层：删除用户");
        usersDao.delete(id);
    }
}