## Commit 1 - Criação do componente base

A primeira etapa foi identificar que todas as partes do carro
possuem características em comum.

Foi criada uma abstração chamada ComponenteCarro contendo:
- nome;
- método calcularPeso().

Essa classe representa o componente do padrão Composite.

## Commit 2 - Criação das folhas

Foram criadas as peças simples do carro.

Esses objetos representam folhas da árvore Composite,
pois não possuem outros componentes internos.

## Commit 3 - Implementação do Composite

Foi criada uma classe capaz de armazenar outros componentes.

O método calcularPeso() percorre todos os elementos internos,
permitindo o cálculo recursivo do peso.

## Commit 4 - Construção da árvore do carro

Foram criados os agrupadores que representam a estrutura real
do carro.

Cada grupo pode conter outros componentes, mantendo o padrão Composite.