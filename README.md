# exemplo1-Interface-ComInterface

Uma locadora brasileira de carros cobra um valor por hora para locações de até 12 horas. Porém, se a duração da locação ultrapassar 12 horas, a locação será cobrada com base em um valor diário. Além do valor da locação, é acrescido no preço o valor do imposto conforme regras do país que, no caso do Brasil, é 20% para valores até 100.00, ou 15% para valores acima de 100.00. Fazer um programa que lê os dados da locação (modelo do carro, instante inicial e final da locação), bem como o valor por hora e o valor diário de locação. O programa deve então gerar a nota de pagamento (contendo valor da locação, valor do imposto e valor total do pagamento) e informar os dados na tela. Veja os exemplos nos próximos slides.

Exemplo 2

Entre com os dados do aluguel

Modelo do carro: Civic

Retirada (dd/MM/yyyy hh:mm): 25/04/2023 10:30

Retorno (dd/MM/yyyy hh:mm): 27/04/2023 11:40

Entre com o preço por hora: 10.00

Entre com o preço por dia: 130.00


FATURA:

Pagamento básico: 390.00

Imposto: 58.50

Pagamento total: 448.50

---------------
Cálculos:

Duração = (27/06/2023 11:40) - (25/06/2023 10:30) = 2 dias + 1:10 = 3 dias

Pagamento básico = 3 * 130 = 390

Imposto = 390 * 15% = 390 * 0.15 = 58.50


