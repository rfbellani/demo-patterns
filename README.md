Demo de Patterns de Desenvolvimento
Ref. Curso Alura de Design Patterns I 
     Curso Alura de Design Patterns II

1. Padrao Strategy
    - Criada Interface para definir a assinatura do metodo de calculo
    - Classes de impostos ICMS e ISS implementam interface e regra do calculo 
    - Imposto eh passado para realizar o calculo através da Interface Imposto
    - O Metodo que executa o calculo dos impostos recebe a interface e somente chama o metodo calcula da Interface Imposto
    
2 - Chain of Responsibility
    - Criada uma classe para cada tipo de desconto
    - Criada Interface Desconto e as classes de desconto implementam esta interface
    - Todo tipo de desconto receberá o próximo desconto, formando assim a sequencia de execucao
    - Deve haver uma classe final que encerra a sequencia  de processamento (SemDesconto)
    
3 - Template Method
    - Dois novos Impostos ICVV e IKCV que tem um mesmo comportamento (Aplicar taxa maxima ou minima)
    - Criar uma classe de template de imposto condicional (TemplateDeImpostoCondicional)
    - Template de Imposto Condicional implementa Imposto
    - no metodo calcula tem a regra de aplicacao do maximo ou minimo imposto
    - Como eh um template, os metodos de definicao do imposto sao abstratos e a classe deve ser
    - As classes de novos impostos deixam de implementar a interface Imposto e passam a extender TemplateDeImpostoCondicional
    - Agora devem implementar os metodos abstratos
    
4 - Decorator
    - Padrao de Projeto que visa juntar os comportamentos de varias classes
    - Ex. composicao de calculo de Imposto ICMS com ISS

5 - Padrao Builder
    - A ideia é esconder a complexidade da criacao de objetos complexos
    - Exemplo a classe NotaFiscalBuilder
    - Os metodos que populam as variaveis da Nota devem retornar o proprio Builder para implementar interfaces fluentes com Method Chaine 
    
6 - Padrao Command
   - Encapsula comandos que serao executados posteriormente
   - Tem uma interface Comando com metodo executa
   - A classe recebe o objeto pelo construtor e executa o comando 
   - Utilizado para casos de filas de trabalho onde as acoes sao executadas em momentos diferentes
   


