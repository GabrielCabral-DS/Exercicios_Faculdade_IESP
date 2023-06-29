var i, altura, sexo, maioraltura = 0, menoraltura = 0, homem = 0,mulher = 0, mediaM = 0, quantidadeM = 0, quantidadeH = 0;
for(i = 1 ;i <= 5; i++) {
    altura = parseInt(prompt("Informe sua altura["+i+"]:"));
    sexo = prompt("sexo: M ou F:")
    if(i == 1){
        menoraltura = altura;
    } if(altura > maioralt){
        maioraltura = altura;
    } if(altura < menoralt){
        menoraltura = altura;
    } if(sexo == 'F'){
        mulher += altura;
        quantidadeM++;
    } else if(sexo == 'M'){
        homem += altura;
        quantidadeH++;
    }
}
mediaM = M/quantidadeM;
alert("A maior altura é: "+ maioraltura);
alert("A menor altura é;"+ menoraltura);
alert("A media das mulheres é:" + quantidadeM);
alert("O numero de homens é: "+ quantidadeH);