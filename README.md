This is a Spring Boot Application using ElasticSearch and PostgreSQl as Databases

For ElasticSearch:
Install elasticSearch locally and insert data index: fooditem type: search
create index using PUT : localhost:9200/fooditems
create data structure using below json format 
  POST: localhost:9200/fooditems/search 
    Request Body: { "name": "Eggs ", "region": "Zambia", "mealtype": "Breakfast" } #Example


For PostgreSQl:
Install PostgreSQL locally and create table: fooditems
INSERT/CREATE Script:
      CREATE TABLE public.fooditems
      (
          id integer,
          name character varying COLLATE pg_catalog."default",
          region character varying COLLATE pg_catalog."default",
          mealtype character varying COLLATE pg_catalog."default"
      )
      WITH (
          OIDS = FALSE
      )
      TABLESPACE pg_default;
      
      
Run the application and search using below URLs:
  Get All Data: localhost:8080/foodItems/search/_search 
  Get Data using Id: localhost:8080/foodItems/id/{id} 
  Get Data using Id: localhost:8080/foodItems/name/{name}
