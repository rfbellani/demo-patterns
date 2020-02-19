Demo de Patterns de Desenvolvimento
Ref. Curso Alura de Design Patterns

1. Padrao Strategy
    - Criada Interface para definir a assinatura do metodo de calculo
    - Classes de impostos ICMS e ISS implementam interface e regra do calculo 
    - Imposto eh passado para realizar o calculo através da Interface Imposto
    - O Metodo que executa o calculo dos impostos recebe a interface e somente chama o metodo calcula da Interface Imposto

