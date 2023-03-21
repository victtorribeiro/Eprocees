var biblioteca = biblioteca || {};

biblioteca.data_datepicker = (function (){
    function iniciarCamposData() {

        $('.datepicker').datepicker({
            format: 'dd/mm/yyyy',
            clearBtn: true,
            todayBtn: true,
            language: 'pt-BR',
            todayHighlight: true,
            autoclose: true
        });
        
    }

    return {
        iniciarCamposData: iniciarCamposData
    }
})();

// Inicia os campos assim que a pagina carrega
$(document).ready( function() {
    biblioteca.data_datepicker.iniciarCamposData();
});