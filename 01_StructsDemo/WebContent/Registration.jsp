<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@taglib uri="/struts-tags" prefix="s" %>
    <%@ taglib prefix="sx" uri="/struts-dojo-tags" %>
<!DOCTYPE html>
<html>
<head>
<sx:head/>
<meta charset="ISO-8859-1">
<title>register</title>
</head>
<body>
<s:actionerror/>
<s:form action="login" method="post" enctype="multipart/form-data">
<s:textfield name="username" label="Username" require="true"></s:textfield>
<s:password name="password" label="Password"></s:password>
<s:password name="cfmPassword" label="cfmPassword"></s:password>
<s:textfield name="mobile" label="Mobile"/>
<s:radio list="{'Male','Female'}" name="gender" label="Gender"></s:radio>
<s:checkboxlist list="{'swmming','reading','sleeping'}" name="hobbies" label="Hobbies"></s:checkboxlist>
<s:textfield name="age" key="age" size="20" />
<s:textfield name="email" label="email"/>
 <sx:datetimepicker name="dob" label="Date(dd-MMM-yyyy)" 
displayFormat="dd-MMM-yyyy" /> 


<s:doubleselect list="{'Developer','Manager','Tester'}" name="doubleSelectRole" 
	doubleList="top == 'Developer' ? {'Java','PHP'} : (top == 'Manager' ? {'HR Manager', 'Finance Manager'} : {'UI Testing', 'Functional Testing'})" 
	doubleName="doubleSelectExpertise" label="Occupation"></s:doubleselect>
	

<s:select list="{'Java','PHP','Python'}" name="skills" multiple="true" label="Skills"></s:select>
<s:textfield name="percentage" label="percentage"/>
	
<s:textarea name="bio" label="About Yourself" cols="20" rows="3" wrap="true"></s:textarea>
<s:file name="userImage" label="upload file"></s:file>
<s:submit value="Register"></s:submit>
<s:submit value="clear" >
</s:submit>

<s:submit value="Login"></s:submit>

</s:form>
</body>
</html>