
# `padding`

É o espaço entre o conteúdo e a borda que acaba servindo de um "respiro" interno pra página. Ele aumenta a área interna, geralmente alterando o tamanho total do elemento, e é ideal para criar respiro dentro de botões ou contêineres. Pode ser aplicado em todos os lados (top, right, bottom, left).

```css
padding: 20px;
```

Isso faz com que o conteúdo fique afastado das bordas.

> [!important]
> Você pode definir valores específicos por lado:

```css
padding: 10px 20px 30px 40px;
```

Ou mais simples:

```css
margin: 10px 20px;
```

Significa:

```
vertical (top/bottom) → 10px
horizontal (left/right) → 20px
```


Exemplo:  
Um botão com padding maior fica mais “gordinho”, mais confortável de clicar.

---

# `border`

É literalmente a linha que envolve o elemento, define a espessura, estilo e cor das bordas de um elemento HTML. Ela é usada para criar contornos ao redor de divs, imagens e textos.

```css
border: 2px solid black;
```

Formato:

```
border: espessura tipo cor;
```

Tipos comuns:

- `solid` (linha sólida)
    
- `dashed` (tracejada)
    
- `dotted` (pontilhada)
    

---

# `margin`

É o espaço entre um elemento e os outros ao redor.

> [!info]
> Se o [padding](#`padding`) é  o "respiro interno, o `margin` faz o sentido contrário, sendo o “respiro externo”.
Muito usado pra separar elementos verticalmente ou centralizar coisas.

```css
margin: 20px;
```



```html
<!DOCTYPE html>
<html lang="pt-BR">
<head>
  <meta charset="UTF-8">
  <title>Box Model</title>
  <style>
    .caixa {
      width: 200px;
      background-color: lightblue;

      padding: 20px;         /* espaço interno */
      border: 3px solid blue; /* borda */
      margin: 30px;          /* espaço externo */
    }
  </style>
</head>
<body>

  <div class="caixa">
    Esse é o conteúdo da caixa
  </div>

</body>
</html>
```