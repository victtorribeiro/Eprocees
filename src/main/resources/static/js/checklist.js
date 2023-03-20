function selecionaTodos(){  
    var ele=document.getElementsByName('check');  
    for(var i=0; i<ele.length; i++){  
        if(ele[i].type=='checkbox')  
        ele[i].checked=true;  
    }  
}  

function limpaSelecao(){
    var ele=document.getElementsByName('check');  
    for(var i=0; i<ele.length; i++){  
        if(ele[i].type=='checkbox')  
        ele[i].checked=false;  
    }  
}

function selecionaLinhaTabela(param){
    var cols = $("#tabela tbody tr:nth-child("+param+") td");
    console.log(cols);
    var obj = {};
    for(var i=0; i < cols.length; i++){
        obj["col"+i] = cols[i].innerText;
    }
}

