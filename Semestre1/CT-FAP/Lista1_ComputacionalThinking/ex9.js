/*
    informar capital inicial, taxa de juros (% ao mes convertido pra decimal) e tempo (em meses)
    m = c + (c * i * t)
*/

var capitalInicial = 800;
var taxaDeJuros = 0.20;
var tempo = 12;

var montante = capitalInicial + (capitalInicial * taxaDeJuros * tempo)
console.log("Capital inicial: " + capitalInicial + "% de taxa: " + taxaDeJuros + "Meses: " + tempo)
console.log("Montante: " + montante + "R$")
//feito em 5min sem uso de IA 