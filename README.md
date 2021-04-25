# FlipFlop
Compilador desenvolvido para a disciplina de Compiladores

## Como testar o compilador

#### 1. Asegurar que os arquivos abaixo estão na pasta do projeto

antlr <br>
jasmin<br>
build<br>
compile<br>

#### 2. Criar o arquivo de gramática da linguagem. Exemplo: FF.g

#### 3. Cria os analisadores sintáticos e léxicos

`java -jar antlr-4.5.3.jar FF.g`

#### 4.  Compilar os arquivos java

`javac -cp antlr-4.5.3.jar FF*.java`


#### 5. Testar o parser da linguagem. Para isso, é necessário criar um arquivo de teste (Test.ff), o resultado gerará o conteúdo do arquivo Test.j

`java -cp antlr-4.5.3.jar:. FFParser < test-math.ff > Test.j`

```
// Test.ff
console(2 + 2) // result 4
```

#### 6. Gerar o .class do arquivo teste
`java -jar jasmin-2.4.jar Test.j`

#### 7. Executar o arquivo teste (compilado)
`java Test`
