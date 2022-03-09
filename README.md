# design-pattern-factorymethod

## É um padrão que fornece uma interface para criar objetos de uma superclasse, mas permite que as subclasses alterem o tipo de objetos.

### Problema:
Crio aplicações com formularios para sistema operacional windows que estão na classe **WindowsForm**, logo, pela qualidade do produto, passo a receber solicitações de formularios para o Linux.
Pela diferença dos sistemas operacionais, preciso mexer em toda logica do formulario windows e deixar o codigo sujo de condicionais. 

### Solução:
Ao invés de uma chamada direta para **WindowsForm**, que, fabrica formulario. Vou ter uma classe criadora, chamada de **Form**, que, vai ter uma interface em comumn para criar um produto, chamado de **Button**, para, poder ser produzido pela classe criadora

Ou seja, para o codigo cliente( o codigo que chama minha classe criadora ), o **WindowsForm**  vai ser um **Form** e um **WindowsButton** será um **Button**, ou seja meu form vai se adaptar em cada um dos sistemas operacionais.
