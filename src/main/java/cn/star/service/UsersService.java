package cn.star.service;
import cn.star.domain.Users;
import java.util.List;

public interface UsersService {
    //查询所有用户
    public List<Users> findUsers();
    //用户注册
    public void insertUsers(Users users);
    //用户登录
    public boolean login(Users users);
    //修改密码
    public void update(Users users);
    //删除用户
    public void delete(int id);
}