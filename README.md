theater-tickets-dojo-viniciusmayer
==================================
minha implementação para https://github.com/umovme/theater-tickets-dojo


anotações gerais (para acompanhamento do processo)
--------------------------------------------------
algumas observações iniciais:
* não há especificação para valor das entradas para o caso de não ser criança, estudante ou idoso.
* parece ser possível existir estudante e estudante com carteirinha...
* vou criar uma planilha com as combinações (cenários) possíveis a partir da minha interpretação da especificação.
	* disponível em <a href="http://goo.gl/i4NVAh">theater-tickets-dojo-viniciusmayer</a>

algumas observações "finais" (após implementação):
* não implementei nenhum tratamento para o caso de não ser criança, estudante ou idoso. seria necessário realizar validação deste item.
* a especificação deixa em aberto a questão do estudante com/sem carteirinha. optei por: estudante só é estudante mediante apresentação da
carteirinha. seria necessário realizar validação deste item.

observação "atrasada":
* não implementei nenhum tratamento para feriado.
