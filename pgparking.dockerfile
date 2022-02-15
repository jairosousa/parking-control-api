FROM postgres:13.1-alpine
LABEL maintainer "Jairo Nascimento <jaironsousa@gmail.com>"
ENV POSTGRES_PASSWORD=banco123
ENV POSTGRES_DB=parking-control-db
EXPOSE 5432