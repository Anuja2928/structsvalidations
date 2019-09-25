package com.bv.model;

import java.io.File;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.bv.service.LoginService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;

public class Registration extends ActionSupport {

	private String username;
	 private String password;
	 private String gender;
	 private String hobbies[];
	 private int age;
	 private String doubleSelectRole;
	 private String doubleSelectExpertise;
	 private String skills[];
	 private String bio;
	 private Date dob;
	 private String email;
	 private String mobile;
	 private String cfmPassword;

	
	 private File userImage;  
	    private String userImageContentType;  
	    private String userImageFileName;  
	    private double percentage;
	 
	
	
	
	public File getUserImage() {
			return userImage;
		}
		public void setUserImage(File userImage) {
			this.userImage = userImage;
		}
		public String getUserImageContentType() {
			return userImageContentType;
		}
		public void setUserImageContentType(String userImageContentType) {
			this.userImageContentType = userImageContentType;
		}
		public String getUserImageFileName() {
			return userImageFileName;
		}
		public void setUserImageFileName(String userImageFileName) {
			this.userImageFileName = userImageFileName;
		}
	
	 
	 
	 
	
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	public String getCfmPassword() {
		return cfmPassword;
	}
	public void setCfmPassword(String cfmPassword) {
		this.cfmPassword = cfmPassword;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	@RequiredStringValidator(message="select gender")
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String[] getHobbies() {
		return hobbies;
	}
	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDoubleSelectRole() {
		return doubleSelectRole;
	}
	public void setDoubleSelectRole(String doubleSelectRole) {
		this.doubleSelectRole = doubleSelectRole;
	}
	public String getDoubleSelectExpertise() {
		return doubleSelectExpertise;
	}
	public void setDoubleSelectExpertise(String doubleSelectExpertise) {
		this.doubleSelectExpertise = doubleSelectExpertise;
	}
	public String[] getSkills() {
		return skills;
	}
	public void setSkills(String[] skills) {
		this.skills = skills;
	}
	public String getBio() {
		return bio;
	}
	public void setBio(String bio) {
		this.bio = bio;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	 
	
	/*public String execute() throws Exception
	{
		1st method
		if(username.equals("anuja") && password.equals("omi"))
		
		return SUCCESS;
		else
			return ERROR;
		
	}*/
/*	   public void validate() {
	        if (getUsername().length() == 0) {
	        	 addFieldError("username", "username.required");
	        } else if (!getUsername().equals("Anuja")) {
	            addFieldError("username", "Invalid User");
	            
	        }
	        if (getPassword().length() == 0) {
	            addFieldError("password", getText("password.required"));
	        }
	    }*/
	
  
	   @Override
	   public void validate() {
		/*// TODO Auto-generated method stub
		   if(username.equals("anuja") && password.equals("123"))
		   {
			   addActionMessage("valid user");
		   }
		   else
		   {
			   addActionError("invalid user");
		   }*/
		  /*if(username == null || username.equals(""))
		   {
			   addFieldError("username", "username.required");
		   }
		   if(age < 18 || age > 65 )
		   {
			   addFieldError("age", "age between 28 and 65");
		   }*/
		  if(LoginService.validateUser(username,password))
		   {
			   addActionMessage("valid user");
		   }
		   else
		   {
			   addActionError("invalid user");
		   }
		   
		  /* boolean valid = true;
           if (password.length() > 15 || password.length() < 8)
           {
        	   addFieldError("password","Password should be less than 15 and more than 8 characters in length.");
                   valid = false;
           }
           if (password.indexOf(username) > -1)
           {
        	   addFieldError("password","Password Should not be same as user name");
                   valid = false;
           }
           String upperCaseChars = "(.*[A-Z].*)";
           if (!password.matches(upperCaseChars ))
           {
        	   addFieldError("password","Password should contain atleast one upper case alphabet");
                   valid = false;
           }
           String lowerCaseChars = "(.*[a-z].*)";
           if (!password.matches(lowerCaseChars ))
           {
        	   addFieldError("password","Password should contain atleast one lower case alphabet");
                   valid = false;
           }
           String numbers = "(.*[0-9].*)";
           if (!password.matches(numbers ))
           {
        	   addFieldError("password","Password should contain atleast one number.");
                   valid = false;
           }
           String specialChars = "(.*[,~,!,@,#,$,%,^,&,*,(,),-,_,=,+,[,{,],},|,;,:,<,>,/,?].*$)";
           if (!password.matches(specialChars ))
           {
        	   addFieldError("password","Password should contain atleast one special character");
                   valid = false;
           }
           if (valid)
           {
        	   addActionMessage("password is valid.");
           }*/
		  /*if(gender.length() < 0 )
		   {
			   addFieldError("gender","kindly select gender");
		   }*/
		   
	}
	   /*2nd method*/
	   /*public String execute()  {
		   
		   String filePath = ServletActionContext.getServletContext().getRealPath("/").concat("userimages"); 
		   try {  
			   
			                 
			           System.out.println("Image Location:" + filePath);//see the server console for actual location  
			           File fileToCreate = new File(filePath,userImageFileName);  
			           FileUtils.copyFile(userImage, fileToCreate);//copying source file to new file  
			             
		   }
		   System.out.println("processing");
		   try
		   {
			   destPath="C:\\apache-tomcat-9.0.21\\work";
		  
		   File destFile = new File(destPath,fileName);
		   FileUtils.copyFile(myfile, destFile);
		   }
		   
		   catch(Exception e)
		   {
			  e.printStackTrace();
			   return ERROR;
		   }
		   
		 
		   return SUCCESS;
		   
}*/
	   
	   
		public String execute() {

			String filePath = ServletActionContext.getServletContext().getRealPath("/").concat("userimages");
			try {
				System.out.println("Image Location:" + filePath);// see the server console for actual location
				File fileToCreate = new File(filePath, userImageFileName);
				FileUtils.copyFile(userImage, fileToCreate);// copying source file to new file

				
			} catch (Exception e) {
				e.printStackTrace();
				return ERROR;
			}
			return SUCCESS;
			
		}



	   }