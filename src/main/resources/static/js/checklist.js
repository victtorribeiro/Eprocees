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