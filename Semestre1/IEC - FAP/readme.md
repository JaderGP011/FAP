# CSS

Linguagem de estilização usada em páginas web para deixar o site mais bonito.
Com o CSS é possível aplicar cores, tamanhos, layouts e até animações.

---

## CSS Interno

Existem algumas formas de usar CSS em uma página HTML.
Uma delas é o **CSS interno**, onde o código fica dentro da tag `<head>`, usando a tag `<style>`.

```html
<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <title>Exemplo CSS Interno</title>

    <!-- tag que permite usar CSS dentro do HTML -->
    <style>
        body {
            background-color: #222;
            color: white;
            font-family: Arial, sans-serif;
        }

        h1 {
            color: yellow;
            text-align: center;
        }

        p {
            font-size: 18px;
        }

        .destaque {
            color: cyan;
            font-weight: bold;
        }
    </style>

</head>
<body>

    <h1>Olá, mundo!</h1>

    <p>Esse é um exemplo simples de CSS interno.</p>

    <p class="destaque">Esse texto está destacado usando uma classe.</p>

</body>
</html>
```

Esse método é simples, mas não é muito usado em projetos grandes.

---

## CSS Externo

O **CSS externo** resolve esse problema, permitindo separar o estilo do HTML.

Você cria um arquivo `.css` e conecta ele ao HTML usando a tag `<link>`.

```html
<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <title>Exemplo CSS Externo</title>

    <!-- ligação com o arquivo CSS -->
    <link rel="stylesheet" href="style.css">
</head>
<body>

    <h1>Olá, mundo!</h1>

    <p>Esse é um exemplo simples de CSS externo.</p>

    <p class="destaque">Esse texto está destacado usando uma classe.</p>

</body>
</html>
```

## Seletores CSS

Seletores são usados para **escolher quais elementos do HTML vão receber o estilo**.

### Seletor por tag

Aplica o estilo em todas as tags daquele tipo.

```css
p {
    color: white;
}
```

Todos os `<p>` ficam brancos.

---

### Seletor por classe (`.`)

Aplica o estilo em elementos que possuem uma classe específica.

```css
.destaque {
    color: yellow;
}
```

```html
<p class="destaque">Texto</p>
```

Pode ser usado em vários elementos.

---

### Seletor por id (`#`)

Aplica o estilo em um único elemento.

```css
#titulo {
    color: red;
}
```

```html
<h1 id="titulo">Olá</h1>
```

Deve ser usado apenas uma vez na página.

---

### Seletor universal (`*`)

Seleciona todos os elementos da página.

```css
* {
    margin: 0;
}
```

Muito usado para remover espaçamentos padrão.

---

### Seletor descendente

Aplica o estilo apenas em elementos dentro de outros.

```css
div p {
    color: blue;
}
```

Apenas `<p>` dentro de `<div>` serão afetados.
