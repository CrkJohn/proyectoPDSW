package edu.eci.pdsw.persistence.mybatisimpl.mappers;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import edu.eci.pdsw.entities.User;

public interface UserMapper{
	public User getUserByCredentials(@Param("email") String email,  @Param("password") String password);
	
	public List<User> consultUsers();
	
	public User consultUserByMail(@Param("usermail")String usermail);
	
	public void modifyUser(@Param("email")String email, @Param("rol")int rol);
}
