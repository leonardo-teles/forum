# Spring Boot API REST: Construa uma API Rest

Certificado: <a href="https://cursos.alura.com.br/certificate/74f3446f-2672-45f8-b56d-58cc4c41cd0e" rel="noopener" targer="_blank">I</a>

Tópicos Abordados:

**1. Introdução ao Spring Boot**

**2. Publicando Endpoints**
   - Uso da anotação @ResponseBody
   - Usando DTO
   - Módulo Spring Boot DevTools
   - Atualização e remoção de recursos na API
   - O que é REST
   
**3. Usando Spring Data**
   - Começando com Spring Data JPA
   - Configurações do banco de dados da aplicação
   - Utilizando Repository
   - Interface que segue o padrão Repository
   - Consulta com filtros
   - Filtrando dados pelo relacionamento
   
**4. Trabalhando com POST**
   - Uso da anotação @RequestBody
   - Boas práticas no cadastro
   - Métodos com retorno void
   - Testando o cadastro com Postman
   - O cabeçalho Content-Type
   
**5. Validação com Bean Validation**
   - Validações com Bean Validation
   - Uso da anotação @Valid
   - Simplificando o JSON
   - Uso da anotação @ResponseStatus no RestControllerAdvice

**6. Métodos PUT, DELETE e tratamento de erro**
   - Paths dinâmicos
   - Controle transacional
   - Tratando o erro 404
   - Vantagem de devolver o erro 404   
   
# Spring Boot API Rest: Segurança da API, Cache e Monitoramento

Certificado: <a href="https://cursos.alura.com.br/certificate/35e51df4-c450-4d34-986b-782d8b4ecd56" rel="noopener" targer="_blank">II</a>

Tópicos Abordados:

**1. Paginação e Ordenação de recursos**
   - Paginação
   - Vantagem de utilizar a interface Page
   - Ordenação
   - Ordenando registros na lista
   - Simplificando a paginação e ordenação
   - Uso da anotação @PageableDefault

**2. Melhorando desempenho com Spring Cache**
   - Utilizando Cache
   - Anotação @Cacheable
   - Invalidando Cache
   - Boas práticas no uso de cache
   
**3. Proteção com Spring Security**
   - Habilitando o Spring Security
   - Liberando acesso aos endpoints públicos
   - Restringindo acesso aos endpoints privados
   - Autenticando o usuário
   - Lógica de autenticação
   
**4. Gerando Token com JWT**
   - Por que autenticar via token
   - Configurando autenticação Stateless
   - Página de login
   - Gerando tokens com JWT
   - Injeção de propriedades
   - Retornando o token para o cliente
   
**5. Autenticação via Token**
   - Recuperando o token do header Authorization
   - OncePerRequestFilter
   - Validando o token
   - Injeção de dependências no Filter
   - Autenticando o cliente via Spring Security
   - Forçando a autenticação via SecurityContextHolder

**6. Monitoramento com Spring Boot Actuator e Admin**
   - Spring Boot Actuator
   - Spring Boot Admin
   - Monitorando a API com Spring Boot Admin
   - Spring Boot Admin Client     
   
**7. Documentação da API com Swagger**
   - Documentação da API com SpringFox Swagger
   - Token JWT na documentação do Swagger
   - Enviando token JWT no Swagger
   
# Spring Boot e Teste: Profiles, Testes e Deploy

Certificado: <a href="https://cursos.alura.com.br/certificate/cb5d3622-1a81-4ea0-a13c-5085eccbc66e" rel="noopener" targer="_blank">III</a>

Tópicos Abordados:

**1. Mais segurança**
   - Atualizando o Spring Boot
   - Autorização baseada em Roles
   - Restringindo o acesso a determinado endpoint

**2. Profiles**
   - Spring profiles
   - Beans baseados em profiles
   - Utilização da anotação @Profile
   
**3. Testes automatizados**
   - Testes automatizados com Spring Boot
   - Anotação @SpringBootTest
   - Testando um repository
   - Anotação @DataJpaTest
   - Testando o repository com outro banco de dados
   - Alterando o banco de dados utilizado durante os testes
   - Testando um Controller
   - Injetando o MockMvc
   
**4. Deploy**
   - Geração do jar da aplicação via Maven
   - Externalizando senhas com variáveis de ambiente
   - Deploy tradicional com arquivo war
   
**5. Deploy com Docker e na nuvem**
   - Gerando imagem Docker da aplicação
   - Arquivo Dockerfile
   - Rodando a aplicação via Docker
   - Variáveis de ambiente no Docker
   - Deploy no Heroku
   - Spring Boot em ambientes Cloud