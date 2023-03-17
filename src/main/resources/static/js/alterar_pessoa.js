function mostrarPessoaFisicaOuJuridica(pessoa){
    if(pessoa=='fisica'){
        document.getElementById('pessoaFisica').style.display='block';
        document.getElementById('tabelaPessoaFisica').style.display='block';
        document.getElementById('pessoaJuridica').style.display='none';
        document.getElementById('tabelaPessoaJuridica').style.display='none';
    }
    if(pessoa=='juridica'){
        document.getElementById('pessoaFisica').style.display='none';
        document.getElementById('tabelaPessoaFisica').style.display='none';
        document.getElementById('pessoaJuridica').style.display='block';
        document.getElementById('tabelaPessoaJuridica').style.display='block'
    }
}