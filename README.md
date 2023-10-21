# API de Catalogação de Bandas

Esta é uma API Restful simples para catalogar informações sobre bandas musicais.

## Recursos Principais

- **Bandas**: Gerencie informações sobre bandas, incluindo nome, gênero e número de integrantes.
- **Álbuns**: Registre detalhes de álbuns, como nome, capa e títulos de músicas, associados a bandas.
- **Usuários**: Registre usuários para gerenciar bandas e álbuns associados.

```mermaid
classDiagram
  class User {
    - name: String
    - banda: Banda
    - album: Album
  }

  class Banda {
    - nome: String
    - genero: String
    - integrantes: Int
  }

  class Album {
    - nome: String
    - capa: String
    - musicaTitulo: String
  }

  User "1" -- "*" Banda
  User "1" -- "*" Album
```
