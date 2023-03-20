var biblioteca = biblioteca || {};

biblioteca.mascara = (function (){
    function configurarMascaraCpfCnpj(id, nomeMascara) {
        
        id = '#' + id;
        $(id).keypress(function(){
            console.log('teste');
            if(nomeMascara == 'cpf'){
                $(this).mask('000.000.000-00');
            }
            else if(nomeMascara == 'cnpj'){
                $(this).mask('000.000.000/0000-00');
            }
            else if(nomeMascara == 'cpf_cnpj'){
                var tamanho = $(this).val().replace(/\.|-|\//ig, "").length;
    
                if(tamanho < 11)
                    $(this).mask('000.000.000-00');
                else
                    $(this).mask('000.000.000/0000-00');
            }
        });
    }

    return {
        configurarMascaraCpfCnpj: configurarMascaraCpfCnpj
    }
})();