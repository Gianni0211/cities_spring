<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<style type="text/css">
.form{
   display: flex;
   flex-direction: column;
   width: 200px;
   margin: auto;
   margin-top: 80px;
}
.result{
  margin: auto;
  margin-top: 30px;
  width: 200px;
}

.btn{
 background-color: green;
 color: white;
 margin-top: 10px;
 padding: 5px 8px 5px 8px;
 border-radius: 20px;
 cursor: pointer;
}

.res{
  margin: 20px auto 10px auto;
  color: blue;
  width: 200px;
  
}
</style>
<head>


<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>cities</title>

</head>
<body>

	<form class="form" action="cities_servlet">
	<label for="input">Inerisci una paese</label>
	<input id="input" name="paese" placeholder="es. Italia" type="text">
	
	<button type="submit" class="btn">Inserisci</button>
	</form>
	<p class="">${requestScope.res }</p>
	<div class="result">
	
	</div>
	
	
</body>
</html>