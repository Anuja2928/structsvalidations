<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
     <%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>success</title>
</head>
<body>
<s:if test="hasActionMessages()">
<s:actionmessage/>
</s:if>
Hello:<s:property value="username"></s:property><br/>
Gender:<s:property value="gender" ></s:property><br/>
Hobbies:<s:property value="hobbies"></s:property><br/>
Age:<s:property value="age"></s:property><br/>
Email:<s:property value="email"></s:property><br/>
MobileNo:<s:property value="mobile"></s:property><br/>
Date Of Birth:<s:property value="dob"></s:property><br/>
Role:<s:property value="doubleSelectRole"></s:property><br/>
Expertise: <s:property value="doubleSelectExpertise"></s:property><br/>
Skills:<s:property value="skills"></s:property><br/>
About Yourself: <s:property value="bio"></s:property><br/>
<p> file uploaded succesfully</p>
User Image: <s:property value="userImage" /><br/>  
        Content Type:<s:property value="userImageContentType" /><br/>  
        File Name:  <s:property value="userImageFileName" /><br/>  
        Uploaded Image: <img src="userimages/<s:property value="userImageFileName"/>"   
                                                     width="100" height="100" />

<a href="HelloForm.jsp">click here</a>
</body>
</html>