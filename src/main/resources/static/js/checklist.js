function selecionaTodos(){
    $("input[name='check']").attr("checked", "checked")
}

function limpaSelecao(){
    $("input[name='check']").removeAttr('checked')
}