package com.test.SpringSwagger;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiModelProperty;

@RestController
@RequestMapping("/rest/user")
public class UserResource {
	
	public List<User> getUsers(){
		List<User> lists=new ArrayList<User>();
		lists.add(new User("sam",2000L));
		lists.add(new User("Peter",1000L));
		return lists;
	}

	@GetMapping("/{userName}")
	public User getUser(@PathVariable("userName") final String userName) {
		return new User(userName,1000L);
	}
	
	private class User {
		
		@ApiModelProperty(notes ="name of the User")
		private String userName;
		@ApiModelProperty(notes ="salary of the User")
		private Long salary;
		
		public User(String userName,Long salary) {
			this.userName = userName;
			this.salary = salary;
		}

		public String getUserName() {
			return userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public Long getSalary() {
			return salary;
		}

		public void setSalary(Long salary) {
			this.salary = salary;
		}
		
		
	}

}
