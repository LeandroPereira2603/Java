# Java
<p> Aqui terá todos os meus reposiórios criados com a linguagem java. </p>


<strong> Legenda :</strong> sobre prática , desenvolvimento , estudo .

|Descrição | Logotipo   |
|:--: |:--:|
| Abandonado | 🔴 | 
| Em desenvolvimento    |  🟡  | 
| Projeto concluído    |  💻  | 
| Repositório Favorito | ⭐ | 
| Código Fonte - local do repositório | ☕ | 
| Desenvolvimento para outro idioma | 🗺️ |
| Exercicio em andamento |  🕗  |  
| Exercicio concluido | ✔ | 

<p> <strong> Legenda : </strong> sobre os arquivos de extensão . </p>

| Descrição | Extensão |
|:--:|:--:|
| Para melhor visualização e detalhe do código | arquivo.md|
| Para execusão do java | arquivo.java |

### Convençôes usadas para anotaçôes do repositório :

<p> Utilizo o seguinte parâmetro para o repositório . </p>

 <p> O uso dos parênteses : </p>

* Para dar ênfase ao assunto .
* Para mostrar o significado da sigla que está abreviada .
* Para colocar o meu nome como autor de toda a documentação ( LLP )  .
  
 <p> O uso da tipografia italica : </p>

* para citar nomes de variáveis 
* linha de código.

### Índice :

* Tópicos de estudo 

   * Anotaçôes
   * Matérias


* Prática 

   * Sites : Git hub - pages 
   * Algoritmos : Gerais
   * Beecrowd : Exercicios gerais 


# 📚 Tópicos de estudo

## :book: Anotações  :

<p> Aqui tera todas as meus resumos da linguagem de programação java , com complementoa de referências de livros e conteúdo de cursos . </p>

### Sobre :

* [ Fontes ]
* [ História da linguagem | Sobre a linguagem | Regras de sintaxe   ]
* [ Boas práticas de programação]

### Sintaxe da Linguagem java :

* [ Declaração de variáveis]
* [ Operadores Aritiméticos]
* [ Operadores Relacionais]
* [ Operadores Lógicos ]
* [ Operadores de comparação ]
* [ Interpolação de variáveis ]
* [ Concatenação de variáveis ]
* [ Estrutura de desição ( if ,swicth case ) ]
* [ Função]
* [ Estrutura de repetição ( for, while, do while)]
* [ Array - Matriz]
* [ Objeto ]
* [ For-each ]
* [ Map ]
* [ Métodos ( Math, etc..) ]
* [ String : manipulando caracteres]

### Bibliotecas : 

*  [ java.util.Scanner ]



## Funçôes globais e métodos :

* [decimal()]

## :book: Matérias 

* [ Estrutura de dados ]
* [ POO ( Programação orientado a objeto) ]


# 💻 Prática 

<p> Todos os contéudos de práticas ,feito em linguagem java .</p>

## :computer: Algoritmos : Gerais  
 
### Cálculos :

1. [ Tabuada.md  ] ☕  [ Tabuada.java ] 
1. [  Metódo-de-butterfly.md  ] ☕ [ Metódo-de-butterfly.java]🗺️ ( EUA : English )
1. [ Imc.md] ☕ [ Imc.java]
1. [ Circuferência do circulo.md ] ☕  [ Circuferência do circulo.java ]

###  Lógica :

### Estrutura de dados :

1. [Bubble Sort] ☕ [ Bubble Sort]
1. [Select Sort ] ☕ [ Select Sort ]

## :computer: Beecrowd : Exercicios gerais  

<p> <strong>Beecrowd</strong> é uma plataforma exclusivo para programadores , iniciante ao avaçado , para resolver problemas em categorias em gerais . </p>

### 1 - Begin :
 
**Basic problems** for anyones who has just started to program .. 

1. ✔ [ Hello-world.md]
1. ✔ [ Extremely-basic.md ]
1. [ Area-of-a-circle.md]
1. [ Simple-sum.md]
1. [ Simple-product.md]
1. [ Average ]
1. [ Average Two ]
1. [ Difference ]
1. [ Salary ]
1. [ Salary-bonus ]
1. [ Calculate-simples ]
1. [ Sphere]
1. [ Area]
1. [ The greatest ]
1. [ Consumption ]
1. [ Distance-beteween-two-points]
1. [ Distance]
1. [ Fuel-spent ]
1. [ Bank Notes ]
1. [ Time conversation ]
1. 🕗 [ Age-days]
1. 🕗 [ Bank-note-coin]
1. 🕗 [ Select test]

### 2 - AD-HOC)

**Simulation** , problems , dates, games and general , ad-hoc  .

1. 🕗 [to-carry-or-not-to-carry]


### 3 - Strings 

Palindromes, Frequency, Ad-Hoc, LCS, String Manipulation...

1. 🕗 [ Encryption]

### 4 - Data structures and libraes 

Queue,stack,sort,map,set...

1. 🕗 [ Tda-rarional ]


**Algoritmo** predileto :

```java

/*LLP - (Leandro Pereira) : um dos meus métodos prediiletos são a utilização do for , exemplo :
 Este algoritmo vai mostrar todas as tabuadas do 0 até o número que o usuario digitar */


import java.util.Scanner;

public class Tabuada {
public static void main(String[] args) {

Scanner ler = new Scanner (System.in);

System.out.println("Digite o número máximo de tabuadas que deseja visualizar ");
int c = ler.nexInt();

c++;
var n = 0;
for (int k=0;k<c;k++){ 
 for (int  i = 0 ; i<11;i++){
  var result = n * i ;
   System.out.println(" "+n+" x "+i+" = "+result);
  }
  n++;
  System.out.println("");
}

}

}

```


<!-- colocar imagem e link 
 [![Binder](https://mybinder.org/badge_logo.svg)](https://mybinder.org/v2/gh/storopoli/ciencia-de-dados/main?filepath=notebooks%2FAula_Especial_Python.ipynb)
-->
