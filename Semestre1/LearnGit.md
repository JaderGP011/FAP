# Git

---

## Glossário Básico

| Termo | O que significa? |
| :--- | :--- |
| **Repositório (Repo)** | A "pasta" do seu projeto onde o Git armazena todo o histórico de alterações. |
| **Versionamento** | O sistema de controlar diferentes versões de um projeto ao longo do tempo. |
| **Commit** | Um "ponto de salvamento" que registra suas alterações com uma mensagem. |
| **Branch (Ramo)** | Uma linha separada de desenvolvimento (ex: para testar uma nova função). |
| **Merge (Mesclar)** | O ato de unir as alterações de uma *branch* em outra (geralmente na principal). |
| **Staging Area (Index)** | A área de preparação onde você escolhe o que entrará no próximo *commit*. |
| **Clone** | Baixar uma cópia completa de um repositório remoto para sua máquina. |
| **Pull** | Trazer as novidades do servidor (nuvem) para o seu computador local. |
| **Push** | Enviar seus *commits* locais para o servidor remoto. |
| **Checkout / Switch** | Comando para transitar entre diferentes *branches* ou versões. |

---

## Comandos Básicos

`git init` --> Dá inicio ao controle de versionamento fazendo da pasta um repositório

`git add <arquivo ou ponto . pra adicionar todos>` adiciona o arquivo que será preparado para o commit

`git status` mostra as alterações

`git commit -m "mensagem pro commit"` Cria realmente a versão do seu código

`git branch -M "main"`
    Usado para renomear a branch principal (necessário em algumas empresas/equipes de desenvolvimento)

`git remote add orgin <link.git>`
    `remote` é a palavra pra dizer que eu quero fazer conexão com o repositório  
    na núvem, `add origin` pra adicionar um apelido dado pra url chamado origin
    (que é só um nome padrão pro git usar sempre que fizer algo relacionado ao reposiório dessa url)

`git push -u origin <nome da branch>` "empurra" o seu código pra núvem

- `push` → envia código
- `origin` → destino (remoto)
- `<nome da branch>` → branch
- `-u` → cria vínculo automático

---

## Branch's

### Transitar entre branchs

    git checkout <nome da branch>

### Criação de uma nova branch

    git checkout -b "<nome da nova branch>"

### Merges

Para fazer a mescla de códigos, primeiro é necessário voltar ao branch que você quer incorporar o código

```bash
git checkout main
git merge <branch a incorporar>
git push origin main
```

## Clone

Usado para replicar o seu reposiório (ou de outra pessoa) na sua máquina

`git clone <url do projeto (github.com/...)>`
`git pull` (esse é só pra atualizar na sua máquina a alteração que outra pessoa fez)

## Pull Request

Mais util para projetos em equipe. Se eu faço uma alteração de alguma coisa eu posso solicitar que a pessoa responsável pelo meu projeto faça um pull no meu código. É meio que um processo de aprovação