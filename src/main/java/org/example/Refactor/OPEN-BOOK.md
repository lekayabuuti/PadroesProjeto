| Linha Inicial   | Linha Final     | Nome do Code Smell  | Justificativa                                                         |
|-----------------|-----------------|---------------------|-----------------------------------------------------------------------|
| 27              |                 | Primitive Obsession | O tipo de custumer pode ser um ENUM                                   |
| 31              | 34              | Comments            | Comentários inúteis quando existe o ENUM                              |
| 5, 20, 104, 121 | 8, 24, 107, 124 | Primitive Obsession | Substituindo os atributos de Customer pelo próprio Customer           |
|36| | Temporary Field | Inicializaçao de valor inutil em total                                |
|36|56 | Long Method | o processOrder faz muita coisa, retirei o calculo de total dali       |
|40|46| Switch Statements | O if foi simplificado em sua complexidade por um switch-case          |
|36|56 | Long Method | o método de calcular tamanho foi simplificado com base no enum criado |

# Code smells

### Bloaters

- Long Method
- Large Class
- Primitive Obsession (Uso de primitivos em vez de pequenos objetos para tarefas simples.)
- Long Parameter List
- Data Clumps (Ocorrência em diferentes partes do código de grupos idênticos de variáveis.)

### Object-Orientation Abusers

- Alternative Classes with Different Interfaces (Duas classes que desempenham funções idênticas, mas têm nomes de métodos diferentes.)
- Refused Bequest (Uma subclasse que usa apenas alguns dos métodos e propriedades herdados dos seus pais.)
- Switch Statements (Existência recorrente de operadores switch complexos ou uma sequência de instruções if idênticos.)
- Temporary Field (Campos temporários que recebem valores apenas em determinadas circunstâncias.)

### Change Preventers

- Divergent Change (Necessidade de se alterar muitos métodos não relacionados ao fazer alterações em uma classe.)
- Parallel Inheritance Hierarchies (Sempre que se cria uma subclasse para uma classe, é necessário criar uma subclasse para outra classe.)
- Shotgun Surgery (Design no qual qualquer modificação exige várias pequenas alterações em diferentes classes.)

### Dispensables

- Comments
- Duplicate Code
- Data Class
- Dead Code (Uma variável, parâmetro, campo, método ou classe não é mais usado e, por isso, pode ser removido.)
- Lazy Class (Uma classe não faz o suficiente para justificar a sua existência, devendo ser excluída.)
- Speculative Generality (Há uma classe, método, campo ou parâmetro não utilizado, pois houve uma tentativa de antecipar o design.)

### Couplers

- Feature Envy (Um método acessa os dados de outro objeto mais do que os seus próprios dados.)
- Inappropriate Intimacy (Uma classe utiliza os campos e métodos internos de outra classe.)
- Message Chains (Ocorrência sistemática de chamadas encadeadas no formato $a->b()->c()->d().)
- Middle man (Uma classe que se tornou dispensável por realizar apenas uma ação: delegar trabalho para outra classe.)



# Refactoring Techniques

### Composing Methods

- Extract Method
- Inline Method
- Extract Variable
- Inline Temp (Substituir uma variável temporária pela própria chamada a função.)
- Replace Temp with Query (Guardar em uma variável temporária e resultado de uma chamada a função.)
- Split Temporary Variable (Criar variáveis temporárias para valores distintos.)
- Remove Assignments to Parameters (Criar uma variável local ao invés de alterar o valor de um parâmetro.)
- Replace Method with Method Object (Criar uma nova classe e mover o método para ela.)
- Substitute Algorithm (Trocar um algoritmo por outro equivalente, mas de maior qualidade.)


### Moving Features between Objects

- Move Method
- Move Field
- Extract Class
- Inline Class
- Hide Delegate (Delegar a B uma chamada a A, ao invés de pedir a B uma instância de A.)
- Remove Middle Man (Pedir a B uma instância de A, para que B não precise ser usado para chamar métodos de A.)
- Introduce Local Extension (Crie uma subclasse que encapsula ou estende outra para decorá-la com uma nova funcionalidade.)


### Organizing Data

- Change Value to Reference (Substitua chamadas a múltiplas instâncias por chamadas a uma única instância.)
- Change Reference to Value
- Duplicate Observed Data (Crie uma classe para representar dados da UI e outra para o Model.)
- Self Encapsulate Field (Use getters dentro da própria classe ao invés de atributos privados.)
- Replace Data Value with Object (Use value objects ao invés de atributos simples.)
- Replace Array with Object
- Change Unidirectional Association to Bidirectional
- Change Bidirectional Association to Unidirectional
- Encapsulate Field
- Encapsulate Collection
- Replace Magic Number with Symbolic Constant
- Replace Type Code with Class
- Replace Type Code with Subclasses (Substitua um atributo indicando o tipo de um elemento por subclasses representando cada tipo.)
- Replace Type Code with State/Strategy
- Replace Subclass with Fields (Substitua uma hierarquia de subtipos simplista por apenas um atributo indicando o tipo.)


### Simplifying Conditional Expressions

- Consolidate Conditional Expression (Consolide múltiplas condicionais em apenas uma.)
- Consolidate Duplicate Conditional Fragments (Mova código que aparece em todas as condições para fora da condicional.)
- Decompose Conditional (Extraia conjuntos complexos de comando dentro de condicionais para métodos com nomes descritivos.)
- Replace Conditional with Polymorphism (Substitua estruturas if-else ou switch-case repetivitas por polimorfismo.)
- Remove Control Flag
- Replace Nested Conditional with Guard Clauses
- Introduce Null Object (Crie uma subclasse que represente o comportamento de um objeto nulo e use-o no lugar de condicionais verificar nulidade.)

### Simplifying Method Calls

- Add Parameter
- Remove Parameter
- Rename Method
- Separate Query from Modifier (Crie métodos separados para comando e consulta para evitar efeitos colaterais.)
- Parameterize Method (Remova métodos repetidos introduzindo parâmetros de configuração.)
- Introduce Parameter Object (Substitua vários parâmetros por um com os respectivos valores.)
- Preserve Whole Object (Passe o objeto todo ao invés de extrair valores para então passá-los como parâmetros.)
- Remove Setting Method
- Replace Parameter with Explicit Methods (Troque a parametrização de métodos por múltiplos métodos.)
- Replace Parameter with Method Call (Ao invés de invocar um método, guardar o resultado e então passar com parâmetro, chame o método direto no parâmetro.)
- Hide Method
- Replace Constructor with Factory Method
- Replace Error Code with Exception

### Dealing with Generalization

- Pull Up Field
- Pull Up Method
- Pull Up Constructor Body
- Push Down Field
- Push Down Method