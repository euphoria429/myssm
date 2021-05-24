package cn.star.dao;
import cn.star.domain.Users;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface UsersDao {
    //查询所有用户
    @Select("select * from users")
    public List<Users> findUsers();

    //用户注册
    @Insert("INSERT INTO USERS (username,PASSWORD) VALUES(#{username},#{PASSWORD})")
    public void insertUsers(Users users);

    //用户登录
    @Select("select * from users where username=#{username} and PASSWORD=#{PASSWORD}")
    public Users login(Users users);

    //修改密码
    @Update("update users set PASSWORD=#{PASSWORD} where username=#{username}")
    public void update(Users users);

    //删除用户
    @Delete("delete from users where id=#{id}")
    public void delete(int id);
}