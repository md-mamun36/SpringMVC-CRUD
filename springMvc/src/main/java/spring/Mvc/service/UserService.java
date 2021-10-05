package spring.Mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.Mvc.dao.UserDao;
import spring.Mvc.model.User;

@Service
public class UserService {
	
	@Autowired
	private UserDao dao;
	
	
	public void createUser(User user) {
		this.dao.saveuser(user);
		

	}
	
	public List<User>getAlluser(){
		
		List<User> all = this.dao.alldata();
		return all;
	}
	
	public User getuser(int id) {
		
		User getuser = this.dao.getuser(id);
		return getuser;
	}
	
	public void delete(int id) {
		
		this.dao.delete(id);
	}
}
