function validateLogin() {
	let nameUser = frmLogin.nameUser.value
	let pass = frmLogin.pass.value

	if (nameUser === "") {
		alert("Preencha o campo: usuário")
		frmLogin.nameUser.focus()
		return false
	}
	else if (pass === "") {
		alert("Preencha sua senha")
		frmLogin.pass.focus()
		return false
	}
	else {
		document.forms["frmLogin"].submit()
	}


}

function validateNewUser(){
	let uNN = frmNewAccount.uNN.value
	let cPass = frmNewAccount.value
	let confirmPass = frmNewAccount.confirmPass.value
	
	
	if (uNN === "") {
		alert("Digite um usuário")
		frmNewAccount.uNN.focus()
		return false
	}
	else if (cPass === "") {
		alert("Preencha sua senha")
		frmNewAccount.cPass.focus()
		return false
	}
	else if (confirmPass === "") {
		alert("Confirme sua senha")
		frmNewAccount.confirmPass.focus()
		return false
	}else if(confirmPass == cPass){
		alert("As senhas são diferentes")
		frmNewAccount.confirmPass.focus()
	}
	else {
		document.forms["frmNewAccount"].submit()
	}

	
}
