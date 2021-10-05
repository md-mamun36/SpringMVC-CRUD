package spring.Mvc.dao;



import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import spring.Mvc.model.User;

@Repository
public class UserDao {
private SessionFactory sef;
	@Autowired
private HibernateTemplate hibtemp;
	
	//insert data
	@Transactional
	public void saveuser(User user) {
		 this.hibtemp.saveOrUpdate(user);
		
		
	}
	
	//show all data
	public List<User> alldata(){
		List<User> getall = this.hibtemp.loadAll(User.class);
		return getall;
	}
	
	//show single data
	public User getuser(int id) {
		User usr = this.hibtemp.get(User.class, id);
		return usr;
	}
	
	//edit data
	@Transactional
	public void edit(User user) {
		this.hibtemp.update(user);
		
	}
	//to delete data
	@Transactional
	public void delete(int id) {
		
		User usr = this.hibtemp.load(User.class, id);
		this.hibtemp.delete(usr);
	}
}
