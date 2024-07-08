function validar() {
	let namePro = frmbudget.nameProduct.value
	let productId = frmbudget.productId.value
	let amount = frmbudget.amount.value

	if (namePro === "") {
		alert("Preencha o campo: nome do Produto")
		frmbudget.nameProduct.focus()
		return false
	} else if (productId === "") {
		alert("Preencha o campo: Id")
		frmbudget.productId.focus()
		return false
	} else if (amount === "") {
		alert("Preenha o campo: Quantidade")
	}
	else {
		document.forms["frmbudget"].submit()
	}


}
