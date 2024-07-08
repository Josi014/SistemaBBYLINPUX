<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Sistema_BBYLinpux</title>
<link rel="stylesheet" href="style.css">
<link rel="icon" class="image" href="images/logo.png">
</head>

<body>
	<div class="format">
		<img src="images/logo.png">
		<form name="frmLogin" action="insert">
			<div class="container">
				<h1>Sistema BBYLinpux</h1>
				<table>
					<tr>
						<input type="text" class="login" name="nameUser"
							placeholder="seuemail@dominio.com">
					</tr>
					<tr>
						<input type="text" class="login" name="pass"
							placeholder="sua*senha" value="">
					</tr>
				</table>
				<center>
					<input type="button" class="submitLogin" name="submitLogin"
						onclick="validateLogin()" value="Entrar">
					<p>Não possui conta? Cadastre-se abaixo</p>
					<input type="button" href="newAccount.js" class="submitLogin"
						name="submitRegister" href="register.jsp" value="Cadastrar">
				</center>
			</div>
		</form>
	</div>


</body>
<script src="scripts/validate.js"></script>

</html>
