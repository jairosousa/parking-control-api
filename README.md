# Docker

## Banco de Dados
```
docker build -f pgparking.dockerfile -t jnsousa/pgparking:v1 .
```

## Criar container banco de dados
```
docker run --name "pgparking" -p 5432:5432 -d jnsousa/pgparking:v1
```