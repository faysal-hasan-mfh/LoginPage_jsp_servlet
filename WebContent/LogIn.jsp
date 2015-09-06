<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta charset="utf-8">
<title>log in</title>
<link rel="stylesheet" type="text/css" href="css/style.css"/>
</head>
<body>

			<div class="account fix">
					<p><a href="">No Account !</a></p>
				</div>
				
				<br/>
				
				
			<div class="main fix">
				
				<div class="insideMain fix">
		
					<div class="leftPortion fix">
		
						<img src="image/car.jpg"/>
						<h3>~ Make Your Life Comfortable ~</h3>
						
					</div>
					
					<div class="midClass fix"> 
						<img src="image/line.png"/>
					</div>
					<br/>
					<br/>
					<div class="rightPortion fix">
						<h1>BenZ</h1>
						<form action="login" method="post">
							<table class="tabClass fix" border="0" cellspacing="5px">
								<tr>
									<td> Name : </td>
									<td> <input class="inputClass fix" type="text" name="userName"/> </td>
									
								</tr>
							
								<tr>
									<td> Password : </td>
									<td> <input class="inputClass fix" type="password" name="userPassword"/> </td>
									
								</tr>
								
								<tr>
									
									<td></td>
									<td>
									 	<input class="subClass fix" type="submit" value="LOG IN"/>
									
									 	 <p class="forClass fix"><a href="">forget password!</a></p>
									</td>
									
								</tr>
								
								<tr>
									<td class="errorClass fix" colspan="2"> </td>
								</tr>
								
							</table>
						</form>
					</div>
				</div>
				
				
				
			</div>

</body>
</html>